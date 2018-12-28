# 开发规范

## 部分项目需要使用的url
* [solr生产环境](http://193.112.129.159:9080/solr/)
* [solr开发环境](http://193.112.129.159:9080/solr/)
* [activemq生产环境](http://193.112.129.159:8161/)
* [activemq开发环境](http://193.112.129.159:8161/)
* [生产环境数据库]()
* [开发环境数据库]()
* [测试环境数据库]()
* [开发环境服务器账号密码]()

## LOG 规范
* LOG 使用规范遵循 SLF4J 的规范
* [Java日志全解析](https://zhuanlan.zhihu.com/p/24272450)

## 使用工具
* 项目后端开发工具为IDEA，前端为VSCode，接口测试工具为postman
* jdk版本为jdk8，tomcat版本为tomcat7

## 提交代码规范
1. 代码提交之前请自己测试至少两遍，确认代码无误之后进行提交。
2. 提交格式为：新增|修复|删除|优化|其他 + 冒号 + 注释
    * 新增:新增了xx功能、xx文件。
    * 修改:修改了xx功能，涉及的文件为xx。
    * 删除:删除了xx功能、xx文件。
3. 需要对sql进行修改，请把sql语句写到resource目录下的sql.sql文件中，并加上注释统一修改。
4. 需要对配置文件进行修改，在群里进行说明，交由杨德石进行修改，提交代码时不要提交resource目录下的更改

## 开发理念
1. 用心写代码，提炼真正的非功能性需求。
2. 极简代码, 高度复用，无重复代码和配置。
3. 修改功能时多考虑影响面, 不可留下没修改完全的部分。
4. 只有一个需求时，不需扩展性。两个类似需求时, 再提炼扩展性。

## 开发规范
1. 代码缩进全部用四个空格代替制表符，禁止使用工具自带的格式化快捷键。
2. 方法之间留一行空行，代码块之间留一行空行，实体类注入之间留一行空行。
3. 不应有无意义的空行。
4. 换行符统一使用\r\n。
5. 对集合的操作禁止使用new创建对象，一律使用Lists.newArrayList()方式，
```
Map<String, Object> map = Maps.newHashMap();
List<Object> list = Lists.newArrayList();
```
6. 接口返回值全部使用ExamResult，正确的code为200，错误的code为400。即便是方法没有返回值，也必须要使用返回值。
7. 每天离开实验室之前，必须将代码提交。第二天来实验室准备开发之前，必须将master分支上的代码合并到自己分支，并重新拉取。
8. 尽量避免在循环中使用查询语句。
9. StringUtils使用本项目下utils包中的工具类
10. 开发规范需要在遵守阿里巴巴的基础之上，遵循以上开发规范

## 参数规范
1. 前端参数传递形式统一以application/x-www-form-urlencoded形式
2. 后端统一以ExamResult包装json格式
3. 除currentPage（当前页），currentCount（每页显示条数），sortName（排序列名），sortOrder（排序方式）
以外，都用s_xxxx的格式进行传递
4. 后端接收参数数量大时，使用HttpServletRequest request进行接收，接着将request封装到page的构造中
5. get请求传递单个参数的时候，使用RESTFUL风格，将参数放到url上，但是不必要区分出GET、DELETE等请求方式

## 注释规范
1. 多行注释统一使用文档注释。方法、类名上面的注释全部使用多行注释，并且标注作者、时间
```java
/**
 * 多行注释例子
 * @author 杨德石
 * @date 2018/1/28
 */
```
2. 方法内部使用单行注释，双斜线后面需要加一行空格
```java
// 单行注释例子
```
## 更新操作
更新 domain 操作的时候，不推荐直接 new 一个实体对象进行更新，这样的结果可能会导致一些初始化的属性直接被更新了
，通常是先查询对应的实体对象，然后直接更新。

## 常量定义规范
1. 常量的命名全部用大写，单词之间使用下划线隔开，每一个常量上方必须加上注释
2. 后期值不常改动的常量：在 BaseConstant 类里直接定义，把值写死即可，比如：
```
public static final String PAPER_ID = "8888";
```
3. 后期值会改动的常量：在 resource.properties定义，命名规范，需要能看出来该常量所表示的数据，
    例如试卷编号
    @Value("${PAPER_ID}")
    private String PAPER_ID;
    
## 数据库规范
1. 每张表要有注释（ comment ），格式为 模块|用途|负责人|创建日期 ，例如：贷款|记录贷款用户身份证号码|张三|2016-03-25；
2. 每个字段要有注释（ comment ），格式为 用途|负责人|创建日期 ， 例如：记录用户性别@1:男@0:女@2:未知|李四|2016-03-25；
3. 每张表必加字段，id （长度36，使用UUID）， created_by （创建人），created_time（创建时间），update_by（修改人），update_time（修改时间），delete（是否删除）
4. ID属性或者外键字段需要来源说明，来自哪张表的那个字段，例如：记录车辆ID，#取自cp_used_car.car_id|李四|2016-03-25；
5. 不使用视图、触发器。外键全部为逻辑外键，不加外键约束。
6. 时间字段长度为25，类型为varchar。操作时间的时候使用DateUtils进行创建。
7. 因某些需求所必须，而去改动数据库时，不允许使用可视化工具，统一使用sql语句进行修改，并将修改后的sql语句放到webapp/static/doc/xxx.sql文件中，格式如下。
```mysql
# 修改xx字段为xx|杨德石
alter table user change sex gender varchar(12) comment '模块|用途|负责人|创建日期'
after age;
# 修改xx字段为xx|杨德石
```
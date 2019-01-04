package com.school.test;

import com.school.utils.QRCodeUtil;
import org.junit.jupiter.api.Test;

public class QRCodeTest {

    @Test
    public void testQRCode() throws Exception {
        String text = "http://www.baidu.com";
        //不含Logo
        //QRCodeUtil.encode(text, null, "e:\\", true);
        //含Logo，不指定二维码图片名
        //QRCodeUtil.encode(text, "e:\\csdn.jpg", "e:\\", true);
        //含Logo，指定二维码图片名
        QRCodeUtil.encode(text, "e:\\hh.jpg", "e:\\", "qrcode", true);
    }

}

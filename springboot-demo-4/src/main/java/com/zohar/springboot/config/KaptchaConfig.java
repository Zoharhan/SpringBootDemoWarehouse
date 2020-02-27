package com.zohar.springboot.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Properties;
import java.util.Random;

@Component
public class KaptchaConfig {
    @Bean
    public DefaultKaptcha getDDefaultKaptcha() {
        DefaultKaptcha dk = new DefaultKaptcha();
        Properties properties = new Properties();
        // 图片边框
        /*合法值：yes , no   默认：*/
        properties.setProperty("kaptcha.border", "yes");
        // 边框颜色
        /*合法值： r,g,b (and optional alpha) 或者 white,black,blue.*/
        properties.setProperty("kaptcha.border.color", "black");
        //  边框厚度
        /*合法值：>0*/
        properties.setProperty("kaptcha.border.thickness","1");
        // 图片宽
        properties.setProperty("kaptcha.image.width", "110");
        // 图片高
        properties.setProperty("kaptcha.image.height", "40");
        //  验证码内容文本集合
        properties.setProperty("kaptcha.textproducer.char.string","Q2WE4R5T6Y8UPAS3DFGHJ6YKZXCQ2VBNM");
        // 验证码长度
        properties.setProperty("kaptcha.textproducer.char.length", "4");
        // 字体
        properties.setProperty("kaptcha.textproducer.font.names", "Arial,Courier");
        // 字体大小
        properties.setProperty("kaptcha.textproducer.font.size", "30");
        //  字体颜色
        properties.setProperty("kaptcha.textproducer.font.color","black");
        //  文字间隔
        properties.setProperty("kaptcha.textproducer.char.space","4");
        //  验证码图片样式（水纹com.google.code.kaptcha.impl.WaterRipple  鱼眼com.google.code.kaptcha.impl.FishEyeGimpy  网格com.google.code.kaptcha.impl.ShadowGimpy）
        properties.setProperty("kaptcha.obscurificator.impl","com.google.code.kaptcha.impl.ShadowGimpy");
        // session key
        properties.setProperty("kaptcha.session.key", "code");
        Config config = new Config(properties);
        dk.setConfig(config);
        return dk;
    }
}

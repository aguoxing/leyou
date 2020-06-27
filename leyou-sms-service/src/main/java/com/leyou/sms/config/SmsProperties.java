package com.leyou.sms.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author guoxing
 * @date 2020/6/27 16:08
 */
@Data
@Component
public class SmsProperties {

    @Value("${leyou.sms.accessKeyId}")
    String accessKeyId;

    @Value("${leyou.sms.accessKeySecret}")
    String accessKeySecret;

    @Value("${leyou.sms.signName}")
    String signName;

    @Value("${leyou.sms.verifyCodeTemplate}")
    String verifyCodeTemplate;
}
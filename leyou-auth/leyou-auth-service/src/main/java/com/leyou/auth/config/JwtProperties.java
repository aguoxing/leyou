package com.leyou.auth.config;

import com.leyou.auth.util.RsaUtils;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * @author guoxing
 * @date 2020/6/29 10:15
 */
@Data
@Slf4j
@ConfigurationProperties(prefix = "leyou.jwt")
public class JwtProperties {

    // 密钥
    private String secret;

    // 公钥
    private String pubKeyPath;

    // 私钥
    private String priKeyPath;

    // token过期时间
    private int expire;

    // 公钥
    private PublicKey publicKey;

    // 私钥
    private PrivateKey privateKey;

    private String cookieName;

    private Integer cookieMaxAge;

    /**
     * @PostContruct：在构造方法执行之后执行该方法
     */
    @PostConstruct
    public void init() {
        try {
            File pubKey = new File(pubKeyPath);
            File priKey = new File(priKeyPath);
            if (!pubKey.exists() || !priKey.exists()) {
                // 生成公钥和私钥
                RsaUtils.generateKey(pubKeyPath, priKeyPath, secret);
            }
            // 获取公钥和私钥
            this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
            this.privateKey = RsaUtils.getPrivateKey(priKeyPath);
        } catch (Exception e) {
            log.error("初始化公钥和私钥失败！", e);
            throw new RuntimeException();
        }
    }

}

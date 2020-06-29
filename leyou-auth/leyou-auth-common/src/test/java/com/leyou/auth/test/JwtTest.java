package com.leyou.auth.test;

import com.leyou.auth.entity.UserInfo;
import com.leyou.auth.util.JwtUtils;
import com.leyou.auth.util.RsaUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * @author guoxing
 * @date 2020/6/28 14:48
 */
@SpringBootTest
public class JwtTest {

    private static final String pubKeyPath = "E:\\tmp\\rsa\\rsa.pub";

    private static final String priKeyPath = "E:\\tmp\\rsa\\rsa.pri";

    private PublicKey publicKey;

    private PrivateKey privateKey;

    @Test
    public void testRsa() throws Exception {
        RsaUtils.generateKey(pubKeyPath, priKeyPath, "234");
    }

    @Before
    public void testGetRsa() throws Exception {
        this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
        this.privateKey = RsaUtils.getPrivateKey(priKeyPath);
    }

    @Test
    public void testGenerateToken() throws Exception {
        // 生成token
        String token = JwtUtils.generateToken(new UserInfo(20L, "jack"), privateKey, 5);
        System.out.println("token = " + token);
    }

    @Test
    public void testParseToken() throws Exception {
        String token = "eyJhbGciOiJSUzI1NiJ9.eyJpZCI6MjAsInVzZXJuYW1lIjoiamFjayIsImV4cCI6MTU5MzMyOTMzNX0.dcgAozDaCj9AUjTff9v3muMPBCzOuEn6QssIURYSLLQSg4bwHGKLB84Xenbo6buahtxnx7-hZmdAupUCXgHC24yZdCUsURJz7wew9xPDVGxckUBq8g1Od2ZSOBRuVzPeVD564IRQNCZ3Pgg39-PSA88ZPIlSybEfgJO9yNOePTM";

        // 解析token
        UserInfo user = JwtUtils.getInfoFromToken(token, publicKey);
        System.out.println("id: " + user.getId());
        System.out.println("userName: " + user.getUsername());
    }

}

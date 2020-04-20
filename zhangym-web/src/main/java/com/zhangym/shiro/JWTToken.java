package com.zhangym.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * token
 *
 * @author zym
 * @create 2020-04-14 9:14
 **/
public class JWTToken implements AuthenticationToken {

    // 密钥
    private String token;

    public JWTToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}


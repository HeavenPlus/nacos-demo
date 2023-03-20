package com.heaven.service.impl;

import com.heaven.service.MemberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhanggq
 * @date 2023/3/16 16:21
 */
@RestController
public class MemberServiceImpl implements MemberService {
    @Value("${server.port}")
    private String prot;
    @Override
    public String getUser(@RequestParam("userId") Integer userId) {
        return "用户："+userId +",端口号:" + prot;
    }

    @GetMapping("/get")
    public String get(HttpServletRequest request) {
        String serverPort = request.getHeader("serverPort");
        return "会员服务端口号:" + prot + "，网关端口号：" + serverPort;
    }
}

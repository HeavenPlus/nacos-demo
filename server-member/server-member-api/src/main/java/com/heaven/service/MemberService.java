package com.heaven.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhanggq
 * @date 2023/3/16 15:49
 */
public interface MemberService {

    @GetMapping("/getUser")
    String getUser(@RequestParam("userId") Integer userId);
}

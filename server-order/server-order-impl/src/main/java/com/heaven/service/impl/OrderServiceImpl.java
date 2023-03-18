package com.heaven.service.impl;

import com.heaven.service.openfeign.MemberOpenFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanggq
 * @date 2023/3/18 13:49
 */
@RestController
public class OrderServiceImpl {

    @Autowired
    private MemberOpenFeign memberOpenFeign;

    @GetMapping("/getUser")
    public String getUser(@RequestParam("userId") Integer userId){
        String res = memberOpenFeign.getUser(userId);
        return "订单服务调用会员服务，结果：" + res;
    }
}

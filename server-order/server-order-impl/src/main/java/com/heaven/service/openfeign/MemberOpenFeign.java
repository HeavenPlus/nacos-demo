package com.heaven.service.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhanggq
 * @date 2023/3/18 13:50
 */
@FeignClient("server-member")
public interface MemberOpenFeign {

    @GetMapping("/getUser")
    String getUser(@RequestParam("userId") Integer userId);
}

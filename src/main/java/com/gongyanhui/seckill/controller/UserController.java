package com.gongyanhui.seckill.controller;


import com.gongyanhui.seckill.pojo.User;
import com.gongyanhui.seckill.vo.RespBean;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gongyanhui
 * @since 2021-10-11
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 用户信息(测试)
     * @param user
     * @return
     */
    @RequestMapping("/info")
    @ResponseBody
    public RespBean info(User user) {
        return RespBean.success(user);
    }
}

package com.gongyanhui.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gongyanhui.seckill.pojo.Order;
import com.gongyanhui.seckill.pojo.User;
import com.gongyanhui.seckill.vo.GoodsVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gongyanhui
 * @since 2021-10-16
 */
public interface IOrderService extends IService<Order> {
    /**
     * 秒杀
     * @param user
     * @param goods
     * @return
     */
    Order seckill(User user, GoodsVo goods);
}

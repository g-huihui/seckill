package com.gongyanhui.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gongyanhui.seckill.pojo.Goods;
import com.gongyanhui.seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gongyanhui
 * @since 2021-10-16
 */
public interface IGoodsService extends IService<Goods> {
    /**
     * 获取商品列表
     * @return
     */
    List<GoodsVo> findGoodsVo();

    /**
     * 跳转商品详情页
     * @param goodsId
     * @return
     */
    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}

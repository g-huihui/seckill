package com.gongyanhui.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gongyanhui.seckill.pojo.Goods;
import com.gongyanhui.seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gongyanhui
 * @since 2021-10-16
 */
public interface GoodsMapper extends BaseMapper<Goods> {
    /**
     * 获取商品列表
     * @return
     */
    List<GoodsVo> findGoodsVo();

    /**
     * 获取商品详情
     * @param goodsId
     * @return
     */
    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}

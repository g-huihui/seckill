package com.gongyanhui.seckill.vo;

import com.gongyanhui.seckill.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Gong Yanhui
 * @description TODO 详情返回对象
 * @date 2021-10-24 11:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailVo {

    private User user;
    private GoodsVo goodsVo;
    private int secKillStatus;
    private int remainSeconds;
}

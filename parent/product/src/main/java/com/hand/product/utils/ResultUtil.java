package com.hand.product.utils;

import com.hand.product.VO.ResultVO;

/**
 * @author ZhengShuang
 * @date 2018/10/16 20:47
 */

public class ResultUtil {

    public static ResultVO success(Object data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(data);
        return resultVO;
    }
}

package com.ruoyi.web;

import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.utils.StringUtils;

public class BasicTests {
    public static void main(String[] args) {
        String invokeTarget = StringUtils.substringBefore("ryTask.ryParams('ry')", "(");
        System.out.println(invokeTarget);
    }
}

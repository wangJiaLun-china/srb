package com.wjl.srb.core;

import org.junit.Test;
import org.springframework.util.Assert;

/**
 * @author wangJiaLun
 * @date 2022-01-25
 **/
public class AssertTests {

    @Test
    public void test1(){
        Object o = null;
        if (o == null) {
            throw new IllegalArgumentException("参数错误");
        }
    }
    //断言的用法：更为简洁
    @Test
    public void test2() {
        // 另一种写法
        Object o = null;
        Assert.notNull(o, "用户不存在.");
    }

}

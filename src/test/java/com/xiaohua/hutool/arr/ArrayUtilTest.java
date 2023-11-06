package com.xiaohua.hutool.arr;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author illusion
 * @date 2023/11/6 14:20
 */
public class ArrayUtilTest {


    @Test
    public void isEmptyTest() {

        Object[] obj1 = new Object[]{};
        Object[] obj2 = null;
        Assert.assertTrue(ArrayUtil.isEmpty(obj2));
        Assert.assertTrue(ArrayUtil.isEmpty(obj1));

        int[] ints1 = {};
        int[] ints2 = null;
        Assert.assertTrue(ArrayUtil.isEmpty(ints1));
        Assert.assertTrue(ArrayUtil.isEmpty(ints2));

    }

}

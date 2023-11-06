package com.xiaohua.hutool.arr;

/**
 * @author illusion
 * @date 2023/11/6 11:40
 */
public class ArrayUtil extends PrimitiveArrayUtil {

    /**
     * 数组是否为空
     *
     * @param <T>   数组元素类型
     * @param array 数组
     * @return 是否为空
     */
    public static <T> boolean isEmpty(T[] array) {
        return array == null || array.length == 0;
    }
}

package com.izumi.reggie.common;

// 基于ThreadLocal封装工具类，用于保存和获取当前登陆用户的id
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    // 设置值
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    // 获取值
    public static Long getCurrentId() {
        return threadLocal.get();
    }
}

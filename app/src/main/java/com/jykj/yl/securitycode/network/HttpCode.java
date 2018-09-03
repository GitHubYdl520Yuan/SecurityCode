package com.jykj.yl.securitycode.network;

/**
 * 功能：标记
 */
public class HttpCode {
    public static final String FAILURE = "失败";
    public static final String SUCCESS= "成功";
    public static final int ERROR = 0;//错误
    public static final int HOME = 1;//请求首页的数据
    public static final int DETAILS = 2;//请求详情的数据
    public static final int DOWN_REFRESH = 101;//刷新
    public static final int DOWN_INIT = 102;//初始化界线
    public static final int DOWN_MORE = 103;//加载更多

    public static final int LOGIN=701;  //请求登录
}

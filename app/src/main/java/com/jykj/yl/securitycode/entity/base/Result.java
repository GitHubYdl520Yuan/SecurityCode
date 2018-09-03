package com.jykj.yl.securitycode.entity.base;

/**
 * 功能：返回实体类
 * @param <T>
 */
public class Result<T> {
    private String reason;//返回说明
    private T result;//返回数据
    private int error_code;//错误码

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
}

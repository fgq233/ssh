package com.fgq.util.data;

public class AjaxReturn {

    private Boolean success;
    private Object data;
    private String msg;
    private String errCode;

    public AjaxReturn() {
    }

    public AjaxReturn(Boolean success) {
        this.success = success;
    }

    public AjaxReturn(Boolean success, Object data) {
        this.success = success;
        this.data = data;
    }

    public AjaxReturn(Boolean success, Object data, String msg) {
        this.success = success;
        this.data = data;
        this.msg = msg;
    }

    public AjaxReturn(Boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public AjaxReturn(Boolean success, String msg, String errCode) {
        this.success = success;
        this.msg = msg;
        this.errCode = errCode;
    }

    public AjaxReturn(Boolean success, Object data, String msg, String errCode) {
        this.success = success;
        this.data = data;
        this.msg = msg;
        this.errCode = errCode;
    }

    public Boolean getSuccess() {
        return success;
    }

    public Object getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public String getErrCode() {
        return errCode;
    }

    public AjaxReturn setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public AjaxReturn setData(Object data) {
        this.data = data;
        return this;
    }

    public AjaxReturn setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public AjaxReturn setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
}

package com.zhning.hibbs.exception;

/**
 * Created by zhning on 2016/3/13.
 */
public class BizException extends Exception{
    private int errcode;
    private String errmsg;

    public BizException(Errors error) {
        super(error.getMsg());
        this.errcode = error.getCode();
        this.errmsg = error.getMsg();
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Override
    public String toString() {
        return "ServiceException{" +
                "errcode=" + errcode +
                ", errmsg='" + errmsg + '\'' +
                '}';
    }

    public enum Errors {
        NETWORKNOTAVAILABLE(1000, "网络异常"),
        NULLENTITY(1001,"实体为空"),
        POSTNOTEXIST(1002,"帖子id不存在"),
        CATGNOTEXIST(1003,"类别id不存在"),
        USERNOTEXIST(1004,"用户id不存在")
        ;
        private int code;
        private String msg;


        Errors(int code, String msg) {
            this.msg = msg;
            this.code = code;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}

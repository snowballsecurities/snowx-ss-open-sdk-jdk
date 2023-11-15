// This file is auto-generated, don't edit it. Thanks.
package com.snowballsecurities.snowx.ss.open.api.models;

import com.aliyun.tea.*;

public class LoginResponse extends TeaModel {
    /**
     * <p>接口返回数据的状态</p>
     */
    @NameInMap("result_code")
    @Validation(required = true)
    public String resultCode;

    /**
     * <p>接口信息</p>
     */
    @NameInMap("msg")
    @Validation(required = true)
    public String msg;

    @NameInMap("result_data")
    @Validation(required = true)
    public LoginResponseResultData resultData;

    public static LoginResponse build(java.util.Map<String, ?> map) throws Exception {
        LoginResponse self = new LoginResponse();
        return TeaModel.build(map, self);
    }

    public LoginResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public LoginResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public LoginResponse setResultData(LoginResponseResultData resultData) {
        this.resultData = resultData;
        return this;
    }
    public LoginResponseResultData getResultData() {
        return this.resultData;
    }

    public static class LoginResponseResultData extends TeaModel {
        /**
         * <p>token</p>
         */
        @NameInMap("access_token")
        @Validation(required = true)
        public String accessToken;

        /**
         * <p>token过期时间</p>
         */
        @NameInMap("expiry_time")
        @Validation(required = true)
        public Number expiryTime;

        public static LoginResponseResultData build(java.util.Map<String, ?> map) throws Exception {
            LoginResponseResultData self = new LoginResponseResultData();
            return TeaModel.build(map, self);
        }

        public LoginResponseResultData setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public LoginResponseResultData setExpiryTime(Number expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public Number getExpiryTime() {
            return this.expiryTime;
        }

    }

}

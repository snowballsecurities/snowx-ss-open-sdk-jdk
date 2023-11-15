// This file is auto-generated, don't edit it. Thanks.
package com.snowballsecurities.snowx.ss.open.sdk.models;

import com.aliyun.tea.*;

public class LoginRequest extends TeaModel {
    /**
     * <p>雪盈交易账号 一般是 U 开头</p>
     */
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    /**
     * <p>申请API时填入的 secret key,不是登陆/交易密码</p>
     */
    @NameInMap("secret_key")
    @Validation(required = true)
    public String secretKey;

    public static LoginRequest build(java.util.Map<String, ?> map) throws Exception {
        LoginRequest self = new LoginRequest();
        return TeaModel.build(map, self);
    }

    public LoginRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public LoginRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

}

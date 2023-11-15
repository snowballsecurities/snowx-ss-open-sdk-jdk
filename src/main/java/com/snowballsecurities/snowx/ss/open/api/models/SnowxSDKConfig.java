// This file is auto-generated, don't edit it. Thanks.
package com.snowballsecurities.snowx.ss.open.api.models;

import com.aliyun.tea.*;

public class SnowxSDKConfig extends TeaModel {
    /**
     * <p>接入点 真实环境 "openapi.snbsecurities.com" 测试环境 "sandbox.snbsecurities.com"</p>
     */
    @NameInMap("endpoint")
    @Validation(required = true)
    public String endpoint;

    @NameInMap("protocol")
    @Validation(required = true)
    public String protocol;

    @NameInMap("auth")
    @Validation(required = true)
    public String auth;

    @NameInMap("timeout")
    @Validation(required = true)
    public Number timeout;

    public static SnowxSDKConfig build(java.util.Map<String, ?> map) throws Exception {
        SnowxSDKConfig self = new SnowxSDKConfig();
        return TeaModel.build(map, self);
    }

    public SnowxSDKConfig setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public SnowxSDKConfig setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public SnowxSDKConfig setAuth(String auth) {
        this.auth = auth;
        return this;
    }
    public String getAuth() {
        return this.auth;
    }

    public SnowxSDKConfig setTimeout(Number timeout) {
        this.timeout = timeout;
        return this;
    }
    public Number getTimeout() {
        return this.timeout;
    }

}

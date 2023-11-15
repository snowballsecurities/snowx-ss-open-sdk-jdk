// This file is auto-generated, don't edit it. Thanks.
package com.snowballsecurities.snowx.ss.open.sdk.models;

import com.aliyun.tea.*;

public class GetOrderResponse extends TeaModel {
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
    public OrderEntity resultData;

    public static GetOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrderResponse self = new GetOrderResponse();
        return TeaModel.build(map, self);
    }

    public GetOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetOrderResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetOrderResponse setResultData(OrderEntity resultData) {
        this.resultData = resultData;
        return this;
    }
    public OrderEntity getResultData() {
        return this.resultData;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.snowballsecurities.snowx.ss.open.api.models;

import com.aliyun.tea.*;

public class GetOrderRequest extends TeaModel {
    /**
     * <p>账户 ID</p>
     */
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    /**
     * <p>订单 ID</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static GetOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderRequest self = new GetOrderRequest();
        return TeaModel.build(map, self);
    }

    public GetOrderRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}

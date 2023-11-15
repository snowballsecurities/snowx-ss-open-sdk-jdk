// This file is auto-generated, don't edit it. Thanks.
package com.snowballsecurities.snowx.ss.open.api.models;

import com.aliyun.tea.*;

public class CancelOrderRequest extends TeaModel {
    /**
     * <p>订单 ID</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    /**
     * <p>账户 ID</p>
     */
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    /**
     * <p>新订单 ID</p>
     */
    @NameInMap("new_id")
    @Validation(required = true)
    public String newId;

    public static CancelOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderRequest self = new CancelOrderRequest();
        return TeaModel.build(map, self);
    }

    public CancelOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CancelOrderRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CancelOrderRequest setNewId(String newId) {
        this.newId = newId;
        return this;
    }
    public String getNewId() {
        return this.newId;
    }

}

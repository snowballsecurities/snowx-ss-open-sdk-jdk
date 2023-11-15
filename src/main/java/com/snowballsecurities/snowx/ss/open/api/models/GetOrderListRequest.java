// This file is auto-generated, don't edit it. Thanks.
package com.snowballsecurities.snowx.ss.open.api.models;

import com.aliyun.tea.*;

public class GetOrderListRequest extends TeaModel {
    /**
     * <p>账户 ID</p>
     */
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    /**
     * <p>页码</p>
     */
    @NameInMap("page")
    public Number page;

    /**
     * <p>每页数量</p>
     */
    @NameInMap("size")
    public Number size;

    /**
     * <p>订单状态</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>证券类型</p>
     */
    @NameInMap("security_type")
    public String securityType;

    public static GetOrderListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderListRequest self = new GetOrderListRequest();
        return TeaModel.build(map, self);
    }

    public GetOrderListRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetOrderListRequest setPage(Number page) {
        this.page = page;
        return this;
    }
    public Number getPage() {
        return this.page;
    }

    public GetOrderListRequest setSize(Number size) {
        this.size = size;
        return this;
    }
    public Number getSize() {
        return this.size;
    }

    public GetOrderListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetOrderListRequest setSecurityType(String securityType) {
        this.securityType = securityType;
        return this;
    }
    public String getSecurityType() {
        return this.securityType;
    }

}

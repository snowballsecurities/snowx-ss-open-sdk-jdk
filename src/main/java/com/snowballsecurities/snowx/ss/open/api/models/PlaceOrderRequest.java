// This file is auto-generated, don't edit it. Thanks.
package com.snowballsecurities.snowx.ss.open.api.models;

import com.aliyun.tea.*;

public class PlaceOrderRequest extends TeaModel {
    /**
     * <p>订单 ID</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    /**
     * <p>账户 ID</p>
     */
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    /**
     * <p>证券类型</p>
     */
    @NameInMap("security_type")
    @Validation(required = true)
    public String securityType;

    /**
     * <p>证券代码</p>
     */
    @NameInMap("symbol")
    @Validation(required = true)
    public String symbol;

    /**
     * <p>交易所</p>
     */
    @NameInMap("exchange")
    public String exchange;

    /**
     * <p>订单类型</p>
     */
    @NameInMap("order_type")
    @Validation(required = true)
    public String orderType;

    /**
     * <p>订单方向</p>
     */
    @NameInMap("side")
    @Validation(required = true)
    public String side;

    /**
     * <p>币种</p>
     */
    @NameInMap("currency")
    public String currency;

    /**
     * <p>下单数量</p>
     */
    @NameInMap("quantity")
    @Validation(required = true)
    public Double quantity;

    /**
     * <p>下单价格</p>
     */
    @NameInMap("price")
    public Double price;

    /**
     * <p>订单有效期</p>
     */
    @NameInMap("tif")
    public String tif;

    /**
     * <p>是否仅限盘中</p>
     */
    @NameInMap("rth")
    public Boolean rth;

    /**
     * <p>止损止盈触发价格</p>
     */
    @NameInMap("stop_price")
    public Double stopPrice;

    /**
     * <p>父订单 ID</p>
     */
    @NameInMap("parent")
    public String parent;

    public static PlaceOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        PlaceOrderRequest self = new PlaceOrderRequest();
        return TeaModel.build(map, self);
    }

    public PlaceOrderRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public PlaceOrderRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PlaceOrderRequest setSecurityType(String securityType) {
        this.securityType = securityType;
        return this;
    }
    public String getSecurityType() {
        return this.securityType;
    }

    public PlaceOrderRequest setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }
    public String getSymbol() {
        return this.symbol;
    }

    public PlaceOrderRequest setExchange(String exchange) {
        this.exchange = exchange;
        return this;
    }
    public String getExchange() {
        return this.exchange;
    }

    public PlaceOrderRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public PlaceOrderRequest setSide(String side) {
        this.side = side;
        return this;
    }
    public String getSide() {
        return this.side;
    }

    public PlaceOrderRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public PlaceOrderRequest setQuantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }
    public Double getQuantity() {
        return this.quantity;
    }

    public PlaceOrderRequest setPrice(Double price) {
        this.price = price;
        return this;
    }
    public Double getPrice() {
        return this.price;
    }

    public PlaceOrderRequest setTif(String tif) {
        this.tif = tif;
        return this;
    }
    public String getTif() {
        return this.tif;
    }

    public PlaceOrderRequest setRth(Boolean rth) {
        this.rth = rth;
        return this;
    }
    public Boolean getRth() {
        return this.rth;
    }

    public PlaceOrderRequest setStopPrice(Double stopPrice) {
        this.stopPrice = stopPrice;
        return this;
    }
    public Double getStopPrice() {
        return this.stopPrice;
    }

    public PlaceOrderRequest setParent(String parent) {
        this.parent = parent;
        return this;
    }
    public String getParent() {
        return this.parent;
    }

}

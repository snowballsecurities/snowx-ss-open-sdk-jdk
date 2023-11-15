// This file is auto-generated, don't edit it. Thanks.
package com.snowballsecurities.snowx.ss.open.sdk.models;

import com.aliyun.tea.*;

public class OrderEntity extends TeaModel {
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
    @Validation(required = true)
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
    @Validation(required = true)
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
    @Validation(required = true)
    public Double price;

    /**
     * <p>订单有效期</p>
     */
    @NameInMap("tif")
    @Validation(required = true)
    public String tif;

    /**
     * <p>是否仅限盘中</p>
     */
    @NameInMap("rth")
    @Validation(required = true)
    public Boolean rth;

    /**
     * <p>订单状态</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    /**
     * <p>成交数量</p>
     */
    @NameInMap("filled_quantity")
    @Validation(required = true)
    public Double filledQuantity;

    /**
     * <p>成交均价</p>
     */
    @NameInMap("average_price")
    @Validation(required = true)
    public Double averagePrice;

    /**
     * <p>下单时间</p>
     */
    @NameInMap("order_time")
    @Validation(required = true)
    public String orderTime;

    /**
     * <p>备注</p>
     */
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    /**
     * <p>上游订单 ID</p>
     */
    @NameInMap("secondary_order_id")
    @Validation(required = true)
    public String secondaryOrderId;

    /**
     * <p>止损价格</p>
     */
    @NameInMap("stop_price")
    @Validation(required = true)
    public Double stopPrice;

    /**
     * <p>父订单 ID</p>
     */
    @NameInMap("parent")
    public String parent;

    public static OrderEntity build(java.util.Map<String, ?> map) throws Exception {
        OrderEntity self = new OrderEntity();
        return TeaModel.build(map, self);
    }

    public OrderEntity setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OrderEntity setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public OrderEntity setSecurityType(String securityType) {
        this.securityType = securityType;
        return this;
    }
    public String getSecurityType() {
        return this.securityType;
    }

    public OrderEntity setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }
    public String getSymbol() {
        return this.symbol;
    }

    public OrderEntity setExchange(String exchange) {
        this.exchange = exchange;
        return this;
    }
    public String getExchange() {
        return this.exchange;
    }

    public OrderEntity setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public OrderEntity setSide(String side) {
        this.side = side;
        return this;
    }
    public String getSide() {
        return this.side;
    }

    public OrderEntity setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public OrderEntity setQuantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }
    public Double getQuantity() {
        return this.quantity;
    }

    public OrderEntity setPrice(Double price) {
        this.price = price;
        return this;
    }
    public Double getPrice() {
        return this.price;
    }

    public OrderEntity setTif(String tif) {
        this.tif = tif;
        return this;
    }
    public String getTif() {
        return this.tif;
    }

    public OrderEntity setRth(Boolean rth) {
        this.rth = rth;
        return this;
    }
    public Boolean getRth() {
        return this.rth;
    }

    public OrderEntity setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OrderEntity setFilledQuantity(Double filledQuantity) {
        this.filledQuantity = filledQuantity;
        return this;
    }
    public Double getFilledQuantity() {
        return this.filledQuantity;
    }

    public OrderEntity setAveragePrice(Double averagePrice) {
        this.averagePrice = averagePrice;
        return this;
    }
    public Double getAveragePrice() {
        return this.averagePrice;
    }

    public OrderEntity setOrderTime(String orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public String getOrderTime() {
        return this.orderTime;
    }

    public OrderEntity setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public OrderEntity setSecondaryOrderId(String secondaryOrderId) {
        this.secondaryOrderId = secondaryOrderId;
        return this;
    }
    public String getSecondaryOrderId() {
        return this.secondaryOrderId;
    }

    public OrderEntity setStopPrice(Double stopPrice) {
        this.stopPrice = stopPrice;
        return this;
    }
    public Double getStopPrice() {
        return this.stopPrice;
    }

    public OrderEntity setParent(String parent) {
        this.parent = parent;
        return this;
    }
    public String getParent() {
        return this.parent;
    }

}

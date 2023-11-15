// This file is auto-generated, don't edit it. Thanks.
package com.snowballsecurities.snowx.ss.open.api.models;

import com.aliyun.tea.*;

public class GetOrderListResponse extends TeaModel {
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
    public GetOrderListResponseResultData resultData;

    public static GetOrderListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrderListResponse self = new GetOrderListResponse();
        return TeaModel.build(map, self);
    }

    public GetOrderListResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetOrderListResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetOrderListResponse setResultData(GetOrderListResponseResultData resultData) {
        this.resultData = resultData;
        return this;
    }
    public GetOrderListResponseResultData getResultData() {
        return this.resultData;
    }

    public static class GetOrderListResponseResultData extends TeaModel {
        /**
         * <p>页码</p>
         */
        @NameInMap("page")
        @Validation(required = true)
        public Number page;

        /**
         * <p>每页数量</p>
         */
        @NameInMap("size")
        @Validation(required = true)
        public Number size;

        /**
         * <p>总数量</p>
         */
        @NameInMap("count")
        @Validation(required = true)
        public Number count;

        @NameInMap("items")
        @Validation(required = true)
        public java.util.List<OrderEntity> items;

        public static GetOrderListResponseResultData build(java.util.Map<String, ?> map) throws Exception {
            GetOrderListResponseResultData self = new GetOrderListResponseResultData();
            return TeaModel.build(map, self);
        }

        public GetOrderListResponseResultData setPage(Number page) {
            this.page = page;
            return this;
        }
        public Number getPage() {
            return this.page;
        }

        public GetOrderListResponseResultData setSize(Number size) {
            this.size = size;
            return this;
        }
        public Number getSize() {
            return this.size;
        }

        public GetOrderListResponseResultData setCount(Number count) {
            this.count = count;
            return this;
        }
        public Number getCount() {
            return this.count;
        }

        public GetOrderListResponseResultData setItems(java.util.List<OrderEntity> items) {
            this.items = items;
            return this;
        }
        public java.util.List<OrderEntity> getItems() {
            return this.items;
        }

    }

}

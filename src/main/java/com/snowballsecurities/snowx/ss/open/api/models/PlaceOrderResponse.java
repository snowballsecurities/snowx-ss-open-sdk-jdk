// This file is auto-generated, don't edit it. Thanks.
package com.snowballsecurities.snowx.ss.open.api.models;

import com.aliyun.tea.*;

public class PlaceOrderResponse extends TeaModel {
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
    public PlaceOrderResponseResultData resultData;

    public static PlaceOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        PlaceOrderResponse self = new PlaceOrderResponse();
        return TeaModel.build(map, self);
    }

    public PlaceOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PlaceOrderResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public PlaceOrderResponse setResultData(PlaceOrderResponseResultData resultData) {
        this.resultData = resultData;
        return this;
    }
    public PlaceOrderResponseResultData getResultData() {
        return this.resultData;
    }

    public static class PlaceOrderResponseResultData extends TeaModel {
        /**
         * <p>订单 ID</p>
         */
        @NameInMap("id")
        @Validation(required = true)
        public String id;

        /**
         * <p>订单状态</p>
         */
        @NameInMap("status")
        @Validation(required = true)
        public String status;

        /**
         * <p>备注</p>
         */
        @NameInMap("memo")
        @Validation(required = true)
        public String memo;

        public static PlaceOrderResponseResultData build(java.util.Map<String, ?> map) throws Exception {
            PlaceOrderResponseResultData self = new PlaceOrderResponseResultData();
            return TeaModel.build(map, self);
        }

        public PlaceOrderResponseResultData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PlaceOrderResponseResultData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PlaceOrderResponseResultData setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

    }

}

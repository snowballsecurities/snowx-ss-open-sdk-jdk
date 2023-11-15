// This file is auto-generated, don't edit it. Thanks.
package com.snowballsecurities.snowx.ss.open.sdk.models;

import com.aliyun.tea.*;

public class CancelOrderResponse extends TeaModel {
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
    public CancelOrderResponseResultData resultData;

    public static CancelOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderResponse self = new CancelOrderResponse();
        return TeaModel.build(map, self);
    }

    public CancelOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelOrderResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CancelOrderResponse setResultData(CancelOrderResponseResultData resultData) {
        this.resultData = resultData;
        return this;
    }
    public CancelOrderResponseResultData getResultData() {
        return this.resultData;
    }

    public static class CancelOrderResponseResultData extends TeaModel {
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

        public static CancelOrderResponseResultData build(java.util.Map<String, ?> map) throws Exception {
            CancelOrderResponseResultData self = new CancelOrderResponseResultData();
            return TeaModel.build(map, self);
        }

        public CancelOrderResponseResultData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CancelOrderResponseResultData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

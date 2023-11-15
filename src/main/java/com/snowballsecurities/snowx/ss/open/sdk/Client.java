// This file is auto-generated, don't edit it. Thanks.
package com.snowballsecurities.snowx.ss.open.sdk;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.snowballsecurities.snowx.ss.open.sdk.models.*;

public class Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    public String _auth;
    public String _endpoint_host;
    public String _protocol;
    public Number _timeout;
    /**
    * init the client
    * @param config Config of the config
    */
    public Client(SnowxSDKConfig config) throws Exception {
        this._endpoint_host = config.endpoint;
        this._auth = config.auth;
        this._protocol = config.protocol;
        this._timeout = config.timeout;
    }

    public java.util.Map<String, ?> _get(String pathname, TeaModel query) throws Exception {
        TeaModel.validateParams(query, "query");
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeout", _timeout)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                request_.protocol = _protocol;
                request_.method = "GET";
                request_.pathname = pathname;
                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", _endpoint_host),
                    new TeaPair("accept", "application/json")
                );
                if (!com.aliyun.teautil.Common.isUnset(_auth)) {
                    request_.headers.put("Cookie", "access_token=" + _auth + "");
                }

                request_.query = com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(query));
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

                return this._handle(response_);
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }
        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    public java.util.Map<String, ?> _delete(String pathname, TeaModel query) throws Exception {
        TeaModel.validateParams(query, "query");
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeout", _timeout)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                request_.protocol = _protocol;
                request_.method = "DELETE";
                request_.pathname = pathname;
                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", _endpoint_host),
                    new TeaPair("accept", "application/json")
                );
                if (!com.aliyun.teautil.Common.isUnset(_auth)) {
                    request_.headers.put("Cookie", "access_token=" + _auth + "");
                }

                request_.query = com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(query));
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

                return this._handle(response_);
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }
        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    public java.util.Map<String, ?> _post(String pathname, TeaModel query, TeaModel body) throws Exception {
        TeaModel.validateParams(query, "query");
        TeaModel.validateParams(body, "body");
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeout", _timeout)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                request_.protocol = _protocol;
                request_.method = "POST";
                request_.pathname = pathname;
                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", _endpoint_host),
                    new TeaPair("accept", "application/json"),
                    new TeaPair("content-type", "application/json; charset=utf-8")
                );
                if (!com.aliyun.teautil.Common.isUnset(_auth)) {
                    request_.headers.put("Cookie", "access_token=" + _auth + "");
                }

                request_.query = com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(query));
                request_.body = Tea.toReadable(com.aliyun.teautil.Common.toJSONString(com.aliyun.teautil.Common.toMap(body)));
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

                return this._handle(response_);
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }
        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    /**
    * Login
    * @param body
    */
    public LoginResponse login(LoginRequest body) throws Exception {
        TeaModel.validateParams(body, "body");
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeout", _timeout)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                request_.protocol = _protocol;
                request_.method = "POST";
                request_.pathname = "/v2/auth/access-token";
                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", _endpoint_host),
                    new TeaPair("accept", "application/json"),
                    new TeaPair("content-type", "application/json; charset=utf-8")
                );
                request_.body = Tea.toReadable(com.aliyun.teautil.Common.toJSONString(body));
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

                this._handle(response_);
                java.util.Map<String, Object> result = com.aliyun.teautil.Common.assertAsMap(com.aliyun.teautil.Common.readAsJSON(response_.body));
                java.util.Map<String, Object> resultData = com.aliyun.teautil.Common.assertAsMap(result.get("result_data"));
                this._auth = com.aliyun.teautil.Common.assertAsString(resultData.get("access_token"));
                return TeaModel.toModel(TeaConverter.merge(Object.class,
                    result
                ), new LoginResponse());
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }
        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    public void addRuntimeOptionsInterceptor(RuntimeOptionsInterceptor interceptor) {
        interceptorChain.addRuntimeOptionsInterceptor(interceptor);
    }

    public void addRequestInterceptor(RequestInterceptor interceptor) {
        interceptorChain.addRequestInterceptor(interceptor);
    }

    public void addResponseInterceptor(ResponseInterceptor interceptor) {
        interceptorChain.addResponseInterceptor(interceptor);
    }

    public java.util.Map<String, ?> _handle(TeaResponse response) throws Exception {
        java.util.Map<String, Object> result = com.aliyun.teautil.Common.assertAsMap(com.aliyun.teautil.Common.readAsJSON(response.body));
        if (!com.aliyun.teautil.Common.equalNumber(response.statusCode, 200)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("message", "code: " + result.get("result_code") + " reason: " + result.get("msg") + ""),
                new TeaPair("code", "" + result.get("result_code") + "")
            ));
        }

        String code = com.aliyun.teautil.Common.assertAsString(result.get("result_code"));
        if (!com.aliyun.teautil.Common.equalString(code, "60000")) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("message", "code: " + result.get("result_code") + " reason: " + result.get("msg") + ""),
                new TeaPair("code", "" + result.get("result_code") + "")
            ));
        }

        return TeaConverter.merge(Object.class,
            result
        );
    }

    /**
    * 根据订单ID获取订单详情
    * @param body
    */
    public GetOrderResponse getOrder(GetOrderRequest body) throws Exception {
        return TeaModel.toModel(this._get("/order/" + body.orderId + "", body), new GetOrderResponse());
    }

    /**
    * 获取订单列表
    * @param body
    */
    public GetOrderListResponse getOrderList(GetOrderListRequest body) throws Exception {
        return TeaModel.toModel(this._get("/order", body), new GetOrderListResponse());
    }

    /**
    * 撤单
    * @param body
    */
    public CancelOrderResponse cancelOrder(CancelOrderRequest body) throws Exception {
        return TeaModel.toModel(this._delete("/order/" + body.orderId + "", body), new CancelOrderResponse());
    }

    public PlaceOrderResponse placeOrder(PlaceOrderRequest body) throws Exception {
        return TeaModel.toModel(this._post("/order/v2/" + body.id + "", null, body), new PlaceOrderResponse());
    }
}

# FraudNotificationApi

All URIs are relative to *https://financialdataexchange-prod.apigee.net/fdx-v50-core-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportSuspectedFraudIncident**](FraudNotificationApi.md#reportSuspectedFraudIncident) | **POST** /fraud/suspected-incident | Notify Data Provider of fraud

<a name="reportSuspectedFraudIncident"></a>
# **reportSuspectedFraudIncident**
> reportSuspectedFraudIncident(authorization, body)

Notify Data Provider of fraud

Notify Data Provider of suspected fraud

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FraudNotificationApi;


FraudNotificationApi apiInstance = new FraudNotificationApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
SuspectedFraudIncident body = new SuspectedFraudIncident(); // SuspectedFraudIncident | 
try {
    apiInstance.reportSuspectedFraudIncident(authorization, body);
} catch (ApiException e) {
    System.err.println("Exception when calling FraudNotificationApi#reportSuspectedFraudIncident");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **body** | [**SuspectedFraudIncident**](SuspectedFraudIncident.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


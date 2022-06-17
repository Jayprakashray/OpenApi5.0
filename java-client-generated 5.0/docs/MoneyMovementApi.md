# MoneyMovementApi

All URIs are relative to *https://financialdataexchange-prod.apigee.net/fdx-v50-core-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountPaymentNetworks**](MoneyMovementApi.md#getAccountPaymentNetworks) | **GET** /accounts/{accountId}/payment-networks | Get payment networks supported by the account

<a name="getAccountPaymentNetworks"></a>
# **getAccountPaymentNetworks**
> AccountPaymentNetworkList getAccountPaymentNetworks(authorization, accountId, offset, limit)

Get payment networks supported by the account

Get payment networks supported by the account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MoneyMovementApi;


MoneyMovementApi apiInstance = new MoneyMovementApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
String accountId = "accountId_example"; // String | Account Identifier
String offset = "offset_example"; // String | Opaque cursor used by the provider to send the next set of records
Integer limit = 56; // Integer | Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values
try {
    AccountPaymentNetworkList result = apiInstance.getAccountPaymentNetworks(authorization, accountId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoneyMovementApi#getAccountPaymentNetworks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **accountId** | **String**| Account Identifier |
 **offset** | **String**| Opaque cursor used by the provider to send the next set of records | [optional]
 **limit** | **Integer**| Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values | [optional]

### Return type

[**AccountPaymentNetworkList**](AccountPaymentNetworkList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


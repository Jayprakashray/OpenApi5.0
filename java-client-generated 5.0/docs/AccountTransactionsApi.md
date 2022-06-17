# AccountTransactionsApi

All URIs are relative to *https://financialdataexchange-prod.apigee.net/fdx-v50-core-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountTransactionImages**](AccountTransactionsApi.md#getAccountTransactionImages) | **GET** /accounts/{accountId}/transaction-images/{imageId} | Get account transaction image
[**searchForAccountTransactions**](AccountTransactionsApi.md#searchForAccountTransactions) | **GET** /accounts/{accountId}/transactions | Search for account transactions

<a name="getAccountTransactionImages"></a>
# **getAccountTransactionImages**
> File getAccountTransactionImages(authorization, accountId, imageId)

Get account transaction image

Get account transaction image

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountTransactionsApi;


AccountTransactionsApi apiInstance = new AccountTransactionsApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
String accountId = "accountId_example"; // String | Account Identifier
String imageId = "imageId_example"; // String | Image Identifier
try {
    File result = apiInstance.getAccountTransactionImages(authorization, accountId, imageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountTransactionsApi#getAccountTransactionImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **accountId** | **String**| Account Identifier |
 **imageId** | **String**| Image Identifier |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, image/gif, image/jpeg, image/tiff, image/png

<a name="searchForAccountTransactions"></a>
# **searchForAccountTransactions**
> Transactions searchForAccountTransactions(authorization, accountId, startTime, endTime, offset, limit)

Search for account transactions

Search for account transactions. Example: /accounts/{accountId}/transactions?startTime&#x3D;value1&amp;endTime&#x3D;value2

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountTransactionsApi;


AccountTransactionsApi apiInstance = new AccountTransactionsApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
String accountId = "accountId_example"; // String | Account Identifier
LocalDate startTime = new LocalDate(); // LocalDate | Start time for use in retrieval of elements (ISO 8601)
LocalDate endTime = new LocalDate(); // LocalDate | End time for use in retrieval of elements (ISO 8601)
String offset = "offset_example"; // String | Opaque cursor used by the provider to send the next set of records
Integer limit = 56; // Integer | Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values
try {
    Transactions result = apiInstance.searchForAccountTransactions(authorization, accountId, startTime, endTime, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountTransactionsApi#searchForAccountTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **accountId** | **String**| Account Identifier |
 **startTime** | [**LocalDate**](.md)| Start time for use in retrieval of elements (ISO 8601) | [optional]
 **endTime** | [**LocalDate**](.md)| End time for use in retrieval of elements (ISO 8601) | [optional]
 **offset** | **String**| Opaque cursor used by the provider to send the next set of records | [optional]
 **limit** | **Integer**| Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values | [optional]

### Return type

[**Transactions**](Transactions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


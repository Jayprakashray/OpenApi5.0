# AccountStatementsApi

All URIs are relative to *https://financialdataexchange-prod.apigee.net/fdx-v50-core-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountStatement**](AccountStatementsApi.md#getAccountStatement) | **GET** /accounts/{accountId}/statements/{statementId} | Get an account statement
[**searchForAccountStatements**](AccountStatementsApi.md#searchForAccountStatements) | **GET** /accounts/{accountId}/statements | Search for statements

<a name="getAccountStatement"></a>
# **getAccountStatement**
> File getAccountStatement(authorization, accountId, statementId)

Get an account statement

Gets an account statement image file. Use [HTTP Accept request-header](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html) to specify desired content types. See ContentTypes definition for typical values

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountStatementsApi;


AccountStatementsApi apiInstance = new AccountStatementsApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
String accountId = "accountId_example"; // String | Account Identifier
String statementId = "statementId_example"; // String | Statement Identifier
try {
    File result = apiInstance.getAccountStatement(authorization, accountId, statementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountStatementsApi#getAccountStatement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **accountId** | **String**| Account Identifier |
 **statementId** | **String**| Statement Identifier |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, image/gif, image/jpeg, image/tiff, image/png, application/json

<a name="searchForAccountStatements"></a>
# **searchForAccountStatements**
> Statements searchForAccountStatements(authorization, accountId, startTime, endTime, offset, limit)

Search for statements

Get account statements. Example: GET /accounts/{accountId}/statements?startTime&#x3D;value1&amp;endTime&#x3D;value2

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountStatementsApi;


AccountStatementsApi apiInstance = new AccountStatementsApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
String accountId = "accountId_example"; // String | Account Identifier
LocalDate startTime = new LocalDate(); // LocalDate | Start time for use in retrieval of elements (ISO 8601)
LocalDate endTime = new LocalDate(); // LocalDate | End time for use in retrieval of elements (ISO 8601)
String offset = "offset_example"; // String | Opaque cursor used by the provider to send the next set of records
Integer limit = 56; // Integer | Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values
try {
    Statements result = apiInstance.searchForAccountStatements(authorization, accountId, startTime, endTime, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountStatementsApi#searchForAccountStatements");
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

[**Statements**](Statements.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


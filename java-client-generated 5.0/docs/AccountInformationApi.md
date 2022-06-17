# AccountInformationApi

All URIs are relative to *https://financialdataexchange-prod.apigee.net/fdx-v50-core-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccount**](AccountInformationApi.md#getAccount) | **GET** /accounts/{accountId} | Get an account
[**searchForAccounts**](AccountInformationApi.md#searchForAccounts) | **GET** /accounts | Search for accounts

<a name="getAccount"></a>
# **getAccount**
> AccountWithDetails getAccount(authorization, accountId)

Get an account

Get a specific account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountInformationApi;


AccountInformationApi apiInstance = new AccountInformationApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
String accountId = "accountId_example"; // String | Account Identifier
try {
    AccountWithDetails result = apiInstance.getAccount(authorization, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationApi#getAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **accountId** | **String**| Account Identifier |

### Return type

[**AccountWithDetails**](AccountWithDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchForAccounts"></a>
# **searchForAccounts**
> Accounts searchForAccounts(authorization, accountIds, startTime, endTime, resultType, offset, limit)

Search for accounts

Query all information for a set of accounts provided in the payload

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountInformationApi;


AccountInformationApi apiInstance = new AccountInformationApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
List<String> accountIds = Arrays.asList("accountIds_example"); // List<String> | Comma separated list of account ids
List<LocalDate> startTime = Arrays.asList(new LocalDate()); // List<LocalDate> | Start time for use in retrieval of transactions
List<LocalDate> endTime = Arrays.asList(new LocalDate()); // List<LocalDate> | End time for use in retrieval of transactions
ResultType resultType = new ResultType(); // ResultType | Flag to indicate if you want a lightweight array of metadata (AccountDescriptor or Tax or Operations) or full item details (Account or a Tax subclass or Availability details). If set to 'lightweight', should only return the fields associated with the metadata entity. This field is not required, defaults to lightweight
String offset = "offset_example"; // String | Opaque cursor used by the provider to send the next set of records
Integer limit = 56; // Integer | Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values
try {
    Accounts result = apiInstance.searchForAccounts(authorization, accountIds, startTime, endTime, resultType, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationApi#searchForAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **accountIds** | [**List&lt;String&gt;**](String.md)| Comma separated list of account ids | [optional]
 **startTime** | [**List&lt;LocalDate&gt;**](LocalDate.md)| Start time for use in retrieval of transactions | [optional]
 **endTime** | [**List&lt;LocalDate&gt;**](LocalDate.md)| End time for use in retrieval of transactions | [optional]
 **resultType** | [**ResultType**](.md)| Flag to indicate if you want a lightweight array of metadata (AccountDescriptor or Tax or Operations) or full item details (Account or a Tax subclass or Availability details). If set to &#x27;lightweight&#x27;, should only return the fields associated with the metadata entity. This field is not required, defaults to lightweight | [optional]
 **offset** | **String**| Opaque cursor used by the provider to send the next set of records | [optional]
 **limit** | **Integer**| Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values | [optional]

### Return type

[**Accounts**](Accounts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


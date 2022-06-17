# PersonalInformationApi

All URIs are relative to *https://financialdataexchange-prod.apigee.net/fdx-v50-core-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountContact**](PersonalInformationApi.md#getAccountContact) | **GET** /accounts/{accountId}/contact | Get an account&#x27;s contact information
[**getCustomer**](PersonalInformationApi.md#getCustomer) | **GET** /customers/{customerId} | Customer by id
[**getCustomerInfo**](PersonalInformationApi.md#getCustomerInfo) | **GET** /customers/current | Get current authenticated customer information
[**getCustomers**](PersonalInformationApi.md#getCustomers) | **GET** /customers | Retrieve customers

<a name="getAccountContact"></a>
# **getAccountContact**
> AccountContact getAccountContact(authorization, accountId)

Get an account&#x27;s contact information

Get contact information on the account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PersonalInformationApi;


PersonalInformationApi apiInstance = new PersonalInformationApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
String accountId = "accountId_example"; // String | Account Identifier
try {
    AccountContact result = apiInstance.getAccountContact(authorization, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalInformationApi#getAccountContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **accountId** | **String**| Account Identifier |

### Return type

[**AccountContact**](AccountContact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomer"></a>
# **getCustomer**
> Customer getCustomer(authorization, customerId)

Customer by id

Retrieve customer information by customer id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PersonalInformationApi;


PersonalInformationApi apiInstance = new PersonalInformationApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
String customerId = "customerId_example"; // String | Customer Identifier
try {
    Customer result = apiInstance.getCustomer(authorization, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalInformationApi#getCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **customerId** | **String**| Customer Identifier |

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerInfo"></a>
# **getCustomerInfo**
> Customer getCustomerInfo(authorization)

Get current authenticated customer information

Get information about the customer within the authorization scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PersonalInformationApi;


PersonalInformationApi apiInstance = new PersonalInformationApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
try {
    Customer result = apiInstance.getCustomerInfo(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalInformationApi#getCustomerInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomers"></a>
# **getCustomers**
> Customers getCustomers(authorization, offset, limit)

Retrieve customers

Retrieve account holders related to consented accounts

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PersonalInformationApi;


PersonalInformationApi apiInstance = new PersonalInformationApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
String offset = "offset_example"; // String | Opaque cursor used by the provider to send the next set of records
Integer limit = 56; // Integer | Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values
try {
    Customers result = apiInstance.getCustomers(authorization, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalInformationApi#getCustomers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **offset** | **String**| Opaque cursor used by the provider to send the next set of records | [optional]
 **limit** | **Integer**| Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values | [optional]

### Return type

[**Customers**](Customers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


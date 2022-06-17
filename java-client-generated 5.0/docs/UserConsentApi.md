# UserConsentApi

All URIs are relative to *https://financialdataexchange-prod.apigee.net/fdx-v50-core-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConsentGrant**](UserConsentApi.md#getConsentGrant) | **GET** /consents/{consentId} | Get Consent Grant

<a name="getConsentGrant"></a>
# **getConsentGrant**
> ConsentGrant getConsentGrant(authorization, consentId)

Get Consent Grant

Get a Consent Grant

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserConsentApi;


UserConsentApi apiInstance = new UserConsentApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
ConsentId consentId = new ConsentId(); // ConsentId | Consent Grant ID
try {
    ConsentGrant result = apiInstance.getConsentGrant(authorization, consentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserConsentApi#getConsentGrant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **consentId** | [**ConsentId**](.md)| Consent Grant ID |

### Return type

[**ConsentGrant**](ConsentGrant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


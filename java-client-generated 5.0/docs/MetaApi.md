# MetaApi

All URIs are relative to *https://financialdataexchange-prod.apigee.net/fdx-v50-core-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAvailability**](MetaApi.md#getAvailability) | **GET** /availability | Get API availability
[**getCapability**](MetaApi.md#getCapability) | **GET** /capability | Get API capability
[**getCertificationMetrics**](MetaApi.md#getCertificationMetrics) | **GET** /certification-metrics | Get certification performance metrics

<a name="getAvailability"></a>
# **getAvailability**
> AvailabilityList getAvailability(authorization, operationId)

Get API availability

Get information about this API&#x27;s availability

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MetaApi;


MetaApi apiInstance = new MetaApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
OperationId operationId = new OperationId(); // OperationId | Specific operationId for which to get the metrics. Optional
try {
    AvailabilityList result = apiInstance.getAvailability(authorization, operationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#getAvailability");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **operationId** | [**OperationId**](.md)| Specific operationId for which to get the metrics. Optional | [optional]

### Return type

[**AvailabilityList**](AvailabilityList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCapability"></a>
# **getCapability**
> Capability getCapability(authorization, operationId, fdxVersion, resultType)

Get API capability

Get information about this API&#x27;s capability

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MetaApi;


MetaApi apiInstance = new MetaApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
OperationId operationId = new OperationId(); // OperationId | Specific operationId for which to get the metrics. Optional
FdxVersion fdxVersion = new FdxVersion(); // FdxVersion | Specific FDX version for which to get the capability. Optional
ResultType resultType = new ResultType(); // ResultType | Flag to indicate if you want a lightweight array of metadata (AccountDescriptor or Tax or Operations) or full item details (Account or a Tax subclass or Availability details). If set to 'lightweight', should only return the fields associated with the metadata entity. This field is not required, defaults to lightweight
try {
    Capability result = apiInstance.getCapability(authorization, operationId, fdxVersion, resultType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#getCapability");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **operationId** | [**OperationId**](.md)| Specific operationId for which to get the metrics. Optional | [optional]
 **fdxVersion** | [**FdxVersion**](.md)| Specific FDX version for which to get the capability. Optional | [optional]
 **resultType** | [**ResultType**](.md)| Flag to indicate if you want a lightweight array of metadata (AccountDescriptor or Tax or Operations) or full item details (Account or a Tax subclass or Availability details). If set to &#x27;lightweight&#x27;, should only return the fields associated with the metadata entity. This field is not required, defaults to lightweight | [optional]

### Return type

[**Capability**](Capability.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCertificationMetrics"></a>
# **getCertificationMetrics**
> CertificationMetrics getCertificationMetrics(authorization, operationId)

Get certification performance metrics

Get certification performance metrics for this implementer&#x27;s APIs

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MetaApi;


MetaApi apiInstance = new MetaApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
OperationId operationId = new OperationId(); // OperationId | Specific operationId for which to get the metrics. Optional
try {
    CertificationMetrics result = apiInstance.getCertificationMetrics(authorization, operationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#getCertificationMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **operationId** | [**OperationId**](.md)| Specific operationId for which to get the metrics. Optional | [optional]

### Return type

[**CertificationMetrics**](CertificationMetrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# RewardProgramCategoriesApi

All URIs are relative to *https://financialdataexchange-prod.apigee.net/fdx-v50-core-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRewardProgramCategories**](RewardProgramCategoriesApi.md#getRewardProgramCategories) | **GET** /reward-programs/{rewardProgramId}/categories | Get reward categories

<a name="getRewardProgramCategories"></a>
# **getRewardProgramCategories**
> RewardCategories getRewardProgramCategories(authorization, rewardProgramId, offset, limit)

Get reward categories

Get reward categories

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RewardProgramCategoriesApi;


RewardProgramCategoriesApi apiInstance = new RewardProgramCategoriesApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
String rewardProgramId = "rewardProgramId_example"; // String | Reward Program Identifier
String offset = "offset_example"; // String | Opaque cursor used by the provider to send the next set of records
Integer limit = 56; // Integer | Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values
try {
    RewardCategories result = apiInstance.getRewardProgramCategories(authorization, rewardProgramId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RewardProgramCategoriesApi#getRewardProgramCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **rewardProgramId** | **String**| Reward Program Identifier |
 **offset** | **String**| Opaque cursor used by the provider to send the next set of records | [optional]
 **limit** | **Integer**| Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values | [optional]

### Return type

[**RewardCategories**](RewardCategories.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


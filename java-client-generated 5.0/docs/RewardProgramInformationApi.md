# RewardProgramInformationApi

All URIs are relative to *https://financialdataexchange-prod.apigee.net/fdx-v50-core-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRewardProgram**](RewardProgramInformationApi.md#getRewardProgram) | **GET** /reward-programs/{rewardProgramId} | Get reward program
[**searchRewardPrograms**](RewardProgramInformationApi.md#searchRewardPrograms) | **GET** /reward-programs | Search reward programs

<a name="getRewardProgram"></a>
# **getRewardProgram**
> RewardProgram getRewardProgram(authorization, rewardProgramId)

Get reward program

Get a specific reward program

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RewardProgramInformationApi;


RewardProgramInformationApi apiInstance = new RewardProgramInformationApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
String rewardProgramId = "rewardProgramId_example"; // String | Reward Program Identifier
try {
    RewardProgram result = apiInstance.getRewardProgram(authorization, rewardProgramId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RewardProgramInformationApi#getRewardProgram");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |
 **rewardProgramId** | **String**| Reward Program Identifier |

### Return type

[**RewardProgram**](RewardProgram.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchRewardPrograms"></a>
# **searchRewardPrograms**
> RewardPrograms searchRewardPrograms(authorization)

Search reward programs

Query all reward programs

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RewardProgramInformationApi;


RewardProgramInformationApi apiInstance = new RewardProgramInformationApi();
String authorization = "authorization_example"; // String | Access token for authentication and authorization
try {
    RewardPrograms result = apiInstance.searchRewardPrograms(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RewardProgramInformationApi#searchRewardPrograms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Access token for authentication and authorization |

### Return type

[**RewardPrograms**](RewardPrograms.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


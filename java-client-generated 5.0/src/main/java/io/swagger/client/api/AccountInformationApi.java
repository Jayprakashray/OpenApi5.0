/*
 * FDX V5.0
 * Financial Data Exchange V5.0 Core API
 *
 * OpenAPI spec version: 5.0.0
 * Contact: fdxsupport@financialdataexchange.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.AccountWithDetails;
import io.swagger.client.model.Accounts;
import org.threeten.bp.LocalDate;
import io.swagger.client.model.ResultType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountInformationApi {
    private ApiClient apiClient;

    public AccountInformationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountInformationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAccount
     * @param authorization Access token for authentication and authorization (required)
     * @param accountId Account Identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAccountCall(String authorization, String accountId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
//        String localVarPath = "/accounts/{accountId}"
        String localVarPath = "?accountIds={accountId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAccountValidateBeforeCall(String authorization, String accountId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getAccount(Async)");
        }
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getAccount(Async)");
        }
        
        com.squareup.okhttp.Call call = getAccountCall(authorization, accountId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get an account
     * Get a specific account
     * @param authorization Access token for authentication and authorization (required)
     * @param accountId Account Identifier (required)
     * @return AccountWithDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountWithDetails getAccount(String authorization, String accountId) throws ApiException {
        ApiResponse<AccountWithDetails> resp = getAccountWithHttpInfo(authorization, accountId);
        return resp.getData();
    }

    /**
     * Get an account
     * Get a specific account
     * @param authorization Access token for authentication and authorization (required)
     * @param accountId Account Identifier (required)
     * @return ApiResponse&lt;AccountWithDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountWithDetails> getAccountWithHttpInfo(String authorization, String accountId) throws ApiException {
        com.squareup.okhttp.Call call = getAccountValidateBeforeCall(authorization, accountId, null, null);
        Type localVarReturnType = new TypeToken<AccountWithDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an account (asynchronously)
     * Get a specific account
     * @param authorization Access token for authentication and authorization (required)
     * @param accountId Account Identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountAsync(String authorization, String accountId, final ApiCallback<AccountWithDetails> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAccountValidateBeforeCall(authorization, accountId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountWithDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchForAccounts
     * @param authorization Access token for authentication and authorization (required)
     * @param accountIds Comma separated list of account ids (optional)
     * @param startTime Start time for use in retrieval of transactions (optional)
     * @param endTime End time for use in retrieval of transactions (optional)
     * @param resultType Flag to indicate if you want a lightweight array of metadata (AccountDescriptor or Tax or Operations) or full item details (Account or a Tax subclass or Availability details). If set to &#x27;lightweight&#x27;, should only return the fields associated with the metadata entity. This field is not required, defaults to lightweight (optional)
     * @param offset Opaque cursor used by the provider to send the next set of records (optional)
     * @param limit Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchForAccountsCall(String authorization, List<String> accountIds, List<LocalDate> startTime, List<LocalDate> endTime, ResultType resultType, String offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accountIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "accountIds", accountIds));
        if (startTime != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
        if (endTime != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
        if (resultType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("resultType", resultType));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchForAccountsValidateBeforeCall(String authorization, List<String> accountIds, List<LocalDate> startTime, List<LocalDate> endTime, ResultType resultType, String offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling searchForAccounts(Async)");
        }
        
        com.squareup.okhttp.Call call = searchForAccountsCall(authorization, accountIds, startTime, endTime, resultType, offset, limit, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Search for accounts
     * Query all information for a set of accounts provided in the payload
     * @param authorization Access token for authentication and authorization (required)
     * @param accountIds Comma separated list of account ids (optional)
     * @param startTime Start time for use in retrieval of transactions (optional)
     * @param endTime End time for use in retrieval of transactions (optional)
     * @param resultType Flag to indicate if you want a lightweight array of metadata (AccountDescriptor or Tax or Operations) or full item details (Account or a Tax subclass or Availability details). If set to &#x27;lightweight&#x27;, should only return the fields associated with the metadata entity. This field is not required, defaults to lightweight (optional)
     * @param offset Opaque cursor used by the provider to send the next set of records (optional)
     * @param limit Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values (optional)
     * @return Accounts
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Accounts searchForAccounts(String authorization, List<String> accountIds, List<LocalDate> startTime, List<LocalDate> endTime, ResultType resultType, String offset, Integer limit) throws ApiException {
        ApiResponse<Accounts> resp = searchForAccountsWithHttpInfo(authorization, accountIds, startTime, endTime, resultType, offset, limit);
        return resp.getData();
    }

    /**
     * Search for accounts
     * Query all information for a set of accounts provided in the payload
     * @param authorization Access token for authentication and authorization (required)
     * @param accountIds Comma separated list of account ids (optional)
     * @param startTime Start time for use in retrieval of transactions (optional)
     * @param endTime End time for use in retrieval of transactions (optional)
     * @param resultType Flag to indicate if you want a lightweight array of metadata (AccountDescriptor or Tax or Operations) or full item details (Account or a Tax subclass or Availability details). If set to &#x27;lightweight&#x27;, should only return the fields associated with the metadata entity. This field is not required, defaults to lightweight (optional)
     * @param offset Opaque cursor used by the provider to send the next set of records (optional)
     * @param limit Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values (optional)
     * @return ApiResponse&lt;Accounts&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Accounts> searchForAccountsWithHttpInfo(String authorization, List<String> accountIds, List<LocalDate> startTime, List<LocalDate> endTime, ResultType resultType, String offset, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = searchForAccountsValidateBeforeCall(authorization, accountIds, startTime, endTime, resultType, offset, limit, null, null);
        Type localVarReturnType = new TypeToken<Accounts>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search for accounts (asynchronously)
     * Query all information for a set of accounts provided in the payload
     * @param authorization Access token for authentication and authorization (required)
     * @param accountIds Comma separated list of account ids (optional)
     * @param startTime Start time for use in retrieval of transactions (optional)
     * @param endTime End time for use in retrieval of transactions (optional)
     * @param resultType Flag to indicate if you want a lightweight array of metadata (AccountDescriptor or Tax or Operations) or full item details (Account or a Tax subclass or Availability details). If set to &#x27;lightweight&#x27;, should only return the fields associated with the metadata entity. This field is not required, defaults to lightweight (optional)
     * @param offset Opaque cursor used by the provider to send the next set of records (optional)
     * @param limit Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchForAccountsAsync(String authorization, List<String> accountIds, List<LocalDate> startTime, List<LocalDate> endTime, ResultType resultType, String offset, Integer limit, final ApiCallback<Accounts> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchForAccountsValidateBeforeCall(authorization, accountIds, startTime, endTime, resultType, offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Accounts>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

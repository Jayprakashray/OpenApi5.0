package io.fcc;

import java.io.IOException;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.AccountInformationApi;
import io.swagger.client.model.AccountWithDetails;

public class Example {
  public static void main(String[] args) throws IOException {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    String  accessToken = new LoginNew().doit();
    String authorization = "Bearer "+accessToken;

//    https://financialdataexchange-prod.apigee.net/fdx-v50-core-api
    	
    String url = "https://financialdataexchange-prod.apigee.net/fdx-v5_0/accounts";
    String url1 = "https://financialdataexchange-prod.apigee.net/fdx-v4_6/accounts?resultType=details";
    String url2 = "https://financialdataexchange-prod.apigee.net/fdx-v4_6/accounts?accountIds=Loan252";
    
    defaultClient.setBasePath(url);
    defaultClient.addDefaultHeader("Authorization",authorization);
    
    AccountInformationApi apiInstance = new AccountInformationApi(defaultClient);
    String accountId = "Loan252"; // String | Account Identifier
    try {
//    	AccDetail result = apiInstance.getAccountAD(authorization, accountId);
    	AccountWithDetails result = apiInstance.getAccount(authorization, accountId);
    	
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountInformationApi#getAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
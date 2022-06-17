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

import java.io.File;
import org.threeten.bp.LocalDate;
import io.swagger.client.model.Transactions;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AccountTransactionsApi
 */
@Ignore
public class AccountTransactionsApiTest {

    private final AccountTransactionsApi api = new AccountTransactionsApi();

    /**
     * Get account transaction image
     *
     * Get account transaction image
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountTransactionImagesTest() throws Exception {
        String authorization = null;
        String accountId = null;
        String imageId = null;
        File response = api.getAccountTransactionImages(authorization, accountId, imageId);

        // TODO: test validations
    }
    /**
     * Search for account transactions
     *
     * Search for account transactions. Example: /accounts/{accountId}/transactions?startTime&#x3D;value1&amp;endTime&#x3D;value2
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchForAccountTransactionsTest() throws Exception {
        String authorization = null;
        String accountId = null;
        LocalDate startTime = null;
        LocalDate endTime = null;
        String offset = null;
        Integer limit = null;
        Transactions response = api.searchForAccountTransactions(authorization, accountId, startTime, endTime, offset, limit);

        // TODO: test validations
    }
}
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

import io.swagger.client.model.RewardProgram;
import io.swagger.client.model.RewardPrograms;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RewardProgramInformationApi
 */
@Ignore
public class RewardProgramInformationApiTest {

    private final RewardProgramInformationApi api = new RewardProgramInformationApi();

    /**
     * Get reward program
     *
     * Get a specific reward program
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRewardProgramTest() throws Exception {
        String authorization = null;
        String rewardProgramId = null;
        RewardProgram response = api.getRewardProgram(authorization, rewardProgramId);

        // TODO: test validations
    }
    /**
     * Search reward programs
     *
     * Query all reward programs
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchRewardProgramsTest() throws Exception {
        String authorization = null;
        RewardPrograms response = api.searchRewardPrograms(authorization);

        // TODO: test validations
    }
}

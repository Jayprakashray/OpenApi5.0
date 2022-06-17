# InsuranceAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountCategory** | [**AccountCategoryEnum**](#AccountCategoryEnum) | Category of account |  [optional]
**policyPremium** | [**BigDecimal**](BigDecimal.md) | The amount of the user&#x27;s premium |  [optional]
**policyPremiumTerm** | [**PolicyPremiumTermEnum**](#PolicyPremiumTermEnum) | The payment term for the premium |  [optional]
**policyStartDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**policyStatus** | [**PolicyStatus**](PolicyStatus.md) |  |  [optional]
**policyEndDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**policyCoverageAmount** | [**BigDecimal**](BigDecimal.md) | Total amount of money the user is insured for |  [optional]
**transactions** | [**List&lt;InsuranceTransaction&gt;**](InsuranceTransaction.md) | Transactions on the insurance account |  [optional]
**bills** | [**List&lt;Bills&gt;**](Bills.md) | Payments due on the insurance account |  [optional]

<a name="AccountCategoryEnum"></a>
## Enum: AccountCategoryEnum
Name | Value
---- | -----
DEPOSIT_ACCOUNT | &quot;DEPOSIT_ACCOUNT&quot;
INVESTMENT_ACCOUNT | &quot;INVESTMENT_ACCOUNT&quot;
LOAN_ACCOUNT | &quot;LOAN_ACCOUNT&quot;
LOC_ACCOUNT | &quot;LOC_ACCOUNT&quot;
INSURANCE_ACCOUNT | &quot;INSURANCE_ACCOUNT&quot;

<a name="PolicyPremiumTermEnum"></a>
## Enum: PolicyPremiumTermEnum
Name | Value
---- | -----
MONTHLY | &quot;MONTHLY&quot;
ANNUAL | &quot;ANNUAL&quot;

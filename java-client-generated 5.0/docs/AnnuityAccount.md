# AnnuityAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annuityProductType** | **Object** | CURRENCY, SHARES. Deprecated, will be removed in v6.0 |  [optional]
**annuityValueBasis** | **Object** | FIXED, VARIABLE. Deprecated, will be removed in v6.0 |  [optional]
**paymentAmount** | [**BigDecimal**](BigDecimal.md) | Amount of the recurring payment. Deprecated, will be removed in v6.0 |  [optional]
**paymentFrequency** | **Object** | ANNUALLY, BIWEEKLY, DAILY, MONTHLY, SEMIANNUALLY, SEMIMONTHLY, WEEKLY. Deprecated, will be removed in v6.0 |  [optional]
**paymentStartDate** | **Object** | Date of first payment; could be a future date. Deprecated, will be removed in v6.0 |  [optional]
**paymentEndDate** | **Object** | Date last payment will be made. Deprecated, will be removed in v6.0 |  [optional]
**totalPaymentCount** | [**BigDecimal**](BigDecimal.md) | Total number of payments that will be produced by the annuity. Deprecated, will be removed in v6.0 |  [optional]
**netPresentValue** | [**BigDecimal**](BigDecimal.md) | Surrender or cash balance value. Deprecated, will be removed in v6.0 |  [optional]
**annualIncrease** | [**BigDecimal**](BigDecimal.md) | Percent or dollar amount of annual payment increase. Deprecated, will be removed in v6.0 |  [optional]
**annualIncreaseType** | **Object** | FIXED, PERCENT, DOLLAR. Deprecated, will be removed in v6.0 |  [optional]
**periodCertainGuarantee** | **Object** | NONE, 5-YEAR, 10-YEAR, 20-YEAR, 30-YEAR. Deprecated, will be removed in v6.0 |  [optional]
**payoutType** | [**PayoutType**](PayoutType.md) |  |  [optional]
**policyProductType** | [**PolicyProductType**](PolicyProductType.md) |  |  [optional]
**payoutAmount** | [**BigDecimal**](BigDecimal.md) | Amount paid out, based on mode frequency |  [optional]
**payoutMode** | [**PayoutMode**](PayoutMode.md) |  |  [optional]
**payoutStartDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**payoutEndDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**numberModalPayouts** | **Integer** | Total number of payouts |  [optional]
**surrenderValue** | [**BigDecimal**](BigDecimal.md) | Cash surrender value (net) available if contract is surrendered |  [optional]
**payoutChangePercentage** | [**BigDecimal**](BigDecimal.md) | Percentage of the accumulated value to be paid to the payee each year; used exclusive of payoutChangeAmount |  [optional]
**payoutChangeAmount** | [**BigDecimal**](BigDecimal.md) | Incremental modal amount (positive or negative) by which the payout amount will be changed; used exclusive of payoutPercentage |  [optional]
**periodCertainType** | [**PeriodCertainType**](PeriodCertainType.md) |  |  [optional]

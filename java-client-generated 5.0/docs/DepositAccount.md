# DepositAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balanceAsOf** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**currentBalance** | [**BigDecimal**](BigDecimal.md) | Balance of funds in account |  [optional]
**openingDayBalance** | [**BigDecimal**](BigDecimal.md) | Day&#x27;s opening fund balance |  [optional]
**availableBalance** | [**BigDecimal**](BigDecimal.md) | Balance of funds available for use |  [optional]
**annualPercentageYield** | [**BigDecimal**](BigDecimal.md) | Annual Percentage Yield |  [optional]
**interestYtd** | [**BigDecimal**](BigDecimal.md) | YTD Interest |  [optional]
**term** | **Integer** | Term of CD in months |  [optional]
**maturityDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**transactions** | [**List&lt;DepositTransaction&gt;**](DepositTransaction.md) | Transactions on the deposit account |  [optional]

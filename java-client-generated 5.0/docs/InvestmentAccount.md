# InvestmentAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balanceAsOf** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**allowedCheckWriting** | **Boolean** | Check writing privileges |  [optional]
**allowedOptionTrade** | **Boolean** | Allowed to trade options |  [optional]
**currentValue** | [**BigDecimal**](BigDecimal.md) | Total current value of all investments |  [optional]
**holdings** | [**List&lt;Holding&gt;**](Holding.md) | Holdings in the investment account |  [optional]
**openOrders** | [**List&lt;OpenOrder&gt;**](OpenOrder.md) | Open orders in the investment account |  [optional]
**contribution** | [**List&lt;Contribution&gt;**](Contribution.md) | Describes how new contributions are distributed among the available securities |  [optional]
**vesting** | [**List&lt;Vesting&gt;**](Vesting.md) | Provides the past, present, and future vesting schedule and percentages |  [optional]
**investmentLoans** | [**List&lt;InvestmentLoan&gt;**](InvestmentLoan.md) | Investment loans in the account |  [optional]
**availableCashBalance** | [**BigDecimal**](BigDecimal.md) | Cash balance across all sub-accounts. Should include sweep funds |  [optional]
**margin** | **Boolean** | Margin trading is allowed |  [optional]
**marginBalance** | [**BigDecimal**](BigDecimal.md) | Margin balance |  [optional]
**shortBalance** | [**BigDecimal**](BigDecimal.md) | Short balance |  [optional]
**rolloverAmount** | [**BigDecimal**](BigDecimal.md) | Rollover amount |  [optional]
**employerName** | **String** | Name of the employer in investment 401k Plan |  [optional]
**brokerId** | **String** | Unique identifier FI |  [optional]
**planId** | **String** | Plan number for Investment 401k plan |  [optional]
**calendaryearFor401K** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**calendarYearFor401K** | **Integer** | The calendar year for this 401k account |  [optional]
**balanceList** | [**List&lt;InvestmentBalance&gt;**](InvestmentBalance.md) | List of balances. Aggregate of name value pairs |  [optional]
**dailyChange** | [**BigDecimal**](BigDecimal.md) | Daily change |  [optional]
**percentageChange** | [**BigDecimal**](BigDecimal.md) | Percentage change |  [optional]
**transactions** | [**List&lt;InvestmentTransaction&gt;**](InvestmentTransaction.md) | Transactions on the investment account |  [optional]
**pensionSource** | [**List&lt;PensionSource&gt;**](PensionSource.md) | Pension sources in the investment account |  [optional]

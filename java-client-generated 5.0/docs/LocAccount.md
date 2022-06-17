# LocAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balanceAsOf** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**creditLine** | [**BigDecimal**](BigDecimal.md) | Credit limit |  [optional]
**availableCredit** | [**BigDecimal**](BigDecimal.md) | Available credit |  [optional]
**nextPaymentAmount** | [**BigDecimal**](BigDecimal.md) | Amount of next payment |  [optional]
**nextPaymentDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**principalBalance** | [**BigDecimal**](BigDecimal.md) | Principal balance |  [optional]
**currentBalance** | [**BigDecimal**](BigDecimal.md) | Current balance of the line of credit |  [optional]
**minimumPaymentAmount** | [**BigDecimal**](BigDecimal.md) | Minimum payment amount |  [optional]
**lastPaymentAmount** | [**BigDecimal**](BigDecimal.md) | Last payment amount |  [optional]
**lastPaymentDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**pastDueAmount** | [**BigDecimal**](BigDecimal.md) | Past Due Amount |  [optional]
**lastStmtBalance** | [**BigDecimal**](BigDecimal.md) | Last Statement Balance |  [optional]
**lastStmtDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**purchasesApr** | [**BigDecimal**](BigDecimal.md) | Purchases APR |  [optional]
**advancesApr** | [**BigDecimal**](BigDecimal.md) | Advances APR |  [optional]
**cashAdvanceLimit** | [**BigDecimal**](BigDecimal.md) | Cash advance limit |  [optional]
**availableCash** | [**BigDecimal**](BigDecimal.md) | Available cash |  [optional]
**financeCharges** | [**BigDecimal**](BigDecimal.md) | Finance charges |  [optional]
**cardNetwork** | **String** | Card network, e.g. \&quot;VISA\&quot;, \&quot;MASTERCARD\&quot;, \&quot;AMERICAN_EXPRESS\&quot;, \&quot;DISCOVER\&quot;, \&quot;INTERLINK\&quot;, \&quot;STAR\&quot; etc. |  [optional]
**cardArt** | [**CardArt**](CardArt.md) |  |  [optional]
**transactions** | [**List&lt;LocTransaction&gt;**](LocTransaction.md) | Transactions on the line-of-credit account |  [optional]

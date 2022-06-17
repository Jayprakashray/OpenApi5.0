# LoanAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balanceAsOf** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**principalBalance** | [**BigDecimal**](BigDecimal.md) | Principal balance of loan |  [optional]
**escrowBalance** | [**BigDecimal**](BigDecimal.md) | Escrow balance of loan |  [optional]
**originalPrincipal** | [**BigDecimal**](BigDecimal.md) | Original principal of loan |  [optional]
**originatingDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**loanTerm** | **Integer** | Term of loan in months |  [optional]
**totalNumberOfPayments** | **Integer** | Total number of payments |  [optional]
**nextPaymentAmount** | [**BigDecimal**](BigDecimal.md) | Amount of next payment |  [optional]
**nextPaymentDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**paymentFrequency** | [**PaymentFrequency**](PaymentFrequency.md) |  |  [optional]
**compoundingPeriod** | [**CompoundingPeriod**](CompoundingPeriod.md) |  |  [optional]
**payOffAmount** | [**BigDecimal**](BigDecimal.md) | Payoff amount |  [optional]
**lastPaymentAmount** | [**BigDecimal**](BigDecimal.md) | Last payment amount |  [optional]
**lastPaymentDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**maturityDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**interestPaidYearToDate** | [**BigDecimal**](BigDecimal.md) | Interest paid year to date |  [optional]
**transactions** | [**List&lt;LoanTransaction&gt;**](LoanTransaction.md) | Transactions on the loan account |  [optional]

# InvestmentLoan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loanId** | **String** | Unique identifier for this loan |  [optional]
**loanDescription** | **String** | Description of loan |  [optional]
**initialLoanBalance** | [**BigDecimal**](BigDecimal.md) | Initial loan balance amount |  [optional]
**loanStartDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**currentLoanBalance** | [**BigDecimal**](BigDecimal.md) | Current loan principal balance amount |  [optional]
**dateAsOf** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**loanRate** | [**BigDecimal**](BigDecimal.md) | Loan annual interest rate for the loan |  [optional]
**loanPaymentAmount** | [**BigDecimal**](BigDecimal.md) | Loan payment amount |  [optional]
**loanPaymentFrequency** | [**LoanPaymentFrequency**](LoanPaymentFrequency.md) |  |  [optional]
**loanPaymentInitial** | [**BigDecimal**](BigDecimal.md) | Initial number of loan payments |  [optional]
**loanPaymentsRemaining** | **Integer** | Remaining number of loan payments |  [optional]
**loanMaturityDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**loanInterestToDate** | [**BigDecimal**](BigDecimal.md) | Total interest paid to date on this loan |  [optional]
**loanTotalProjectedInterest** | [**BigDecimal**](BigDecimal.md) | Total projected interest to be paid on this loan |  [optional]
**loanNextPaymentDate** | [**LocalDate**](LocalDate.md) |  |  [optional]

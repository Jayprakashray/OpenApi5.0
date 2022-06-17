# InvestmentTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionType** | [**InvestmentTransactionType**](InvestmentTransactionType.md) |  |  [optional]
**shares** | [**BigDecimal**](BigDecimal.md) | Required for stock, mutual funds. Number of shares (with decimals). Negative numbers indicate securities are being removed from the account |  [optional]
**faceValue** | [**BigDecimal**](BigDecimal.md) | Cash value for bonds |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) | Unit purchase price |  [optional]
**securityId** | **String** | Unique identifier of security |  [optional]
**securityIdType** | [**SecurityIdType**](SecurityIdType.md) |  |  [optional]
**securityType** | [**SecurityType**](SecurityType.md) |  |  [optional]
**symbol** | **String** | Ticker symbol |  [optional]
**markup** | [**BigDecimal**](BigDecimal.md) | Portion of unit price that is attributed to the dealer markup |  [optional]
**commission** | [**BigDecimal**](BigDecimal.md) | Transaction commission |  [optional]
**taxes** | [**BigDecimal**](BigDecimal.md) | Taxes on the trade |  [optional]
**fees** | [**BigDecimal**](BigDecimal.md) | Fees applied to the trade |  [optional]
**load** | [**BigDecimal**](BigDecimal.md) | Load on the transaction |  [optional]
**inv401kSource** | [**Inv401kSourceType**](Inv401kSourceType.md) |  |  [optional]
**confirmationNumber** | **String** | Confirmation number of the transaction |  [optional]
**fractionalCash** | [**BigDecimal**](BigDecimal.md) | Cash for fractional units (used for stock splits) |  [optional]
**incomeType** | [**IncomeType**](IncomeType.md) |  |  [optional]
**oldUnits** | [**BigDecimal**](BigDecimal.md) | Number of shares before split |  [optional]
**splitRatioNumerator** | [**BigDecimal**](BigDecimal.md) | Split ratio numerator |  [optional]
**splitRatioDenominator** | [**BigDecimal**](BigDecimal.md) | Split ratio denominator |  [optional]
**newUnits** | [**BigDecimal**](BigDecimal.md) | Number of shares after split |  [optional]
**subAccountSec** | [**SubAccountType**](SubAccountType.md) |  |  [optional]
**subAccountFund** | [**SubAccountType**](SubAccountType.md) |  |  [optional]
**loanId** | **String** | For 401k accounts only. This indicates the transaction was due to a loan or a loan repayment |  [optional]
**loanPrincipal** | [**BigDecimal**](BigDecimal.md) | How much loan pre-payment is principal |  [optional]
**loanInterest** | [**BigDecimal**](BigDecimal.md) | How much loan pre-payment is interest |  [optional]
**payrollDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**priorYearContrib** | **Boolean** | Indicates this buy was made using prior year&#x27;s contribution |  [optional]
**withholding** | [**BigDecimal**](BigDecimal.md) | Federal tax withholding |  [optional]
**taxExempt** | **Boolean** | Tax-exempt transaction |  [optional]
**gain** | [**BigDecimal**](BigDecimal.md) | For sales |  [optional]
**stateWithholding** | [**BigDecimal**](BigDecimal.md) | State tax withholding |  [optional]
**penalty** | [**BigDecimal**](BigDecimal.md) | Indicates amount withheld due to a penalty |  [optional]
**runningBalance** | [**BigDecimal**](BigDecimal.md) | Running balance of the position |  [optional]
**unitPrice** | [**BigDecimal**](BigDecimal.md) | Price per commonly-quoted unit. Does not include markup/markdown, unitprice. Share price for stocks, mutual funds, and others. Percentage of par for bonds. Per share (not contract) for options |  [optional]
**units** | [**BigDecimal**](BigDecimal.md) | For security-based actions other than stock splits, quantity. Shares for stocks, mutual funds, and others. Face value for bonds. Contracts for options |  [optional]
**unitType** | [**UnitType**](UnitType.md) |  |  [optional]
**transactionReason** | [**TransactionReason**](TransactionReason.md) |  |  [optional]
**accruedInterest** | [**BigDecimal**](BigDecimal.md) | Accrued interest |  [optional]
**transferAction** | [**TransferActionEnum**](#TransferActionEnum) | Transfer direction |  [optional]
**positionType** | [**PositionType**](PositionType.md) |  |  [optional]

<a name="TransferActionEnum"></a>
## Enum: TransferActionEnum
Name | Value
---- | -----
IN | &quot;IN&quot;
OUT | &quot;OUT&quot;

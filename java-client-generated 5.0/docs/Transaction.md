# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** |  |  [optional]
**transactionId** | **String** |  |  [optional]
**referenceTransactionId** | **String** |  |  [optional]
**postedTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**transactionTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**description** | **String** | The description of the transaction |  [optional]
**memo** | **String** |  |  [optional]
**debitCreditMemo** | [**DebitCreditMemo**](DebitCreditMemo.md) |  |  [optional]
**category** | **String** | Transaction category, preferably MCC or SIC. |  [optional]
**subCategory** | **String** | Transaction category detail |  [optional]
**reference** | **String** | A tracking reference identifier |  [optional]
**status** | [**TransactionStatus**](TransactionStatus.md) |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | The amount of money in the account currency |  [optional]
**foreignAmount** | [**BigDecimal**](BigDecimal.md) | The amount of money in the foreign currency |  [optional]
**foreignCurrency** | [**Iso4217Code**](Iso4217Code.md) |  |  [optional]
**imageIds** | **List&lt;String&gt;** | Array of Image Identifiers (unique to this transaction) used to retrieve Images of check or transaction receipt |  [optional]
**lineItem** | [**List&lt;LineItem&gt;**](LineItem.md) | Breakdown of the transaction details |  [optional]
**reward** | [**TransactionReward**](TransactionReward.md) |  |  [optional]
**fiAttributes** | [**List&lt;FiAttribute&gt;**](FiAttribute.md) | Array of FI-specific attributes |  [optional]
**links** | [**HateoasLinks**](HateoasLinks.md) |  |  [optional]

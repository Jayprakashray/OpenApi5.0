# AccountPaymentNetwork

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankId** | **String** | Bank identifier used by the payment network ie. Routing Number |  [optional]
**identifier** | **String** | The number used to identify the account within the payment network. If identifierType is ACCOUNT_NUMBER, this is the account number; if identifierType is TOKENIZED_ACCOUNT_NUMBER, this is a tokenized account number |  [optional]
**identifierType** | [**PaymentNetworkIdentifierType**](PaymentNetworkIdentifierType.md) |  |  [optional]
**type** | [**PaymentNetworkType**](PaymentNetworkType.md) |  |  [optional]
**transferIn** | **Boolean** | Can transfer funds to the account using this information |  [optional]
**transferOut** | **Boolean** | Can transfer funds from the account using this information |  [optional]

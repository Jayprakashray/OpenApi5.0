# AccountDescriptor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** |  |  [optional]
**error** | [**Error**](Error.md) |  |  [optional]
**accountType** | [**AccountType**](AccountType.md) |  |  [optional]
**accountNumber** | **String** | Full account number for the end user&#x27;s handle for the account at the owning institution |  [optional]
**accountNumberDisplay** | **String** | Account display number for the end user&#x27;s handle at the owning institution. This is to be displayed by the Interface Provider |  [optional]
**productName** | **String** | Marketed product name for this account. Used in UIs to assist in account selection |  [optional]
**nickname** | **String** | Name given by the user. Used in UIs to assist in account selection |  [optional]
**status** | [**AccountStatus**](AccountStatus.md) |  |  [optional]
**description** | **String** | Description of account |  [optional]
**currency** | [**Currency**](Currency.md) |  |  [optional]
**fiAttributes** | [**List&lt;FiAttribute&gt;**](FiAttribute.md) | Array of Financial institution-specific attributes |  [optional]

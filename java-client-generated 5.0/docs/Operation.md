# Operation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**OperationId**](OperationId.md) |  |  [optional]
**availability** | [**Availability**](Availability.md) |  |  [optional]
**alsoSupported** | [**List&lt;OperationId&gt;**](OperationId.md) | Additional FDX API endpoints supported at this API, e.g. Transactions within Accounts, or TxImages within Transactions |  [optional]
**version** | **String** | Data provider&#x27;s implementation version number for this operation, which is unrelated to the FDX API version |  [optional]
**fdxVersions** | [**List&lt;FdxVersion&gt;**](FdxVersion.md) | FDX schema versions supported at this endpoint |  [optional]
**cutOffTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**link** | [**HateoasLink**](HateoasLink.md) |  |  [optional]

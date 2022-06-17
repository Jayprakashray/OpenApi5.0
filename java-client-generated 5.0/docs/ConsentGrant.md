# ConsentGrant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**status** | [**ConsentGrantStatus**](ConsentGrantStatus.md) |  |  [optional]
**parties** | [**List&lt;ConsentGrantParty&gt;**](ConsentGrantParty.md) | The non-end user parties participating in the Consent Grant |  [optional]
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**expirationTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**durationType** | [**ConsentDurationType**](ConsentDurationType.md) |  |  [optional]
**durationPeriod** | **Integer** |  |  [optional]
**lookbackPeriod** | **Integer** |  |  [optional]
**resources** | [**List&lt;ConsentGrantResource&gt;**](ConsentGrantResource.md) | The permissioned resource entities |  [optional]

# SuspectedFraudIncident

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Extensible string enum identifying the type of suspected fraud. Initially this will always be set to \&quot;ACCOUNT_TAKEOVER\&quot;. Additional values may be defined in the future. |  [optional]
**incidentId** | **String** | Unique identifier for the fraud incident. |  [optional]
**reason** | **String** | Free text justification for suspected fraud |  [optional]
**fiAttributes** | [**List&lt;FiAttribute&gt;**](FiAttribute.md) | Array of financial institution-specific attributes. Can be used to provide additional structured context on the suspected fraud for the FI to use in determining a resolution. |  [optional]
**reporter** | [**Party**](Party.md) |  |  [optional]

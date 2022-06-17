# HateoasLink

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** | URL to invoke the action on the resource | 
**action** | [**ActionEnum**](#ActionEnum) | HTTP Method to use for the request |  [optional]
**rel** | **String** | Relation of this link to its containing entity, as defined by and with many example relation values at [IETF RFC5988](https://datatracker.ietf.org/doc/html/rfc5988) |  [optional]
**types** | [**List&lt;ContentTypes&gt;**](ContentTypes.md) | Content-types that can be used in the Accept header |  [optional]

<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
GET | &quot;GET&quot;
POST | &quot;POST&quot;
PATCH | &quot;PATCH&quot;
DELETE | &quot;DELETE&quot;
PUT | &quot;PUT&quot;

# Customer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerId** | **String** |  |  [optional]
**name** | [**CustomerName**](CustomerName.md) |  |  [optional]
**dateOfBirth** | [**LocalDate**](LocalDate.md) |  |  [optional]
**taxId** | **String** | Country specific Tax Id associated with this customer (SIN or NAS in Canada, SSN or TIN in US, etc.) |  [optional]
**taxIdCountry** | [**Iso3166CountryCode**](Iso3166CountryCode.md) |  |  [optional]
**governmentId** | **String** | A federal (such as passport) or state (such as driver&#x27;s license) issued identifier |  [optional]
**email** | **List&lt;String&gt;** | An array of the customer&#x27;s electronic mail addresses |  [optional]
**addresses** | [**List&lt;DeliveryAddress&gt;**](DeliveryAddress.md) | An array of the customer&#x27;s physical mail addresses |  [optional]
**telephones** | [**List&lt;TelephoneNumber&gt;**](TelephoneNumber.md) | An array of the customer&#x27;s telephone numbers |  [optional]
**accounts** | [**List&lt;CustomerToAccountRelationship&gt;**](CustomerToAccountRelationship.md) | List of accounts related to this customer |  [optional]

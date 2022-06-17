# RewardBalance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name used to denominate the balance |  [optional]
**type** | [**RewardType**](RewardType.md) |  |  [optional]
**balance** | [**BigDecimal**](BigDecimal.md) | Total units available for redemption at time of download |  [optional]
**accruedYtd** | [**BigDecimal**](BigDecimal.md) | Total units accrued in the current program year at time of download |  [optional]
**redeemedYtd** | [**BigDecimal**](BigDecimal.md) | Total units redeemed in the current program year at time of download |  [optional]
**qualifying** | **Boolean** | Balance used for qualifying purposes |  [optional]
**fiAttributes** | [**List&lt;FiAttribute&gt;**](FiAttribute.md) | Array of FI-specific attributes |  [optional]

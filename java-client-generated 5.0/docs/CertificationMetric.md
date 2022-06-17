# CertificationMetric

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportStartTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**reportEndTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**metricsName** | **String** | Any provider descriptive name for the measurement. Optional, can be omitted if operationIds are returned |  [optional]
**operationIds** | [**List&lt;OperationId&gt;**](OperationId.md) | One or more Operation IDs for which these metrics apply. Optional, can be omitted if metricsName is returned |  [optional]
**responseTimeAverage** | [**BigDecimal**](BigDecimal.md) | The self-reported average response time in milliseconds for all combined data responses |  [optional]
**averageUpTime** | [**BigDecimal**](BigDecimal.md) | See the Certification Performance section that describes how this measurement will be calculated, defines the % of availability during the measurement |  [optional]
**reportTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

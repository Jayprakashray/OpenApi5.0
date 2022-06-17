# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parentAccountId** | **String** |  |  [optional]
**lineOfBusiness** | **String** | The line of business, such as consumer, consumer joint, small business, corporate, etc. |  [optional]
**routingTransitNumber** | **String** | Routing transit number (RTN) associated with account number at owning institution |  [optional]
**balanceType** | [**BalanceType**](BalanceType.md) |  |  [optional]
**contact** | [**AccountContact**](AccountContact.md) |  |  [optional]
**interestRate** | [**BigDecimal**](BigDecimal.md) | Interest Rate of Account |  [optional]
**interestRateType** | [**InterestRateType**](InterestRateType.md) |  |  [optional]
**interestRateAsOf** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**priorInterestRate** | [**BigDecimal**](BigDecimal.md) | Previous Interest Rate of Account |  [optional]
**transferIn** | **Boolean** | Account is eligible for incoming transfers |  [optional]
**transferOut** | **Boolean** | Account is eligible for outgoing transfers |  [optional]
**billPayStatus** | [**AccountBillPayStatus**](AccountBillPayStatus.md) |  |  [optional]
**micrNumber** | **String** |  |  [optional]
**lastActivityDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**rewardProgramId** | **String** |  |  [optional]
**transactionsIncluded** | **Boolean** | Default is false. If present and true, a call to retrieve transactions will not return any further details about this account. This is an optimization that allows an FDX API server to return transactions and account details in a single call |  [optional]

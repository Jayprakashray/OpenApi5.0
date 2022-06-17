# Bills

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalPaymentDue** | [**BigDecimal**](BigDecimal.md) | Total payment due or next payment due.  Monthly payment due for loans |  [optional]
**minimumPaymentDue** | [**BigDecimal**](BigDecimal.md) | The minimum amount which is due |  [optional]
**dueDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**autoPayEnabled** | **Boolean** | Whether the user&#x27;s bill is paid automatically |  [optional]
**autoPayAmount** | [**BigDecimal**](BigDecimal.md) | The amount of money the user has set to autopay this bill |  [optional]
**autoPayDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**pastDueAmount** | [**BigDecimal**](BigDecimal.md) | The amount that the user should have already paid. The value is negative if user owes money |  [optional]
**lastPaymentAmount** | [**BigDecimal**](BigDecimal.md) | The amount of the most recent payment |  [optional]
**lastPaymentDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**statementBalance** | [**BigDecimal**](BigDecimal.md) | The amount of the last statement.  The value is negative if the user owes money |  [optional]
**statementDate** | [**LocalDate**](LocalDate.md) |  |  [optional]

# Calculation design

## Components

| Component | Current responsibility |
| --- | --- |
| `Order` | Holds order code, base amount, and percentage discount. |
| `ShippingService` | Returns a fixed shipping charge using pre-discount order-value tiers. |
| `OrderService` | Applies the percentage discount and adds the shipping charge. |
| Spring Boot bootstrap | Discovers the two services and creates the application context. |

## Current rule

The implemented calculation is:

`total = basic × (1 − discount / 100) + shipment(basic)`

Shipping is fixed at 20 below 100, 12 from 100 through 200, and 0 above 200. This describes the code as it exists; it is not a validated business policy.

## Boundaries and limitations

- Calculations use `double`, which is not a production monetary precision choice.
- No unit tests cover tier boundaries, discount behavior, null values, or invalid ranges.
- There is no invocation point besides the service methods themselves, so the application does not expose an end-user workflow.

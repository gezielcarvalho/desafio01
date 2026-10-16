# Desafio 01 — Spring dependency-injection exercise

> **Repository status:** small Java/Spring course exercise retained as a learning reference. It is not a commerce application or deployable service.

## Documentation

- [Current-state overview](docs/README.md)
- [Project charter](docs/project-charter.md)
- [Calculation design](docs/architecture.md)
- [Delivery and quality handoff](docs/delivery-and-quality.md)

## What exists

The project models an order amount and discount, then calculates a total by composing `OrderService` with `ShippingService`. Shipping uses three tiers based on the pre-discount order amount.

There is no HTTP API, persistence layer, user interface, or production delivery setup.

## Decision

Retain only as a labeled dependency-injection checkpoint, or archive it after owner review. Any reusable pricing/shipping implementation needs a separate domain, precision, and test-design effort.

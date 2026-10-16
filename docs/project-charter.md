# Project charter

## Learning objective

Practice Spring component registration and constructor injection by separating order-total and shipment calculations.

## Scope represented today

- Basic order value and percentage discount fields.
- A shipping service with three value-based tiers.
- An order service that composes the shipment service.
- Application bootstrap and context-load verification.

## Not in scope

- Order creation, persistence, payments, delivery locations, taxes, inventory, or customer workflows.
- REST API, UI, message processing, authentication, authorization, or audit trail.
- Monetary precision policy, currency selection, rounding rules, or production business rules.
- CI, deployment, monitoring, or support operations.

## Ownership and decision gate

This project is a personal learning archive. The owner may retain it as a clearly labeled checkpoint or archive it. Any product use requires a separately approved design.

## Future implementation criteria

1. Define a real order/shipping domain and acceptance examples.
2. Use an appropriate decimal monetary type and explicit rounding policy.
3. Add focused unit tests for discount and shipment boundaries.
4. Design input validation, persistence/API boundaries, and security requirements as needed.
5. Add CI and delivery evidence only after a deliberate product scope exists.

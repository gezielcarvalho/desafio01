# Current-state documentation

## Purpose

This repository is an introductory Spring dependency-injection exercise. It demonstrates a service depending on another service to calculate an order total.

## Current state

- Runtime: Java 21 with Spring Boot and Maven Wrapper.
- Domain: a simple in-memory `Order` with code, base value, and percentage discount.
- Calculation: total equals discounted base value plus a tiered shipping charge.
- Verification: a Spring context-load test only.
- Application surface: no HTTP endpoint, database, controller, CLI runner, or UI was found.

## Decision

Keep as a formative course reference and exclude it from the primary portfolio showcase. It should not be represented as a finished ordering, pricing, or shipping system.

See the [charter](project-charter.md), [calculation design](architecture.md), and [delivery handoff](delivery-and-quality.md).

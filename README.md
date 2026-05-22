# Java OPR1 PR4

Simple Java console project for practicing object-oriented programming concepts, following the PDF file.

The application models a courier delivery service. It works with different shipment types, stores them in an order, and calculates delivery prices using multiple delivery strategies.

## Features

- Abstract base class for shipments
- Shipment types:
  - letter
  - package
  - groceries
- Delivery strategies:
  - standard delivery
  - express delivery
  - personal pickup
  - weekend delivery
- Order management with shipment search by ID
- Total price calculation for shipment and delivery costs

## How To Run

Compile the project:

```bash
javac -encoding UTF-8 -d out src/*.java
```

Run the application:

```bash
java -cp out Main
```

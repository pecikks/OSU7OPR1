# Java OPR1 Finals

Simple Java console project for practicing object-oriented programming concepts, following the PDF file.

The application models a vehicle rental service. It works with different vehicle types, stores them in a rental service, handles renting and returning vehicles, and calculates rental prices.

## Features

- Vehicle interface shared by all vehicle types
- Vehicle types:
  - car
  - van
  - bike
- Rental service for:
  - adding vehicles
  - finding vehicles by ID
  - renting vehicles
  - returning vehicles
  - filtering vehicles by type
  - listing available vehicles
- Rental price calculation with type-specific rules:
  - cars use the daily rate
  - vans include an extra cargo fee
  - bikes get a discount for rentals of 7 or more days

## How To Run

Compile the project:

```bash
javac -encoding UTF-8 -d out src/*.java
```

Run the application:

```bash
java -cp out Main
```

# Java OPR1 PR2

Simple Java console project for a sports equipment rental system.

## Description

The project demonstrates basic object-oriented programming in Java. It works with a rental shop that stores different types of sports equipment, prints the available offer, calculates rental prices, searches equipment by ID, and changes equipment availability when it is rented or returned.

## Main Features

- Store sports equipment in a rental shop
- Work with bikes and skis as specialized equipment types
- Calculate rental price by number of days
- Add an extra daily fee for electric bikes
- Apply a discount for children's skis
- Search equipment by ID
- Show only available equipment
- Rent and return equipment

## Classes

- `Main` - creates sample equipment and demonstrates the program behavior
- `Pujcovna` - manages the list of equipment and rental operations
- `Vybaveni` - base class for rentable equipment
- `Kolo` - bike class with bike type and electric bike support
- `Lyze` - ski class with ski length and children's ski support
- `Pronajimatele` - interface for price calculation and rental information

## How to Run

Compile the project:

```bash
javac -encoding UTF-8 -d out src/*.java
```

Run the program:

```bash
java -cp out Main
```

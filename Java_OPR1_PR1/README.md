# Java_OPR1_PR1

Simple Java console project for practicing object-oriented programming, following the PDF file.

The program models a small library system. It stores different publication types,
prints information about them, demonstrates borrowing behavior, and searches for
a publication by title.

## Features

- Base `Publikace` class for common publication data
- Derived classes for:
  - `Kniha`
  - `Casopis`
  - `EBook`
- `Knihovna` class for storing and managing publications
- Method overriding for publication information and borrowing messages
- Simple title search

## How to Run

Compile the source files:

```bash
javac src/*.java
```

Run the program:

```bash
java -cp src Main
```

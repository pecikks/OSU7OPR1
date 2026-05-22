# Java OPR1 PR3

Simple Java console project for a course reservation system, following the PDF file.

## Description

The project demonstrates basic object-oriented programming in Java. It manages
different types of courses, enrolls participants, checks course capacity, prints
available courses, removes participants, and calculates course prices based on
the course type.

## Main Features

- Store and manage multiple courses
- Work with language, sport, and art courses as specialized course types
- Enroll participants into courses
- Prevent duplicate enrollment by participant ID
- Prevent enrollment when a course is full
- Remove participants from a course
- Search courses by course code
- Show all courses and only available courses
- Calculate prices with discounts or extra costs

## Classes

- `Main` - creates sample courses and participants and demonstrates the program behavior
- `CourseManager` - stores courses and handles searching, enrollment, and printing
- `Course` - abstract base class for shared course data and participant handling
- `LanguageCourse` - course type with language, level, and a discount
- `SportCourse` - course type with optional equipment included in the price
- `ArtCourse` - course type with an additional material cost
- `Participant` - stores participant ID, name, and email
- `Discountable` - interface for classes that provide a discount

## How to Run

Compile the project:

```bash
javac -encoding UTF-8 -d out src/*.java
```

Run the `Main` class from IntelliJ IDEA.

If you want to run the project from the command line, make sure `Main.java`
uses the standard Java entry point:

```java
public static void main(String[] args)
```

Then run:

```bash
java -cp out Main
```

# Building Management System

This is a simple Java program that calculates the area per person in different types of buildings.

## Description

The program defines a `Building` class that stores information about a building, including the number of floors, total area, and the number of occupants. It provides methods to set these values and calculate the area per person.

## Usage

To use the program, create instances of the `Building` class and set the floor area, total area, and the number of occupants. You can then calculate the area per person using the `getareaperperson` method.

### Example

```java
Building house = new Building();
house.setfloor(80);
house.setarea(9000);
house.setfoccupant(800);
double areaPerPersonInHouse = house.getareaperperson();
System.out.printf("Area per person in the house: %.2f\n", areaPerPersonInHouse);

Building office = new Building();
office.setarea(7800);
office.setfloor(56);
office.setfoccupant(6000);
double areaPerPersonInOffice = office.getareaperperson();
System.out.printf("Area per person in the office: %.2f\n", areaPerPersonInOffice);

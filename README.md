# Object Oriented Programming in JAVA 
This repository contains solution to the TP files of the OOP course (currently taught in uni).

## TP File 01
### ```Student.java```
A class Student with 3 attributes (matricule, name, speciality) and 2 constructors

### ```TestStudent.java```
A class TestStudent to test and explain obtained results.
- FIRST TRY ERROR: 
----> because of the zeros at the beginning of the passed matricules || instruction 03 and 04

- SECOND TRY ERROR:
----> because the used contructors are not defined in the Student class || instruction 01 
----> because there are multipme objects with the same name || instruction 01, 02 and 03

OUTPUT:
Meriem Computer Science
Houda Computer Science
Sara Computer Science

OBSERVATION: 
when assigning stu2 to stu1, the name of stu2 was Houda, but after changing the name of stu2 to Sara, the name of stu1 changed to Sara too.

### ```Point.java```
A Point class represents a point in a 2D space. Each Point object has two float fields, x and y, representing the coordinates of the point.
#### Constructor
The Point class has two constructors:

```Point()```: This is a no-argument constructor that initializes a new Point object with default values (0.0 for both x and y).

```Point(float x, float y)```: This constructor initializes a new Point object with the specified x and y values.

#### Methods
The Point class has the following methods:

```setX(float x)```: This method sets the x coordinate of the Point object to the specified x value.

```setY(float y)```: This method sets the y coordinate of the Point object to the specified y value.

```getX()```: This method returns the x coordinate of the Point object.

```getY()```: This method returns the y coordinate of the Point object.

```print()```: This method prints the Point object in the format "(x, y)" to the standard output.

### ```TestPoint.java```
The TestPoint class is a simple Java class that tests the functionality of the Point class.

#### Main Method
The main method in the TestPoint class performs the following operations:

Creates a new Point object p1 using the default constructor.

Sets the x and y coordinates of p1 to 5 and 3, respectively, using the setX(float x) and setY(float y) methods.

Prints the coordinates of p1 using the print() method.

Increments the x and y coordinates of p1 by 2 and 4, respectively.

Prints the updated coordinates of p1.

### ```Rectangle.java```
The Rectangle class represents a rectangle in a 2D space. Each Rectangle object has two Point objects, BL and TR, representing the bottom-left and top-right corners of the rectangle, respectively.

#### Constructor
The Rectangle class has a constructor Rectangle(Point bl, Point tr), which initializes a new Rectangle object with the specified bottom-left and top-right points. It also increments a static variable nbr which keeps track of the number of Rectangle objects created.

#### Methods
The Rectangle class has the following methods:

```length()```: This method calculates and returns the length of the rectangle.

```width()```: This method calculates and returns the width of the rectangle.

```surface()```: This method calculates and returns the surface area of the rectangle.

#### Main Method
The main method in the Rectangle class performs the following operations:

Creates two Point objects, bl and tr.

Creates a Rectangle object using bl and tr.

Prints the length, width, and surface area of the rectangle.

Prints the total number of rectangles created.

### ```Dessin.java```
The Dessin class represents a drawing that contains multiple rectangles. Each Dessin object has an array of Rectangle objects and an index that keeps track of the next open spot in the array. The class also has a static variable total that keeps track of the total surface area of all rectangles in all Dessin objects.

#### Constructor
The Dessin class has a constructor Dessin(int size), which initializes a new Dessin object with an array of Rectangle objects of the specified size.

#### Methods
The Dessin class has the following methods:

```add(Rectangle r)```: This method adds a Rectangle object to the array if there is an open spot. It also increments the total variable by the surface area of the added rectangle.

```totalSurface()```: This method returns the total surface area of all rectangles in the Dessin object.

#### Main Method
The main method in the Dessin class performs the following operations:

Creates a Dessin object with a capacity of 5 rectangles.

Creates three Rectangle objects and adds them to the Dessin object.

Prints the surface area of each rectangle and the total surface area of all rectangles in the Dessin object.

### ```Test.java```
The Test class is a simple Java class that tests the behavior of Java's pass-by-value semantics for both primitive and reference types.

#### Main Method
The main method in the Test class performs the following operations:

Initializes two integer variables x and y, two String variables s1 and s2, and two Point objects p1 and p2.

Prints the initial values of these variables and objects.

Calls the change method, passing in these variables and objects.

Prints the values of these variables and objects after the call to change.

#### Change Method
The change method takes in two integers, two String objects, and two Point objects. It modifies these values and prints them out. The purpose of this method is to demonstrate that changes to primitive types and reference types within a method do not affect the original variables and objects outside the method.


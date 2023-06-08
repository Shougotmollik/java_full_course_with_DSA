
Java is a widely used, general-purpose programming language that is designed to be platform-independent. It is known for its simplicity, readability, and versatility. Java programs are compiled into bytecode, which can be executed on any system with a Java Virtual Machine (JVM).

Class and Object: In Java, a class is a blueprint or template that defines the properties and behaviors of objects. It encapsulates data (in the form of variables) and methods (functions that operate on the data). Here's an example of a simple class called "Person":

        public class Person {
            // Data (instance variables)
            String name;
            int age;

            // Method
            public void sayHello() {
                System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
            }
        }


An object is an instance of a class. It represents a specific entity and can have its own set of data and behavior. Here's an example of creating objects from the "Person" class and accessing their methods:

        public class Main {
            public static void main(String[] args) {
                // Create objects
                Person person1 = new Person();
                Person person2 = new Person();

                // Set data for person1
                person1.name = "Alice";
                person1.age = 25;

                // Set data for person2
                person2.name = "Bob";
                person2.age = 30;

                // Call methods on objects
                person1.sayHello(); // Output: Hello, my name is Alice and I am 25 years old.
                person2.sayHello(); // Output: Hello, my name is Bob and I am 30 years old.
            }
        }


If-else Condition: The if-else statement is used to make decisions based on conditions in Java. It allows you to execute different blocks of code based on whether a condition is true or false. Here's an example that checks whether a number is positive or negative:

        public class Main {
            public static void main(String[] args) {
                int number = -5;

                if (number > 0) {
                    System.out.println("The number is positive.");
                } else {
                    System.out.println("The number is negative.");
                }
            }
        }

Loops: Loops in Java allow you to repeatedly execute a block of code until a specific condition is met or for a certain number of iterations.

The for loop is commonly used when you know the number of iterations in advance. Here's an example that prints numbers from 1 to 5:
            public class Main {
                public static void main(String[] args) {
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(i);
                    }
                }
            }


The while loop is used when the number of iterations is not known in advance. It continues executing the block of code as long as the condition is true. Here's an example that prints numbers from 1 to 5 using a while loop:

            public class Main {
                public static void main(String[] args) {
                    int i = 1;

                    while (i <= 5) {
                        System.out.println(i);
                        i++;
                    }
                }
            }

Object-Oriented Programming (OOP) Methods: In Java, methods are functions defined within a class. They encapsulate reusable code and provide a way to perform specific actions or operations on objects. Methods can have parameters (inputs) and return values (outputs). Here's an example of a class with methods to calculate the area and perimeter of a rectangle:


            public class Rectangle {
                double length;
                double width;

                public double calculateArea() {
                    return length * width;
                }

                public double calculatePerimeter() {
                    return 2 * (length + width);
                }
            }

            public class Main {
                public static void main(String[] args) {
                    Rectangle rectangle = new Rectangle();
                    rectangle.length = 5;
                    rectangle.width = 3;

                    double area = rectangle.calculateArea();
                    double perimeter = rectangle.calculatePerimeter();

                    System.out.println("Area: " + area); // Output: Area: 15.0
                    System.out.println("Perimeter: " + perimeter); // Output: Perimeter: 16.0
                }
            }


In the above example, the "Rectangle" class has two methods: "calculateArea()" and "calculatePerimeter()". These methods operate on the data (length and width) of the object and return the calculated area and perimeter.

These concepts provide a foundation for Java programming, allowing you to create classes, define objects, make decisions using if-else conditions, iterate using loops, and define methods for encapsulating reusable code and performing actions on objects.
package day2;

//Single Inheritance
class Vehicle {

 String brand;

 Vehicle(String brand) {
     this.brand = brand;
 }

 void displayBrand() {
     System.out.println("Vehicle brand: " + brand);
 }
}

class Car extends Vehicle {

 int speed;

 Car(String brand, int speed) {
     super(brand);
     this.speed = speed;
 }

 void showCarDetails() {
     displayBrand();
     System.out.println("Car speed: " + speed + " km/h");
 }
}


//Multilevel Inheritance
class LivingBeing {

 void breathe() {
     System.out.println("Living being breathes");
 }
}

class Human extends LivingBeing {

 void think() {
     System.out.println("Human can think");
 }
}

class Student extends Human {

 void study() {
     System.out.println("Student studies");
 }
}


//Hierarchical Inheritance
class Employee {

 void work() {
     System.out.println("Employee works");
 }
}

class Developer extends Employee {

 void writeCode() {
     System.out.println("Developer writes code");
 }
}

class Tester extends Employee {

 void testSoftware() {
     System.out.println("Tester tests software");
 }
}


//Multiple Inheritance using Interfaces
interface Printable {
 void print();
}

interface Scannable {
 void scan();
}

class Machine implements Printable, Scannable {

 public void print() {
     System.out.println("Machine is printing");
 }

 public void scan() {
     System.out.println("Machine is scanning");
 }
}


//Main Class
public class Inheritance {

 public static void main(String[] args) {

     // Single inheritance
	 System.out.println("Single Inheritance");
     Car car = new Car("Toyota", 180);
     car.showCarDetails();

     System.out.println();

     // Multilevel inheritance
     System.out.println("Multilevel Inheritance");
     Student student = new Student();
     student.breathe();
     student.think();
     student.study();

     System.out.println();

     // Hierarchical inheritance
     System.out.println("Hierarchical Inheritance");
     Developer dev = new Developer();
     dev.work();
     dev.writeCode();

     Tester tester = new Tester();
     tester.work();
     tester.testSoftware();

     System.out.println();

     // Multiple inheritance using interface
     System.out.println("Multiple  Inheritance");
     Machine machine = new Machine();
     machine.print();
     machine.scan();
 }
}


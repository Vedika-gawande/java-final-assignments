package Prcaticals;

import java.util.Scanner;

class Address {
    String num;
    String city;
    String state;
    String country;

    Address(String num, String city, String state, String country) {
        this.num = num;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    void displayAddress() {
        System.out.println(num + ", " + city + ", " + state + ", " + country);
    }
}

class Student {
    String USN;
    String name;
    Address addr;

    Student(String USN, String name, Address addr) {
        this.USN = USN;
        this.name = name;
        this.addr = addr;
    }

    void displayStudent() {
        System.out.println("Student USN: " + USN);
        System.out.println("Student Name: " + name);
        System.out.print("Address: ");
        addr.displayAddress();
    }
}

class Employee {
    String UPID;
    String name;
    Address addr;

    Employee(String UPID, String name, Address addr) {
        this.UPID = UPID;
        this.name = name;
        this.addr = addr;
    }

    void displayEmployee() {
        System.out.println("Employee UPID: " + UPID);
        System.out.println("Employee Name: " + name);
        System.out.print("Address: ");
        addr.displayAddress();
    }
}

public class MainProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Student " + (i+1));

            System.out.print("USN: ");
            String usn = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("House Number: ");
            String num = sc.nextLine();

            System.out.print("City: ");
            String city = sc.nextLine();

            System.out.print("State: ");
            String state = sc.nextLine();

            System.out.print("Country: ");
            String country = sc.nextLine();

            Address addr = new Address(num, city, state, country);

            students[i] = new Student(usn, name, addr);
        }

        System.out.println("\nStudent Details:");
        for(int i = 0; i < n; i++) {
            students[i].displayStudent();
        }

        System.out.println("\nEnter Employee Details");

        System.out.print("UPID: ");
        String upid = sc.nextLine();

        System.out.print("Name: ");
        String ename = sc.nextLine();

        System.out.print("House Number: ");
        String enum1 = sc.nextLine();

        System.out.print("City: ");
        String ecity = sc.nextLine();

        System.out.print("State: ");
        String estate = sc.nextLine();

        System.out.print("Country: ");
        String ecountry = sc.nextLine();

        Address eaddr = new Address(enum1, ecity, estate, ecountry);

        Employee emp = new Employee(upid, ename, eaddr);

        System.out.println("\nEmployee Details:");
        emp.displayEmployee();
    }
}
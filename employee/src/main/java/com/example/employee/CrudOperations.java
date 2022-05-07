package com.example.employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CrudOperations {


    public static void main(String[] args) {
        int choice;
        Scanner integerScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        List<MyClass> collection = new ArrayList<MyClass>();

        do {

            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");
            System.out.println("4. DELETE");
            System.out.println("5. UPDATE");
            System.out.print("ENTER YOUR CHOICE : ");

            choice = integerScanner.nextInt();

            switch (choice) {
                case 1: // Insert
                    System.out.print("  Enter Employee Number : ");
                    int empno = integerScanner.nextInt();
                    System.out.print("  Enter Employee Name : ");
                    String empname = stringScanner.nextLine();
                    System.out.print("  Enter Employee Salary : ");
                    int empsalary = integerScanner.nextInt();

                    collection.add(new MyClass(empno,empname,empsalary));
                break;

                case 2: // Display
                    System.out.println("---------------------------------");

                    Iterator<MyClass> iterator = collection.iterator();

                    while (iterator.hasNext()) {
                        MyClass employee = iterator.next();
                        System.out.println(employee);
                    }
                    System.out.println("---------------------------------");
                break;

                case 3: //Search
                    boolean found = false;
                    System.out.print("Enter Employee Number to Search : ");
                    empno =integerScanner.nextInt();
                    System.out.println("---------------------------------");
                    iterator = collection.iterator();

                    while (iterator.hasNext()) {
                        MyClass employee = iterator.next();
                        if (employee.getEmployeeNo() == empno) {
                            System.out.println(employee);
                            found=true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found!");
                    }
                    System.out.println("---------------------------------");
                break;

                case 4: // Delete
                    found = false;
                    System.out.print("Enter Employee Number to Delete : ");
                    empno =integerScanner.nextInt();
                    System.out.println("---------------------------------");
                    iterator = collection.iterator();

                    while (iterator.hasNext()) {
                        MyClass employee = iterator.next();
                        if (employee.getEmployeeNo() == empno) {
                            iterator.remove();
                            found=true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found!");
                    } else {
                        System.out.println("Record deleted successfully!");
                    }
                    System.out.println("---------------------------------");
                break;

                case 5: // Update
                    found = false;
                    System.out.print("Enter Employee Number to Update : ");
                    empno =integerScanner.nextInt();
                    System.out.println("---------------------------------");
                    ListIterator<MyClass> listIterator = collection.listIterator();

                    while (listIterator.hasNext()) {
                        MyClass employee = listIterator.next();
                        if (employee.getEmployeeNo() == empno) {
                            System.out.print("Enter a new Name : ");
                            empname = stringScanner.nextLine();
                            System.out.print("Enter a new Salary : ");
                            empsalary = integerScanner.nextInt();
                            listIterator.set(new MyClass(empno,empname,empsalary));
                            found=true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found!");
                    } else {
                        System.out.println("Record updated successfully!");
                    }
                    System.out.println("---------------------------------");
                    break;
            }

        } while (choice!=0);

    }
}

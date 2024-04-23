package com.example.entity;
import java.util.Scanner;
public class Student {
    private int id ;
    private String firstName;
    private  String lastName;
    private double mark;
    public Student() {

    }
    public Student(int id, String firstName, String lastName, double mark){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }
    public void scanInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id : ");
        this.id = scanner.nextInt();
        System.out.println("Enter FirstName  : ");
        this.firstName = scanner.nextLine();
        System.out.println("Enter LastName : ");
        this.lastName= scanner.nextLine();
        System.out.println("Enter Mark : ");
        this.mark=scanner.nextDouble();
    }
    public void printInfo(){
        System.out.printf("%3d|%10s%10s|%5f\n" ,getId(), getFirstName(), getLastName(), getMark());
    }
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public double getMark(){
        return mark;
    }
}

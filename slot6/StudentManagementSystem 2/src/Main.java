import com.example.entity.Student;
import com.example.model.StudentList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static StudentList list;
    public static void menu(){
        System.out.println("1. Add a new Student to the list");
        System.out.println("2. Delete a Student from the list");
        System.out.println("3. Search by name");
        System.out.println("4. Search by id");
        System.out.println("5. Print Student infor in descending order or mark");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) {
        list = new StudentList();
        menu();

        while(true){
            int choice;
            System.out.println("#: ");
            choice = input.nextInt();
            if (choice==1){
                addStudent();
                menu();
            } else if (choice==2) {
                deleteStudent();
                menu();
            } else if (choice==3) {
                searchByName();
                menu();
            } else if (choice==4) {
                searchById();
                menu();
            } else if (choice==5) {
                printSorted();
                menu();
            } else if (choice==6) {
                System.exit(0);
            }
        }
    }
    public static void addStudent(){
        int id =0;
        String fn;
        String ln;
        Double mark;
        System.out.println("Enter Sttudent id");
        id = input.nextInt();
        System.out.println("Enter FirstName");
        fn =input.next();
        System.out.println("Enter LastName");
        ln =input.next();
        System.out.println("Enter mark");
        mark =input.nextDouble();
        Student s = new Student(id, fn, ln,mark);
        list.add(s);
    }
    public static void deleteStudent(){
        int id;
        System.out.println("Enter Id : ");
        id = input.nextInt();
        list.remove(id);
    }
    public  static void searchByName(){
        String name;
        System.out.println("Enter a Name : ");
        name = input.next();
        ArrayList<Student>found = list.firstByName(name);
        list.showList(found);
    }
    public static void searchById(){
        int id;
        System.out.println("Enter an Id : ");
        id = input.nextInt();
        Student s = list.findById(id);
        if (s== null){
            System.out.println("Not found");
        }else {
            s.printInfo();
        }
    }
    public static void printSorted(){
        list.sortByMark();
        list.showList();
    }

}
package com.example.model;

import com.example.entity.Student;

import java.util.*;

public class StudentList {
    private ArrayList<Student> list;
    private int length;
    public StudentList(){list = new ArrayList<Student>();}
   public ArrayList<Student> firstByName(String name) {
        boolean found = false;
        ArrayList<Student> matches  = new ArrayList<>();
        for (Student s : list){
            String fullName = new String(s.getFirstName() +""+ s.getLastName()).toLowerCase();
            if(fullName.matches("(.*)" + name.toLowerCase() + "(.*)")){
                matches.add(s);
                found = true;
            }

        }
        if (found == false){
            System.out.println("Not Found");
        }
        return matches;
   }
public Student findById(int id){
        for (Student s:list){
            if(s.getId() == id){
                return s;
            }
        }
        return  null;
}
public void add(Student s){list.add(s);}
    public  void remove(int id){
        boolean found = false;
        for (Student s:list){
            if (s.getId()==id){
                int choice;
                System.out.println("Are you sure deleting this Student ? (1.yes  2.no");
                choice = new Scanner(System.in).nextInt();
                if (choice==1)
                    list.remove(s);
                found = true;
            }
        }
        if (found==false){
            System.out.println("Can not find Student with id :" + id);
        }
    }
    public void sortByMark(){
        Collections.sort(list,new Comparator<Student>(){
            @Override
            public int compare(Student s1 , Student s2) {return new Double(s2.getMark()).compareTo(s1.getMark());}
        });
    }
    public void showList(){
        for (Student s: list){
            s.printInfo();
        }
    }
    public void showList(ArrayList<Student>slist){
        for (Student s: slist){
            s.printInfo();
        }
    }

}

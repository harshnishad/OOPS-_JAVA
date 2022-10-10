import java.util.*;
public class main  {
public static void main(String[] args){
    // Store 5 roll no
    int[] numbers = new int[5];

    // Store 5 name 
    String[] names = new String[5];



    Student kunal = new Student();
    Student random = new Student();
    System.out.println(random.name);
    // kunal.rno = 30;
    // kunal.name = "kunal jaton";
    // kunal.marks = 99.2f;

    System.out.println(kunal.rno);
    System.out.println(kunal.name);
    System.out.println(kunal.marks);
        }
    }
        // creat a class
        // for every single student
    
     class Student{
        int rno;
        String name;
        float marks;

         Student(){
            //this is how you call a constructor from another constructor
            // internally new student data
            this (13,"harsh",99.6f);
         }

         //constructor
         
         // Student arpit = new Student(17."arpit",89.7f)
         //here,this will be replaced with arpit
         Student(int rno , String name,float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
            }
    }

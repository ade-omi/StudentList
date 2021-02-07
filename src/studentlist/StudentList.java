/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

import java.util.Scanner;

/**
 *This class is a simple example of creating arrays of objects
 * @date February 7, 2021
 * @author dapo
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array of students
        Student[] students = new Student[2];
        
        Scanner input = new Scanner(System.in);
        //Loop to create studnets
        
        for(int i =0; i <students.length; i++){
            System.out.println("What are the students names");
            String name = input.nextLine();
            Student student = new Student(name);
            
            students[i] = student;
        }
        System.out.println("Printing the students: ");
        String format = "The student's name is %s\n";
        for(Student student: students){
            System.out.printf(format, student.getName());
        }
        
    }
    
}

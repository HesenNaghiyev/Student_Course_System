package student;

import bean.Student;
import config.Config;
import menu.Menu;

import java.util.Scanner;

public class StudentOperation {


    public static void appendStudent() {

          System.out.println("How Many Student you want to add");
          Scanner scanner1 = new Scanner(System.in);
          int count = scanner1.nextInt();
           for (int i = 1; i <= count; i++) {

            System.out.println("Enter The Student Name");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();

            System.out.println("Enter The Student Surname");
            scanner = new Scanner(System.in);
            String surname = scanner.nextLine();

            System.out.println("Enter The Student Age");
            scanner = new Scanner(System.in);
            int age = scanner.nextInt();

            System.out.println("Enter The Student Id");
            scanner = new Scanner(System.in);
            int id = scanner.nextInt();

            System.out.println("Enter The Student Gpa");
            scanner = new Scanner(System.in);
            double gpa = scanner.nextDouble();

            Student student = new Student(name, surname, age, id, gpa);
            Config.createInstance().addStudent(student);
            System.out.println(student);
            System.err.println("Successfully Added");

        }
        Menu.studentMainMenu();
    }

    public static  void showAllStudents(){
        Config config =Config.createInstance();
        for (int i=0; i<config.getStudents().length; i++){
            System.out.println(config.getStudents()[i]);
        }
        Menu.studentMainMenu();
    }
}
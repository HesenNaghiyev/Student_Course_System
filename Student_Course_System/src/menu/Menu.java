package menu;

import bean.Student;
import course.CourseOperation;
import student.StudentOperation;


import java.util.Scanner;

public class Menu {
    public static void studentMainMenu() throws Exception {
        System.out.println("Press 1 to :Add Student");
        System.out.println("Press 2 to :Show Students");
        System.out.println("Press 3 to :Search  Students");
        System.out.println("Press 4 to :Welcome  Page");
        System.out.println("Press 5 to :Exit from System");

        Scanner scanner = new Scanner(System.in);
        int userChoice;

        while(true) {
            userChoice = scanner.nextInt();
            switch (userChoice)
            {
                case 1:
                    StudentOperation.appendStudent();
                    break;
                case 2: StudentOperation.showAllStudents();
                    break;
                case 3:
                    break;

                case 4:
                    welcomePage();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Please, enter 1 , 2, 3, 4, o 5 ");
                    break;
            }


        }


    }
    public static void courseMainMenu() throws Exception {
        System.out.println("Press 1 to :Add Course");
        System.out.println("Press 2 to :Show Course");
        System.out.println("Press 3 to :Search Course");
        System.out.println("Press 4 to :Welcome  Page");
        System.out.println("Press 5 to :Exit from System");

        Scanner scanner = new Scanner(System.in);
        int userChoice;

        while(true) {
            userChoice = scanner.nextInt();
            switch (userChoice)
            {
                case 1:
                    CourseOperation.appendCourse();

                    break;
                case 2:
                    CourseOperation.showAllCourse();
                    break;
                case 3:
                    break;

                case 4:
                    welcomePage();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Please, enter 1 , 2, 3 ,4, or 5");
                    break;
            }

        }
    }

    public static void welcomePage() throws Exception {
        System.out.println("Welcome to Student and Course management System");
        System.out.println("Press 1 to go Student Operation");
        System.out.println("Press 2 to go Course Operation");

        Scanner sc = new Scanner(System.in);
        int choice;

        while(true) {
            choice = sc.nextInt();
            switch (choice)
            {
                case 1: studentMainMenu();
                    break;
                case 2: courseMainMenu();
                    break;
                default:
                    System.out.println("Please, enter 1 or 2");
                    break;
            }

        }
    }
}

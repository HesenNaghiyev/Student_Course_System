package course;

import bean.Course;
import bean.Student;
import config.Config;
import file.FileUtility;
import menu.Menu;

import java.util.Scanner;

public class CourseOperation {

    public static void appendCourse() throws Exception {

        System.out.println("How Many Course you want to add");
        Scanner scanner1 = new Scanner(System.in);
        int count = scanner1.nextInt();
        for (int i = 1; i <= count; i++) {

            System.out.println("Enter The Course Name");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();

            System.out.println("Enter The Course CRN");
            scanner = new Scanner(System.in);
            String surname = scanner.nextLine();

            System.out.println("Enter the Course Instructor");
            scanner = new Scanner(System.in);
            String instructor = scanner.nextLine();


            Course course =new Course(name,surname,instructor);
            Config.createInstance().addCourse(course);
            System.out.println(course);
            System.err.println("Successfully Added");

            FileUtility.writeObjectIntoFile(Config.createInstance(),"Student_Course_Info.txt");

        }
        Menu.courseMainMenu();
    }

    public static  void showAllCourse() throws Exception {
        Config config =Config.createInstance();
        for (int i=0; i<config.getCourses().length; i++){
            System.out.println(config.getCourses()[i]);
        }
        Menu.courseMainMenu();
    }
}

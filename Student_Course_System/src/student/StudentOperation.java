package student;

import bean.Student;
import config.Config;
import file.FileUtility;
import menu.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperation {

   public static  ArrayList<Student> students =new ArrayList<Student>();

    public static void appendStudent() throws Exception {

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

            FileUtility.writeObjectIntoFile(Config.createInstance(),"Student_Course_Info.txt");

        }
        Menu.studentMainMenu();
    }



    public static  void showAllStudents() throws Exception {
        Config config =Config.createInstance();
        for (int i=0; i<config.getStudents().length; i++){
            if (config.getStudents()[i].getAge()!=-1)
            System.out.println(config.getStudents()[i]);
        }

        Menu.studentMainMenu();
    }


    public static void searchStudentById() throws Exception {
        students.clear();
        Config config =Config.createInstance();
        System.out.println("Please Enter Id");
        Scanner sc = new Scanner(System.in);
        int id =sc.nextInt();

        for (Student x: config.getStudents()) {
              if (x.getId()==id){
                  students.add(x);
                  if (x.getAge()==-1)
                      continue;
                  System.out.println(x);

              }
        }

         if (students.get(0).getAge()==-1){
             Menu.studentMainMenu();
         }
        deleteOrUpdate();



    }


    public static void deleteOrUpdate() throws Exception {
          Scanner scanner =new Scanner(System.in);
          System.out.println("");
          if (isUserSure()){
            System.out.println("For Delete  press 1");
            System.out.println("For Update  press 2");
            scanner=new Scanner(System.in);
            int result =scanner.nextInt();
            switch (result){
                case 1:deleteStudent();
                break;
                case 2:update();
                break;
                default:
                    break;

            }

        }
          else
              Menu.studentMainMenu();
    }

    public static boolean isUserSure() throws Exception {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Do you want to Delete or Update || Yes or No");
        String decision =scanner.nextLine();
        if (decision.equalsIgnoreCase("Yes")){
            return true;
        }
        return false;

    }

    public static void deleteStudent() throws Exception {
        for (Student x:students) {
            x.setAge(-1);
            System.err.println("Student "+x.getName()+ "is deleted");
        }
        Menu.studentMainMenu();

    }

    public static void update() throws Exception {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the ID ");
        int id =scanner.nextInt();


        scanner =new Scanner(System.in);
        System.out.println("Enter the name ");
        String name =scanner.nextLine();

        scanner=new Scanner(System.in);
        System.out.println("Enter the surname ");
        String surname =scanner.nextLine();

        scanner=new Scanner(System.in);
        System.out.println("Enter the age ");
        int age =scanner.nextInt();

        scanner=new Scanner(System.in);
        System.out.println("Enter the gpa ");
        double gpa =scanner.nextDouble();


        for (Student x:students) {
        x.setId(id);
        x.setName(name);
        x.setSurname(surname);
        x.setAge(age);
        x.setGpa(gpa);
        }
        Menu.studentMainMenu();
    }

}
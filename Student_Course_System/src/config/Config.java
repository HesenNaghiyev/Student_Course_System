package config;

import bean.Course;
import bean.Student;
import file.FileUtility;

import java.io.Serializable;

public class Config implements Serializable {

    public static Config config;

    private Student[]  students=new Student[0];
    private  Course [] courses=new Course[0];

    public static Config createInstance(){
        if (config==null){
            config=new Config();
        }
        return config;
    }

    public static void readFromFile()  {
       Object obj= FileUtility.readFileDeserialize("Student_Course_Info.txt");

       if (obj ==null){
           return;
       }
       if (obj instanceof Config){
           config=(Config)obj;
       }
    }

    public  void addStudent(Student s){
        Student [] newStudents =new Student[students.length+1];

        for (int i =0; i<students.length; i++){
            newStudents[i]=students[i];
        }
        newStudents[newStudents.length-1]=s;

        students=newStudents;
    }

    public void addCourse(Course c){
        Course [] newCourses =new Course[courses.length+1];

        for (int i=0; i<courses.length; i++){
            newCourses[i]=courses[i];
        }
        newCourses[newCourses.length-1]=c;

        courses=newCourses;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}






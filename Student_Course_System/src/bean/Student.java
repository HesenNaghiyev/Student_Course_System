package bean;

public class Student extends Person {

    private int Id;

    private double gpa;


    public Student(String name, String surname, int age, int id, double gpa) {
        super(name, surname, age);
        this.Id=id;
        this.gpa=gpa;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }



    @Override
    public String toString() {
        return "Student{" +
                "Name=" + super.getName() +
                ", Surname=" + super.getSurname() +
                ", Age=" + super.getAge() +
                "Id=" + this.Id +
                ", gpa=" + this.gpa +
                 '\'' +
                '}';
    }
}

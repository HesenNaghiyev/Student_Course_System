package bean;

import java.io.Serializable;

public class Course implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;

    private String CRN;

    private String instructor;


    public Course(String name, String CRN, String instructor) {
        this.name = name;
        this.CRN = CRN;
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCRN() {
        return CRN;
    }

    public void setCRN(String CRN) {
        this.CRN = CRN;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", CRN='" + CRN + '\'' +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}

package bean;

public class Student extends Person {

    private double gpa; //4.0 scale
    private String className;

    public void setClassName(String className) {
        this.className = className;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Full Name = " + getName() + " " + getSurname() +
                ", Age = " + getAge() +
                ", School = " + getSchoolName() +
                ", Class = " + className +
                ", GPA =" + gpa +
                ", Class Name='" + className + '}';
    }
}

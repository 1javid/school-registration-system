package bean;

public class Teacher extends Person {

    private String subject;
    private double salary;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Full Name = " + getName() + " " + getSurname() +
                ", Age = " + getAge() +
                ", School = " + getSchoolName() +
                ", Subject = " + subject +
                ", Salary = " + salary + '}';
    }
}

public class Teacher {
    private String name;
    private String dept;
    private String subject;
    private double salary;

//    Constructor
    public Teacher(String name, String dept, String subject, double salary) {
        this.name = name;
        this.dept = dept;
        this.subject = subject;
        this.salary = salary;
    }

    //    Copy Constructor
    public Teacher(Teacher t1) {
        this.name=t1.name;
        this.dept=t1.dept;
        this.subject=t1.dept;
        this.salary=t1.salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

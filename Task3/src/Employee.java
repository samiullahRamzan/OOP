public class Employee {
    private String cnic;
    private String name;
    private double salary;

    public Employee(){
        System.out.println("No argument constructor called!");
    }

    public Employee(String cnic, String name) {
        setCnic(cnic);
        setName(name);
    }

    public Employee(String cnic, String name, double salary) {
        this(cnic,name);       // call second constructor
        this.salary = salary;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

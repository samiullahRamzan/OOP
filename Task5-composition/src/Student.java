public class Student {
    private String name;
    private String email;
    private String cnic;
    private Course course1;
    private Course course2;
    private Address address;

    public Student(String name, String cnic, Address address) {
        this.name = name;
        this.cnic = cnic;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public Course getCourse1() {
        return course1;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public Course getCourse2() {
        return course2;
    }

    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void print(){

        System.out.println("---------------------------------");
        System.out.println("Student detail");
        System.out.println("Name:\t"+name);
        System.out.println("Email:\t"+email);
        System.out.println("CNIC:\t"+cnic);
        System.out.println("Street address:\t"+address.getStreetAddress());
        System.out.println("Town:\t"+address.getTown());
        System.out.println("City:\t"+address.getCity());
        System.out.println("Country:\t"+Address.country);

        System.out.println("Course1 detail");
        System.out.println("Course1 code:\t"+course1.getCourseCode());;
        System.out.println("Course1 title:\t"+course1.getCourseTitle());

        System.out.println("Course2 detail");
        System.out.println("Course2 code:\t"+course2.getCourseCode());;
        System.out.println("Course2 title:\t"+course2.getCourseTitle());
    }
}

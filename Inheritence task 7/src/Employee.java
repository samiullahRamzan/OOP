public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String CNIC;

    public Employee(int id,String firstName, String lastName, String CNIC) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setCNIC(CNIC);
    }

    public Employee(){

    }

    public String toString(){
        System.out.println("-----------------Employee Information------------");
        return "Id:"+getId()+"\n"+"FirstName:"+getFirstName()+"\n"+"LastName:"+getLastName()+"\n"+"CNIC:"+getCNIC()+"\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }
}

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private double height;
    private double weight;


    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, int age) {
        this.name = name;
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        int dateOfBirthYear = year - age;
        LocalDate date1 = LocalDate.of(dateOfBirthYear, month, day);
        setDateOfBirth(date1);
    }

    public double getHeight() {
        return height;
    }

    public double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public void setHeight(double height) {
        if(height>0){
            this.height = feetToMeters(height);
        }else{
            System.out.println("Height should be greater than 0");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight>0){
            this.weight = weight;
        }else{
            System.out.println("Weight should be greater than 0");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        LocalDate date=LocalDate.now();
        return date.getYear()-getDateOfBirth().getYear();
    }



    public double getBMI(){
        return getWeight()/(getHeight()*getHeight());
    }

    public String getBMIHelp(double BMI){
        if(BMI<18.5){
            return "Underweight";
        }else if(BMI<24.9){
            return "Normal weight";
        }else if(BMI<29.9){
            return "Over weight";
        }else{
            return "Obesity";
        }
    }

}


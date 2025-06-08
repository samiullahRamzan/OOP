public class BasePlusCommissionEmployee extends CommissionEmployee{
       private double basicSalary;

        public BasePlusCommissionEmployee(int id,String firstName,String lastName,
                                          String CNIC, double commissionRate,
                                          double totalSales,double salary) {
               super(id,firstName,lastName,CNIC,commissionRate,totalSales);
               setBasicSalary(salary);
        }

       public String toString(){
              return super.toString()+"Basic Salary:"+getBasicSalary()+"\n";
       }
        @Override
        public double getEarnings(){
            return super.getEarnings()+getBasicSalary();

        }

        public double getBasicSalary() {
            return basicSalary;
        }

        public void setBasicSalary(double basicSalary) {
            this.basicSalary = basicSalary;
        }
}



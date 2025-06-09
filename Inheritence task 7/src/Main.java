public class Main {
    public static void main(String[] args) {
//        Employee employee=new Employee(3554,"gujjar","230","43453654645");
//        CommissionEmployee c_employee=new CommissionEmployee(4546,"SAMI","ULLAH","35103-1175274-1",30000,45);
//        System.out.println(employee.toString());
//        System.out.println(c_employee.toString());
//        BasePlusCommissionEmployee basePlus=new BasePlusCommissionEmployee(4546,"SAMI","ULLAH","35103-1175274-1",30000,45,68658);
//        System.out.println(basePlus.toString());
//        System.out.println("--------------------------------");
//        System.out.println("Here is earning of basepluscommission employee:\t"+basePlus.getEarnings());

          HourlyEmployee hourlyEmployee=new HourlyEmployee("SAMI","ULLAH","35103-2275274-1",56,67868);
          System.out.println(hourlyEmployee.toString());
          System.out.println(hourlyEmployee.earnings());
    }
}
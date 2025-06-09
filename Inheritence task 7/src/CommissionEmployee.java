public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double totalSales;

    public CommissionEmployee(int id,String firstName,String lastName,
                              String CNIC, double commissionRate,
                              double totalSales) {
        super(id,firstName,lastName,CNIC);
       setCommissionRate(commissionRate);
       setTotalSales(totalSales);
    }

    public CommissionEmployee(){

    }
    @Override
    public String toString(){
      return super.toString()+"CommissionRate:"+getCommissionRate()+"\n"+"TotalSales:"+getTotalSales()+"\n";
    }

    public double getEarnings() {
        double commission = getCommissionRate() * getTotalSales();
        double bonus = 0;

        if (commission >= 10000 && commission <= 20000) {
            bonus = 5000;
        } else if (commission > 20000 && commission <= 50000) {
            bonus = 10000;
        } else if (commission > 50000) {
            bonus = 20000;
        }

        return commission + bonus;
    }


    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }


}

public class basePlusCommissionEmployee extends commissionEmployee {
    private final double baseSalary;

    public basePlusCommissionEmployee(String firstname, String lastname, String socialSecurityNumber,
                                      double CommissionRate, double GrossSales,double baseSalary){
        super(firstname, lastname, socialSecurityNumber, CommissionRate, GrossSales);
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("base salary must be greater than 0.0");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings(){
        return baseSalary + super.earnings();
    }

    @Override
    public String toString(){
        return String.format("%s:%n%n%s: %s %s%n%s: %s%n%s: $%.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "Base Salary plus Commission Employee","Employee",
                getFirstname(),getLastname(),"socialSecurityNumber",getSocialSecurityNumber(),"Base Salary",
                getBaseSalary(),"Gross Sales",
                getGrossSales(),"Commission Rate",getCommissionRate(),"Earnings",earnings());
    }
}

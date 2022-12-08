package BridgeLabz;

public class EmpWageUC11 {
    public static void main(String[] args) {
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("TATA", 10, 20, 100);
        empWageBuilder.addCompanyEmpWage("Birla", 20, 22, 90);
        empWageBuilder.calculateWage();
    }
}


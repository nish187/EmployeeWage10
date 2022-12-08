package BridgeLabz;

public class EmpWageUC10 {

        public static void main(String[] args) {
            EmpWageBuilder empWageBuilder = new EmpWageBuilder();
            empWageBuilder.addCompanyEmpWage("TATA", 10, 20, 100);
            empWageBuilder.addCompanyEmpWage("Reliance", 20, 22, 90);
            empWageBuilder.calculateWage();
        }
    }


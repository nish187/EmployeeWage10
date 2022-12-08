package BridgeLabz;

public class EmpWage {
    public static void main(String[] args) {
        EmpWageUC9 TATA = new EmpWageUC9("TATA", 10, 20, 100);
        EmpWageUC9 Reliance = new EmpWageUC9("Reliance", 20, 22, 90);
        TATA.calculateWage();
        System.out.println(TATA);
        Reliance.calculateWage();
        System.out.println(Reliance);
    }
}

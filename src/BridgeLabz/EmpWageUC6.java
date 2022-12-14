package BridgeLabz;

public class EmpWageUC6 {


       public static final int IS_FULL_TIME = 1;
       public static final int IS_PART_TIME = 2;
       public static final int WAGE_PER_HOUR = 20;
       public static final int FULL_DAY_HOUR = 8;
        public static final int PART_TIME_HOUR = 4;
        public static final int WORKING_DAY_PER_MONTH = 20;
        public static final int TOTAL_WORK_HOURS = 100;
        static int totalHours=0;
       static int day = 0;
        static int totalWage = 0;
        static int dailyWage = 0;

        public static void main(String[] args) {

            System.out.println("Welcome to EmployeeWage Program");

            while ((totalHours < TOTAL_WORK_HOURS) && (day < WORKING_DAY_PER_MONTH)) {

                int attendance = (int) (Math.floor(Math.random() * 10)) % 3;
                switch (attendance) {
                    case IS_FULL_TIME:
                        dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                        totalHours =totalHours+ FULL_DAY_HOUR;
                        break;
                    case IS_PART_TIME:

                        dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                        totalHours =totalHours+ PART_TIME_HOUR;
                        break;
                    default:
                        break;
                }
                totalWage =totalWage+ dailyWage;
                day++;
            }
            System.out.println("Total work hours is : " + totalHours);
            System.out.println("Total work days are: " + day);
            System.out.println("Total wage is: " + totalWage);
        }
    }


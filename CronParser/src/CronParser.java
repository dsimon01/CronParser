public class CronParser {

    public static void main(String[] args) {

        if (args.length != 0) {
            Parser cron = new Parser(args[0]);
            System.out.printf("%-15s %15s %n", "Minutes: " , cron.getMin());
            System.out.printf("%-15s %6s %n", "Hour: " , cron.getHourString());
            System.out.printf("%-15s %9s %n", "Day of Month: " , cron.getDay_of_month());
            System.out.printf("%-20s %18s %n", "Month: " , cron.getMonth());
            System.out.printf("%-15s %14s %n", "Day of Week: " , cron.getDay_of_week());
            System.out.printf("%-15s %18s %n", "Command: " , cron.getCommand());
        }else {
            System.err.println("Incorrect number of arguments || arguments missing - CronParser script - required");
            System.exit(-1);
        }
    }
}
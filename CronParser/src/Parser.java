public class Parser {

    private String data;

    private MinuteExpression minutes;
    private String min;

    private HourExpression hour;
    private String hourString;

    private DayOfMonthExpression dayOfMonthExpression;
    private String day_of_month;

    private MonthExpression monthExpression;
    private String month;

    private DayOfTheWeekExpression dayOfTheWeek;   // rename to +Expression
    private String day_of_week;

    private CommandExpression commandExpression;
    private String command;

    public Parser(String data){
        this.data = data;
       helper(data);
    }

    private void helper(String data){
        String[] split_data = data.split(" ");

        for (int i = 0; i < split_data.length; i++){
            switch (i){
                case 0 :
                    passMinutes(split_data[i]);
                case 1 :
                    passHour(split_data[i]);
                case 2 :
                    passDoM(split_data[i]);
                case 3 :
                    passMonth(split_data[i]);
                case 4 :
                    passDoW(split_data[i]);
                case 5 :
                    passCommand(split_data[i]);
                default:
            }
        }
    }

    private void passMinutes(String x){
        minutes = new MinuteExpression(x);
        min = minutes.interpret(x);
    }

    private void passHour(String x){
        hour = new HourExpression(x);
        hourString = hour.interpret(x);
    }

    private void passDoM(String x){
        dayOfMonthExpression = new DayOfMonthExpression(x);
        day_of_month = dayOfMonthExpression.interpret(x);
    }

    private void passMonth(String x){
        monthExpression = new MonthExpression(x);
        month = monthExpression.interpret(x);
    }

    private void passDoW(String x){
        dayOfTheWeek = new DayOfTheWeekExpression(x);
        day_of_week = dayOfTheWeek.interpret(x);
    }

    private void passCommand(String x){
        commandExpression = new CommandExpression(x);
        command = commandExpression.interpret(x);
    }

    public String getMin(){
        return min;
    }

    public String getHourString(){
        return hourString;
    }

    public String getDay_of_month(){
        return day_of_month;
    }

    public String getMonth(){
        return month;
    }

    public String getDay_of_week(){
        return day_of_week;
    }

    public String getCommand(){
        return command;
    }
}

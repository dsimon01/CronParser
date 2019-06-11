public class DayOfTheWeekExpression implements Expression {

    private String data;

    public DayOfTheWeekExpression(String data){
        this.data = data;
    }

    @Override
    public String interpret(String context) {
        if (context.contains(data)) {
            switch (data){
                case "1-5" :
                    return "1 2 3 4 5";
                case "1-7":
                    return "1 2 3 4 5 6 7";
                default:
                    return "Unsupported data at: " + this.getClass().getName();
        }
    }
        return data;
    }
}


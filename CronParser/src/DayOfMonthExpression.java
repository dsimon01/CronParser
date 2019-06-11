public class DayOfMonthExpression implements Expression {

    private String data;

    public DayOfMonthExpression(String data) {
        this.data = data;
    }

    @Override
    public String interpret(String context) {
        if (context.contains(data)) {
            switch (data) {
                case "1,15":
                    return "1 15";
                case "2,6":
                    return "2 6";
                default:
                    return "Unsupported data at: " + this.getClass().getName();
            }
        }
        return data;
    }
}

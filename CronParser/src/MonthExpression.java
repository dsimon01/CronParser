public class MonthExpression implements Expression {

    private String data;

    public MonthExpression(String data){
        this.data = data;
    }

    @Override
    public String interpret(String context) {
        if (context.contains(data)) {
            switch (data){
                case "*" :
                    return "1 2 3 4 5 6 7 8 9 10 11 12";
                case "2,6":
                    return "2 6";
                default:
                    return "Unsupported data at: " + this.getClass().getName();
        }
    }
        return data;
    }
}

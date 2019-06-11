public class MinuteExpression implements Expression {

    private String data;

    public MinuteExpression(String data) {
        this.data = data;
        interpret(data);
    }

    @Override
    public String interpret(String context) {
        if (context.contains(data)) {
            switch (data) {
                case "*/15":
                    return "0 15 30 45";
                case "*":
                    return "1 2 3 4 5 6 7 8 9 10...";
                case "0":
                    return "0";
                default:
                    return "Unsupported data at: " + this.getClass().getName();
            }
        }
        return data;
    }

}
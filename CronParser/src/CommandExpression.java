public class CommandExpression implements Expression {

    private String data;

    public CommandExpression(String data) {
        this.data = data;
    }

    @Override
    public String interpret(String context) {
        if (context.contains(data)) {
            return data;
        }
        return "Unsupported data at: " + this.getClass().getName();
    }
}
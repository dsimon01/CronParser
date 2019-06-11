public class HourExpression implements Expression {

    private String data;

    public HourExpression(String data){
        this.data = data;
    }

    @Override
    public String interpret(String context) {
        if (context.contains(data)) {
            switch (data) {
                case "0":
                    return "0";
                case "1" :
                    return "1";
                default:
                    return "Unsupported data at: " + this.getClass().getName();
        }
    }
        return data;
    }
}

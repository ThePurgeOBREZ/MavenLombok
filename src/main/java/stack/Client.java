package stack;

public class Client {
    public static void main(String[] args) {
        String initialString = "fsdfsd";
        StackService service = new StackService();
        System.out.println(service.isStatementCorrect(initialString));
    }
}

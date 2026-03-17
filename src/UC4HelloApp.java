public class UC4HelloApp {
    public static void main(String[] args) {

        String message;

        if (args.length > 0) {
            message = String.join(", ", args);
        } else {
            message = "World";
        }

        System.out.println("Hello, " + message + "!");
    }
}
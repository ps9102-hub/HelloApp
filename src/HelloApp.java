public class HelloApp {
    public static void main(String[] args) {

        // Check if arguments are passed
        if (args.length > 0) {
            // Join all arguments with space
            String name = String.join(" ", args);
            System.out.println("Hello " + name);
        } else {
            // Default message
            System.out.println("Hello");
        }
    }
}
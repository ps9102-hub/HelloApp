public class HelloApp {
    public static void main(String[] args) {
        // Check if any command-line arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build greeting for multiple names
        String greeting = "Hello, ";
        for (String name : args) {
            greeting += name + ", ";
        }

        // Remove the trailing comma and space
        greeting = greeting.substring(0, greeting.length() - 2);

        // Add exclamation mark
        greeting += "!";

        // Print the final greeting
        System.out.println(greeting);
    }
}
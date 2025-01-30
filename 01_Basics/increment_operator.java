public class increment_operator {
    public static void main(String[] args) {
        int a = 5;

        // Pre-increment (++a) - Increases first, then uses the value
        System.out.println("Pre-increment: " + (++a)); // Output: 6

        // Post-increment (a++) - Uses the value first, then increases
        System.out.println("Post-increment: " + (a++)); // Output: 6 (then a becomes 7)

        System.out.println("After Post-increment: " + a); // Output: 7

        //Another Example
        int b = 5;
        // Using += operator
        b += 2;  
        System.out.println("Using += : " + b); // Output: 7
    }
}

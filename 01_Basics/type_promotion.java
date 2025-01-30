public class type_promotion {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int c = a * b; // byte is promoted to int automatically
        
        System.out.println("Answer: " + c);
    }
}

public class switch_statement {
    public static void main(String[] args) {
        int n = 3;

        switch (n) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

                case 3:
                System.out.println("Wednesday");
                break;
        
            default:
                System.out.println("Enter a valid number");
                break;
        }
    }
}

public class logical_operators {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int x = 10;
        int y = 20;

        boolean result1 = a>b & x<y;   // This AND checks both condition, so more time complexity
        boolean result2 = a<b && x<y;  // This is Short-Circuiting where only 1st condition is checked, less time complexity
        boolean result3 = a<b;                               // There are 3 operators AND,OR & NOT

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(!result3);

    }
}


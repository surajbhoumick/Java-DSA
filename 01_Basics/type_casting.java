public class type_casting {
    public static void main(String[] args) {
        int num = 10;
double d = num; // Automatic conversion (widening)
System.out.println(d); // Output: 10.0


double numx = 10.99;
int i = (int) numx; // Manual conversion (narrowing)
System.out.println(i); // Output: 10 (decimal part lost)

    }
}

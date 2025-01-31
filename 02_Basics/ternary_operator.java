public class ternary_operator {

    public static void main(String[] args) {
        int a = 4;
        int result;

        /*if(a%2==0)                      Normal Method
        result = 10;

        else
        result = 20; */

        // ? : (Ternary operator)

        result = a%2==0 ?10:20;

        System.out.println(result);
                
    }
}
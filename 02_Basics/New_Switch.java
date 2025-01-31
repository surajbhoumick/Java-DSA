public class New_Switch {
    public static void main(String[] args) {
        int day = 3; // Directly assigning a value

        String dayName = switch (day) {   //using switch as an expression
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day! Please enter a number between 1 and 7.";
        };

        System.out.println("Day: " + dayName);
    }
}

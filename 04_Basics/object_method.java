class Car {

    int num;
    String word;

    // Method
    void drive() {
        System.out.println("The Car is driving: " + word);
    }
}

public class object_method {
    public static void main(String args[]) {
        // Create an object of Car
        Car info = new Car();

        // Set the properties for this object
        info.num = 20;
        info.word = "Toyota";

        // Call the method to make the car drive
        info.drive();
    }
}
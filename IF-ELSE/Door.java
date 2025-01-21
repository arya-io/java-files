// WAP to "open a door" if the user enters the correct code

public class Door {

    public static void main(String[] args) {

        // Set the correct door code
        int doorCode = 1337;

        // Check if the entered code matches the correct door code
        if (doorCode == 1337) {
            // If the code is correct, open the door
            System.out.println("Correct code. The door is now open.");
        } else {
            // If the code is incorrect, keep the door closed
            System.out.println("Wrong code. The door remains closed.");
        }
    }
}

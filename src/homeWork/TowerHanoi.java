package homeWork;

public class TowerHanoi {

    // Function to solve Tower of Hanoi
    public static void solveTowerOfHanoi(int n, String source, String auxiliary, String destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        // Move n-1 disks from source to auxiliary
        solveTowerOfHanoi(n - 1, source, destination, auxiliary);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move the n-1 disks from auxiliary to destination
        solveTowerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        String source = "A"; // Source rod
        String auxiliary = "B"; // Auxiliary rod
        String destination = "C"; // Destination rod

        System.out.println("The moves to solve Tower of Hanoi with " + n + " disks are:");
        solveTowerOfHanoi(n, source, auxiliary, destination);
    }
}

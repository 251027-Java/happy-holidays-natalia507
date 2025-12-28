import java.util.Scanner;

/**
 * Holiday ASCII Art Generator
 * 
 * Your task: Create a festive Christmas tree using ASCII characters!
 * 
 * Basic tree structure:
 * * <- Star on top
 * *** <- Tree branches (odd numbers of *)
 * *****
 * *******
 * ||| <- Trunk
 */
public class HolidayArt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the Christmas tree (number of branch levels): ");
        int height = scanner.nextInt();

        // TODO: Print the tree
        printTree(height);
    }

    /**
     * Prints a Christmas tree with the given height.
     * 
     * @param height Number of branch levels (not including star and trunk)
     */
    public static void printTree(int height) {
        // Steps:
        // 1. Print the star on top (centered)
        // 2. Loop through each level of branches
        // - Calculate spaces needed for centering
        // - Calculate stars needed (1, 3, 5, 7, ...)
        // 3. Print the trunk (centered)

        int i = 1; // Initialize star count for branches
        for(int x = 0; x< height; x++){ //Loops through the height of the tree

            System.out.println(" ".repeat((height*2 - i-1)/2) + "*".repeat(i) + " ".repeat((height*2 - i-1)/2));//Parses through and prints the branches adding two stars each time
            i+=2;
        }
        System.out.println(" ".repeat((height*2-4)/2) +  "|||" + " ".repeat((height*2-4)/2));
        System.out.println("Merry Christmas!");
    }
}

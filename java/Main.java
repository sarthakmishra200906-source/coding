import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Setup Input: Get the size of the matrix from the user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // 2. Fill the matrix with user-provided values
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // 3. Execute the spiral logic
        List<Integer> result = getSpiralOrder(matrix);
        
        // 4. Output the final result
        System.out.println("Spiral Order: " + result);
        sc.close();
    }

    public static List<Integer> getSpiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) return res;

        // Define the four boundaries of the matrix
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        // Loop until boundaries cross each other
        while (top <= bottom && left <= right) {
            
            // Move RIGHT: Across the current top row
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++; // Move the top boundary down

            // Move DOWN: Down the current right column
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--; // Move the right boundary left

            // Check if we still have a valid sub-matrix to traverse
            if (top <= bottom && left <= right) {
                
                // Move LEFT: Across the current bottom row
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--; // Move the bottom boundary up

                // Move UP: Up the current left column
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++; // Move the left boundary right
            }
        }
        return res;
    }
    
}
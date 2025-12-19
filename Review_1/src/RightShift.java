import java.util.*; 

public class RightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the list: ");
        int size = sc.nextInt();
        System.out.print("Enter the list of integers (space-separated): ");
        int[] numbers = new int[size];
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter number of positions to right shift: ");
        int positions = sc.nextInt();
        int[] shiftedArray = shift(numbers, size, positions);
        System.out.println("Array after right shift: " + Arrays.toString(shiftedArray));
        
        sc.close();
    }
    public static int[] shift(int[] numbers, int size, int positions) {
        for(int i=0; i<positions; i++) {
            int temp = numbers[size - 1];
            for(int j=size - 1; j>0; j--) {
                numbers[j] = numbers[j - 1];
            }
            numbers[0] = temp;
        }
        return numbers;
    }
}

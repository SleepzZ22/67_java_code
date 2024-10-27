//ติวสอบเรื่องการหาค่ามากที่สุดและน้อยที่สุด//
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int count = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

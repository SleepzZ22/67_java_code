//การหาผลรวมตัวเลขการใช้ลูป for เพื่อหาผลรวมการหาผลรวมตัวเลข//
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int count = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();
            sum += number;
        }
        System.out.println("Total sum: " + sum);
    }
}

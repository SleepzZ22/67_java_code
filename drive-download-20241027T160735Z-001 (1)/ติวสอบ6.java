//การใช้ลูป while เพื่อหาผลรวม//
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int count = sc.nextInt();
        int sum = 0, i = 1;

        while (i <= count) {
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();
            sum += number;
            i++;
        }
        System.out.println("Total sum: " + sum);
    }
}
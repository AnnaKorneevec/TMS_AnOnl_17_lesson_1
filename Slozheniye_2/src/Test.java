import java.util.Scanner;
class ScannerSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Ввести 2 числа ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print(a + b);
    }
}
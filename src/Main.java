import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("# Üslü Sayı Alma #");
        int n1, n2;
        ExponentialNumbers numbers = new ExponentialNumbers();
        System.out.print("Taban değeri giriniz : ");
        n1 = scanner.nextInt();
        System.out.print("Üs değerinini giriniz : ");
        n2 = scanner.nextInt();
        System.out.println("Sonuç : " + numbers.expNum(n1, n2));
    }

}
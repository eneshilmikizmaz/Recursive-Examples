import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yapmak İstediğiniz İşlem\n" +
                "1-Üslü Sayı\n" +
                "2-Asal Sayı\n" +
                "3-Desene göre Metot");
        int choise = scanner.nextInt();
        switch (choise){
            case 1:
                System.out.println("# Üslü Sayı Alma #");
                int n1, n2, num ;
                ExponentialNumbers numbers = new ExponentialNumbers();
                System.out.print("Taban değeri giriniz : ");
                n1 = scanner.nextInt();
                System.out.print("Üs değerinini giriniz : ");
                n2 = scanner.nextInt();
                System.out.println("Sonuç : " + numbers.expNum(n1, n2));
                break;
            case 2:
                System.out.println("# Asal Sayı Bulma #");
                PrimeNumber number = new PrimeNumber();
                System.out.println("Sayı giriniz :");
                num = scanner.nextInt();
                System.out.println(number.isPrime(num,num-1));
                break;
            case 3:
                System.out.println("# Desene Göre Metot #");
                MethodByPattern method = new MethodByPattern();
                System.out.println("Sayı giriniz :");
                num = scanner.nextInt();
                method.pattern(num,num,true);
                break;
        }

    }

}
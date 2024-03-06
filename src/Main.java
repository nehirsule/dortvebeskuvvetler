import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //n kullanıcının gireceği değer

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        n = input.nextInt();

        //4'ün üslerini i diye tanımladım

            for (int i = 1; i <= n; i*=4) {
                System.out.println(i);
            }
        //5'in üslerini de m diye tanımladım.

            for (int m = 1; m <= n; m*=5) {
                System.out.println(m);
            }

    }
}

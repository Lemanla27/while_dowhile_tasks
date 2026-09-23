import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Test {
    static void main() {

        //1000000007
        //2147483647
        System.out.println("------------------ALGORITHM 1------------------------\n");
        LocalDateTime start = LocalDateTime.now();
        Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil edin:");
        long num = sc.nextLong();
        long div = 1;
        int count = 0;

        while (num >= div) {
            if (num % div == 0)
                count++;
            div++;
        }
        String result = (count == 2) ? "sadedir": "sade deyil";
        System.out.println(result);

        LocalDateTime end = LocalDateTime.now();
        Duration timeout = Duration.between(start, end);
        System.out.println("Vaxt serfi: " + timeout.toSeconds() + "s");

        test();
        test2();
    }

    static void test(){
        System.out.println("------------------ALGORITHM 2------------------------\n");
        LocalDateTime start = LocalDateTime.now();
        Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil edin:");
        long num = sc.nextLong();//5
        long div = 1;
        int count = 0;

        while (num/2 >= div) {
            if (num % div == 0)
                count++;
            div++;
        }
        String result = (count == 2) ? "sadedir": "sade deyil";
        System.out.println(result);

        LocalDateTime end = LocalDateTime.now();
        Duration timeout = Duration.between(start, end);

        System.out.println("Vaxt serfi: " + timeout.toSeconds() + "s");
    }

    static void test2(){
        System.out.println("------------------ALGORITHM 3------------------------\n");
        LocalDateTime start = LocalDateTime.now();
        Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil edin:");
        long num = sc.nextLong();
        long div = 1;
        int count = 0;
        double sqrt = Math.sqrt(num);

        while (sqrt >= div) {
            if (num % div == 0)
                count++;
            div++;
        }
        String result = (count == 2) ? "sadedir": "sade deyil";
        System.out.println(result);

        LocalDateTime end = LocalDateTime.now();
        Duration timeout = Duration.between(start, end);

        System.out.println("Vaxt serfi: " + timeout.toSeconds() + "s");
    }


}

import java.util.Scanner;

public class IntermediateTasks {
    static void main() {
        /*
        3. İki ədəd arasında ən böyük ortaq bölən (GCD) tapmaq üçün Evklid alqoritmini
        while dövrü ilə yaz.
        4. İki ədədin ən kiçik ortaq bölünəni (LCM) — yuxarıdakı GCD tapşırığından istifadə
        edərək.
         */

        //TASK-1
        // 1.İstifadəçidən daxil edilən ədədin sadə ədəd (prime) olub-olmadığını w
        // while dövrü ilə yoxla.
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("eded daxil edin:");
//        int num = sc.nextInt();//5
//        int div = 1;
//        int count = 0;
//
//        while (num >= div) {
//            if (num % div == 0) {
//                count++;
//            }
//            div++;
//        }
//        if (count == 2) {
//            System.out.println("eded sadedir");
//        } else
//            System.out.println("eded sade deyil");

        //TASK-14
        //14. İstifadəçidən ədədlər daxil etməyi davam etdir (do-while ilə),
        // "-1" daxil edilənə qədər; sonda daxil edilən ədədlərin ortalamasını hesabla.

//        Scanner sc=new Scanner(System.in);
//
//        int num;
//        int count=0;
//        int sum=0;
//
//        do{
//            System.out.println("eded daxil edin:");
//            num=sc.nextInt();
//
//            if(num!=-1) {
//                count++;
//                sum = sum + num;
//            }
//        }while(num!=-1);
//        {
//            double average = sum / count;
//            System.out.println(average);

        //sual: eger en bashda -1 daxil edilseydi?
        //       }


        //TASK-13
        // 13. Verilmiş bir sətri (String) while dövrü ilə tərsinə çevir
        // (hazır reverse()metodundan istifadə etmədən).
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("cumle daxil edin");
//        String sentence = sc.nextLine();
//
//        int sentenceLenght = sentence.length();
//        int index = sentenceLenght-1;
//        String reverse = "";
//
//
//        while (index > 0) {
//            reverse = reverse + sentence.charAt(index);
//            index--;
//        }
//        System.out.println(reverse);


        //TASK-6
        // 6. Verilmiş ədədin Armstrong (narsis) ədəd olub-olmadığını yoxla (məs: 153 =
        //         1³+5³+3³).
        //reqem sayi da tapmaliyam
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("eded daxil edin:");
//        int num = sc.nextInt();
//        int constnum = num;
//        int count = 0;
//
//        while (num > 0) {
//            num = num / 10;
//            count++;
//        }
//
//        double arms = 0;
//        num = constnum;
//
//        while (num > 0) {
//            int qaliq = num % 10;
//            arms = Math.pow(qaliq, count) + arms;
//            num = num / 10;
//        }
//
//        if (constnum == arms) {
//            System.out.println("eded arms");
//        } else System.out.println("deyil");


        //TASK-10
        //10. Verilmiş ədədin bütün bölənlərini (divisors) tap və onların cəmini hesabla.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("eded daxil edin:");
//        int num = sc.nextInt();
//        int count = 1;
//        int sum = 0;
//
//        while (num >= count) {
//            if (num % count == 0) {
//                sum = sum + count;
//            }
//            count++;
//        }
//        System.out.println(sum);


        //TASK-8
        //8. do-while istifadə edərək istifadəçidən düzgün parol daxil edənə qədər
        // soruş (məs:parol = "java123").
//        Scanner sc = new Scanner(System.in);
//
//        String pin;
//        System.out.println("parol daxil edin");
//
//        String truePin = "java123";
//
//        do {
//            pin = sc.nextLine();
//            if (!(pin.equals(truePin))) {
//                System.out.println("parol daxil edin");
//
//            }
//        } while (!(pin.equals(truePin)));
//        System.out.println("Ugurla daxil oldunuz");


        //TASK-5
        // 5. Verilmiş bir ədədin palindrom olub-olmadığını yoxla (məs: 121 → bəli).

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Eded daxil edin:");
//        int eded = sc.nextInt();
//        int consteded = eded;
//
//        int reverse = 0;
//
//        while (eded > 0) {
//            int remainder = eded % 10;
//            reverse = reverse * 10 + remainder;
//            eded = eded / 10;
//
//        }
//        if (consteded == reverse) {
//            System.out.println("eded polindromdur");
//        } else System.out.println("eded polindrom deyil");


        //12. do-while ilə sadə kalkulyator menyusu yarat
        // (toplama, çıxma, vurma, bölmə və "Çıxış" seçimi).
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1.eded daxil edin:");
//        int num1 = sc.nextInt();
//        System.out.println("2.eded daxil edin:");
//        int num2 = sc.nextInt();
//
//        int choice;
//
//        do {
//            System.out.println("emel daxil edin:1.toplama, 2.çıxma, 3.vurma, 4.bölmə ,5.Çıxış");
//
//            choice = sc.nextInt();
//            if (choice == 1) {
//                int sum = num1 + num2;
//                System.out.println(sum);
//            } else if (choice == 2) {
//                int dif = num1 - num2;
//                System.out.println(dif);
//            } else if (choice == 3) {
//                int multip = num1 * num2;
//                System.out.println(multip);
//            } else if (choice == 4) {
//                if (num2 != 0) {
//                    double div = num1 / num2;
//                    System.out.println(div);
//                }
//            } else if (choice != 5)
//                System.out.println("dogru sechim daxil edin:");
//
//        } while (choice != 5);
//        System.out.println("chixish");


        //TASK-11
        //11. Collatz ardıcıllığını simulyasiya et: ədəd cütdürsə 2-yə böl,
        // təkdirsə 3n+1 et, ədəd 1-ə çatana qədər davam et.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("eded daxil edin:");
//        int num = sc.nextInt();
//
//        while (num > 1) {
//            if (num % 2 == 0) {
//                num = num / 2;
//            } else {
//                num = num * 3 + 1;
//            }
//
//        }
//        System.out.println(num);


        //TASK-2
        //  2. Fibonacci ardıcıllığının ilk N ədədini while dövrü ilə çap et.
        // 0 +1 +1+ 2+ 3 5

//        Scanner sc =new Scanner(System.in);
//        System.out.println("hansi edededek chap olunacaq?");
//        int  limit=sc.nextInt();//7
//
//        int num1=0;
//        int num2=1;
//
//        while(num1<=limit){
//            System.out.println(num1);
//            int nextnum=num1+num2;
//            num1=num2;
//            num2=nextnum;
        //      }


        //TASK-7
        //7. İstifadəçidən daxil edilən onluq (decimal) ədədi ikilik (binary)
        // sistemə çevir (while dövrü ilə)


//        Scanner sc = new Scanner(System.in);
//        System.out.println("eded daxil edin");
//        int num = sc.nextInt();
//        String binary = "";
//
//        while (num > 0) {
//            int remainder = num % 2;
//            binary = binary + remainder;
//            num = num / 2;
//        }
//        System.out.println(binary);


        //TASK-9
        //9. İki ədəd aralığında (A və B) olan bütün sadə ədədləri tapıb çap et.

     /*   Scanner sc = new Scanner(System.in);
        System.out.println("1.ededi daxil edin:");
        int num1 = sc.nextInt();

        System.out.println("2.ededi daxil edin:");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        num1++;

        while (num1 < num2) {

            if (num1 > 1) {
                int count = 0;
                int div = 1;

                while (div <= num1) {
                    if (num1 % div == 0) {
                        count++;
                    }
                    div++;
                }
                if (count == 2) {
                    System.out.println(num1);
                }
            }
            num1++;

        }*/


//       TASK- 3.
//        İki ədəd arasında ən böyük ortaq bölən (GCD) tapmaq üçün Evklid alqoritmini
//        while dövrü ilə yaz.
     /*   Scanner sc = new Scanner(System.in);

        System.out.println("A ededini daxil edin:");
        int A = sc.nextInt();

        System.out.println("B ededini daxil edin:");
        int B = sc.nextInt();

        int a = A;
        int b = B;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        int ebob = a;

        int ekob = (A * B) / ebob;

        System.out.println("ƏBOB = " + ebob);
        System.out.println("ƏKOB = " + ekob); */


    }


}

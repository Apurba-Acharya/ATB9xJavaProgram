package Task;

import java.util.Scanner;

public class Practice_16_PrimeNumberChecker {

    /* Prime Number checker */

    //Type 1:
//    public static boolean isPrime(int number) {
//        if (number <= 1) {
//            return false;
//        }
//        if (number <= 3) {
//            return true;
//        }
//        if (number % 2 == 0 || number % 3 == 0) {
//            return false;
//        }
//        for (int i = 5; i * i <= number; i += 6) {
//            if (number % i == 0 || number % (i + 2) == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int num = sc.nextInt();
//        sc.close();
//        if (isPrime(num)){
//            System.out.println(num + " is a prime number");
//        }else {
//            System.out.println(num + " is not a prime number");
//        }
//    }

    //Type 2:
        public static boolean isprime (int number){
            if (number <=1){
                return false;
            }
            for (int i = 2; i*i<=number ; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            int i = 9;
            if (isprime(i)){
                System.out.println(i + " : Prime");
            }else {
                System.out.println(i + " : notPrime");
            }
        }

}
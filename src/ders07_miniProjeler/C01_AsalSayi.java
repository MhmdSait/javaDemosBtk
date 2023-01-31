package ders07_miniProjeler;

public class C01_AsalSayi {

    public static void main (String[] args){
        int number = -7;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isPrime = true;

        if(number==1){
            System.out.println("Sayı asal değildir");
            return;
        }

        if (number<1){
            System.out.println("Geçersiz Sayı");
            return;
        }

        for (int i=2; i<number; i++){
            if (number % i == 0){
                isPrime = false;
            }
        }

        if (isPrime){                        // isPrime==true ile aynı anlamdadır
            System.out.println("Sayı asaldır");
        }else {
            System.out.println("Sayı asal değildir");
        }
    }
}

package ders05_dizilerleCalismak;

public class C03_MultiDimensionalArrayDemo {

    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ağrı";
        sehirler[1][1] = "Bitlis";
        sehirler[1][2] = "Kars";
        sehirler[2][0] = "Urfa";
        sehirler[2][1] = "Antep";
        sehirler[2][2] = "Diyarbakır";

        for (int i = 0; i <= 2; i++) {
            System.out.println("----------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }

    }
}

package ders05_dizilerleCalismak;

public class C01_ArraysDemo {
    public static void main(String[] args) {
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derya";
        ogrenciler[2] = "Ali";
        ogrenciler[3] = "Aşil";

        for (int i = 0; i < ogrenciler.length; i++ ) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("---------------");

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}

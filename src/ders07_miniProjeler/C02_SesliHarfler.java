package ders07_miniProjeler;

public class C02_SesliHarfler {
    public static void main (String[] args){
        char harf='E';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }

    }
}

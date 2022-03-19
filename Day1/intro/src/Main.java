public class Main {

    public static void main(String[] args) {

        String internetSubeButonu = "İnternet Şubesi";
        double dolarDun = 8.20;
        double dolarBugun = 8.21;
        int vade = 36;
        boolean dustuMu = false;

        System.out.println(internetSubeButonu);

        if (dolarBugun < dolarDun) {
            System.out.println("Dolar düştü resmi");
        } else if (dolarBugun == dolarDun) {
            System.out.println("Dolar dünkü dolara eşittir.");
        } else {
            System.out.println("Dolar düştü resmi");
        }
        System.out.println("***********************************************************");
        String kredi1 = "Mutlu emekli kredisi";
        String kredi2 = "Hızlı kredi";
        String kredi3 = "Konut kredisi";
        String kredi4 = "Meb kredisi";
        String kredi5 = "TSK kredisi";

        System.out.println(kredi1);
        System.out.println(kredi2);
        System.out.println(kredi3);
        System.out.println(kredi4);
        System.out.println(kredi5);
        System.out.println("**********************************************************");

        String[] krediler = { "Mutlu Emekli Kredisi", "Hızlı kredisi", "Konut kredisi", "Meb kredisi", "tsk kredisi" };
        for (String kredi : krediler) {// foreach döngüsü
            System.out.println(kredi);
        }
        System.out.println("********************************************************");
        for (int i = 0; i < krediler.length; i++) {

            System.out.println(krediler[i]);
        }
        System.out.println("*****************************************************");
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);

        int[] sayilar1 = { 1, 2, 3, 4, 5, };
        int[] sayilar2 = { 10, 20, 30, 40, 50 };
        sayilar1 = sayilar2;
        sayilar2[0] = 100;
        System.out.println(sayilar1[0]);
        System.out.println("***************************************************");
        String sehir1="Ankara";
        String sehir2="İstanbul";
        sehir1=sehir2;
        sehir2="İzmir";
        System.out.println(sehir1);


    }

}

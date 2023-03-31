package tugas1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var fun = new functions();
        Scanner input = new Scanner(System.in);

        boolean ulang = true;

        int paket1, paket2, paket3, paket4;
        paket1 = 6_500;
        paket2 = 7_500;
        paket3 = 7_500;
        paket4 = 10_000;

        System.out.println("\n======================");
        System.out.println("Price List Loundry 17");
        System.out.println("======================\n");

        while (ulang) {
            fun.tampilMenu();

            boolean belilagi = true;
            while (belilagi) {
                System.out.print("\npilihan anda : ");
                String pilihanUser = input.next();

                switch (pilihanUser) {
                    case "1" -> {
                        System.out.println("1. Cuci aja");
                        fun.perhitungan(paket1);
                        belilagi = false;
                    }
                    case "2" -> {
                        System.out.println("2. Cuci + Kering");
                        fun.perhitungan(paket2);
                        belilagi = false;
                    }
                    case "3" -> {
                        System.out.println("3. Setrika aja");
                        fun.perhitungan(paket3);
                        belilagi = false;
                    }
                    case "4" -> {
                        System.out.println("4. Cuci + Kering + Setrika3");
                        fun.perhitungan(paket4);
                        belilagi = false;
                    }
                    default -> System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-4]");
                }
            }
            System.out.println("\nTotal pesanan saat ini = " + fun.total);

            boolean pesanLagi = true;
            while(pesanLagi){
                System.out.println("\nApakah anda ingin melanjutkan (y/n)? ");
                String again = input.next();

                if (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("n")){
                    ulang = fun.yesOrNo(again);
                    pesanLagi = false;
                }else{
                    System.err.println("Silahkan pilih (y/n)");
                    pesanLagi = true;
                }
            }

        }

        sayThanks(fun.total);

    }

    //function
    public static void sayThanks(int totalHarga){
        System.out.println("\nJadi total pesanan anda sebesar "+ totalHarga);
        System.out.println("\n--> Terima kasih");
    }
}

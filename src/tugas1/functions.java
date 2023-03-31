package tugas1;

import java.util.Scanner;

public class functions {
    public void tampilMenu(){
        System.out.println("\nPERKILO");
        System.out.println("1. Cuci Kering Saja");
        System.out.println("2. Cuci + Lipat");
        System.out.println("3. Setrika saja");
        System.out.println("4. Cuci + Kering + Setrika");
    }

    public boolean yesOrNo(String again){
        if (again.equalsIgnoreCase("y")){
            return true;
        }else{
            return false;
        }
    }

    int total = 0;
    public void perhitungan(int paket){
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa kilo : ");
        int jumlah = input.nextInt();

        total += jumlah * paket;
    }

}

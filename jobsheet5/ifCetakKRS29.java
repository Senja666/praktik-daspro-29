package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS29 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS minta tanda tangan DPA");
        }

        sc.close();
    }
}

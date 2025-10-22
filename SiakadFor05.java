import java.util.Scanner;

public class SiakadFor05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai;
        double tertinggi = 0;
        double terendah = 100;

        int jmlLulus = 0;
        int jmlTdkLulus = 0;
        int btsNilai = 60;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            
    
            if (nilai >= btsNilai) {
                jmlLulus++;
            } else {
                jmlTdkLulus++;
            }
        }
    
        sc.close();

        System.out.println("------------------------------------");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
        
        System.out.println("Jumlah mahasiswa lulus: " + jmlLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jmlTdkLulus);
    }
}
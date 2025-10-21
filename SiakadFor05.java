import java.util.Scanner;
public class SiakadFor05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  nilai, tetinggi = 0, terendah = 100;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            
            if (nilai > tetinggi) {
                tetinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            System.out.println("Nilai tertinggi saat ini: " + tetinggi);
            System.out.println("Nilai terendah saat ini: " + terendah);
        }
    }
}
        
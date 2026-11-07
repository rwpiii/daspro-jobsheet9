import java.util.Scanner;

public class Tugas1_PengelolaanNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = sc.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0!");
        } else {
            int[] nilai = new int[jumlah];
            int total = 0;

            for (int i = 0; i < nilai.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilai[i] = sc.nextInt();
                total += nilai[i];
            }

            double rata2 = (double) total / nilai.length;
            System.out.println("\nRata-rata nilai: " + rata2);

            int tertinggi = nilai[0];
            int terendah = nilai[0];
            for (int i = 1; i < nilai.length; i++) {
                if (nilai[i] > tertinggi) tertinggi = nilai[i];
                if (nilai[i] < terendah) terendah = nilai[i];
            }
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);

            System.out.println("\nDaftar nilai mahasiswa:");
            for (int i = 0; i < nilai.length; i++) {
                String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
            }
        }

        sc.close();
    }
}

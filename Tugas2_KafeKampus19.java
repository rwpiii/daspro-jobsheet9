import java.util.Scanner;

public class Tugas2_KafeKampus19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-16s Rp %,d%n", (i + 1), menu[i], harga[i]);
        }

        System.out.print("\nCari menu: ");
        String cari = sc.nextLine().trim();

        int indeksCari = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                indeksCari = i;
                break;
            }
        }

        if (indeksCari != -1) {
            System.out.println("Menu ditemukan: " + menu[indeksCari] + " - Rp " + harga[indeksCari]);
        } else {
            System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia.");
        }

        System.out.print("\nJumlah item yang ingin dipesan: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        if (jumlah <= 0) {
            System.out.println("Jumlah pesanan harus lebih dari 0!");
        } else {
            String[] pesanan = new String[jumlah];   
            int[] hargaPesanan = new int[jumlah];

            for (int i = 0; i < jumlah; i++) {
                int indeks;
                do {
                    System.out.print("Item ke-" + (i + 1) + " (nama menu): ");
                    String nama = sc.nextLine().trim();

                    indeks = -1;
                    for (int j = 0; j < menu.length; j++) {
                        if (menu[j].equalsIgnoreCase(nama)) {
                            indeks = j;
                            break;
                        }
                    }

                    if (indeks == -1) {
                        System.out.println("Menu tidak tersedia, silakan ulangi.");
                    }
                } while (indeks == -1);

                pesanan[i] = menu[indeks];
                hargaPesanan[i] = harga[indeks];
            }

            int total = 0;
            for (int i = 0; i < jumlah; i++) {
                total += hargaPesanan[i];
            }

            System.out.println("\n=========== DAFTAR PESANAN ===========");
            for (int i = 0; i < jumlah; i++) {
                System.out.printf("%d. %-18s Rp %,10d%n", (i + 1), pesanan[i], hargaPesanan[i]);
            }
            System.out.println("--------------------------------------");
            System.out.printf("%-21s Rp %,10d%n", "TOTAL BIAYA", total);
            System.out.println("======================================");
        }

        sc.close();
    }
}

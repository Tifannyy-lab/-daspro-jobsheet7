import java.util.Scanner;
public class TugasBioskop24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int jumlah, i = 1;
        int totalTiket = 0, totalPenjualan = 0;
        double persenDiskon = 0, subtotal, bayar;
        do {
            System.out.print("Masukkan jumlah tiket pelanggan ke-" + i + " (0 untuk berhenti): ");
            jumlah = sc.nextInt();
            if (jumlah < 0) {
                System.out.println("Jumlah tiket tidak boleh kurang dari 0");
                continue;
            }
            if (jumlah > 0) {
                subtotal = jumlah * hargaTiket;
                if (jumlah > 10) {
                    persenDiskon = 0.15;
                } else if (jumlah > 4) {
                    persenDiskon = 0.10;
                }
                bayar = subtotal - subtotal * persenDiskon;
                System.out.println("Total bayar pelanggan ke-" + i + ": Rp " + bayar);
                totalTiket += jumlah;
                totalPenjualan += bayar;
                i++;
            }
        } while (jumlah != 0);
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan tiket hari ini: Rp " + totalPenjualan);
        sc.close();
    }
}
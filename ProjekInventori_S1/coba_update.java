import java.util.Scanner;

public class coba_update {
    private static Barang[] inventaris = new Barang[10]; 
    private static int jumlahBarang = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("============================");
            System.out.println("Menu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat Inventaris");
            System.out.println("3. Update Jumlah Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline

            switch (pilihan) {
                case 1:
                    tambahBarang();
                    break;
                case 2:
                    lihatInventaris();
                    break;
                case 3:
                    updateJumlahBarang();
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahBarang() {
        if (jumlahBarang < inventaris.length) {
            System.out.print("Masukkan nama barang: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan jumlah barang: ");
            int jumlah = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline

            inventaris[jumlahBarang] = new Barang(nama, jumlah);
            jumlahBarang++;
            System.out.println("Barang berhasil ditambahkan ke inventaris.");
        } else {
            System.out.println("Inventaris penuh, tidak bisa menambah barang lagi.");
        }
    }

    private static void lihatInventaris() {
        System.out.println("Inventaris Gudang Supermarket:");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println(inventaris[i]);
        }
    }

    private static void updateJumlahBarang() {
        System.out.print("Masukkan nama barang yang akan diupdate: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jumlah baru: ");
        int jumlahBaru = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline

        boolean barangDitemukan = false;
        for (int i = 0; i < jumlahBarang; i++) {
            if (inventaris[i].getNama().equalsIgnoreCase(nama)) {
                inventaris[i].setJumlah(jumlahBaru);
                System.out.println("Jumlah barang berhasil diupdate.");
                barangDitemukan = true;
                break;
            }
        }

        if (!barangDitemukan) {
            System.out.println("Barang tidak ditemukan dalam inventaris.");
        }
    }
}

class Barang {
    private String nama;
    private int jumlah;

    public Barang(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "Nama Barang: " + nama + ", Jumlah: " + jumlah;
    }
}



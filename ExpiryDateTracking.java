import java.util.Scanner;

public class ExpiryDateTracking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan tanggal saat ini
        System.out.print("Masukkan tanggal saat ini (Format: yyyy-MM-dd): ");
        String currentDateStr = scanner.nextLine();

        // Membuat array produk
        String[][] products = new String[4][2];

        // Meminta pengguna memasukkan nama produk dan tanggal kedaluwarsa
        for (int i = 0; i < products.length; i++) {
            System.out.print("Masukkan nama produk ke-" + (i + 1) + ": ");
            products[i][0] = scanner.nextLine();
            System.out.print("Masukkan tanggal kedaluwarsa produk ke-" + (i + 1) + " (Format: yyyy-MM-dd): ");
            products[i][1] = scanner.nextLine();
        }

        // Menyortir produk berdasarkan tanggal kedaluwarsa (Bubble Sort)
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = 0; j < products.length - i - 1; j++) {
                String[] product1Date = products[j][1].split("-");
                String[] product2Date = products[j + 1][1].split("-");
                
                int year1 = Integer.parseInt(product1Date[0]);
                int month1 = Integer.parseInt(product1Date[1]);
                int day1 = Integer.parseInt(product1Date[2]);
                
                int year2 = Integer.parseInt(product2Date[0]);
                int month2 = Integer.parseInt(product2Date[1]);
                int day2 = Integer.parseInt(product2Date[2]);
                
                int yearCurrent = Integer.parseInt(currentDateStr.split("-")[0]);
                int monthCurrent = Integer.parseInt(currentDateStr.split("-")[1]);
                int dayCurrent = Integer.parseInt(currentDateStr.split("-")[2]);
                
                // Membandingkan tanggal kedaluwarsa dengan tanggal saat ini
                if (year1 > year2 || (year1 == year2 && month1 > month2) || (year1 == year2 && month1 == month2 && day1 > day2)) {
                    // Tukar posisi jika produk kedua lebih dekat dengan tanggal saat ini
                    String[] temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }

        // Menampilkan produk yang sudah diurutkan
        System.out.println("Urutan Produk Berdasarkan Tanggal Kedaluwarsa (Yang Paling Dekat dengan Tanggal Saat Ini):");
        for (String[] product : products) {
            System.out.println(product[0] + " - Tanggal Kedaluwarsa: " + product[1]);
        }
    }
}

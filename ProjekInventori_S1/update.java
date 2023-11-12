import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class update {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] namaBrgArray = new String[100];
        String[] tipeBrgArray = new String[50];
        String[] prdDateArray = new String[100];
        String[] expDateArray = new String[100];
        double[] hargaArray = new double[100];
        int[] stokBrgArray = new int[100];
        int itemCount = 0;
        int fitur;

        do {
            System.out.println("===============Selamat Datang===============");
            System.out.println("1.Item Entry and Storage");
            System.out.println("2.Update Item Information");
            System.out.println("3.Tampilkan");
            System.out.println("0.Keluar dari Menu");
            System.out.print("Masukkan Nomor Menu: ");
            fitur = input.nextInt();
            input.nextLine();

            switch (fitur) {
                case 1:
                    do {
                        System.out.println("=====Item Entry and Storage=====");
                        System.out.print("Masukkan Nama Barang: ");
                        namaBrgArray[itemCount] = input.nextLine();
                        System.out.print("Masukkan Kategori Barang: ");
                        tipeBrgArray[itemCount] = input.nextLine();
                        prdDateArray[itemCount] = getDateInput("Tanggal Produksi Barang (dd/MM/yyyy): ");
                        expDateArray[itemCount] = getDateInput("Tanggal Kadaluarsa Barang (dd/MM/yyyy): ");
                        System.out.print("Masukkan Harga Barang: ");
                        hargaArray[itemCount] = input.nextDouble();
                        input.nextLine();
                        System.out.print("Masukkan Jumlah Stok Barang: ");
                        stokBrgArray[itemCount] = input.nextInt();
                        input.nextLine();
                        itemCount++;

                        System.out.println("Barang " + namaBrgArray[itemCount - 1] + " telah berhasil ditambahkan");
                        System.out.println("Masukkan data lagi?");
                        System.out.println("1. Iya");
                        System.out.println("0. Kembali ke menu");

                        int pilihStop1 = input.nextInt();
                        input.nextLine(); // Consume newline character
                        if (pilihStop1 == 0) {
                            break;
                        }
                    } while (true);
                    break;
                case 2:
                    int menu2;
                    int stop2 = 0;
                    do {
                        System.out.println("======Update Item Information======");
                        System.out.println("Silahkan Pilih");
                        System.out.println("1. Update");
                        System.out.println("2. Hapus");
                        System.out.println("0. Keluar");
                        System.out.print("Masukkan Nomor: ");
                        menu2 = input.nextInt();
                        input.nextLine(); // Consume newline character

                        switch (menu2) {
                            case 0:
                                break;
                            case 1:
                                System.out.print("Masukkan Nama Barang yang ingin anda ubah: ");
                                String targetItem = input.nextLine();

                                int index = -1;
                                for (int i = 0; i < itemCount; i++) {
                                    if (namaBrgArray[i].equalsIgnoreCase(targetItem)) {
                                        index = i;
                                        break;
                                    }
                                }

                                if (index != -1) {
                                    System.out.println("============================");
                                    System.out.println("Part yang ingin anda ubah:");
                                    System.out.println("1. Nama Barang");
                                    System.out.println("2. Kategori Barang");
                                    System.out.println("3. Tanggal Produksi Barang");
                                    System.out.println("4. Tanggal Kadaluarsa Barang");
                                    System.out.println("5. Harga Barang");
                                    System.out.println("6. Jumlah Stok Barang");
                                    System.out.println("0. Selesai");
                                    System.out.print("Pilih menu: ");
                                    int pilihan = input.nextInt();
                                    input.nextLine(); // Consume newline character

                                    switch (pilihan) {
                                        case 1:
                                            System.out.println("Nama Barang Lama: " + namaBrgArray[index]);
                                            System.out.print("Masukkan Nama Barang Baru: ");
                                            namaBrgArray[index] = input.nextLine();
                                            break;
                                        case 2:
                                            System.out.println("Kategori Barang lama: " + tipeBrgArray[index]);
                                            System.out.print("Masukkan Kategori Barang Baru: ");
                                            tipeBrgArray[index] = input.nextLine();
                                            break;
                                        case 3:
                                            System.out.println("Tanggal Produksi Lama: " + prdDateArray[index]);
                                            prdDateArray[index] = getDateInput("Masukkan Tanggal Produksi Baru (dd/MM/yyyy): ");
                                            break;
                                        case 4:
                                            System.out.println("Tanggal Kadaluarsa Lama: " + expDateArray[index]);
                                            expDateArray[index] = getDateInput("Masukkan Tanggal Kadaluarsa Baru (dd/MM/yyyy): ");
                                            break;
                                        case 5:
                                            System.out.println("Harga Barang Lama: " + hargaArray[index]);
                                            System.out.print("Masukkan Harga Barang Baru: ");
                                            hargaArray[index] = input.nextDouble();
                                            input.nextLine();
                                            break;
                                        case 6:
                                            System.out.println("Jumlah Stok Barang Lama: " + stokBrgArray[index]);
                                            System.out.print("Masukkan Jumlah Stok Barang Baru: ");
                                            stokBrgArray[index] = input.nextInt();
                                            input.nextLine();
                                            break;
                                        case 0:
                                            System.out.println("+++++Anda telah selesai melakukan pembaruan data+++++");
                                            break;
                                        default:
                                            System.out.println("Pilihan tidak valid.");
                                    }
                                    System.out.println("Barang " + namaBrgArray[index] + " berhasil diperbarui ");
                                } else {
                                    System.out.println("Barang dengan nama " + targetItem + " tidak ditemukan.");
                                }
                                break;
                            case 2:
                                System.out.print("Masukkan Nama Barang yang ingin dihapus: ");
                                String itemToDelete = input.nextLine();

                                int deleteIndex = -1;
                                for (int i = 0; i < itemCount; i++) {
                                    if (namaBrgArray[i].equalsIgnoreCase(itemToDelete)) {
                                        deleteIndex = i;
                                        break;
                                    }
                                }

                                if (deleteIndex != -1) {
                                    // Shift the array elements to remove the item
                                    for (int i = deleteIndex; i < itemCount - 1; i++) {
                                        namaBrgArray[i] = namaBrgArray[i + 1];
                                        tipeBrgArray[i] = tipeBrgArray[i + 1];
                                        prdDateArray[i] = prdDateArray[i + 1];
                                        expDateArray[i] = expDateArray[i + 1];
                                        hargaArray[i] = hargaArray[i + 1];
                                        stokBrgArray[i] = stokBrgArray[i + 1];
                                    }

                                    itemCount--;
                                    System.out.println("Data barang " + itemToDelete + " telah berhasil dihapus");
                                } else {
                                    System.out.println("Barang dengan nama " + itemToDelete + " tidak ditemukan.");
                                }
                                break;
                            default:
                                System.out.println("Nomor menu yang anda masukkan salah, silahkan pilih antara 1, 2, atau 0");
                                break;
                        }
                    } while (menu2 != stop2);
                    break;
                case 3:

            }
        } while (fitur != 0);
    }

    public static String getDateInput(String prompt) {
        Scanner input = new Scanner(System.in);
        String date = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        while (true) {
            System.out.print(prompt);
            date = input.nextLine();
            try {
                dateFormat.parse(date);
                return date;
            } catch (ParseException e) {
                System.out.println("Tanggal tidak valid. Format yang benar: dd/MM/yyyy");
            }
        }
    }
}       






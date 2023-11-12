import java.util.Scanner;

public class coba_expiry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] namaBrg = {"Sedap Goreng", "Teh Rio"};
        String[] tipeBrg = {"Makanan", "Minuman"};
        String[] prdDate = {"22 September 2023", "23 September 2023"};
        String[] expDate = {"23 desember 2024", "24 desember 2025"};
        String[] dateNow = new String[5];
        String[] supplier = {"Wings", "Sayap"};
        String[] konSupp = {"08214141414", "08515151521"};
        String[] alamatSupp = {"Jawa", "Malang"};
        double[] harga = {110000, 22500};
        int[] stokBrg = {100, 200};
        String[] cabang = {"Malang", "Blitar", "Tuban"};
        int[][] stokCabang = {
            {5,5},//malang
            {6,6},//blitar
            {7,7}//tuban
        };
        int menu, fitur;
        boolean stop = true;        
        
        do{
        System.out.println("===============Selamat Datang===============");
        System.out.println("1.Item Entry and Storage"); 
        System.out.println("2.Update Item Information"); 
        System.out.println("3.Item Categorization");
        System.out.println("4.Supplier Management");
        System.out.println("5.Stock Checking");
        System.out.println("6.Code Scanning");
        System.out.println("7.Expiry Date Tracking ");
        System.out.println("8.Delivery");
        System.out.println("0.Keluar");
        System.out.print("Masukkan Nomor Menu: ");        
        fitur = input.nextInt();
            if (fitur == 0 ) {
                break;
            }
 
        switch (fitur) {
            case 1:
            break;
            case 7:
                int menu7;
                int stop7 = 0;
                do {
                System.out.println("=====Expiry Date Tracking=====");
                System.out.println("Silahkan pilih menu anda (1/0):");
                System.out.println("1. Cek tanggal kadaluarsa");
                System.out.println("2. Tampilkan daftar kadaluarsa");
                System.out.println("0. Kembali");
                System.out.print("Pilih menu: ");
                menu7 = input.nextInt();
                switch (menu7) {
                    case 1:
                    
                    break;
                    case 2:
                    System.out.println("Nama Barang:");
                    case 0:
                    break;
                }
            } while (menu7 != stop7);
            break;
            // case 0:
            //     System.out.println("!!Anda keluar dari menu!!");
            //     System.exit(0);
            //     break;
            
                         
        }
        } while (fitur != 0);
    
    }
}
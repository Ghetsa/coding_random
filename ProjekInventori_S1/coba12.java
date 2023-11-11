import java.util.Scanner;

public class coba12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] namaBrg = {"Mie Sedap Goreng", "Teh Rio"};
        String[] tipeBrg = {"Makanan", "Minuman"};
        String[] prdDate = {"22 September 2023", "23 September 2023"};
        String[] expDate = {"23 desember 2024", "24 desember 2025"};
        String[] dateNow = new String[5];
        String[] supplier = {"Wings", "Sayap"};
        String[] konSupp = {"08214141414", "08515151521"};
        String[] alamatSupp = {"Jawa", "Malang"};
        double[] harga = {110000, 22500};
        int[] stokBrg = {100, 200};
        int[][] stokCabang = {
            {5,6},//malang
            {6,7},//blitar
            {8,9}//tuban
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
                int index = -1;

                switch (menu7) {
                    case 1:
                        System.out.print("Masukkan nama barang: ");
                        String barang = input.next();
                        input.nextLine();
                        
                        for (int i = 0; i < namaBrg.length; i++) {
                            if (namaBrg[i].equalsIgnoreCase(barang)) {
                                index = i;
                                break;
                            }
                        }

                        if (index != -1) {
                            System.out.print("Masukkan tanggal yang ingin Anda cek (format: dd-MM-yyyy): ");
                            String prdDateInput = input.nextLine();

                            if (prdDate[index].equals(prdDateInput)) {
                                System.out.println("Tanggal produksi barang sesuai.");
                                System.out.print("Masukkan tanggal sekarang (format: dd-MM-yyyy): ");
                                String dateNowInput = input.nextLine();

                                if (expDate[index].equals(dateNowInput)) {
                                    System.out.println("Tanggal kadaluwarsa sama dengan tanggal sekarang.");
                                } else if (dateNowInput.compareTo(expDate[index]) > 0) {
                                    System.out.println("Tanggal kadaluwarsa sudah lewat.");
                                } else {
                                    System.out.println("Tanggal kadaluwarsa belum lewat.");
                                }
                            } else {
                                System.out.println("Tanggal produksi barang tidak sesuai.");
                            }
                        } else {
                            System.out.println("Barang tidak ditemukan.");
                        }
                        break;

                    case 2:
                        System.out.println("Daftar barang yang sudah kadaluwarsa:");
                        for (int i = 0; i < namaBrg.length; i++) {
                            if (expDate[i].compareTo(dateNow[i]) < 0) {
                                System.out.println(namaBrg[i]);
                            }
                        }
                        break;

                    case 0:
                        break;
                }
            } while (menu7 != stop7);
            break;
    
            case 0:
                System.out.println("!!Anda keluar dari menu!!");
                System.exit(0);
                break;
            case 8:
            int fitur8;
            do{
            System.out.println("=====Delivery=====");
            System.out.println("1.Malang");
            System.out.println("2.Blitar");
            System.out.println("3.Tuban");
            System.out.println("0.Keluar");
            System.out.print("Masukkan Nomor Cabang: ");
            fitur8 = input.nextInt();

            if(fitur8 == 0){
                break;
            }
            switch (fitur8) {
                case 1:
                    int stop81 = 0;
                    do{
                        int jumKirBarang;
                        int hasilCarBrg=0;                        
                        for(int j=0;j<namaBrg.length; j++){
                            System.out.println((j+1) +" | "+ supplier[j] +" | "+ namaBrg[j] +" | "+tipeBrg[j]+" | "+prdDate[j]+" | "+harga[j]+" | "+stokBrg[j] );
                            }
                        
                        System.out.println("Masukkan Nama Barang: ");
                        String cariBarang = input.next();
                        for(int i=0; i<namaBrg.length; i++){
                            if(namaBrg[i].equalsIgnoreCase(cariBarang)){
                                hasilCarBrg=i;
                                break;
                            }else{
                                System.out.println("Barang tidak di");
                            }
                        }  
                        System.out.println(hasilCarBrg);

                    } while (stop81 != 0);
                    break;
                    case 2:
                    int stop82 = 0;
                    do {
                        int jumKirBarang;
                        int hasilCarBrg = 0;
                        for (int j = 0; j < namaBrg.length; j++) {
                            System.out.println((j + 1) + " | " + supplier[j] + " | " + namaBrg[j] + " | " + tipeBrg[j] + " | " + prdDate[j] + " | " + harga[j] + " | " + stokBrg[j]);
                        }
                        System.out.print("Masukkan Nama Barang: ");
                        String cariBarang = input.next();
                        for (int i = 0; i < namaBrg.length; i++) {
                            if (namaBrg[i].equalsIgnoreCase(cariBarang)) {
                                hasilCarBrg = i;
                                break;
                            }
                        }
                        System.out.println(hasilCarBrg);
                    } while (stop82 != 0);
                    break;
            
                case 3:
                    int stop83 = 0;
                    do {
                        int jumKirBarang;
                        int hasilCarBrg = 0;
                        for (int j = 0; j < namaBrg.length; j++) {
                            System.out.println((j + 1) + " | " + supplier[j] + " | " + namaBrg[j] + " | " + tipeBrg[j] + " | " + prdDate[j] + " | " + harga[j] + " | " + stokBrg[j]);
                        }
                        System.out.print("Masukkan Nama Barang: ");
                        String cariBarang = input.next();
                        for (int i = 0; i < namaBrg.length; i++) {
                            if (namaBrg[i].equalsIgnoreCase(cariBarang)) {
                                hasilCarBrg = i;
                                break;
                            }
                        }
                        System.out.println(hasilCarBrg);
                    } while (stop83 != 0);
                    break;

                    // int jumKirBarang;
                    // int hasil=0;
                    // String cariBarang;
                    // System.out.println("===Cabang Malang===");
                    // for(int j=0;j<namaBrg.length; j++){
                    // System.out.println((j+1) +" | "+ supplier[j] +" | "+ namaBrg[j] +" | "+tipeBrg[j]+" | "+prdDate[j]+" | "+harga[j]+" | "+stokBrg[j] );
                    // }
                    // System.out.println("Masukkan Nomer Barang: ");
                    // cariBarang = input.next();
                    // for(int i=0; i<namaBrg.length; i++){
                    //     if(namaBrg[i].equalsIgnoreCase(cariBarang)){
                    //         hasil++;
                    //         break;
                    //     }
                    // }                    
                    // System.out.println("Masukkan Jumlah Barang: ");
                    // // jumKirBarang = input.nextInt();
                    // System.out.println(hasil);
                    // // stokBrg[hasil] -= jumKirBarang;  //mengurangi stok gudang
                    // // stokCabang[0][hasil] += jumKirBarang; //menambah stok di cabang
                    

                default:
                    break;
            }

            }while (fitur8 != 0);
                break;//break menu8                 
        }
        } while (fitur != 0);
    
    }
}

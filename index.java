import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;

public class index {
    public static void main(String[] args)  throws ParseException{
        Scanner input = new Scanner(System.in);

        String[] namaBrg = {"Mie Sedap Goreng", "Teh Rio"};
        String[] tipeBrg = {"Makanan", "Minuman"};
        String[] prdDate = {"22 September 2023", "23 September 2023"};
        String[] expDate = {"23 desember 2024", "24 desember 2025"};
        // String[] dateNow = new String[5];
        String[] supplier = {"Wings", "Wings"};
        String[] konSupp = {"08214141414", "08515151521"};
        String[] alamatSupp = {"Jawa", "Malang"};
        double[] harga = {110000, 22500};
        int[] stokBrg = {10, 20};
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
            do{
            int i=0;
            System.out.println("=====Item Entry and Storage=====");
            System.out.print("Masukkan Nama Supplier: ");
            String newSupplier = input.nextLine();            
            //buat array baru
            int newSizeSupplier = supplier.length + 1;
            String[] tempSuplier = new String[newSizeSupplier];
            //copy 
            for(int j=0; j<supplier.length; j++){
                tempSuplier[j] = supplier[j];
            }
            //tambah nama supplier
            tempSuplier[newSizeSupplier - 1] = newSupplier;
            //tuker array lama ke baru
            supplier = tempSuplier;
            input.next();

            System.out.print("Masukkan Nama Barang: ");
            String newNama = input.nextLine();
            int newSizeBarang = namaBrg.length + 1;
            String[] tempnama = new String[newSizeBarang];
            for(int j=0; j<namaBrg.length; j++){
                tempnama[j]=namaBrg[j];
            }
            tempnama[newSizeBarang - 1] = newNama;
            namaBrg = tempnama;
            input.next();

            System.out.print("Masukkan Kategori Barang: ");
            String newTipe = input.nextLine();
            int newSizeTipe = tipeBrg.length + 1;
            String[] tempTipe = new String[newSizeTipe];
            for(int j=0; j<tipeBrg.length; j++){
                tempTipe[j]=tipeBrg[j];
            }
            tempTipe[newSizeTipe - 1] = newTipe;
            tipeBrg = tempTipe;
            input.next();

            System.out.print("Masukkan Tanggal Produksi Barang: ");
            prdDate[i] = input.next();
            input.nextLine();

            System.out.print("Masukkan Tanggal Kadaluarsa Barang: ");
            expDate[i] = input.next();
            input.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double newHarga = input.nextDouble();
            int newSizeHarga = harga.length + 1;
            double[] tempHarga = new double[newSizeHarga];
            for(int j=0; j<harga.length;j++){
                tempHarga[j] = harga[j];
            }
            tempHarga[newSizeHarga - 1] = newHarga;
            harga = tempHarga;
            
            System.out.print("Masukkan Jumlah Stok Barang: ");
            int newStok = input.nextInt();
            int newSizeStok = stokBrg.length + 1;
            int[] tempStok = new int[newSizeStok];
            for(int j=0;j<stokBrg.length;j++){
                tempStok[j] = stokBrg[j];
            }
            tempStok[newSizeStok - 1] = newStok;
            stokBrg = tempStok;
            
            //coba ditampilkan(nnt dihapus)
            for(int j=0;j<namaBrg.length; j++){
                System.out.println((j+1) +" | "+ supplier[j] +" | "+ namaBrg[j] +" | "+tipeBrg[j]+" | "+prdDate[j]+" | "+harga[j]+" | "+stokBrg[j] );
            }

            System.out.println("===========================================================================");
            System.out.println("Barang telah berhasil ditambahkan");
            System.out.println("Masukkan data lagi?");
            System.out.println("1. Iya");
            System.out.println("0. Kembali");

            int pilihStop1 = input.nextInt();
            if( pilihStop1 == 0){
                stop = false; //kembali ke main menu
            }else{
                stop = true; // lanjut 
            }
            i++;
            }while (stop);         
            
                break;
                case 2:
                int menu2;
                int stop2 = 0;
                do {
                    System.out.println("======Update Item Information======");
                    System.out.println("Silahkan Pilih");
                    System.out.println("1. Update");
                    System.out.println("2. Hapus");
                    System.out.println("3. Tampilkan Item");//Sementara
                    System.out.println("0. Kembali");
                    System.out.print("Masukkan Nomor: ");
                    menu2 = input.nextInt();
                    input.nextLine(); 
                    int index = -1;
                    switch (menu2) {
                        case 1:
                            System.out.print("Masukkan Nama Barang yang ingin anda ubah: ");
                            String namaBrgUpdate = input.nextLine();

                            for (int i = 0; i < namaBrg.length; i++) {
                                if (namaBrg[i].equalsIgnoreCase(namaBrgUpdate)) {
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
                                        System.out.print("Masukkan Nama Barang Baru: ");
                                        namaBrg[index] = input.nextLine();
                                        break;
                                    case 2:
                                        System.out.print("Masukkan Kategori Barang Baru: ");
                                        tipeBrg[index] = input.nextLine();
                                        break;
                                    case 3:
                                        System.out.print("Masukkan Tanggal Produksi Baru: ");
                                        prdDate[index] = input.nextLine();
                                        break;
                                    case 4:
                                        System.out.print("Masukkan Tanggal Kadaluarsa Baru: ");
                                        expDate[index] = input.nextLine();
                                        break;
                                    case 5:
                                        System.out.print("Masukkan Harga Barang Baru: ");
                                        harga[index] = input.nextDouble();
                                        break;
                                    case 6:
                                        System.out.print("Masukkan Jumlah Stok Barang Baru: ");
                                        stokBrg[index] = input.nextInt();
                                        break;
                                    case 0:
                                        System.out.println("+++++Anda telah selesai melakukan pembaruan data+++++");
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid.");
                                }
                                System.out.println("Barang " + namaBrg[index] + " berhasil diperbarui ");
                            } else {
                                System.out.println("Barang tidak ditemukan");
                            }
                            break;
                        case 2:
                            System.out.print("Masukkan Nama Barang yang ingin dihapus: ");
                            String namaBarangHapus = input.nextLine();

                            int indexHapus = -1;
                            for (int i = 0; i < namaBrg.length; i++) {
                                if (namaBrg[i].equalsIgnoreCase(namaBarangHapus)) {
                                    indexHapus = i;
                                    break;
                                }
                            }
                            
                            if (indexHapus != -1) {
                                for (int i = indexHapus; i < namaBrg.length - 1; i++) {
                                    namaBrg[i] = namaBrg[i + 1];
                                    tipeBrg[i] = tipeBrg[i + 1];
                                    prdDate[i] = prdDate[i + 1];
                                    expDate[i] = expDate[i + 1];
                                    supplier[i] = supplier[i + 1];
                                    konSupp[i] = konSupp[i + 1];
                                    alamatSupp[i] = alamatSupp[i + 1];
                                    harga[i] = harga[i + 1];
                                    stokBrg[i] = stokBrg[i + 1];
                                }

                                int lastIn = namaBrg.length - 1;
                                namaBrg[lastIn] = null;
                                tipeBrg[lastIn] = null;
                                prdDate[lastIn] = null;
                                expDate[lastIn] = null;
                                supplier[lastIn] = null;
                                konSupp[lastIn] = null;
                                alamatSupp[lastIn] = null;
                                harga[lastIn] = 0;
                                stokBrg[lastIn] = 0;
                                
                                System.out.println("Data barang " + namaBarangHapus + " telah berhasil dihapus");
                            } else {
                                System.out.println("Barang tidak ditemukan");
                            }
                            break;
                        case 3:
                            for (int i = 0; i < namaBrg.length; i++) {
                                if (namaBrg[i] == null) {
                                    continue;
                                } else {
                                    System.out.println("Nama Barang: " + namaBrg[i]);
                                System.out.println("Tipe Barang: " + tipeBrg[i]);
                                System.out.println("Tanggal Produksi: " + prdDate[i]);
                                System.out.println("Tanggal Kadaluarsa: " + expDate[i]);
                                System.out.println("Supplier: " + supplier[i]);
                                System.out.println("Kontak Supplier: " + konSupp[i]);
                                System.out.println("Alamat Supplier: " + alamatSupp[i]);
                                System.out.println("Harga: " + harga[i]);
                                System.out.println("Stok: " + stokBrg[i]);
                                System.out.println("====================");
                                }
                            }
                    break;
                        case 0:
                            break;
                        default:
                            System.out.println("Nomor menu yang anda masukkan salah, silahkan pilih antara 1, 2, atau 3");
                            break;
                    }
                } while (menu2 != stop2);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;

            case 3:
                System.out.println("=====Item Categorization=====");

                break;
            case 4:
            // loop nya ada yang ilang, lagi nyoba array. udah ketemu cara nambahin sesuai urutan, cuma lek ada lebih dr 1 produk carra ngatur supplier ini gimanaaa saya bingung
            int menu4;
            do{
                System.out.println("=====Supplier Management=====");
                System.out.println("1.Masukkan Supplier Baru");
                System.out.println("2.Lihat Informasi Supplier");
                System.out.println("0.Kembali");
                System.out.print("Masukkan Nomor: ");
                menu4 = input.nextInt();
                if (menu4 == 0 ) {
                    break;
                }
                switch(menu4){
                    case 1 :
                    int stop4 = 0;
                    do{
                    // String cariSupplier;
                    int hasil=0;                        
                        // if(stop4 != 0 && stop4 != 1){
                        //     System.out.println("=========================");
                        //     System.out.println("Masukkan Data Supplier Lagi?");
                        //     System.out.println("1. Iya");
                        //     System.out.println("0. Tidak");
                        //     System.out.print("Pilih angka 1 atau 0: ");                                                       
                        //     stop4 = input.nextInt();         
                        //     continue;         
                        // }
                    System.out.println("===Masukkan Supplier Baru===");
                    System.out.print("Masukkan Supplier: ");
                    String cariSupplier = input.next();
                    for(int i=0; i<supplier.length; i++){
                        if(supplier[i] == cariSupplier){
                            hasil=i;
                            break;
                        }
                    }
                    System.out.print("Masukkan Kontak Supplier: ");
                    konSupp[hasil] = input.next();
                    System.out.print("Masukkan Alamat Supplier: ");
                    alamatSupp[hasil] = input.next();
                    // System.out.println("=============================");
                    // System.out.println("Masukkan Data Supplier Lagi?");
                    // System.out.println("1. Iya");
                    // System.out.println("0. Tidak");
                    // System.out.print("Masukkan Nomer: ");
                    // stop4 = input.nextInt();
                    // if(stop4 != 0 && stop4 != 1 && stop4 >= 2){
                    //     System.out.println("============================");
                    //     System.out.println("Masukkan angka 0 atau 1");
                    //     continue;
                    // }
                    } while (stop4 != 0);

                    break;
                    case 2:
                    System.out.println("===================List Supplier==================");
                    System.out.println("==================================================");
                    System.out.println("No |"+" Supplier \t| Kontak \t| Alamat  ");
                    for(int i=0; i<supplier.length;i++){
                        System.out.println((i+1)+"  | "+ supplier[i]+" \t| "+konSupp[i]+" \t| "+alamatSupp[i]);
                    }
                    System.out.println("==================================================");                    
                        break;
                }

            }while (menu4 != 0);
                break;
            // case 5:
            //     int menu5;
            //     int stop5 = 0;
            //     do {
            //     System.out.println("=====Stock Checking=====");
            //     System.out.println("1. Cek Semua Stok Barang");
            //     System.out.println("2. Cek Stok Berdasarkan Nama Barang");
            //     System.out.println("0. Kembali");
            //     System.out.print("Pilih Nomor : ");
            //     menu5 = input.nextInt();

            // switch (menu5) {
            //     case 1:
            //         System.out.println("Stok Barang :");
            //         System.out.println("Nama Barang           : " + namaBrg );
            //         System.out.println("Kategori Barang       : " + tipeBrg );
            //         System.out.println("Harga Barang          : " + harga );
            //         break;
            //     case 2:
            //         System.out.println("Masukkan Nama Barang Yang Ingin Anda Cek :");
            //         namaBrg = input.next();
            //         input.nextLine();
            //         System.out.println("Nama Barang           : " );
            //         System.out.println("Kategori Barang       : " );
            //         System.out.println("Jumlah Stok Barang    : " );
            //         break;
            //     case 0:
            //         break;
            //     default:
            //         System.out.println("Nomor menu yang anda masukkan salah");
            //         break;
            // }
            // } while (menu5 != stop5);
            //     break;
            // case 6:
            
            //     System.out.println("=====Item Scanning=====");
            //     System.out.print("Masukkan nama Barang Yang Ingin Anda Scan: ");
            //     namaBrg = input.next();
            //     input.nextLine();

            //     System.out.println("=====Data Barang yang Dicari=====");
            //     System.out.println("Nama Barang               : \n" );
            //     System.out.println("Kategori Barang           : \n" );
            //     System.out.println("Nama Supplier             : \n" );
            //     System.out.println("Tanggal Produksi Barang   : \n" );
            //     System.out.println("Tanggal Kadaluarsa Barang : \n" );
            //     System.out.println("Harga Barang              : \n" );
            //     System.out.println("Jumlah Stok Barang        : \n" );

            //     break;
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
                int index = 0;
                switch (menu7) {
                    case 1:
                        
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        Date date1 = sdf.parse("2020-01-30");
                        Date date2 = sdf.parse("2020-01-31");

                        System.out.println("The date 1 is: " + sdf.format(date1));
                        System.out.println("The date 2 is: " + sdf.format(date2));
                        if(date1.compareTo(date2) > 0) {
                            System.out.println("Date 1 occurs after Date 2");
                        } else if(date1.compareTo(date2) < 0) {
                            System.out.println("Date 1 occurs before Date 2");
                        } else if(date1.compareTo(date2) == 0) {
                            System.out.println("Both dates are equal");
                        }
                        // System.out.print("Masukkan Nama Barang yang ingin dicek: ");
                        // input.nextLine(); // Consume the newline
                        // String namaBrgExp = input.nextLine();

                        // for (int i = 0; i < namaBrg.length; i++) {
                        //     if (namaBrg[i].equalsIgnoreCase(namaBrgExp)) {
                        //         index = i;
                        //         break;
                        //     }
                        // }


                        // System.out.print("Masukkan tanggal (1-31): ");
                        // int prdDateTgl = input.nextInt();

                        // System.out.print("Masukkan tanggal (1-31): ");
                        // int prdDateBln = input.nextInt();

                        // System.out.print("Masukkan tanggal (1-31): ");
                        // int prdDateThn = input.nextInt();

                        // if (namaBrg[index]== namaBrgExp) {
                        //     if (expDate[index].compareTo(dateNow) < 0) {
                        //         System.out.println("Tanggal sudah lewat!");
                        //     } else {
                        //         System.out.println("Tanggal belum lewat.");
                        //     }
                        // } else {
                        //     System.out.println("Barang tidak ditemukan.");
                        // }

                        // System.out.print("Masukkan tanggal yang ingin Anda cek (format: dd-MM-yyyy): ");
                        // String prdDateExp = input.nextLine();

                        // System.out.print("Masukkan tanggal sekarang (format: dd-MM-yyyy): ");
                        // String dateNow = input.nextLine();

                        
                        // if (namaBrg[index]== namaBrgExp) {
                        //     if (expDate[index].compareTo(dateNow) < 0) {
                        //         System.out.println("Tanggal sudah lewat!");
                        //     } else {
                        //         System.out.println("Tanggal belum lewat.");
                        //     }
                        // } else {
                        //     System.out.println("Barang tidak ditemukan.");
                        // }


                        // if (prdDateExp.equals(prdDate[index])) {
                        //     if (expDate[index].compareTo(dateNow) < 0) {
                        //         System.out.println("Tanggal sudah lewat!");
                        //     } else {
                        //         System.out.println("Tanggal belum lewat.");
                        //     }
                        // } else {
                        //     System.out.println("Barang tidak ditemukan.");
                        // }
                        break;

                    case 2:
                        System.out.println("Daftar Kadaluarsa:");
                        System.out.print("Masukkan tanggal sekarang (format: dd-MM-yyyy): ");
                        String dateNow1 = input.nextLine();
                        
                        for (int i = 0; i < namaBrg.length; i++) {
                            if (expDate[i].compareTo(dateNow1) < 0) {
                                System.out.println(namaBrg[i]);
                            }
                        }
                        break;

                    case 0:
                        break;
                }            } while (menu7 != stop7);
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
                    System.out.println("===Cabang Malang===");
                    System.out.println("Masukkan ");
                    break;

                default:
                    break;
            }

            }while (fitur != 0);
                break;//break menu8                 
        }
        } while (fitur != 0);
    
    }
}

// INI NOTE!!!

//  case 1:
//             do{
//             int i=0;
//             System.out.println("=====Item Entry and Storage=====");
//             System.out.print("Masukkan Nama Supplier: ");
//             supplier[i] = input.nextLine();
//             input.nextLine();
//             System.out.print("Masukkan Nama Barang: ");
//             namaBrg[i] = input.nextLine();
//             System.out.print("Masukkan Kategori Barang: ");
//             tipeBrg[i] = input.nextLine();
//             System.out.print("Masukkan Tanggal Produksi Barang: ");
//             prdDate[i] = input.next();
//             input.nextLine();
//             System.out.print("Masukkan Tanggal Kadaluarsa Barang: ");
//             expDate[i] = input.next();
//             input.nextLine();
//             System.out.print("Masukkan Harga Barang: ");
//             harga[i] = input.nextDouble();
//             input.nextLine();
//             System.out.print("Masukkan Jumlah Stok Barang: ");
//             stokBrg[i] = input.nextInt();
//             input.nextLine();
//             System.out.println("===========================================================================");
//             System.out.println("Barang telah berhasil ditambahkan");
//             System.out.println("Masukkan data lagi?");
//             System.out.println("1. Iya");
//             System.out.println("0. Kembali");
//             int pilihStop1 = input.nextInt();
//             if( pilihStop1 == 0){
//                 stop = false; //kembali ke main menu
//             }else{
//                 stop = true; // lanjut 
//             }
//             i++;
//             }while (stop);                     
//                 break;
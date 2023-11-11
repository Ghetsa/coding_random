import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CompareDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date today = new Date();

        String[] namaBrg = {"Sedap Goreng", "Teh Rio"};
        String[] tipeBrg = {"Makanan", "Minuman"};
        Date[] prdDate = {"22 September 2023", "23 September 2023"};
        Date[] expDate = {"23 desember 2024", "24 desember 2025"};
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
                int indeksBarangCek = -1;
                int index = 0;
                switch (menu7) {
                    case 1:
                            System.out.println("Daftar Barang:");
                            for (int i = 0; i < namaBrg.length; i++) {
                                System.out.println((i+1) +". "+namaBrg[i]);
                            }

                            System.out.print("Masukkan Nomor barang: ");
                            int noBarangCek = input.nextInt();

                            if (noBarangCek >= 1 && noBarangCek <= namaBrg.length) {
                                index = noBarangCek - 1;
                                if (expDate[index]) {
                                    
                                } else {
                                    
                                }
                                System.out.println("Barang " + namaBrg[index]);
                            } else {
                                System.out.println("Indeks tidak valid.");
                            }
                            System.out.println(index);
                            // Temukan indeks barang berdasarkan nama
                            // for (int i = 0; i < namaBrg.length; i++) {
                            //     if (namaBrg[i].equalsIgnoreCase(noBarangCek)) {
                            //         indeksBarangCek = i;
                            //         break;
                            //     }
                            // }

                            
                            // if (indeksBarangCek != -1) {
                            //     try {
                            //         Date tanggalKadaluarsa = dateFormat.parse(expDate[indeksBarangCek]);
                            //         if (tanggalKadaluarsa.before(today)) {
                            //             System.out.println("Tanggal kadaluarsa telah lewat!");
                            //         } else {
                            //             System.out.println("Tanggal kadaluarsa belum lewat.");
                            //         }
                            //     } catch (Exception e) {
                            //         System.out.println("Format tanggal tidak valid.");
                            //     }
                            // } else {
                            //     System.out.println("Nama barang tidak ditemukan.");
                            // }
                            // break;
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
            case 8:
            int fitur8;
            do{
            System.out.println("=====Delivery=====");
            System.out.println("1. Pengiriman");
            System.out.println("2. Lihat Stok Cabang");
            System.out.println("0. Kembali");
            System.out.print("Masukkan Nomor Menu: ");
            fitur8 = input.nextInt();
            input.nextLine(); 

            switch (fitur8) {
                case 1:
                    int stop81 = -1;
                        int indeks=0;            
                        int jumKirBarang; 
                    do{  
                        System.out.println("===Pilih Cabang===");                                                       
                        System.out.println("1.Malang");
                        System.out.println("2.Blitar");
                        System.out.println("3.Tuban");
                        System.out.println("0.Kembali");
                        System.out.print("Masukkan Nomor Cabang: ");
                        int kirim_cabang = input.nextInt();
                        stop81 = kirim_cabang;// angka pada stop81 mengikuti input dari menu pilih cabang
                        switch(kirim_cabang){
                            case 1: 
                            System.out.println("===Kirim Cabang Malang===");
                            for (int i=0;i<namaBrg.length; i++){
                            System.out.println((i+1) +" | "+ supplier[i] +" | "+ namaBrg[i] +" | "+tipeBrg[i]+" | "+prdDate[i]+" | "+harga[i]+" | "+stokBrg[i] );
                            }   //menampilkan informasi barang dalam gudang
                            
                            System.out.print("Masukkan Nomor Urut Barang: ");
                            int cariNomorBarangMalang = input.nextInt();

                            if (cariNomorBarangMalang >= 1 && cariNomorBarangMalang <= namaBrg.length) {
                                indeks = cariNomorBarangMalang - 1;
                                System.out.println("Barang yang akan dikirim adalah " + namaBrg[indeks]);
                            } else {
                                System.out.println("Indeks tidak valid.");
                            }//mencari posisi index barang

                            System.out.print("Masukkan Jumlah Barang: ");
                            jumKirBarang = input.nextInt();
                            stokBrg[indeks] -= jumKirBarang;  //mengurangi stok gudang
                            stokCabang[0][indeks] += jumKirBarang; //menambah stok di cabang


                            break;
                            case 2: 
                            System.out.println("===Kirim Cabang Blitar===");
                            for (int i=0;i<namaBrg.length; i++){
                            System.out.println((i+1) +" | "+ supplier[i] +" | "+ namaBrg[i] +" | "+tipeBrg[i]+" | "+prdDate[i]+" | "+harga[i]+" | "+stokBrg[i] );
                            }   //menampilkan informasi barang dalam gudang
                            
                            System.out.print("Masukkan Nomor Urut Barang: ");
                            int cariNomorBarangBlitar = input.nextInt();

                            if (cariNomorBarangBlitar >= 1 && cariNomorBarangBlitar <= namaBrg.length) {
                                indeks = cariNomorBarangBlitar - 1;
                                System.out.println("Barang yang akan dikirim adalah " + namaBrg[indeks]);
                            } else {
                                System.out.println("Indeks tidak valid.");
                            }//mencari posisi index barang

                            System.out.print("Masukkan Jumlah Barang: ");
                            jumKirBarang = input.nextInt();
                            stokBrg[indeks] -= jumKirBarang;  //mengurangi stok gudang
                            stokCabang[1][indeks] += jumKirBarang; //menambah stok di cabang                            

                            break;
                            case 3: 
                            System.out.println("===Kirim Cabang Tuban===");
                            for (int i=0;i<namaBrg.length; i++){
                            System.out.println((i+1) +" | "+ supplier[i] +" | "+ namaBrg[i] +" | "+tipeBrg[i]+" | "+prdDate[i]+" | "+harga[i]+" | "+stokBrg[i] );
                            }   //menampilkan informasi barang dalam gudang
                            
                            System.out.print("Masukkan Nomor Urut Barang: ");
                            int cariNomorBarangTuban = input.nextInt();

                            if (cariNomorBarangTuban >= 1 && cariNomorBarangTuban <= namaBrg.length) {
                                indeks = cariNomorBarangTuban - 1;
                                System.out.println("Barang yang akan dikirim adalah " + namaBrg[indeks]);
                            } else {
                                System.out.println("Indeks tidak valid.");
                            }//mencari posisi index barang

                            System.out.print("Masukkan Jumlah Barang: ");
                            jumKirBarang = input.nextInt();
                            stokBrg[indeks] -= jumKirBarang;  //mengurangi stok gudang
                            stokCabang[2][indeks] += jumKirBarang; //menambah stok di cabang                              

                            break;
                            default:
                            System.out.println("Pilih Nomor Cabang!!!");
                            break;
                        }


                        } while (stop81 != 0);
                    break;

                case 2:
                    System.out.println("===Stok Cabang===");
                    System.out.print("Nama Barang |");
                    for (int i=0; i<cabang.length;i++){
                        System.out.print( cabang[i] + "\t|");
                    }
                    System.out.println();

                    for(int i=0;i<namaBrg.length;i++){
                        System.out.print(namaBrg[i]);
                        for(int j=0; j<stokCabang.length;j++){
                            System.out.print(" |\t "+ stokCabang[j][i]);
                        }
                        System.out.println("|");
                    }
                    break; //break case 2
            }

            }while (fitur8 != 0);
                break;//break menu8                 
        }
        } while (fitur != 0);
    
    }
}
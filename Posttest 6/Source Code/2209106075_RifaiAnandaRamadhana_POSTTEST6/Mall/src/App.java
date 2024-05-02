import java.util.ArrayList;
import toko.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    final void tampilkan(ArrayList<tokoPakaian> tkoPakaian, ArrayList<tokoElektronik> tkoElektronik)throws IOException {
        final class status {
            private final String status = "tersedia";
        
            public String getStatus() {
                return status;
            }
        }
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        status statusInfo = new status(); // Menggunakan kelas baru dengan nama yang berbeda
        String statusTersedia = statusInfo.getStatus();
        System.out.println("Toko Tersedia");
        System.out.println("1. Toko Pakaian");
        System.out.println("2. Toko Elektronik");
        System.out.println("Pilih : ");
        String pilih = br.readLine();
        if (pilih.startsWith("1")) {
            if (tkoPakaian.size() < 1) {
                System.out.println("Data Belum Tersedia");
            }
            else {
                for(int i = 0; i < tkoPakaian.size(); i++){
                    tokoPakaian toko = tkoPakaian.get(i);
                    String idToko = toko.getIdToko();
                    String namaToko = toko.getNamaToko();
                    String lokasiToko = toko.getLokasiToko();
                    String jenisUsaha = toko.getJenisUsaha();
                    String daftarProduk = toko.getDaftarProduk();
                    String jenisPakaian = toko.getjenisPakaian();
                    String ukuranTersedia = toko.getUkuranTersedia();
                    String namaMall = toko.namaMall("");
                    double harga = toko.getHarga();
                    String Status = statusTersedia;
            
                    System.out.println("================================");
                    System.out.println("Id Toko = " + idToko);
                    System.out.println("Nama Toko = " + namaToko);
                    System.out.println("Lokasi Toko = " + lokasiToko);
                    System.out.println("Jenis Usaha = " + jenisUsaha);
                    System.out.println("Daftar Produk = " + daftarProduk);
                    System.out.println("Jenis Pakaian = " + jenisPakaian);
                    System.out.println("Ukuran Tersedia = " + ukuranTersedia);
                    System.out.println("Nama Mall = " + namaMall);
                    System.out.println("Harga = " + harga);
                    System.out.println("Status = " + Status);
                    System.out.println("================================");
                }
            }
        }
        else if (pilih.startsWith("2")){
            if (tkoElektronik.size() < 1) {
                System.out.println("Data Belum Tersedia");
            }
            else {
                for(int i = 0; i < tkoElektronik.size(); i++){
                    tokoElektronik toko = tkoElektronik.get(i);
                    String idToko = toko.getIdToko();
                    String namaToko = toko.getNamaToko();
                    String lokasiToko = toko.getLokasiToko();
                    String jenisUsaha = toko.getJenisUsaha();
                    String daftarProduk = toko.getDaftarProduk();
                    String jenisBarang = toko.getJenisBarang();
                    String namaMall = toko.namaMall("");
                    String merk = toko.getMerk();
                    double harga = toko.getHarga();
                    String Status = statusTersedia;

                    System.out.println("================================");
                    System.out.println("Id Toko = " + idToko);
                    System.out.println("Nama Toko = " + namaToko);
                    System.out.println("Lokasi Toko = " + lokasiToko);
                    System.out.println("Jenis Usaha = " + jenisUsaha);
                    System.out.println("Daftar Produk = " + daftarProduk);
                    System.out.println("Jenis Barang = " + jenisBarang);
                    System.out.println("Merk Yang tersedia = " + merk);
                    System.out.println("Nama Mall = " + namaMall);
                    System.out.println("Harga = " + harga);
                    System.out.println("status = " + Status);
                    System.out.println("================================");
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        ArrayList<tokoPakaian> tkoPakaian = new ArrayList<>();
        ArrayList<tokoElektronik> tkoElektronik = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("===========================================================================");
        System.out.println("                            HALO SELAMAT DATANG                            ");
        System.out.println("===========================================================================");
        System.out.println("PROGRAM INI MERUPAKAN PROGRAM UNTUK MENDATA TOKO YANG ADA DI MALL SAMARINDA");
        System.out.println("============================================================================");
        while (true) {
            System.out.println("1. Lihat Toko");
            System.out.println("2. Tambah Toko");
            System.out.println("3. Ubah Toko");
            System.out.println("4. Hapus Toko");
            System.out.println("5. Check Harga");
            System.out.println("6. Diskon Toko");
            System.out.println("7. EXIT");
            System.out.println("==========="); 
            System.out.print("Menu : ");  
            String menu = br.readLine();
            if (menu.startsWith("1")){
                new App().tampilkan(tkoPakaian, tkoElektronik);
            }
            else if (menu.startsWith("2")){
                System.out.println("Toko Tersedia");
                System.out.println("1. Toko Pakaian");
                System.out.println("2. Toko Elektronik");
                System.out.println("Pilih : ");
                String pilih = br.readLine();
                if (pilih.startsWith("1")) {
                    String id = "" + tkoPakaian.size();
                    System.out.println("Masukkan Nama Toko = ");
                    String nama = br.readLine();
                    System.out.println("Masukkan Lokasi Toko = ");
                    String lokasiToko = br.readLine();
                    System.out.println("Masukkan Daftar Produk = ");
                    String daftarProduk = br.readLine();
                    System.out.println("Masukkan Jenis Pakaian = ");
                    String jenisPakaian = br.readLine();
                    System.out.println("Masukkan Ukuran Tersedia = ");
                    String ukuranTersedia = br.readLine();
                    System.out.println("Masukkan harga = ");
                    int harga = Integer.parseInt(br.readLine());
                    tokoPakaian tokoPakaian = new tokoPakaian(id, nama, lokasiToko, "", daftarProduk, jenisPakaian, ukuranTersedia, harga);
                    tkoPakaian.add(tokoPakaian);
                }
                else if (pilih.startsWith("2")) {
                    String id = "" + tkoElektronik.size();
                    System.out.println("Masukkan Nama Toko = ");
                    String nama = br.readLine();
                    System.out.println("Masukkan Lokasi Toko = ");
                    String lokasiToko = br.readLine();
                    System.out.println("Masukkan Daftar Produk = ");
                    String daftarProduk = br.readLine();
                    System.out.println("Masukkan Jenis Barang = ");
                    String jenisBarang = br.readLine();
                    System.out.println("Masukkan Merk tersedia = ");
                    String Merk = br.readLine();
                    System.out.println("Masukkan Harga = ");
                    int harga = Integer.parseInt(br.readLine());
                    tokoElektronik tokoElektronik = new tokoElektronik(id, nama, lokasiToko, "", daftarProduk, jenisBarang, Merk, harga);
                    tkoElektronik.add(tokoElektronik);
                }

            }
            else if (menu.startsWith("3")) {
                if (tkoPakaian.size() < 1) {
                    System.out.println("Data Belum Tersedia");
                }
                else {
                    System.out.println("Ubah Toko");
                    System.out.println("Toko Tersedia");
                    System.out.println("1. Toko Pakaian");
                    System.out.println("2. Toko Elektronik");
                    System.out.println("Pilih : ");
                    String pilih = br.readLine();
                    if (pilih.startsWith("1")) {
                        System.out.println("cari id toko : ");
                        String cari = br.readLine();
                        for (int i = 0; i < tkoPakaian.size(); i++) {
                            tokoPakaian tokoBaru = tkoPakaian.get(i);
                            String idToko = tokoBaru.getIdToko();
                            if (cari.equals(idToko) && tokoBaru.getJenisUsaha() == "Toko Pakaian") {
                                System.out.println("Masukkan Nama Toko = "); String namaBaru = br.readLine();
                                tokoBaru.setNamaToko(namaBaru);
                                System.out.println("Masukkan Lokasi Toko = "); String lokasiToko = br.readLine();
                                tokoBaru.setLokasiToko(lokasiToko);
                                System.out.println("Masukkan Daftar Produk = "); String daftarProduk = br.readLine();
                                tokoBaru.setDaftarProduk(daftarProduk);
                                System.out.println("Masukkan Jenis Pakaian = "); String jenisPakaian = br.readLine();
                                tokoBaru.setjenisPakaian(jenisPakaian);
                                System.out.println("Masukkan Ukuran Tersedia = "); String ukuranTersedia = br.readLine();
                                tokoBaru.setukuranTersedia(ukuranTersedia);
                                System.out.println("Masukkan Harga Baru = "); int harga = Integer.parseInt(br.readLine());
                                tokoBaru.setHarga(harga);
                                break;
                            }
                        }
                    }
                    else if (pilih.startsWith("2")){
                        System.out.println("cari id toko : ");
                        String cari = br.readLine();
                        for (int i = 0; i < tkoElektronik.size(); i++) {
                            tokoElektronik tokoBaru = tkoElektronik.get(i);
                            String idToko = tokoBaru.getIdToko();
                            if (cari.equals(idToko) && tokoBaru.getJenisUsaha() == "Toko Elektronik") {
                                System.out.println("Masukkan Nama Toko = "); String namaBaru = br.readLine();
                                tokoBaru.setNamaToko(namaBaru);
                                System.out.println("Masukkan Lokasi Toko = "); String lokasiToko = br.readLine();
                                tokoBaru.setLokasiToko(lokasiToko);
                                System.out.println("Masukkan Daftar Produk = "); String daftarProduk = br.readLine();
                                tokoBaru.setDaftarProduk(daftarProduk);
                                System.out.println("Masukkan Jenis Barang = "); String jenisBarang = br.readLine();
                                tokoBaru.setJenisBarang(jenisBarang);
                                System.out.println("Masukkan Merk Tersedia = "); String Merk = br.readLine();
                                tokoBaru.setMerk(Merk);
                                System.out.println("Masukkan Harga Baru = "); int harga = Integer.parseInt(br.readLine());
                                tokoBaru.setHarga(harga);
                                break;
                            }
                        }
                    }
                }
            }
            else if (menu.startsWith("4")) {
                System.out.println("Toko Tersedia");
                System.out.println("1. Toko Pakaian");
                System.out.println("2. Toko Elektronik");
                System.out.println("Pilih : ");
                String pilih = br.readLine();
                if (pilih.startsWith("1")) {
                    if (tkoPakaian.size() < 1) {
                        System.out.println("Data Belum Tersedia");
                    }
                    else {
                        System.out.println("Hapus Toko");
                        System.out.println("Cari id Toko : ");
                        String cari = br.readLine();
                        for (int i = 0; i < tkoPakaian.size(); i++) {
                            toko tokoBaru = tkoPakaian.get(i);
                            String idToko = tokoBaru.getIdToko();
                            if (cari.equals(idToko) && tokoBaru.getJenisUsaha() == "Toko Pakaian") {
                                tkoPakaian.remove(i);
                                break;
                            }
                        }
                    }
                }
                else if (pilih.startsWith("")){
                    if (tkoElektronik.size() < 1) {
                        System.out.println("Data Belum Tersedia");
                    }
                    else {
                        System.out.println("Hapus Toko");
                        System.out.println("Cari id Toko : ");
                        String cari = br.readLine();
                        for (int i = 0; i < tkoElektronik.size(); i++) {
                            toko tokoBaru = tkoElektronik.get(i);
                            String idToko = tokoBaru.getIdToko();
                            if (cari.equals(idToko) && tokoBaru.getJenisUsaha() == "Toko Elektronik") {
                                tkoElektronik.remove(i);
                                break;
                            }
                        }
                    }
                }
            }
            
            else if(menu.equals("5")){
                System.out.println("1. Harga Pakaian");
                System.out.println("2. Harga Elektronik");
                String cari = br.readLine();
                if(cari.equals("1")){
                    System.out.println("Check Harga Pakaian");
                    System.out.println("Cari Index : ");
                    int cariPakaian = Integer.parseInt(br.readLine());
                    for( int i = 0; i < tkoPakaian.size(); i++){
                        if(cariPakaian == i){
                            tokoPakaian tokoBaru = tkoPakaian.get(i);
                            tokoBaru.CheckHarga(tokoBaru.diskon(9.25, tokoBaru.getHarga()));
                        }
                    }
                }
                else if(cari.equals("2")){
                    System.out.println("Check Harga Pakaian");
                    System.out.println("Cari Index : ");
                    int cariElektronik = Integer.parseInt(br.readLine());
                    for( int i = 0; i < tkoElektronik.size(); i++){
                        if(cariElektronik == i){
                            tokoElektronik tokoBaru = tkoElektronik.get(i);
                            tokoBaru.CheckHarga(tokoBaru.diskon(10, tokoBaru.getHarga()));
                        }
                    }
                }
            }
            else if (menu.startsWith("6")){
                System.out.println("Diskon Toko");
                System.out.println("Diskon toko elektronik : " + 9.25 + " %");
                System.out.println("Diskon Toko Pakaian : " + 10 + " %");
            }
            else if (menu.startsWith("7")){
                System.exit(0);
            }
            else {
                System.out.println("MASUKKAN ULANG PILIHAN!");
            }
        }
    }
}
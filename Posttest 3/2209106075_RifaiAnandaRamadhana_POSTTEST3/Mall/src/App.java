import java.util.ArrayList;
import toko.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
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
            System.out.println("5. EXIT");
            System.out.println("==========="); 
            System.out.print("Menu : ");  
            String menu = br.readLine();
            if (menu.startsWith("1")){
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
                            String namaToko = toko.getnamaToko();
                            String lokasiToko = toko.getlokasiToko();
                            String jenisUsaha = toko.getjenisUsaha();
                            String daftarProduk = toko.getdaftarProduk();
                            String jenisPakaian = toko.getjenisPakaian();
                            String ukuranTersedia = toko.getUkuranTersedia();
        
                            System.out.println("================================");
                            System.out.println("Id Toko = " + idToko);
                            System.out.println("Nama Toko = " + namaToko);
                            System.out.println("Lokasi Toko = " + lokasiToko);
                            System.out.println("Jenis Usaha = " + jenisUsaha);
                            System.out.println("Daftar Produk = " + daftarProduk);
                            System.out.println("Jenis Pakaian = " + jenisPakaian);
                            System.out.println("Ukuran Tersedia = " + ukuranTersedia);
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
                            String namaToko = toko.getnamaToko();
                            String lokasiToko = toko.getlokasiToko();
                            String jenisUsaha = toko.getjenisUsaha();
                            String daftarProduk = toko.getdaftarProduk();
                            String jenisBarang = toko.getjenisBarang();
                            String merk = toko.getMerk();
        
                            System.out.println("================================");
                            System.out.println("Id Toko = " + idToko);
                            System.out.println("Nama Toko = " + namaToko);
                            System.out.println("Lokasi Toko = " + lokasiToko);
                            System.out.println("Jenis Usaha = " + jenisUsaha);
                            System.out.println("Daftar Produk = " + daftarProduk);
                            System.out.println("Jenis Barang = " + jenisBarang);
                            System.out.println("Merk Yang tersedia = " + merk);
                            System.out.println("================================");
                        }
                    }
                }
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
                    String jenisUsaha = "Toko Pakaian";
                    System.out.println("Masukkan Daftar Produk = ");
                    String daftarProduk = br.readLine();
                    System.out.println("Masukkan Jenis Pakaian = ");
                    String jenisPakaian = br.readLine();
                    System.out.println("Masukkan Ukuran Tersedia = ");
                    String ukuranTersedia = br.readLine();
                    tokoPakaian tokoPakaian = new tokoPakaian(id, nama, lokasiToko, jenisUsaha, daftarProduk, jenisPakaian, ukuranTersedia);
                    tkoPakaian.add(tokoPakaian);
                }
                else if (pilih.startsWith("2")) {
                    String id = "" + tkoElektronik.size();
                    System.out.println("Masukkan Nama Toko = ");
                    String nama = br.readLine();
                    System.out.println("Masukkan Lokasi Toko = ");
                    String lokasiToko = br.readLine();
                    String jenisUsaha = "Toko Elektronik";
                    System.out.println("Masukkan Daftar Produk = ");
                    String daftarProduk = br.readLine();
                    System.out.println("Masukkan Jenis Barang = ");
                    String jenisBarang = br.readLine();
                    System.out.println("Masukkan Merk tersedia= ");
                    String Merk = br.readLine();
                    tokoElektronik tokoElektronik = new tokoElektronik(id, nama, lokasiToko, jenisUsaha, daftarProduk, jenisBarang, Merk);
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
                            if (cari.equals(idToko) && tokoBaru.getjenisUsaha() == "Toko Pakaian") {
                                System.out.println("Masukkan Nama Toko = "); String namaBaru = br.readLine();
                                tokoBaru.setnamaToko(namaBaru);
                                System.out.println("Masukkan Lokasi Toko = "); String lokasiToko = br.readLine();
                                tokoBaru.setlokasiToko(lokasiToko);
                                System.out.println("Masukkan Daftar Produk = "); String daftarProduk = br.readLine();
                                tokoBaru.setdaftarProduk(daftarProduk);
                                System.out.println("Masukkan Jenis Pakaian = "); String jenisPakaian = br.readLine();
                                tokoBaru.setjenisPakaian(jenisPakaian);
                                System.out.println("Masukkan Ukuran Tersedia = "); String ukuranTersedia = br.readLine();
                                tokoBaru.setukuranTersedia(ukuranTersedia);
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
                            if (cari.equals(idToko) && tokoBaru.getjenisUsaha() == "Toko Elektronik") {
                                System.out.println("Masukkan Nama Toko = "); String namaBaru = br.readLine();
                                tokoBaru.setnamaToko(namaBaru);
                                System.out.println("Masukkan Lokasi Toko = "); String lokasiToko = br.readLine();
                                tokoBaru.setlokasiToko(lokasiToko);
                                System.out.println("Masukkan Daftar Produk = "); String daftarProduk = br.readLine();
                                tokoBaru.setdaftarProduk(daftarProduk);
                                System.out.println("Masukkan Jenis Barang = "); String jenisBarang = br.readLine();
                                tokoBaru.setjenisBarang(jenisBarang);
                                System.out.println("Masukkan Merk Tersedia = "); String Merk = br.readLine();
                                tokoBaru.setMerk(Merk);
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
                            if (cari.equals(idToko) && tokoBaru.getjenisUsaha() == "Toko Pakaian") {
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
                            if (cari.equals(idToko) && tokoBaru.getjenisUsaha() == "Toko Elektronik") {
                                tkoElektronik.remove(i);
                                break;
                            }
                        }
                    }
                }
            }
            else if (menu.startsWith("5")){
                System.exit(0);
            }
            else {
                System.out.println("MASUKKAN ULANG PILIHAN!");
            }
        }
    }
}
import java.util.ArrayList;
import toko.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<toko> tko = new ArrayList<>();
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
                if (tko.size() < 1) {
                    System.out.println("Data Belum Tersedia");
                }
                else {
                    for(int i = 0; i < tko.size(); i++){
                        toko toko = tko.get(i);
                        String idToko = toko.getIdToko();
                        String namaToko = toko.getnamaToko();
                        String jenisToko = toko.getjenisToko();
                        String tanggalSewa = toko.gettanggalSewa();
                        String tanggalAkhirSewa = toko.gettanggalAkhirSewa();
                        int totalSewa = toko.gettotalSewa();
    
                        System.out.println("================================");
                        System.out.println("Id Toko = " + idToko);
                        System.out.println("Nama Toko = " + namaToko);
                        System.out.println("Jenis Toko = " + jenisToko);
                        System.out.println("tanggal Sewa Toko = " + tanggalSewa);
                        System.out.println("tanggal Akhir Sewa Toko = " + tanggalAkhirSewa);
                        System.out.println("Total Harga = " + totalSewa);
                        System.out.println("================================");
                    }
                }
            }
            else if (menu.startsWith("2")){
                String id = "" + tko.size();
                System.out.println("Masukkan Nama Toko = ");
                String nama = br.readLine();
                System.out.println("Masukkan Jenis Toko = ");
                String jenis = br.readLine();
                System.out.println("Masukkan tanggal Sewa Toko = ");
                String tanggalSewa = br.readLine();
                System.out.println("Masukkan tanggal Akhir Sewa Toko = ");
                String tanggalAkhir = br.readLine();
                System.out.println("Masukkan Total Harga = ");
                int totalHarga = Integer.parseInt(br.readLine());
                toko toko = new toko(id, nama, jenis, tanggalSewa, tanggalAkhir, totalHarga);
                tko.add(toko);
            }
            else if (menu.startsWith("3")) {
                if (tko.size() < 1) {
                    System.out.println("Data Belum Tersedia");
                }
                else {
                    System.out.println("Ubah Toko");
                    System.out.println("cari id toko : ");
                    String cari = br.readLine();
                    for (int i = 0; i < tko.size(); i++) {
                        toko tokoBaru = tko.get(i);
                        String idToko = tokoBaru.getIdToko();
                        if (cari.equals(idToko)) {
                            System.out.println("Masukkan Nama Toko = "); String namaBaru = br.readLine();
                            tokoBaru.setnamaToko(namaBaru);
                            System.out.println("Masukkan Jenis Toko = "); String jenisBaru = br.readLine();
                            tokoBaru.setjenisToko(jenisBaru);
                            System.out.println("Masukkan tanggal Sewa Toko = "); String tanggalSewaBaru = br.readLine();
                            tokoBaru.settanggalSewa(tanggalSewaBaru);
                            System.out.println("Masukkan tanggal Akhir Sewa Toko = "); String tanggalAkhirBaru = br.readLine();
                            tokoBaru.settanggalAkhirSewa(tanggalAkhirBaru);
                            System.out.println("Masukkan Total Harga = "); int totalHargaBaru = Integer.parseInt(br.readLine());
                            tokoBaru.settotalSewa(totalHargaBaru);
                            break;
                        }
                    }
                }
            }
            else if (menu.startsWith("4")) {
                if (tko.size() < 1) {
                    System.out.println("Data Belum Tersedia");
                }
                else {
                    System.out.println("Hapus Toko");
                    System.out.println("Cari id Toko : ");
                    String cari = br.readLine();
                    for (int i = 0; i < tko.size(); i++) {
                        toko tokoBaru = tko.get(i);
                        String idToko = tokoBaru.getIdToko();
                        if (cari.equals(idToko)) {
                            tko.remove(i);
                            break;
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
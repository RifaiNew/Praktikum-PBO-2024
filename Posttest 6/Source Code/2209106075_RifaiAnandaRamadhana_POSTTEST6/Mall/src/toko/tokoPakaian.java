package toko;

public class tokoPakaian extends toko {
    private String jenisPakaian;
    private String ukuranTersedia;
    private double harga;
    
    public tokoPakaian(String IdToko, String  namaToko, String lokasitoko, String jenisUsh, String daftarProd, String jenispakaian, String ukurantersedia, double harga) {
        super(IdToko, namaToko, lokasitoko, jenisUsh, daftarProd);
        this.jenisPakaian = jenispakaian;
        this.ukuranTersedia = ukurantersedia;
        this.harga = harga;
    }


    public String getjenisPakaian() {
        return jenisPakaian;
    }
    public String getUkuranTersedia() {
        return ukuranTersedia;
    }
    public double getHarga() {
        return harga;
    }

    public void setjenisPakaian(String jenispakaian) {
        this.jenisPakaian = jenispakaian;
    }
    public void setukuranTersedia(String ukurantersedia) {
        this.ukuranTersedia = ukurantersedia;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void CheckHarga(double Harga){
        System.out.println("Harga utama : " + Harga);
    }

    @Override
    public String getJenisUsaha() {
        return "Toko Pakaian";
    }
}

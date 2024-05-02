package toko;

public class tokoElektronik extends toko {
    private String jenisBarang;
    private String merk;
    private double harga;

    public tokoElektronik(String idToko, String namaToko, String lokasiToko, String jenisUsaha, String daftarProduk, String jenisBarang, String merk, double harga) {
        super(idToko, namaToko, lokasiToko, jenisUsaha, daftarProduk);
        this.jenisBarang = jenisBarang;
        this.merk = merk;
        this.harga = harga;
    }

    @Override
    public String getJenisUsaha() {
        return "Toko Elektronik";
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    
    public String getMerk() {
        return merk;
    }
    
    public double getHarga() {
        return harga;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public void CheckHarga(double Harga){
        System.out.println("Harga utama : " + Harga);
    }
}



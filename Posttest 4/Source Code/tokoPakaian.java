package toko;

public class tokoPakaian extends toko{
    private String jenisPakaian;
    private String ukuranTersedia;
    
    public tokoPakaian(String IdToko, String  namaToko, String lokasitoko, String jenisUsh, String daftarProd, String jenispakaian, String ukurantersedia) {
        super(IdToko, namaToko, lokasitoko, jenisUsh, daftarProd);
        this.jenisPakaian = jenispakaian;
        this.ukuranTersedia = ukurantersedia;
    }


    public String getjenisPakaian() {
        return jenisPakaian;
    }
    public String getUkuranTersedia() {
        return ukuranTersedia;
    }


    public void setjenisPakaian(String jenispakaian) {
        this.jenisPakaian = jenispakaian;
    }
    public void setukuranTersedia(String ukurantersedia) {
        this.ukuranTersedia = ukurantersedia;
    }

    @Override
    public String getjenisUsaha() {
        return "Toko Pakaian";
    }
}

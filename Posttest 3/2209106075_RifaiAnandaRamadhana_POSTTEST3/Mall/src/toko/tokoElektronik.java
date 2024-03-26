package toko;

public class tokoElektronik extends toko{
    private String jenisBarang;
    private String Merk;
    
    public tokoElektronik(String IdToko, String  namaToko, String lokasitoko, String jenisUsh, String daftarProd, String jenisbarang, String merk) {
        super(IdToko, namaToko, lokasitoko, jenisUsh, daftarProd);
        this.jenisBarang = jenisbarang;
        this.Merk = merk;
    }


    public String getjenisBarang() {
        return jenisBarang;
    }
    public String getMerk() {
        return Merk;
    }


    public void setjenisBarang(String jenisbarang) {
        this.jenisBarang = jenisbarang;
    }
    public void setMerk(String merk) {
        this.Merk = merk;
    }
}

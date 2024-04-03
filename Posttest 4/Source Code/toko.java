package toko;

public class toko {
    protected String IdToko;
    protected String namaToko;
    protected String lokasiToko;
    protected String jenisUsaha;
    protected String daftarProduk;

    public toko(String IdToko, String  namaToko, String lokasitoko, String jenisUsh, String daftarProd) {
        this.IdToko = IdToko;
        this.namaToko = namaToko;
        this.lokasiToko = lokasitoko;
        this.jenisUsaha = jenisUsh;
        this.daftarProduk = daftarProd;
    }

    public String getIdToko() {
        return IdToko;
    }
    public String getnamaToko() {
        return namaToko;
    }
    public String getlokasiToko() {
        return lokasiToko;
    }
    public String getjenisUsaha() {
        return jenisUsaha;
    }
    public String getdaftarProduk() {
        return daftarProduk;
    }


    public void setIdToko(String idToko) {
        this.IdToko = idToko;
    }
    public void setnamaToko(String NamaToko) {
        this.namaToko = NamaToko;
    }
    public void setlokasiToko(String lokasitoko) {
        this.lokasiToko = lokasitoko;
    }
    public void setjenisUsaha(String jenisUsh) {
        this.jenisUsaha = jenisUsh;
    }
    public void setdaftarProduk(String daftarProd) {
        this.daftarProduk = daftarProd;
    }

    public double diskon(double diskon){
        return diskon;
    }
    public int diskon(int diskon, int hargaawal){
        return diskon < hargaawal ? hargaawal = diskon / hargaawal : hargaawal;
    }
}

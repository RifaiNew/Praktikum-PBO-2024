package toko;

public class toko {
    private String IdToko;
    private String namaToko;
    private String lokasiToko;
    private String jenisUsaha;
    private String daftarProduk;

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
}

package toko;

public abstract class toko {
    protected String IdToko;
    protected String namaToko;
    protected String lokasiToko;
    protected String jenisUsaha;
    protected String daftarProduk;

    public toko(String IdToko, String namaToko, String lokasiToko, String jenisUsaha, String daftarProduk) {
        this.IdToko = IdToko;
        this.namaToko = namaToko;
        this.lokasiToko = lokasiToko;
        this.jenisUsaha = jenisUsaha;
        this.daftarProduk = daftarProduk;
    }
    public double diskon(double diskon){
        return diskon;
    }
    public int diskon(int diskon, int hargaawal){
        return diskon < hargaawal ? hargaawal = diskon / hargaawal : hargaawal;
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
    public void setlokasiToko(String lokasiToko) {
        this.lokasiToko = lokasiToko;
    }
    public void setjenisUsaha(String jenisUsaha) {
        this.jenisUsaha = jenisUsaha;
    }
    public void setdaftarProduk(String daftarProduk) {
        this.daftarProduk = daftarProduk;
    }
}

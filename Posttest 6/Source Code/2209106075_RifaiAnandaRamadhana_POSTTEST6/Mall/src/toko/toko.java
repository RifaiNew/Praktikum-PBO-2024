package toko;

public abstract class toko implements TokoInterface {
    protected String IdToko;
    protected String namaToko;
    protected String lokasiToko;
    protected String jenisUsaha;
    protected String daftarProduk;
    protected String TokoInterface ;

    public toko(String IdToko, String namaToko, String lokasiToko, String jenisUsaha, String daftarProduk) {
        this.IdToko = IdToko;
        this.namaToko = namaToko;
        this.lokasiToko = lokasiToko;
        this.jenisUsaha = jenisUsaha;
        this.daftarProduk = daftarProduk;
    }

    public String getIdToko() {
        return IdToko;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public String getLokasiToko() {
        return lokasiToko;
    }

    public String getJenisUsaha() {
        return jenisUsaha;
    }

    public String getDaftarProduk() {
        return daftarProduk;
    }



    public void setIdToko(String idToko) {
        this.IdToko = idToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public void setLokasiToko(String lokasiToko) {
        this.lokasiToko = lokasiToko;
    }

    public String namaMall(String namaMall) {
        return "Lembuswana";
    }

    public void setJenisUsaha(String jenisUsaha) {
        this.jenisUsaha = jenisUsaha;
    }

    public void setDaftarProduk(String daftarProduk) {
        this.daftarProduk = daftarProduk;
    }

    @Override
    public double diskon(double diskon, double harga) {
        return diskon < harga ? harga - diskon : harga;
    }
}

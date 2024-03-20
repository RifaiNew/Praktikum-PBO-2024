package toko;

public class toko {
    String IdToko;
    String namaToko;
    String jenisToko;
    String tanggalSewa;
    String tanggalAkhirSewa;
    int totalSewa;

    public toko(String IdToko, String  namaToko, String jenisToko, String tanggalSewa, String tanggalAkhirSewa,int totalSewa) {
        this.IdToko = IdToko;
        this.namaToko = namaToko;
        this.jenisToko = jenisToko;
        this.tanggalSewa = tanggalSewa;
        this.tanggalAkhirSewa = tanggalAkhirSewa;
        this.totalSewa = totalSewa;
    }

    public String getIdToko() {
        return IdToko;
    }
    public String getnamaToko() {
        return namaToko;
    }
    public String getjenisToko() {
        return jenisToko;
    }
    public String gettanggalSewa() {
        return tanggalSewa;
    }
    public String gettanggalAkhirSewa() {
        return tanggalAkhirSewa;
    }
    public int gettotalSewa() {
        return totalSewa;
    }

    public void setIdToko(String idToko) {
        IdToko = idToko;
    }
    public void setnamaToko(String NamaToko) {
        namaToko = NamaToko;
    }
    public void setjenisToko(String JenisToko) {
        jenisToko = JenisToko;
    }
    public void settanggalSewa(String TanggalSewa) {
        tanggalSewa = TanggalSewa;
    }
    public void settanggalAkhirSewa(String TanggalAkhirSewa) {
        tanggalAkhirSewa = TanggalAkhirSewa;
    }
    public void settotalSewa(int TotalSewa) {
        totalSewa = TotalSewa;
    }
}

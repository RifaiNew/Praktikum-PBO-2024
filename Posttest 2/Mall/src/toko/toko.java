package toko;

public class toko extends mall {
    private String IdToko;
    private String namaToko;
    private String jenisToko;
    private String tanggalSewa;
    private String tanggalAkhirSewa;
    private int totalSewa;

    public toko(String IdToko, String  namaToko, String jenisToko, String tanggalSewa, String tanggalAkhirSewa,int totalSewa, String idMall, String namamall) {
        super(idMall, namamall);
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
        this.IdToko = idToko;
    }
    public void setnamaToko(String NamaToko) {
        this.namaToko = NamaToko;
    }
    public void setjenisToko(String JenisToko) {
        this.jenisToko = JenisToko;
    }
    public void settanggalSewa(String TanggalSewa) {
        this.tanggalSewa = TanggalSewa;
    }
    public void settanggalAkhirSewa(String TanggalAkhirSewa) {
        this.tanggalAkhirSewa = TanggalAkhirSewa;
    }
    public void settotalSewa(int TotalSewa) {
        this.totalSewa = TotalSewa;
    }
}

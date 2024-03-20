package toko;

public class mall {
    protected String IdMall;
    protected String namaMall;

    public mall(String idmall, String  namamall) {
        this.IdMall = idmall;
        this.namaMall = namamall;
    }


    public String getIdMall() {
        return IdMall;
    }
    public String getnamaMall() {
        return namaMall;
    }


    public void setIdMall(String idMall) {
        this.IdMall = idMall;
    }
    public void setnamaMall(String NamaMall) {
        this.namaMall = NamaMall;
    }
}


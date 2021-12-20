package hobby;

import java.util.Date;

public class Oil {
    private String oilPainting;
    private int oilPicture;
    private Date oilDate;

    public String getOilPainting() {
        return oilPainting;
    }

    public void setOilPainting(String oilPainting) {
        this.oilPainting = oilPainting;
    }

    public int getOilPicture() {
        return oilPicture;
    }

    public void setOilPicture(int oilPicture) {
        this.oilPicture = oilPicture;
    }

    public Date getOilDate() {
        return oilDate;
    }

    public void setOilDate(Date oilDate) {
        this.oilDate = oilDate;
    }

    public Oil(String райдуга, int oilPicture, String s) {
    }

    public Oil(String oilPainting, int oilPicture, Date oilDate) {
        this.oilPainting = oilPainting;
        this.oilPicture = oilPicture;
        this.oilDate = oilDate;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Масляна техніка живопису{" +
                "назва картини: " + oilPainting + '\'' +
                ", номер в каталозі: " + oilPicture +
                ", дата придбання: " + oilDate +
                '}';
    }
}

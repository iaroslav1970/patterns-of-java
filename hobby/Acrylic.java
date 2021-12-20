package hobby;

import java.util.Date;

public class Acrylic {
    private String acrylicPainting;
    private int acrylicPicture;
    private Date acrylicDate;

    public String getAcrylicPainting() {
        return acrylicPainting;
    }

    public void setAcrylicPainting(String acrylicPainting) {
        this.acrylicPainting = acrylicPainting;
    }

    public int getAcrylicPicture() {
        return acrylicPicture;
    }

    public void setAcrylicPicture(int acrylicPicture) {
        this.acrylicPicture = acrylicPicture;
    }

    public Date getAcrylicDate() {
        return acrylicDate;
    }

    public void setAcrylicDate(Date acrylicDate) {
        this.acrylicDate = acrylicDate;
    }

    public Acrylic(String ранок, int acrylicPicture, String s) {
    }

    public Acrylic(String acrylicPainting, int acrylicPicture, Date acrylicDate) {
        this.acrylicPainting = acrylicPainting;
        this.acrylicPicture = acrylicPicture;
        this.acrylicDate = acrylicDate;
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
        return "Акрилова техніка живопису{" +
                "назва картини: " + acrylicPainting + '\'' +
                ", номер в каталозі: " + acrylicPicture +
                ", дата придбання: " + acrylicDate +
                '}';
    }
}

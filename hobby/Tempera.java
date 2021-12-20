package hobby;

import java.util.Date;

public class Tempera {
    private String temperaPainting;
    private int temperaPicture;
    private Date temperaDate;

    public String getTemperaPainting() {
        return temperaPainting;
    }

    public void setTemperaPainting(String temperaPainting) {
        this.temperaPainting = temperaPainting;
    }

    public int getTemperaPicture() {
        return temperaPicture;
    }

    public void setTemperaPicture(int temperaPicture) {
        this.temperaPicture = temperaPicture;
    }

    public Date getTemperaDate() {
        return temperaDate;
    }

    public void setTemperaDate(Date temperaDate) {
        this.temperaDate = temperaDate;
    }

    public Tempera(String temperaPainting, int temperaPicture, String s) {
    }

    public Tempera(String temperaPainting, int temperaPicture, Date temperaDate) {
        this.temperaPainting = temperaPainting;
        this.temperaPicture = temperaPicture;
        this.temperaDate = temperaDate;
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
        return "Темперна техніка живопису{" +
                "назва картини: " + temperaPainting + '\'' +
                ", номер в каталозі: " + temperaPicture +
                ", дата придбання: " + temperaDate +
                '}';
    }
}

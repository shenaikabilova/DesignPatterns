package shenaikabilova.creatededignpattern.prototype.zad3;

/**
 * Created by ShenaiKabilova
 */
public class Photo {
    private int number;
    private String photoName;

    public Photo(int number, String photoName) {
        this.number = number;
        this.photoName = photoName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }
}

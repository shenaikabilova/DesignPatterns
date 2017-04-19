package shenaikabilova.creatededignpattern.prototype.zad3;

import java.util.List;

/**
 * Created by ShenaiKabilova
 */
public class Album implements Cloneable{
    private String albumName;
    private List<Photo> photos;

    public Album(String albumName, List<Photo> photos) {
        this.albumName = albumName;
        this.photos = photos;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    @Override
    public Album clone() throws CloneNotSupportedException {
        //return this.clone();
        return null;
    }
}

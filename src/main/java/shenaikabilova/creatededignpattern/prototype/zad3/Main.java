package shenaikabilova.creatededignpattern.prototype.zad3;
/*Да се създаде приложение Photo Archive, за архивиране на групи от
снимки, които ще се копират в друг албум, с цел съхранение, в случай
на изтриване и възможност за възстановяването им последством оригинала.
В случая архива става съдържател на прототипи, които могат да бъдат
копирани в случай, че е необходимо.
* */
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ShenaiKabilova
 */
public class Main {
    public static void main(String[] args) {
        Photo photo1 = new Photo(1, "photo1");
        Photo photo2 = new Photo(1, "photo2");
        Photo photo3 = new Photo(1, "photo3");
        Photo photo4 = new Photo(1, "photo4");
        Photo photo5 = new Photo(1, "photo5");
        Photo photo6 = new Photo(1, "photo6");

        List<Photo> photos = new ArrayList<>();
        photos.add(photo1);
        photos.add(photo2);
        photos.add(photo3);
        photos.add(photo4);
        photos.add(photo5);
        photos.add(photo6);

        Album album1 = new Album("album1", photos);
        try {
            Album album2 = (Album) album1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

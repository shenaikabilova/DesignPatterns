package com.tu.design.pattern.shenaikabilova.singleton.zad3;
/*
* Помислете за международна авиолиния с множество сървъри,
* разположени по целия свят, които обработват резервации.
* По различно 24 часово време, някой ще са тежко натоварени а някои по-леко.
* Всеки сървър може да се запише в балансатор за натовареност,
* за да бъде добавен или премахнат временно от системата с течение на
* времето. Моделирайте тази система с балансатора за натовареност
* като Единствен.
* */
/**
 * Created by ShenaiKabilova
 */
public class Main3 {
    public static void main (String[] args) {
        Balansator balans = Balansator.balansatorGetInstance();

        Server s1 = new Server("server1", 5.32);
        Server s2 = new Server("server2", 22.00);
        Server s3 = new Server("server3", 1.05);
        Server s4 = new Server("server4", 9.00);

        balans.addServer(s1);
        balans.addServer(s2);
        balans.addServer(s3);
        balans.addServer(s4);

        balans.removerServer(s3);

        balans.getCurrentServers();
    }
}

package com.tu.design.pattern.shenaikabilova.createdesignpatterns.singleton.zad3;

/**
 * Created by ShenaiKabilova
 */
public class Server {
    private String serverName;
    private double serverCurrentTime;

    public Server(String serverName, double serverCurrentTime) {
        this.serverName = serverName;
        this.serverCurrentTime = serverCurrentTime;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public double getServerCurrentTime() {
        return serverCurrentTime;
    }

    public void setServerCurrentTime(double serverCurrentTime) {
        this.serverCurrentTime = serverCurrentTime;
    }
}

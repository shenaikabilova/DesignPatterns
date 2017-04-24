package com.tu.design.pattern.structural.proxy;

/**
 * @author Kamen on 30.04.16
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String    fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

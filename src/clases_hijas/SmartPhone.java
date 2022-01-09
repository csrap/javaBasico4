package clases_hijas;

import clases_ejercicio.SmartDevice;

public class SmartPhone extends SmartDevice {
    public boolean navigatorWeb = true;


    public SmartPhone() {

    }


    public SmartPhone(double batery, double memory, String operatingSystem, double screen, boolean camera, boolean navigatorWeb) {
        super(batery, memory, operatingSystem, screen, camera);
        this.navigatorWeb = navigatorWeb;
    }
}

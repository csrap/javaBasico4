package clases_hijas;

import clases_ejercicio.SmartDevice;


public class SmartWatch extends SmartDevice {

     public String strap;

     public SmartWatch() {

     }

    public SmartWatch(double batery, double memory, String operatingSystem, double screen, boolean camera, String strap) {
        super(batery, memory, operatingSystem, screen, camera);
        this.strap = strap;
    }
}

package clases_ejercicio;

public class SmartDevice {

    //1.- Atributos
    protected double batery;
    protected double memory;
    protected String operatingSystem;
    protected double screen;
    protected boolean camera;
    int durationBatery;

    //2.- constructores
    public SmartDevice() {

    }

    public SmartDevice(double batery, double memory, String operatingSystem, double screen, boolean camera) {
        this.batery = batery;
        this.memory = memory;
        this.operatingSystem = operatingSystem;
        this.screen = screen;
        this.camera = camera;
    }

    //3.- métodos
 public void duration (int time) {
     this.durationBatery += time;
 }


}




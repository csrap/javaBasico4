package clases_ejercicio;

import clases_hijas.SmartPhone;
import clases_hijas.SmartWatch;

public class Main {

    public static void main(String[] args) {

        // Contructor vacio
        SmartDevice googleChorns = new SmartDevice();

// Clase identificador = new Clase();
        SmartDevice tv_smart = new SmartDevice(0, 64, "Android", 32, false);
        System.out.println("------ Tv_Smart  features---------");
        System.out.println("Batery: " + tv_smart.batery + " mAh");
        System.out.println("Memory: " + tv_smart.memory + " GB");
        System.out.println("OS: " + tv_smart.operatingSystem);
        System.out.println("Screen: " + tv_smart.screen+"'");
        System.out.println("Camera: " + tv_smart.camera);


        SmartPhone iphone13 = new SmartPhone(120, 64, "IOS", 6.6, true, true);
        System.out.println("------ Iphone13  features---------");
        System.out.println("Batery: " + iphone13.batery + " mAh");
        System.out.println("Memory: " + iphone13.memory + " GB");
        System.out.println("OS: " + iphone13.operatingSystem);
        System.out.println("Screen: " + iphone13.screen+"'");
        System.out.println("Camera: " + iphone13.camera);
        System.out.println("Navigator Web: " + iphone13.navigatorWeb);

        SmartWatch galaxyWatch4 = new SmartWatch(247, 16, "Wear OS powered by Samsung", 1.36, false, "steel");
        System.out.println("------ GalaxyWatch 4  features---------");
        System.out.println("Batery: " + galaxyWatch4.batery + " mAh");
        System.out.println("Memory: " + galaxyWatch4.memory + " GB");
        System.out.println("OS: " + galaxyWatch4.operatingSystem);
        System.out.println("Screen: " + galaxyWatch4.screen+"'");
        System.out.println("Camera: " + galaxyWatch4.camera);
        System.out.println("strap: " + galaxyWatch4.strap);
    }
    }


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import gui.Lap;

/**
 *
 * @author chamu
 */
public class LapBuilder {
    
     
   private String brand;
   private String Model;
   private int ram;
   private int gpu;
   private String processor;
   private int hardDrive;
   private double screenSize;
   private boolean wifi;
   private boolean bluetooth;
   private String os;

    /**
     * @param brand the brand to set
     */
    public LapBuilder setBrand(String brand) {
        this.brand = brand;
        
        return this;
    }

    /**
     * @param Model the Model to set
     */
    public LapBuilder setModel(String Model) {
        this.Model = Model;
        
        return this;
    }

    /**
     * @param ram the ram to set
     */
    public LapBuilder setRam(int ram) {
        this.ram = ram;
        
        return this;
    }

    /**
     * @param gpu the gpu to set
     */
    public LapBuilder setGpu(int gpu) {
        this.gpu = gpu;
        
        return this;
    }

    /**
     * @param processor the processor to set
     */
    public LapBuilder setProcessor(String processor) {
        this.processor = processor;
        
        return this;
    }

    /**
     * @param hardDrive the hardDrive to set
     */
    public LapBuilder setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
        
        return this;
    }

    /**
     * @param screenSize the screenSize to set
     */
    public LapBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        
        return this;
    }

    /**
     * @param wifi the wifi to set
     */
    public LapBuilder setWifi(boolean wifi) {
        this.wifi = wifi;
        
        return this;
    }

    /**
     * @param bluetooth the bluetooth to set
     */
    public LapBuilder setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
        
        return this;
    }

    /**
     * @param os the os to set
     */
    public LapBuilder setOs(String os) {
        this.os = os;
        
        return this;
    }
    
    public Lap getLap(){
        
        return new Lap(brand, Model, ram, gpu, processor, hardDrive, screenSize, wifi, bluetooth, os);
        
        
    }
    
}

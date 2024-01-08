package com.digicl.structuraldesignpattern.bridge;

import com.digicl.structuraldesignpattern.bridge.devices.Device;
import com.digicl.structuraldesignpattern.bridge.devices.Radio;
import com.digicl.structuraldesignpattern.bridge.devices.Tv;
import com.digicl.structuraldesignpattern.bridge.remotes.AdvancedRemote;
import com.digicl.structuraldesignpattern.bridge.remotes.BasicRemote;

public class BridgeRunner {
    public static void main(String[] args) {
        testDevice(new Tv());
//        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
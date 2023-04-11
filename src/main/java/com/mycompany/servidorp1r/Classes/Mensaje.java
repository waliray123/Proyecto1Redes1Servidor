/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidorp1r.Classes;

import java.io.Serializable;

/**
 *
 * @author waliray
 */
public class Mensaje implements Serializable{
    private String MacAddressEnvio;
    private String MacAddressRecibo;
    private String Mensaje;
    private String ip;
    private long CRC32;

    public Mensaje(String MacAddressEnvio, String MacAddressRecibo, String Mensaje, String ip) {
        this.MacAddressEnvio = MacAddressEnvio;
        this.MacAddressRecibo = MacAddressRecibo;
        this.Mensaje = Mensaje;
        this.ip = ip;
    }

    public Mensaje(String MacAddressEnvio, String MacAddressRecibo, String Mensaje, String ip, long CRC32) {
        this.MacAddressEnvio = MacAddressEnvio;
        this.MacAddressRecibo = MacAddressRecibo;
        this.Mensaje = Mensaje;
        this.ip = ip;
        this.CRC32 = CRC32;
    }        

    public String getMacAddressEnvio() {
        return MacAddressEnvio;
    }

    public void setMacAddressEnvio(String MacAddressEnvio) {
        this.MacAddressEnvio = MacAddressEnvio;
    }

    public String getMacAddressRecibo() {
        return MacAddressRecibo;
    }

    public void setMacAddressRecibo(String MacAddressRecibo) {
        this.MacAddressRecibo = MacAddressRecibo;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public long getCRC32() {
        return CRC32;
    }

    public void setCRC32(long CRC32) {
        this.CRC32 = CRC32;
    }
    
    
    
}

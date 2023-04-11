/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidorp1r.Classes;

/**
 *
 * @author waliray
 */
public class Dispositivo {
    private String macAddress;
    private String ipAddress;
    private String tipoConexion;    
    private String estado;

    public Dispositivo(String macAddress, String ipAddress, String tipoConexion, String estado) {
        this.macAddress = macAddress;
        this.ipAddress = ipAddress;
        this.tipoConexion = tipoConexion;
        this.estado = estado;
    }


    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    


    
}

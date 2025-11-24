package com.mycompany.tp5;
public class Celular {
    private String imei;
    private String marca; 
    private String modelo;
    private Usuario usuario;
    private Bateria bateria;
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;}
    public String getImei() {
        return imei;}
    public void setImei(String imei) {
        if (imei != null) {
        this.imei = imei;}}
    public String getMarca() {
        return marca;}
    public void setMarca(String marca) {
        if (marca != null){
        this.marca = marca;}}
    public String getModelo() {
        return modelo;}
    public void setModelo(String modelo) {
        if (modelo != null){
        this.modelo = modelo;}}
    public Usuario getUsuario(){
        return usuario;}
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        if (usuario != null & usuario.getCelular() != this){
            usuario.setCelular(this);}}
    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + 
                ", modelo=" + modelo + ", bateria=" + bateria+"}";
    }
    
    
    
    
}

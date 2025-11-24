package com.mycompany.tp5;
public class CuentaBancaria {
    private String cbu; 
    private double saldo; 
    private Titular1 titular1;
    private ClaveSeguridad claveSeguridad;
    public CuentaBancaria(String cbu, double saldo, String codigo, 
            String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);}
    public String getCbu() {
        return cbu;}
    public void setCbu(String cbu) {
        if (cbu != null){
        this.cbu = cbu;}}
    public double getSaldo() {
        return saldo;}
    public void setSaldo(double saldo) {
        if (saldo > 0){
        this.saldo = saldo;}}
    public Titular1 getTitular1(){
        return titular1;}
    public void setTitular1(Titular1 titular1){
        this.titular1 = titular1; 
        if (titular1 != null && titular1.getCuentaBancaria() != this){
            titular1.setCuentaBancaria(this);
        }}
    public ClaveSeguridad getClaveSeguridad(){
        return claveSeguridad; }
    public void setClaveSeguridad(String codigo,String ultimaModificacion){
        if (codigo != null && ultimaModificacion != null){
            claveSeguridad.setCodigo(codigo); 
            claveSeguridad.setUltimaModificacion(ultimaModificacion);
        }}
    
    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + '}';
    }
    
    
    
}

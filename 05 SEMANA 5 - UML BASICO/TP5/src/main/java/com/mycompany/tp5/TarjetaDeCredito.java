package com.mycompany.tp5;
public class TarjetaDeCredito {
    private int numero; 
    private String fechaVencimiento; 
    private Banco banco;
    private Cliente cliente; 
    public TarjetaDeCredito(int numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;}
    
    public int getNumero() {
        return numero;}

    public void setNumero(int numero) {
        if (numero > 0){
        this.numero = numero;}}

    public String getFechaVencimiento() {
        return fechaVencimiento;}

    public void setFechaVencimiento(String fechaVencimiento) {
        if (fechaVencimiento != null){
        this.fechaVencimiento = fechaVencimiento;}}
    
    public Cliente getCliente(){
        return cliente;}
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaDeCredito() != this){
            cliente.setTarjetaDeCredito(this); }}
    
    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" 
                + fechaVencimiento + ", Banco=" + banco + '}';
    }
    
    
}

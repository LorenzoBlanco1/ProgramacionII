package com.mycompany.tp5;
public class Reserva {
    private String fecha; 
    private String hora;
    private Mesa mesa;
    private Cliente2 cliente2; 
    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;}
    public String getFecha() {
        return fecha;}
    public void setFecha(String fecha) {
        if (fecha != null){
        this.fecha = fecha;}}
    public String getHora() {
        return hora;}
    public void setHora(String hora) {
        if (hora != null){
        this.hora = hora;}}
    public Cliente2 getCliente2(){
        return cliente2;}
    public void setCliente2(Cliente2 cliente2){
        if (cliente2 != null){
            this.cliente2 = cliente2;}
        else {System.out.println("El cliente no existe!");}}
    public Mesa getMesa(){
        return mesa; }
    
    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + '}';
    }

    
    
    
}

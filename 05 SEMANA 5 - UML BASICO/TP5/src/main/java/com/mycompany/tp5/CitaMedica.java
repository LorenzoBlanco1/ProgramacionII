package com.mycompany.tp5;
public class CitaMedica {
    private String fecha; 
    private String hora;
    private Paciente paciente; 
    private Profesional profesional;
    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;}

    public String getFecha() {
        return fecha;}

    public void setFecha(String fecha) {
        if (fecha != null){
        this.fecha = fecha;}}

    public String getHora() {
        return hora;}

    public void setHora(String hora) {
        if (hora != null){
            this.hora = hora;
        }}

    public Paciente getPaciente(){
        return paciente;}
    
    public void setPaciente(Paciente paciente){
        if (paciente != null){
           this.paciente = paciente;}}
    public Profesional getProfesional(){
        return profesional;}
    public void setProfesional(Profesional profesional){
        if (profesional != null){
            this.profesional = profesional;}}
    
    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + '}';
    }
    
    
    
}

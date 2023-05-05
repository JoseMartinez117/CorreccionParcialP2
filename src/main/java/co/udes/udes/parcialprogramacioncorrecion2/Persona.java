/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.udes.udes.parcialprogramacioncorrecion2;

/**
 *
 * @author LabSispc13
 */
public class Persona {
    private String nombre;
    private String dni;
    private String num;

    public Persona() {
    }

    public Persona(String nombre, String dni, String num) {
        this.nombre = nombre;
        this.dni = dni;
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String GetAllP() {
        return "nombre=" + nombre + ", dni=" + dni + ", num=" + num+", ";
    }
    
}

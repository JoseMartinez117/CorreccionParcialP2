/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.udes.udes.parcialprogramacioncorrecion2;

/**
 *
 * @author LabSispc13
 */
public class Cliente extends Persona{

    public Cliente() {
    }

    public Cliente(String nombre, String dni, String num) {
        super(nombre, dni, num);
    }

    @Override
    public String toString() {
        return "Cliente{" +super.GetAllP()+'}';
    }
    
    
}

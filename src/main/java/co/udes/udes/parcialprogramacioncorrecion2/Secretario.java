/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.udes.udes.parcialprogramacioncorrecion2;

import java.util.ArrayList;

/**
 *
 * @author LabSispc13
 */
public class Secretario extends Empleado{
    private String numFax;

    public Secretario() {
    }

    public Secretario(String numFax, String direccion, String años, double salario, ArrayList mySupervisor, String nombre, String dni, String num) {
        super(direccion, años, salario, mySupervisor, nombre, dni, num);
        this.numFax = numFax;
        incrementarSalario(salario, años);
    }

   

    @Override
    public void incrementarSalario(double salario, String años) {
        super.incrementarSalario(salario, años); 
        double porcen = 0.05;
        
    }
    
    public String getNumFax() {
        return numFax;
    }

    public void setNumFax(String numFax) {
        this.numFax = numFax;
    }

    public String getSec(){
        return"Secretarip{"+super.GetAllE()+", numFax= "+numFax+'}';
    }
    
    @Override
    public String toString() {
        return "Secretario{"+super.GetAllE()+ "numFax=" + numFax + '}';
    }
    
}

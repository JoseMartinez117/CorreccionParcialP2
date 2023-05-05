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
public class Empleado extends Persona{
    private String direccion;
    private String años;
    private double salario;
    private ArrayList mySupervisor;

    public Empleado() {
    }

    public Empleado(String direccion, String años, double salario, ArrayList mySupervisor, String nombre, String dni, String num) {
        super(nombre, dni, num);
        this.direccion = direccion;
        this.años = años;
        this.salario = salario;
        this.mySupervisor = mySupervisor;
        
    }

    public Empleado(String direccion, String años, double salario, String nombre, String dni, String num) {
        super(nombre, dni, num);
        this.direccion = direccion;
        this.años = años;
        this.salario = salario;
    }
    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAños() {
        return años;
    }

    public void setAños(String años) {
        this.años = años;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList getSupervisor() {
        return mySupervisor;
    }

    public void setSupervisor(ArrayList supervisor) {
        this.mySupervisor = mySupervisor;
    }

    
    public String GetAllE() {
        return super.GetAllP() + ", direccion=" + direccion + ", anios=" + años + ", salario=" + salario + ", supervisor=" + mySupervisor + '}';
    }
    
    public String NotSuperviser() {
        return super.GetAllP() + ", direccion=" + direccion + ", anios=" + años + ", salario=" + salario + '}';
    }

    @Override
    public String toString() {
        return "Empleado{"+ super.GetAllP() + "direccion=" + direccion + ", Year=" + años + ", salario=" + salario + ", \n[mySupervisor=" + mySupervisor+ "]"+'}';
    }
    
    
    public void incrementarSalario(double salario, String años){
        System.out.println("Se ha incrementado el salario en base a los años de antiguedad");
        int aux=Integer.parseInt(años);
        double porcen = 1;
        for(int i=0; i<aux; i++){
            salario+=salario*porcen;
        } 
    }
    
    public void cambiarSup(ArrayList supervisor, int index, ArrayList change){
        this.mySupervisor=supervisor;
        supervisor.get(index);
        supervisor.set(index, change);
        supervisor.remove(index);
    }
   
    
    
}

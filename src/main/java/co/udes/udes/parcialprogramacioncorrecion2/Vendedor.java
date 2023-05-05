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
public class Vendedor extends Empleado{
    private String celular;
    private String areavent;
    private Carro myCarro;
    private ArrayList<String> clientes;
    private String comision;

    public Vendedor() {
    }

    public Vendedor(String celular, String areavent, Carro myCarro, ArrayList<String> clientes, String comision, String direccion, String años, double salario, ArrayList mySupervisor, String nombre, String dni, String num) {
        super(direccion, años, salario, mySupervisor, nombre, dni, num);
        this.celular = celular;
        this.areavent = areavent;
        this.myCarro = myCarro;
        this.clientes = clientes;
        this.comision = comision;
        incrementarSalario(salario, años);
        cambiar();
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getAreavent() {
        return areavent;
    }

    public void setAreavent(String areavent) {
        this.areavent = areavent;
    }

    public Carro getMyCarro() {
        return myCarro;
    }

    public void setMyCarro(Carro myCarro) {
        this.myCarro = myCarro;
    }

    public ArrayList<String> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<String> clientes) {
        this.clientes = clientes;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Vendedor{"+ super.GetAllE() + "celular=" + celular + ", areavent=" + areavent + ", myCarro=" + myCarro.GetCarro() + ", clientes=" + clientes + ", comision=" + comision + '}';
    }

    @Override
    public void incrementarSalario(double salario, String años) {
        super.incrementarSalario(salario, años);
        double porcen = 0.10;
    }
    
    //Agregar cliente, eliminar cliente, cambiar carro
    
    public void cambiar(){
        this.myCarro.setMarca("Renault");
        this.myCarro.setModelo("StepWay");
        this.myCarro.setPlaca("Ded117");
    }
    
    
}

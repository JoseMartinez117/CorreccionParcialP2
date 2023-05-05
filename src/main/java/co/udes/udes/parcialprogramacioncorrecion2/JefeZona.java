/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.udes.udes.parcialprogramacioncorrecion2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class JefeZona extends Empleado{
    private String despacho;
    private Secretario mySecretario;
    private ArrayList<String> vendedores;
    private Carro myCarro;

    public JefeZona() {
    }

    public JefeZona(String despacho, Secretario mySecretario, ArrayList<String> vendedores, Carro myCarro, String direccion, String años, double salario, String nombre, String dni, String num) {
        super(direccion, años, salario, nombre, dni, num);
        this.despacho = despacho;
        this.mySecretario = mySecretario;
        this.vendedores = vendedores;
        this.myCarro = myCarro;
        incrementarSalario(salario, años);
        cambiar();
        secretaria();
    }

    
 

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public Secretario getMySecretario() {
        return mySecretario;
    }

    public void setMySecretario(Secretario mySecretario) {
        this.mySecretario = mySecretario;
    }

    public ArrayList<String> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<String> vendedores) {
        this.vendedores = vendedores;
    }

    public Carro getMyCarro() {
        return myCarro;
    }

    public void setMyCarro(Carro myCarro) {
        this.myCarro = myCarro;
    }

    @Override
    public String toString() {
        return "JefeZona{"+ super.NotSuperviser()+ ", despacho=" + despacho + ", mySecretario=" + mySecretario.getSec() + ", vendedores=" + vendedores + ", myCarro=" + myCarro.GetCarro() + '}';
    }

    
    

    @Override
    public void incrementarSalario(double salario, String años) {
        super.incrementarSalario(salario, años);
        double porcen = 0.20;
    }
    

    public void cambiar(){
        this.myCarro.setMarca("Renault");
        this.myCarro.setModelo("StepWay");
        this.myCarro.setPlaca("Ded117");
    }
    
    public void secretaria(){
    this.mySecretario.setNombre("Claudia");
    this.mySecretario.setDni("124345");
    this.mySecretario.setAños("3");
    this.mySecretario.setDireccion("Oficina Norte");
    this.mySecretario.setNum("3132089123");
    this.mySecretario.setNumFax("6778080");
    this.mySecretario.setSalario(3000000);
    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.udes.udes.parcialprogramacioncorrecion2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LabSispc13
 */
public class ParcialProgramacionCorrecion2 {

    public static void main(String[] args){
       
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Empleado> storageEmployee = new ArrayList();
        ArrayList<String> storageSecretary = new ArrayList();
        ArrayList<String> storageSaller = new ArrayList();
        ArrayList<String> storageZoneBoss = new ArrayList();
        ArrayList<String> storageSupervisor = new ArrayList();
        ArrayList<String> storageCustomer = new ArrayList();
        ArrayList<String> storageCar = new ArrayList();
        
       
        
        int menu, submenu;
        String x="";
        
        Empleado myEmployee = new Empleado("Estacion central", "3", 3000000, "Jose", "1093293324", "3132078101");
        storageSupervisor.add(myEmployee.NotSuperviser());
        
        Carro myCar = new Carro("IND777", "Toyota", "AE86");
        storageCar.add(myCar.GetCarro());
        
        Cliente myCustomer = new Cliente("Juan", "1093293327", "3132078109");
        storageCustomer.add(myCustomer.toString());
        
        Secretario mySecretary = new Secretario("5776060","Estacion central", "3", 3000000, storageSupervisor,"Juana", "1093293327", "3132078106");
        storageSecretary.add(mySecretary.toString());
        
        while(true){
            System.out.println("Con que desea tabajar el dia de hoy?");
            System.out.println("1->Empleado");
            System.out.println("2->Secretario");
            System.out.println("3->Vendedor");
            System.out.println("4->JefeZona");
            System.out.println("0->Salir");
            int y = keyboard.nextInt();
            
            if(y==1){
             x="Empleado";
            }
            if(y==2){
             x="Secretario";
            }
            if(y==3){
             x="Vendedor";
            }
            if(y==4){
             x="JefeZona";
            }
            if(y==0){
                System.out.println("Gracias por usar el programma");
                System.exit(0);
            }

            submenu=Submenu(keyboard, x);

            switch(submenu){
                case 0:
                 System.out.println("Volviendo al menu \n");

                 break;
                case 1:
                    if(x.equals("Empleado")){
                        storageEmployee = Add(keyboard, x, storageEmployee,  storageSupervisor, myCar, mySecretary,storageCar);
                    }
                    if(x.equals("Secretario")){
                        storageSecretary = Add(keyboard, x, storageSecretary, storageSupervisor, myCar, mySecretary,storageCar);
                    }
                    if(x.equals("Vendedor")){
                        storageSaller = Add(keyboard, x, storageSaller,  storageSupervisor, myCar, mySecretary ,storageCustomer);
                    }
                    if(x.equals("JefeZona")){
                        storageZoneBoss = Add(keyboard, x, storageZoneBoss, storageSecretary, myCar, mySecretary, storageSaller);
                    }

                    break;
                case 2:
                    if(x.equals("Empleado")){
                        storageEmployee = Delete(storageEmployee, keyboard, x, storageSupervisor);
                    }
                    if(x.equals("Secretario")){
                        storageSecretary = Delete(storageSecretary, keyboard, x, storageSupervisor);
                    }
                    if(x.equals("Vendedor")){
                        storageSaller = Delete(storageSaller, keyboard, x, storageSupervisor);
                    }
                    if(x.equals("JefeZona")){
                        storageZoneBoss = Delete(storageZoneBoss, keyboard, x, storageSupervisor);
                    }
                    break;
                case 3:
                    if(x.equals("Empleado")){
                        Show(storageEmployee);
                    }
                    if(x.equals("Secretario")){
                        Show(storageSecretary);
                    }
                    if(x.equals("Vendedor")){
                        Show(storageSaller);
                    }
                    if(x.equals("JefeZona")){
                       Show(storageZoneBoss);
                    }

                    break;
                case 4:
                    if(x.equals("Empleado")){
                        Change(storageEmployee, keyboard, x, storageSupervisor, myEmployee);
                    }
                    if(x.equals("Secretario")){
                        Change(storageSecretary, keyboard, x, storageSupervisor, myEmployee);
                    }
                    if(x.equals("Vendedor")){
                       Change(storageSaller, keyboard, x, storageSupervisor, myEmployee);
                    }
                   

                    break;
                case 5:
                    if(x.equals("Vendedor")){
                        Vendedor mySaller = new Vendedor();
                        mySaller.cambiar();
                    }
                    if(x.equals("JefeZona")){
                       JefeZona ZoneBoss= new JefeZona();
                       ZoneBoss.cambiar();
                    }

                    break;
                    
                case 6:
                    if(x.equals("vendedor")){
                        storageCustomer = List (keyboard, x, storageCustomer);
                    }else{
                     JefeZona ZoneBoss = new JefeZona();
                     ZoneBoss.secretaria();
                    }
                    
                    break;

                default:
                    System.out.println("Selecciono de manera erronea");
                    System.out.println("Gracias por usar la aplicacion");
                    break;
            }
        }
        
       
       
        
    }
   
    
  public static int Submenu(Scanner keyboard, String x){
        System.out.println("\nBienvenido al submenu "+x);
        System.out.println("Que le gustaria hacer el dia de hoy?");
        System.out.println("1->Agregar "+x);
        System.out.println("2->Eliminar "+x);
        System.out.println("3->Ver "+x);
        System.out.println("4->Cambiar de Supervisor");
        
        if(x.equals("Vendedor") || x.equals("JefeZona")){
            System.out.println("5->Cambiar Carro");
            System.out.println("6->Modificar lista clientes");
        }
        if(x.equals("JefeZona")){
            System.out.println("6->Cambiar de Secretario");
        }    
        System.out.println("0->Salir");
        return keyboard.nextInt();
        
    }
    
  public static ArrayList Add(Scanner keyboard, String x, ArrayList storage, ArrayList storageSup, Carro myCar, Secretario mySecretary ,ArrayList list){     
        int cycles;   
        System.out.println("Cuantos "+x+" quieres agregar?");
        cycles = keyboard.nextInt();
        
        System.out.println("Recuerda que todos los nuevos "+x+" tendran como supervisor a Jose");
        if(x.equals("Vendedor") || x.equals("JefeZona")){
            System.out.println("El carro que se el es entrega a todos los nuevos es el Toyota AE86");
        }
        
        for(int i=0; i<cycles; i++){ 
            System.out.println("Ingrese los siguientes datos");
            System.out.print("Nombre: ");
            String name = keyboard.next();
            System.out.print("DNI: ");
            String dni = keyboard.next();
            System.out.print("Telefono: ");
            String num = keyboard.next();
            System.out.print("Salario: ");
            double salary = keyboard.nextDouble();
            System.out.print("Años de estancia: ");
            String age = keyboard.next();
            int aux=Integer.parseInt(age);
            System.out.print("Direccion: ");
            String direc = keyboard.next();
            keyboard.next();
            
            if(!x.equals("JefeZona")){
                System.out.println("Supervisor: Jose");
            }
            
            if(x.equals("Empleado")){                                               
                Empleado myEmployee = new Empleado(direc, age, salary, storageSup, name, dni, num);
                storage.add(myEmployee.toString());
            }  
            
            
            
            if(x.equals("Secretario")){
                System.out.print("Numero de Fax: ");
                String fax = keyboard.next();
                mySecretary = new Secretario(fax, direc, age, salary, storageSup, name, dni, num);
                storage.add(mySecretary.toString());
            }
            
            if(x.equals("Vendedor")){
                //String celular, String areavent, Carro myCarro, ArrayList<String> clientes, String comision, String direccion, String años, double salario, Supervisor mySupervisor, String nombre, String dni, String num
                System.out.print("Area de venta: ");
                String saleArea = keyboard.nextLine();
                keyboard.next();
                System.out.print("Numero de celular: ");
                String cell = keyboard.next();
                System.out.print("% Comision: ");
                String commission = keyboard.next();
                
                Vendedor mySaller = new Vendedor(cell, saleArea, myCar, list, commission, direc, age, salary, storageSup, name, dni, num);
                storage.add(mySaller.toString());     
            }
            
            if(x.equals("JefeZona")){
                //String despacho, Secretario mySecretario, ArrayList<String> vendedores, Carro myCarro
                System.out.print("Despacho: ");
                String dispatch = keyboard.nextLine();
                keyboard.next();
                System.out.println(storageSup.get(0)); //Mostrar Secretario
                JefeZona myZoneBoss= new JefeZona(dispatch, mySecretary, list, myCar, direc, age, salary, name, dni, num);
                storage.add(myZoneBoss.toString());
                
            }
          
            if(aux>=3){
              Empleado myEmployee = new Empleado(direc, age, salary, name, dni, num);
              storageSup.add(myEmployee.NotSuperviser());
            }
            
            
        }
       
      
       
       return storage;
   }
       
  public static ArrayList Delete(ArrayList storage, Scanner keyboard, String x, ArrayList list){
       
      System.out.println("Que elemento deseas remover de los datos de "+x);
       for(int i=0; i<storage.size(); i++){
           System.out.println("En la posicion "+i+" se encuentra "+storage.get(i));
       }
       System.out.println("Recuerda que los elementos van del 0 hasta N numero");
       int delete=keyboard.nextInt();
       
       int z=0;
       
       for(int j=0; j<storage.size(); j++){
           if(storage.get(delete).equals(list.get(j))){
               z=j;
               break;
           } 
       }
       
       list.remove(z);
       storage.remove(delete);
       
       return storage;
   }
   
  public static void Show(ArrayList storage){
       System.out.println("");
       for(int i=0; i<storage.size(); i++){
           System.out.println("En la poscicion "+i+" se encuentra: \n"+storage.get(i));
       }
   } 
  
  public static void Change(ArrayList storage, Scanner keyboard, String x, ArrayList list, Empleado empleado){
      
      
      System.out.println("Estos son los "+x+" actuales");
      for(int i=0; i<storage.size(); i++){
           System.out.println("En la posicion "+i+" se encuentra "+storage.get(i));
       }
      int select = keyboard.nextInt();
      System.out.println(" ");
      System.out.println("Estos son los supervisores disponibles ");
       for(int i=0; i<list.size(); i++){
           System.out.println("En la posicion "+i+" se encuentra "+list.get(i));
       }
       int change=keyboard.nextInt();
       
      empleado.cambiarSup(list, change, storage);
     
      
  }
  
   public static ArrayList List(Scanner keyboard, String x, ArrayList list){
       System.out.println("Que desea realizar?");
       System.out.println("1->Agregar");
       System.out.println("2->Eliminar");
       int desicion = keyboard.nextInt();
    
       if(desicion==1){
        int cycles=0;
         
        System.out.println("Cuantos clientes desea agregar?");
        cycles = keyboard.nextInt();

         for(int i=0; i<cycles; i++){
             System.out.println("Ingrese los siguientes datos");
             System.out.print("Nombre: ");
             String name = keyboard.next();
             System.out.print("DNI: ");
             String dni = keyboard.next();
             System.out.print("Telefono: ");
             String num = keyboard.next();

            Cliente myCostumer = new Cliente(name, dni, num);
            list.add(myCostumer);
         }    
         
       }else if(desicion==2){
           System.out.println("Que elemento deseas remover de los datos de clientes");
            for(int i=0; i<list.size(); i++){
           System.out.println("En la posicion "+i+" se encuentra "+list.get(i));
            }
            System.out.println("Recuerda que los elementos van del 0 hasta N numero");
            int delete=keyboard.nextInt();
            
            list.remove(delete);
        }
       
       
       
   return list;
   }
   
   
   
   
}

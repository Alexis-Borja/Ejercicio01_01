/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio0101;

/**
 *
 * @author Usuario
 */
public class Ejercicio0101 {

    public static void main(String[] args) {
        //CLASE AUTO
        Auto sail=new Auto();
        sail.modelo="2015";
        sail.color="plomo";
        sail.marca="chevrolet";
        sail.kilometraje=15000;
        
        System.out.println("CLASE AUTO");
        System.out.println("Marca: "+sail.marca);
        System.out.println("Color: "+sail.color);
        System.out.println("Modelo: "+sail.modelo);
        System.out.println("Kilometraje: "+sail.kilometraje);
        
        sail.enciende();
        sail.acelera();
        sail.frena();
        
        //CLASE PERRO
        gato esfinge=new gato();
        esfinge.color="Cafe";
        esfinge.dueño="Bryan";
        esfinge.marca="esfinge";
        esfinge.edad=1;
        
        System.out.println("CLASE PERRO");
        System.out.println("Marca: "+esfinge.marca);
        System.out.println("Color: "+esfinge.color);
        System.out.println("Su dueno se llama: "+esfinge.dueño);
        System.out.println("Edad del gato: "+esfinge.edad+" ano");
        
        esfinge.gatomini();
        esfinge.gatoalto();
        
        //CLASE ESCUELA
        escuela prepa=new escuela();
        prepa.ndirector="Ing.Eduardo Pinos";
        prepa.nestudiantes=400;
        prepa.nprofesores=80;
        prepa.ubicacion="Totoracocha";
        
        System.out.println("CLASE ESCUELA");
        System.out.println("Nombre del directos: "+prepa.ndirector);
        System.out.println("Numero de estudiantes: "+prepa.nestudiantes);
        System.out.println("Numero de profesores: "+prepa.nprofesores);
        System.out.println("Ubicacion: "+prepa.ubicacion);
        
        //CLASE TRANSPORTE
        transporte bus=new transporte();
        bus.marca="Hino";
        bus.ruta="Cuenca-Guayaquil";
        bus.modelo=2008;
        bus.nasientos=45;
        
        System.out.println("CLASE TRANSPORTE");
        System.out.println("Marca del bus: "+bus.marca);
        System.out.println("Ruta del bus: "+bus.ruta);
        System.out.println("Modelo del bus: "+bus.modelo);
        System.out.println("Asientos maximos: "+bus.nasientos);
        
        //CLASE TAMAÑO
        tamaño estudiante=new tamaño();
        estudiante.nombre="David";
        estudiante.apellido="Asitimbay";
        estudiante.edad=13;
        estudiante.altura=168;
        
        System.out.println("CLASE TAMANO");
        System.out.println("Nombre del estudiante: "+estudiante.nombre);
        System.out.println("Apellido del estudiante: "+estudiante.apellido);
        System.out.println("Edad del estudiante: "+estudiante.edad+" anos");
        System.out.println("Altura del estudiante: "+estudiante.altura+"cm");
    }
}

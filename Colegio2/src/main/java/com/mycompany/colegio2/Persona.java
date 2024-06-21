
package com.mycompany.colegio2;


public class Persona {
    
    private String nombre;
    private String paterno;
    private String materno;
    private String nacionalidad;
    private int edad;

    public Persona() {
        
        this.nombre = " ";
        this.paterno = " ";
        this.materno = " ";
        this.nacionalidad = " ";
        this.edad = 0;
        
    }

    public Persona(String nombre, String paterno, String materno, 
            String nacionalidad, int edad) {
        
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        
    }
    
    
    // sets

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    // gets

    public String getNombre() {
        return this.nombre;
    }

    public String getPaterno() {
        return this.paterno;
    }

    public String getMaterno() {
        return this.materno;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public int getEdad() {
        return this.edad;
    }

    
    public void Mostrar(){
        
        System.out.println("Nombre: " + this.nombre);
        System.out.println("\nApellido paterno: " + this.paterno);
        System.out.println("\nApellido materno: " + this.materno);
        System.out.println("\nNacionalidad: " + this.nacionalidad);
        System.out.println("\nEdad: " + this.edad);
    }
    
    
@Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido paterno: " + paterno + "\nApellido materno: " 
                + materno + "\nNacionalidad:" + nacionalidad + "\nEdad:" + edad;
    }
    
    
    
}


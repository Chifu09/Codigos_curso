
package com.mycompany.colegio2;


public class Profesores {
    
    Persona personita;
    
    private String materia;
    private int no_empleado;

    public Profesores() {
        
        this.personita = new Persona();
        this.materia = " ";
        this.no_empleado = 0;
        
    }

    public Profesores(String nombre, String paterno, String materno, 
            String nacionalidad, int edad, String materia, int no_empleado) {
        
        this.personita = new Persona(nombre, paterno, materno, nacionalidad, edad);
        this.materia = materia;
        this.no_empleado = no_empleado;
        
    }

    public Profesores(Persona personita, String materia, int no_empleado) {
        
        this.personita = personita;
        this.materia = materia;
        this.no_empleado = no_empleado;
        
    }
    
    
        // sets
    
        public void setNombre(String nombre) {
            this.personita.setNombre(nombre);
        }

        public void setPaterno(String paterno) {
            this.personita.setPaterno(paterno);
        }

        public void setMaterno(String materno) {
            this.personita.setMaterno(materno);
        }

        public void setNacionalidad(String nacionalidad) {
            this.personita.setNacionalidad(nacionalidad);
        }

        public void setEdad(int edad) {
            this.personita.setEdad(edad);
        }

        public void setPersonita(Persona personita) {
            this.personita = personita;
        }

        public void setMateria(String materia) {
            this.materia = materia;
        }

        public void setNo_empleado(int no_empleado) {
            this.no_empleado = no_empleado;
        }
    
        
        // gets
        
        public String getNombre(){
            return this.personita.getNombre();
        }

        public String getPaterno() {
            return this.personita.getPaterno();
        }

        public String getMaterno() {
            return this.personita.getMaterno();
        }

        public String getNacionalidad() {
            return this.personita.getNacionalidad();
        }

        public int getEdad() {
            return this.personita.getEdad();
        }

        public Persona getPersonita() {
            return personita;
        }

        public String getMateria() {
            return materia;
        }

        public int getNo_empleado() {
            return no_empleado;
        }
        
        public void Mostrar(){
    
            System.out.println("Nombre: " + this.personita.getNombre());
            System.out.println("Apellido paterno: " + this.personita.getPaterno());
            System.out.println("Apellido materno: " + this.personita.getMaterno());
            System.out.println("Nacionalidad: " + this.personita.getNacionalidad());
            System.out.println("Edad: " + this.personita.getEdad());
            System.out.println("Materia impatida: " + this.materia);
            System.out.println("Numero de empleado: " + this.no_empleado);
    
        }
        
        
@Override
    public String toString(){  
        return "(" + this.personita.getNombre() + ", "+ this.personita.getPaterno()
                + ", "+ this.personita.getMaterno() + ", "+ this.personita.getNacionalidad() + ", " 
                + this.getEdad() + ", "+ this.materia + ", "+ this.no_empleado + ")" ; 
    }
        
    
}


package com.mycompany.colegio2;


public class Alumnos {
    
    Persona personita;
    
    private int boleta;
    private int grupo;

    public Alumnos() {
        
        this.personita = new Persona();
        this.boleta = 0;
        this.grupo = 0;
        
    }

    public Alumnos(String nombre, String paterno, String materno, 
            String nacionalidad, int edad, int boleta, int grupo) {
        
        this.personita = new Persona(nombre, paterno, materno, nacionalidad, edad);
        this.boleta = boleta;
        this.grupo = grupo;
        
    }

    public Alumnos(Persona personita, int boleta, int grupo) {
        
        this.personita = personita;
        this.boleta = boleta;
        this.grupo = grupo;
        
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
        
        public void setPersonita(Persona personita){
            this.personita = personita;
        }
        
        public void setBoleta(int boleta) {
            this.boleta = boleta;
        }

        public void setGrupo(int grupo) {
            this.grupo = grupo;
        }

            
        //gets
        
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

        public int getBoleta() {
            return this.boleta;
        }

        public int getGrupo() {
            return this.grupo;
        }
    
        public Persona getPersonita() {
            return this.personita;
        }

        
        public void Mostrar(){
    
            System.out.println("Nombre: " + this.personita.getNombre());
            System.out.println("Apellido paterno: " + this.personita.getPaterno());
            System.out.println("Apellido materno: " + this.personita.getMaterno());
            System.out.println("Nacionalidad: " + this.personita.getNacionalidad());
            System.out.println("Edad: " + this.personita.getEdad());
            System.out.println("Boleta: " + this.boleta);
            System.out.println("Grupo: " + this.grupo);
    
        }
        
        
@Override
    public String toString(){  
        return "(" + this.personita.getNombre() + ", "+ this.personita.getPaterno()
                + ", "+ this.personita.getMaterno() + ", "+ this.personita.getNacionalidad() + ", " 
                + this.getEdad() + ", "+ this.boleta + ", "+ this.grupo + ")" ; 
    }
    
}

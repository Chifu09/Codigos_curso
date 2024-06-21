
package com.mycompany.colegio2;


public class Directivos {
    
    Persona personita;
    
    private String puesto;
    private int clave;

    public Directivos() {
        
        this.personita = new Persona();
        this.puesto = " ";
        this.clave = 0;
        
    }

    public Directivos(String nombre, String paterno, String materno, 
            String nacionalidad, int edad, String puesto, int clave) {
        
        this.personita = new Persona(nombre, paterno, materno, nacionalidad, edad);
        this.puesto = puesto;
        this.clave = clave;
        
    }

    public Directivos(Persona personita, String puesto, int clave) {
        
        this.personita = personita;
        this.puesto = puesto;
        this.clave = clave;
        
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

        public void setPuesto(String puesto) {
            this.puesto = puesto;
        }

        public void setClave(int clave) {
            this.clave = clave;
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

        public String getPuesto() {
            return puesto;
        }

        public int getClave() {
            return clave;
        }
        
        
        public void Mostrar(){
    
            System.out.println("Nombre: " + this.personita.getNombre());
            System.out.println("Apellido paterno: " + this.personita.getPaterno());
            System.out.println("Apellido materno: " + this.personita.getMaterno());
            System.out.println("Nacionalidad: " + this.personita.getNacionalidad());
            System.out.println("Edad: " + this.personita.getEdad());
            System.out.println("Puesto que ocupa: " + this.puesto);
            System.out.println("Clave de empleado: " + this.clave);
    
        }
        
        
@Override
    public String toString(){  
        return "(" + this.personita.getNombre() + ", "+ this.personita.getPaterno()
                + ", "+ this.personita.getMaterno() + ", "+ this.personita.getNacionalidad() + ", " 
                + this.getEdad() + ", "+ this.puesto + ", "+ this.clave + ")" ; 
    }
        
}


package com.mycompany.colegio2;
//import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileReader;

public class Colegio2 {
    
    static Alumnos [] alum = new Alumnos[5];
    static Profesores [] profe = new Profesores[5];
    static Directivos [] direc = new Directivos[5];
    
    public int aleatorio(int limite){
        return (int) (random() * limite);
    }
    
    public void escribir (String NArchivo)
            throws IOException
    {
        File archivo;
        archivo = new File(NArchivo);
        
            FileWriter FW = new FileWriter(archivo);
            FW.write("Nombre,ApellidoPaterno,ApellidoMaterno\n");
            for(int i = 0; i < alum.length; i++){
                FW.write(alum[i].getNombre() + ",");
                FW.write(alum[i].getPaterno() + ",");
                FW.write(alum[i].getMaterno() + ",");
                FW.write(alum[i].getNacionalidad()+ ",");
                FW.write(alum[i].getEdad() + ",");
                FW.write(alum[i].getBoleta() + ",");
                FW.write(alum[i].getGrupo() + "\n");
            }
            FW.close();  
    }       
    
    public void cerrarArchivo(FileWriter Archivo)
            throws IOException
    {
        Archivo.close();
    }
    
    public void leer(String NArchivo)
            throws IOException,NumberFormatException
    {
        String texto = "";
        
        File archivo;
        archivo = new File(NArchivo);
        FileReader FR = new FileReader(archivo);
        int valor = FR.read();
            while(valor != -1){
                System.out.print((char) valor);     // desplegado
                texto = texto + ((char) valor);
                valor = FR.read();
            }
            FR.close();
//            System.out.println(texto);
            
            String [] registros = texto.split("\n");     // el metodo split corta el string
//            System.out.println(Arrays.toString(registros));
            
//            System.out.println(registros[0]);
            for(int i = 1; i < registros.length; i++){
                String [] mitad = registros[i].split(",");
                System.out.println(Arrays.toString(mitad));     //desplegado
                
                alum = Arrays.copyOf(alum, alum.length + 1);  

                alum[alum.length -1] = new Alumnos(mitad[0], mitad[1], mitad[2], 
                        mitad[3], Integer.parseInt(mitad[4]), 
                        Integer.parseInt(mitad[5]), Integer.parseInt(mitad[6]));
            }
//            String [] mitad = registros[0].split(",");
//            System.out.println(Arrays.toString(mitad));
    }
    
    public void leerB(String NArchivo)
            throws IOException,NumberFormatException
    {
        String texto = "";
        
        File archivo;
        archivo = new File(NArchivo);
        FileReader FR = new FileReader(archivo);
        BufferedReader Br = new BufferedReader(FR);
//        Alumnos [] alum = new Alumnos[0];
        String line;
        line = Br.readLine();
        
        while((line = Br.readLine()) != null){
            if(!line.equals("")){
                if(line.charAt(0) != '#'){
                    alum = Arrays.copyOf(alum, alum.length + 1); 
                    String[] est = line.split("," , -1);

                    alum[alum.length -1] = new Alumnos(est[0], est[1], est[2], 
                            est[3], Integer.parseInt(est[4]), 
                            Integer.parseInt(est[5]), Integer.parseInt(est[6]));     // aqui creo el objeto alum y lo guardo
                }
            }/*else{
                Br.close();2
           
                throw new IOException("Espacio en blanco");
            }*/
        }
           
        Br.close();
        
    }
    
    public void leerProf(String NArchivo)
            throws IOException,NumberFormatException
    {
        String texto = "";
        
        File archivo;
        archivo = new File(NArchivo);
        FileReader FR = new FileReader(archivo);
        BufferedReader PR = new BufferedReader(FR);

        String line;
        line = PR.readLine();
        
        while((line = PR.readLine()) != null){
            if(!line.equals("")){
                if(!line.trim().startsWith("@")){
                    profe = Arrays.copyOf(profe, profe.length + 1); 
                    String[] est = line.split("," , -1);

                    profe[profe.length -1] = new Profesores(est[0], est[1], est[2], 
                            est[3], Integer.parseInt(est[4]), 
                            (est[5]), Integer.parseInt(est[6]));     // aqui creo el objeto alum y lo guardo
                }
            }/*else{
                Br.close();2
           
                throw new IOException("Espacio en blanco");
            }*/
        }
           
        PR.close();
    }
    public void leerDirec(String NArchivo)
            throws IOException,NumberFormatException
    {
        String texto = "";
        
        File archivo;
        archivo = new File(NArchivo);
        FileReader FR = new FileReader(archivo);
        BufferedReader DR = new BufferedReader(FR);

        String line;
        line = DR.readLine();
        
        while((line = DR.readLine()) != null){
            if(!line.equals("")){
                if(!line.trim().startsWith("@")){
                    direc = Arrays.copyOf(direc, direc.length + 1); 
                    String[] est = line.split("," , -1);

                    direc[direc.length -1] = new Directivos(est[0], est[1], est[2], 
                            est[3], Integer.parseInt(est[4]), 
                            (est[5]), Integer.parseInt(est[6]));     // aqui creo el objeto alum y lo guardo
                }
            }/*else{
                Br.close();2
           
                throw new IOException("Espacio en blanco");
            }*/
        }
           
        DR.close();
    }
    
    public static void Rellenar(){
        
        Colegio2 cole = new Colegio2();
    
        String [] nombres = {"Brenda", "Omar", "Alejandro", "Mauro", "Frida", 
            "Renata", "Eduardo", "Isaac", "Sofia", "Pablo", "Angel", "Diego", 
            "Patricio", "Hector", "Raul"};
        
        String [] apellidos = {"Cifuentes", "Aguilar", "Morales", "Diaz", 
            "Avila", "Alejandre", "Tabla", "Ruiseco", "Hernandez", "Ruiz", 
            "Velasquez", "Valencia", "Juarez", "Valdez", "Sanchez"};
        
        String [] nacionalidad = {"Mexicana", "Amercicana", "China", "Rusa", 
            "Francesa"};
        
        String [] materia = {"Matematicas", "Español", "Ingles", "Italiano", 
            "Quimica"};
        
        String [] puesto = {"Administrativo", "Director", "Prefecto"};
        
        int [] edad_alu = {11, 12, 13, 14, 15, 16, 17};
        
        int [] edad_adu = {34, 35, 36, 37, 38, 39, 40};
        
        int [] grupo = {1, 2, 3, 4, 5, 6, 7};
        
        int [] numeros = {202209, 205362, 20637, 208392, 223201};
        
        for(int i = 0; i < alum.length; i++){
            alum[i] = new Alumnos (nombres[cole.aleatorio(15)], apellidos[cole.aleatorio(15)], 
                    apellidos[cole.aleatorio(15)], nacionalidad[cole.aleatorio(5)], 
                    edad_alu[cole.aleatorio(7)], numeros[cole.aleatorio(5)], grupo[cole.aleatorio(7)]);
        }
        for(int i = 0; i < profe.length; i++){
            profe[i] = new Profesores (nombres[cole.aleatorio(15)], apellidos[cole.aleatorio(15)], 
                    apellidos[cole.aleatorio(15)], nacionalidad[cole.aleatorio(5)], 
                    edad_adu[cole.aleatorio(7)], materia[cole.aleatorio(5)], numeros[cole.aleatorio(5)]);
        }
        for(int i = 0; i < direc.length; i++){
            direc[i] = new Directivos (nombres[cole.aleatorio(15)], apellidos[cole.aleatorio(15)], 
                    apellidos[cole.aleatorio(15)], nacionalidad[cole.aleatorio(5)], 
                    edad_adu[cole.aleatorio(7)], puesto[cole.aleatorio(3)], numeros[cole.aleatorio(5)]);
        }
        
        
    }
    
    public static void Desplegar(){
        
        Scanner tecleado = new Scanner(System.in);
        
        Colegio2 cole = new Colegio2();
        
                        int res = 0;
                        String respuestita = "si";
                        
                        do{
                        
                            System.out.println("\r(1)Desplegar alumnos");
                            System.out.println("(2)Desplegar profesores");
                            System.out.println("(3)Desplegar todos");
                            System.out.println("(4)Salir al menu principal");
                            System.out.println("Escoja una opcion: ");
                            res = tecleado.nextInt();

                            if(res == 1){
                                System.out.println("\nHay " + alum.length + " alumnos");

                                for(int i = 0; i <= alum.length -1; i++){
                                    System.out.println("\r \t \tAlumno no. " + (i + 1) + ": ");
                                    alum[i].Mostrar();
                                }
                            }
                            if(res == 2){
                                System.out.println("\nHay " + profe.length + " profesores");

                                for(int i = 0; i < profe.length; i++){
                                    System.out.println("\r \t \tProfesor no. " + (i + 1) + ": ");
                                    profe[i].Mostrar();
                                }
                            }
                            if(res == 3){
                                System.out.println("\nHay " + alum.length + profe.length + direc.length + " alumnos");

                                for(int i = 0; i < alum.length; i++){
                                    System.out.println("\r \t \tAlumno no. " + (i + 1) + ": ");
                                    alum[i].Mostrar();
                                }
                                for(int i = 0; i < profe.length; i++){
                                    System.out.println("\r \t \tProfesor no. " + (i + 1) + ": ");
                                    profe[i].Mostrar();
                                }
                                for(int i = 0; i < direc.length; i++){
                                    System.out.println("\r \t \tDirectivo no. " + (i + 1) + ": ");
                                    direc[i].Mostrar();
                                }
                            }
                            if(res == 4){
                                respuestita = "no";
                                cole.Menu();
                            }
                            
                        }while(respuestita.equals("si"));
    }
    
    public static void Agregar(){
        
        Scanner tecleado = new Scanner(System.in);
        
        Colegio2 cole = new Colegio2();
        
                int res_grande = 0;
                        String res_peque = "no";
                        
                        do{
                                
                            System.out.println("\r(1)Agregar alumno");
                            System.out.println("(2)Agregar profesor");
                            System.out.println("(3)Agregar directivo");
                            System.out.println("(4)Salir al menu principal");
                            System.out.println("Escoja una opcion: ");
                            
                            try{
                            res_grande = tecleado.nextInt();
                            
                            if(res_grande == 1){
                                
                                alum = Arrays.copyOf(alum, alum.length + 1);  

                                alum[alum.length -1] = new Alumnos();
                                
                                System.out.println("Inserte su nombre: ");
                                alum[alum.length - 1].setNombre(tecleado.next());

                                System.out.println("Inserte su apellido paterno: ");
                                alum[alum.length - 1].setPaterno(tecleado.next());

                                System.out.println("Inserte su apellido materno: ");
                                alum[alum.length - 1].setMaterno(tecleado.next());

                                System.out.println("Inserte su nacionalidad: ");
                                alum[alum.length - 1].setNacionalidad(tecleado.next());

                                System.out.println("Inserte su edad: ");
                                alum[alum.length - 1].setEdad(tecleado.nextInt());

                                System.out.println("Inserte su boleta: ");
                                alum[alum.length - 1].setBoleta(tecleado.nextInt());
                                
                                System.out.println("Inserte su grupo: ");
                                alum[alum.length - 1].setGrupo(tecleado.nextInt());
                                
                                alum[alum.length -1].Mostrar();
                                
                                
                                
                                res_peque = "si";
                                
                            }
                            
                            if(res_grande == 2){
                                
                                profe = Arrays.copyOf(profe, profe.length + 1);  

                                profe[profe.length -1] = new Profesores();
                                
                                System.out.println("Inserte su nombre: ");
                                profe[profe.length - 1].setNombre(tecleado.next());

                                System.out.println("Inserte su apellido paterno: ");
                                profe[profe.length - 1].setPaterno(tecleado.next());

                                System.out.println("Inserte su apellido materno: ");
                                profe[profe.length - 1].setMaterno(tecleado.next());

                                System.out.println("Inserte su nacionalidad: ");
                                profe[profe.length - 1].setNacionalidad(tecleado.next());

                                System.out.println("Inserte su edad: ");
                                profe[profe.length - 1].setEdad(tecleado.nextInt());

                                System.out.println("Inserte su boleta: ");
                                profe[profe.length - 1].setMateria(tecleado.next());
                                
                                System.out.println("Inserte su grupo: ");
                                profe[profe.length - 1].setNo_empleado(tecleado.nextInt());
                                
                                res_peque = "si";
                                
                            }
                            if(res_grande == 3){
                                
                                direc = Arrays.copyOf(direc, direc.length + 1);  

                                direc[direc.length -1] = new Directivos();
                                
                                System.out.println("Inserte su nombre: ");
                                direc[direc.length - 1].setNombre(tecleado.next());

                                System.out.println("Inserte su apellido paterno: ");
                                direc[direc.length - 1].setPaterno(tecleado.next());

                                System.out.println("Inserte su apellido materno: ");
                                direc[direc.length - 1].setMaterno(tecleado.next());

                                System.out.println("Inserte su nacionalidad: ");
                                direc[direc.length - 1].setNacionalidad(tecleado.next());

                                System.out.println("Inserte su edad: ");
                                direc[direc.length - 1].setEdad(tecleado.nextInt());

                                System.out.println("Inserte su boleta: ");
                                direc[direc.length - 1].setPuesto(tecleado.next());
                                
                                System.out.println("Inserte su grupo: ");
                                direc[direc.length - 1].setClave(tecleado.nextInt());
                                
                                res_peque = "si";
                                
                                }
                            
                            if(res_grande == 4){
                                res_peque = "no";
                                cole.Menu();
                            }
                            }catch(InputMismatchException e){
                                System.out.println("\rEl numero agregado no es un entero");
                                tecleado.next();
                                res_peque = "si";
                            }
                        }while(res_peque.equals("si"));
                        
    }
    
    public void Buscar(){
        
        Scanner tecleado = new Scanner(System.in);
        
        Colegio2 cole = new Colegio2();
        
            int resi = 0;
             
        String nom, pat, mat;
        int  edadsita = 0, contador = 0;
        boolean flag = false;
            
                        String respuesta = "si";
                        
                        do{
                        
                            System.out.println("\r(1)Buscar por nombre");
                            System.out.println("(2)Buscar por apellido paterno");
                            System.out.println("(3)Buscar por apellido materno");
                            System.out.println("(4)Buscar por edad");
                            System.out.println("(5)Salir al menu principal");
                            System.out.println("Escoja una opcion: ");
                            resi = tecleado.nextInt();

                                if(resi == 1){
                                    System.out.println("\rDe el nombre de la persona: ");
                                    nom = tecleado.next();

                                    for(Alumnos nombre: alum){
                                        if(nombre.personita.getNombre().equals(nom)){
                                            System.out.println("\rAlumno encontrado: ");
                                            nombre.personita.Mostrar();
                                            contador ++;
                                            System.out.println("\rNumero de alumnos encontrados: " + contador);
                                            flag = true;
                                        }
                                        else{
                                            flag = false;
                                        }
                                    }
                                    for(Profesores nombre: profe){
                                        if(nombre.personita.getNombre().equals(nom)){
                                            System.out.println("\rProfesor encontrado: ");
                                            nombre.personita.Mostrar();
                                            contador ++;
                                            System.out.println("\rNumero de profesores encontrados: " + contador);
                                            flag = true;
                                        }
                                        else{
                                            flag = false;
                                        }
                                    }
                                    for(Directivos nombre: direc){
                                        if(nombre.personita.getNombre().equals(nom)){
                                            System.out.println("\rDirectivo encontrado: ");
                                            nombre.personita.Mostrar();
                                            contador ++;
                                            System.out.println("\rNumero de directivos encontrados: " + contador);
                                            flag = true;
                                        }
                                        else{
                                            flag = false;
                                        }
                                    }
                                        if(!flag){
                                            System.out.println("Persona no encontrado");
                                        }
                                }

                                if(resi == 2){
                                    System.out.println("\rDe el apellido paterno de la persona: ");
                                    pat = tecleado.next();

                                    for(Alumnos paterno: alum){
                                        if(paterno.personita.getPaterno().equals(pat)){
                                            System.out.println("\nAlumno encontrado: ");
                                            paterno.personita.Mostrar();
                                            contador ++;
                                            System.out.println("\rNumero de alumnos encontrados: " + contador);
                                            flag = true;
                                        }
                                        else{
                                            flag = false;
                                        }
                                    }
                                    for(Profesores paterno: profe){
                                        if(paterno.personita.getPaterno().equals(pat)){
                                            System.out.println("\nProfesor encontrado: ");
                                            paterno.personita.Mostrar();
                                            contador ++;
                                            System.out.println("\rNumero de profesores encontrados: " + contador);
                                            flag = true;
                                        }
                                        else{
                                            flag = false;
                                        }
                                    }
                                    for(Directivos paterno: direc){
                                        if(paterno.personita.getPaterno().equals(pat)){
                                            System.out.println("\nDirectivos encontrado: ");
                                            paterno.personita.Mostrar();
                                            contador ++;
                                            System.out.println("\rNumero de directivos encontrados: " + contador);
                                            flag = true;
                                        }
                                        else{
                                            flag = false;
                                        }
                                    }
                                        if(!flag){
                                            System.out.println("Persona no encontrado");
                                        }
                                }

                                if(resi == 3){
                                    System.out.println("De el apellido materno de la persona: ");
                                    mat = tecleado.next();

                                    for(Alumnos materno: alum){
                                        if(materno.personita.getMaterno().equals(mat)){
                                            System.out.println("\nAlumno encontrado: ");
                                            materno.Mostrar();
                                            contador ++;
                                            System.out.println("\rNumero de alumnos encontrados: " + contador);
                                            flag = true;
                                        }
                                        else{
                                            flag = false;
                                        }
                                    }
                                    for(Profesores materno: profe){
                                        if(materno.personita.getMaterno().equals(mat)){
                                            System.out.println("\nProfesor encontrado: ");
                                            materno.Mostrar();
                                            contador ++;
                                            System.out.println("\rNumero de profesores encontrados: " + contador);
                                            flag = true;
                                        }
                                        else{
                                            flag = false;
                                        }
                                    }
                                    for(Directivos materno: direc){
                                        if(materno.personita.getMaterno().equals(mat)){
                                            System.out.println("\nDirectivo encontrado: ");
                                            materno.Mostrar();
                                            contador ++;
                                            System.out.println("\rNumero de directivos encontrados: " + contador);
                                            flag = true;
                                        }
                                        else{
                                            flag = false;
                                        }
                                    }
                                        if(!flag){
                                            System.out.println("Persona no encontrado");
                                        }
                                }
                                if(resi == 4){
                                    System.out.println("De la edad de la persona: ");
                                    edadsita = tecleado.nextInt();

                                    for(Alumnos edad: alum){
                                        if(edad.personita.getEdad() == (edadsita)){
                                            System.out.println("\nAlumno encontrado: ");
                                            edad.Mostrar();
                                            contador ++;
                                            System.out.println("\rNumero de alumnos encontrados: " + contador);
                                            flag = true;
                                        }
                                        else{
                                            flag = false;
                                        }
                                    }
                                    for(Profesores edad: profe){
                                        if(edad.personita.getEdad() == (edadsita)){
                                            System.out.println("\nProfesor encontrado: ");
                                            edad.Mostrar();
                                            contador ++;
                                            System.out.println("\rNumero de profesores encontrados: " + contador);
                                            flag = true;
                                        }
                                        else{
                                            flag = false;
                                        }
                                    }
                                    for(Directivos edad: direc){
                                        if(edad.personita.getEdad() == (edadsita)){
                                            System.out.println("\nDirectivo encontrado: ");
                                            edad.Mostrar();
                                            contador ++;
                                            System.out.println("\rNumero de directivos encontrados: " + contador);
                                            flag = true;
                                        }
                                        else{
                                            flag = false;
                                        }
                                    }
                                        if(!flag){
                                            System.out.println("Persona no encontrado");
                                        }
                                }
                                
                            if(resi == 5){
                                    respuesta= "no";
                                    cole.Menu();
                            }
                            
                        }while(respuesta.equals("si"));
    }
    
    public void Menu(){
        
        Scanner tecleado = new Scanner(System.in);
        
        int opcion = 0;
        String resp = "si";
        
        Colegio2 cole = new Colegio2();
        
        try{
        
        System.out.println("\nBienvenido");
            
        System.out.println("(1)Agregar");
        System.out.println("(2)Desplegar");
        System.out.println("(3)Buscar");
        System.out.println("(4)Salir");
        System.out.println("Escoja una opcion: ");
        opcion = tecleado.nextInt();
       
            switch(opcion){

                case 1:
                        Agregar();
                break;
                case 2:
                        Desplegar();
                break;
                case 3:
                        Buscar();
                break;
                case 4:
                   resp = "no"; 
                break;
                default:
                    System.out.println("Escoja una opcion valida");
                break;
            }
        }catch(InputMismatchException e){
            System.out.println("El numero introducido no es un entero");
            cole.Menu();
        }    
    }
    
    public static void main(String[] args) {
        
        Colegio2 cole = new Colegio2();
        
        Rellenar();
        
        try{
            cole.escribir("Registro_3.csv");   // terminacion csv se guarda en excel 
        }catch(IOException e){
            System.out.println("ERROR DE E/S :" + e);
        }
        
        try{
            cole.leerB("Registro_3.txt");
        }catch(IOException e){
            System.out.println("ERROR DE E/S :" + e);
        }catch(NumberFormatException e){
            System.out.println("ERROR DE FORMATO " + e);
        }
        
        try{
            cole.leerProf("Registros_profes.txt");
        }catch(IOException e){
            System.out.println("ERROR DE E/S :" + e);
        }catch(NumberFormatException e){
            System.out.println("ERROR DE FORMATO " + e);
        }
        
        try{
            cole.leerDirec("Registros_direc.txt");
        }catch(IOException e){
            System.out.println("ERROR DE E/S :" + e);
        }catch(NumberFormatException e){
            System.out.println("ERROR DE FORMATO " + e);
        }
        
        cole.Menu();
        Desplegar();
        cole.Buscar();
        
        
    }
    
}


/*
    Crear un archivo txt con varios datos y pasarlo a la funcion leer para que pasen ahi los datos
    Osea escribirlos en un block de notas y leerlo con el programa y que esos se guarden en el arry de alumnos
*/

/*
    Tarea: investigar si Strings tiene una forma de descartar una liena si empieza por un caracter dado,
    sino idea una forma y convertirla en metodo

    Crear un archivo de registro para los profesores y directivos quitando lineas en blanco y comentarios, osea lo mismo
    de alumnos pero ahora con esos 2 y la tarea que puse en whats

    Para facilitarme la tarea crear un metodo generico que tome como argumento el arrar de objetos y devuelva el array modificado

    Corregir las cabeceras, agregar los datos que faltan
*/
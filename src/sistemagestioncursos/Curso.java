/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestioncursos;

import java.util.ArrayList;

/**
 *
 * @author Duoc
 */
public class Curso {
    
    protected String nombre;
    protected ArrayList<String> alumnos;

    public Curso() {
          this.alumnos = new ArrayList<>();
    }

    public Curso(String nombre, ArrayList<String> alumnos) {
        this.nombre = nombre;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getAlumnos() {
        return alumnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public boolean agregarAlumno(String alumno){
        return alumnos.add(alumno);
    }
    
    public void mostrarAlumnos(){
        for (String alum : alumnos){
            System.out.print(alum);
        }
    }
    
    
    //Sobrecarga
    public void agregarAlumno(ArrayList<String> alumnosNuevos){
       this.alumnos.addAll(alumnosNuevos);
    }

    
}

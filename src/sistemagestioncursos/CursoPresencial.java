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
public class CursoPresencial extends Curso {
    private String sala;
    

    public CursoPresencial(String nombre, ArrayList<String> alumnos, String sala) {
        super(nombre, alumnos);
        this.sala = sala;
    }

    public CursoPresencial() {
    }

    public String getSala() {
        return sala;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getAlumnos() {
        return alumnos;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlumnos(ArrayList<String> alumnos) {
        this.alumnos = alumnos;
    }
    
    // Mostrar información básica
    public void mostrarInfoPre(){
        System.out.printf("Nombre del curso: %s | Sala: %s",nombre,sala);
        mostrarAlumnos();
        
    }

    
    
    
@Override
    public void mostrarAlumnos(){
        System.out.println("\nAlumnos: ");
        for (String alum : alumnos){
            System.out.println(alum);
            
        }
    }
    
}

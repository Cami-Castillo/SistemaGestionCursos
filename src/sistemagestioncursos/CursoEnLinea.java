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
public class CursoEnLinea extends Curso {
    private String link;

    public CursoEnLinea() {
    }
    
    public CursoEnLinea(String nombre, ArrayList<String> alumnos, String link) {
        super(nombre, alumnos);
        this.link = link;
    }
    
    public void mostrarInfoEnLinea(){
        System.out.printf("Nombre curso: %s | Link: %s",nombre,link);
        mostrarAlumnos();
    }

    public String getLink() {
        return link;
    }
    
    public void setLink(String link) {
        this.link = link;
    }

    
    @Override
    public void mostrarAlumnos(){
        System.out.println("Alumnos: ");
        for (String alum : alumnos){
            System.out.println(alum);
            
        }
    }
    
    
    
    
    
}

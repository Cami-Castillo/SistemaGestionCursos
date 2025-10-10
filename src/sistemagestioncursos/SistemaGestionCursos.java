/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestioncursos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Duoc
 */
public class SistemaGestionCursos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<>();
        CursoPresencial cursoPre = new CursoPresencial();
        CursoEnLinea cursoLinea = new CursoEnLinea();    
        ArrayList<String> muchosAlumnos = new ArrayList();
        
        int opcion;
        
        do{
            
            System.out.println("\n=== Menú de Gestión de Cursos ===");
            System.out.println("1. Registrar curso presencial");
            System.out.println("2. Registrar curso en línea");
            System.out.println("3. Ver cursos");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
            

            switch(opcion) {
            
                
                case 1:
    // Registrar curso presencial
                    cursoPre = new CursoPresencial();
                    System.out.print("Nombre del curso presencial: ");
                    String nombrePresencial = scanner.nextLine();
                    cursoPre.setNombre(nombrePresencial);

                    System.out.print("Sala del curso presencial: ");
                    String salaAsignada = scanner.nextLine();
                    cursoPre.setSala(salaAsignada);

                    int opcionAlumno;
                    do {
                        System.out.println("\n¿Deseas agregar alumnos?");
                        System.out.println("1. Agregar un alumno");
                        System.out.println("2. Agregar varios alumnos");
                        System.out.println("3. Volver a registro de cursos");
                        System.out.print("Selecciona opción: ");
                        opcionAlumno = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer

                        switch (opcionAlumno) {
                            case 1:
                                
                                System.out.print("Ingrese un nombre: ");
                                String alumno = scanner.nextLine();
                                if (cursoPre.agregarAlumno(alumno)) {
                                    System.out.println("Alumno agregado con éxito");
                                } else {
                                    System.out.println("Alumno no válido");
                                }
                                break;

                            case 2:
                                String nombreVar;
                                do {
                                    System.out.print("Ingrese nombre del alumno (o 'salir' para terminar): ");
                                    nombreVar = scanner.nextLine();
                                    if (!nombreVar.equalsIgnoreCase("salir")) {
                                        if (cursoPre.agregarAlumno(nombreVar)) {
                                            System.out.println("Alumno agregado: " + nombreVar);
                                        } else {
                                            System.out.println("Alumno no válido");
                                        }
                                    }
                                } while (!nombreVar.equalsIgnoreCase("salir"));
                                break;

                            case 3:
                                System.out.println("Saliendo del submenú de alumnos...");
                                break;

                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (opcionAlumno != 3);
                    
                    cursos.add(cursoPre);   
                    System.out.println("Curso presencial registrado exitosamente.");
                    break;

                case 2:
                // Registrar curso en línea
                    cursoLinea = new CursoEnLinea();    
                    System.out.print("Nombre del curso en línea: ");
                    String nombreEnLinea = scanner.nextLine();
                    cursoLinea.setNombre(nombreEnLinea);

                    System.out.print("Link del curso en línea: ");
                    String link = scanner.nextLine();
                    cursoLinea.setLink(link);

                    int opcionAlumnoLinea;
                    do {
                        System.out.println("\n¿Deseas agregar alumnos?");
                        System.out.println("1. Agregar un alumno");
                        System.out.println("2. Agregar varios alumnos");
                        System.out.println("3. Volver a registro de cursos");
                        System.out.print("Selecciona opción: ");
                        opcionAlumnoLinea = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer

                        switch (opcionAlumnoLinea) {
                            case 1:
                                System.out.print("Ingrese un nombre: ");
                                String alumnoLinea = scanner.nextLine();
                                if (cursoLinea.agregarAlumno(alumnoLinea)) {
                                    System.out.println("Alumno agregado con éxito");
                                } else {
                                    System.out.println("Alumno no válido");
                                }
                                break;

                            case 2:
                                String nombreVarLinea;
                                do {
                                    System.out.print("Ingrese nombre del alumno (o 'salir' para terminar): ");
                                    nombreVarLinea = scanner.nextLine();
                                    if (!nombreVarLinea.equalsIgnoreCase("salir")) {
                                        if (cursoLinea.agregarAlumno(nombreVarLinea)) {
                                            System.out.println("Alumno agregado: " + nombreVarLinea);
                                        } else {
                                            System.out.println("Alumno no válido");
                                        }
                                    }
                                } while (!nombreVarLinea.equalsIgnoreCase("Salir"));
                                break;

                            case 3:
                                System.out.println("Saliendo del submenú de alumnos...");
                                break;

                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (opcionAlumnoLinea != 3);
                    
                    
                    cursos.add(cursoLinea);    
                    System.out.println("Curso en línea registrado exitosamente.");
                    break;



                case 3:

                for (Curso cur : cursos) {
                    if (cur instanceof CursoPresencial) {
                        CursoPresencial cursop = (CursoPresencial) cur;
                        System.out.println("Nombre: " + cursop.getNombre());
                        System.out.println("Sala: " + cursop.getSala());
                        cursop.mostrarAlumnos();  
                        
                    } else if (cur instanceof CursoEnLinea) {
                        CursoEnLinea cl=(CursoEnLinea) cur;
                        System.out.println("Nombre: " + cl.getNombre());
                        System.out.println("Link: " + cl.getLink());
                        cl.mostrarAlumnos();
                    }
                }
                    break;

                case 4:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del menú.");
                    break;
            }

        }while(opcion != 4);
        scanner.close();
    }

}

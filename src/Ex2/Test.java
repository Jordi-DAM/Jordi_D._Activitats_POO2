package Ex2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {


        Alumne alumne1 = new Alumne("Juan", "Pérez", 20, "12345678A");
        Alumne alumne2 = new Alumne("María", "González", 22, "87654321B");


        Modul matematicas = new Modul("Matemáticas");
        Modul historia = new Modul("Historia");
        Modul fisica = new Modul("Física");


        Matrícula matricula1 = new Matrícula(alumne1, matematicas, 8);
        Matrícula matricula2 = new Matrícula(alumne1, historia, 4);
        Matrícula matricula3 = new Matrícula(alumne1, fisica, 6);
        Matrícula matricula4 = new Matrícula(alumne2, matematicas, 3);
        Matrícula matricula5 = new Matrícula(alumne2, historia, 7);
        Matrícula matricula6 = new Matrícula(alumne2, fisica, 4);

        Manager manager = new Manager();
        manager.addMatricula(matricula1);
        manager.addMatricula(matricula2);
        manager.addMatricula(matricula3);
        manager.addMatricula(matricula4);
        manager.addMatricula(matricula5);
        manager.addMatricula(matricula6);


        double mediaNotas1 = manager.obtenerMediaNotas("12345678A");
        System.out.println("La media de notas del alumno con DNI 12345678A es: " + mediaNotas1);


        ArrayList<String> modulosSuspensos1 = manager.obtenerModulosSuspensos("12345678A");
        System.out.println("Los módulos suspendidos del alumno con DNI 12345678A son: " + modulosSuspensos1);


        double mediaNotas2 = manager.obtenerMediaNotas("87654321B");
        System.out.println("La media de notas del alumno con DNI 87654321B es: " + mediaNotas2);


        ArrayList<String> modulosSuspensos2 = manager.obtenerModulosSuspensos("87654321B");
        System.out.println("Los módulos suspendidos del alumno con DNI 87654321B son: " + modulosSuspensos2);
    }
}
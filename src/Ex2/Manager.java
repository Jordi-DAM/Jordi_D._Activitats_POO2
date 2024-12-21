package Ex2;

import java.util.ArrayList;

public class Manager {

    private ArrayList<Matrícula> matrícules;


    public Manager() {
        matrícules = new ArrayList<>();
    }

    public void addMatricula(Matrícula matrícula){
        this.matrícules.add(matrícula);
    }


    public Matrícula getMatriculaByDNI(String dni){
        for (Matrícula m: matrícules){
            if(m.getAlumne().getDni().equals(dni)){
                return m;
            }
        }
        return null;
    }


    public double obtenerMediaNotas(String dni) {
        double sumaNotas = 0;
         int contador = 0;

         for (Matrícula m : matrícules) {
             if (m.getAlumne().getDni().equals(dni)) {
                 sumaNotas += m.getNota();
                 contador++;
             }
         }

            return sumaNotas / contador;
    }

    public ArrayList<String> obtenerModulosSuspensos(String dni) {
        ArrayList<String> modulsSuspesos = new ArrayList<>();

        for (Matrícula m: matrícules) {
            if (m.getAlumne().getDni().equals(dni) && m.getNota() < 5) {
                modulsSuspesos.add(m.getModul().getModulName());
            }
        }
        return modulsSuspesos;
    }


}

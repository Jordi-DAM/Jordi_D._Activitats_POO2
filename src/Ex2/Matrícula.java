package Ex2;

import Ex4.Client;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;

public class Matrícula {

    private Alumne alumne;
    private Modul modul;
    private double nota;

    public Matrícula(Alumne alumne, Modul modul, double nota){
        this.alumne=alumne;
        this.modul=modul;
        this.nota=nota;
    }

    public Alumne getAlumne() {
        return alumne;
    }

    public void setAlumne(Alumne alumne) {
        this.alumne = alumne;
    }

    public Modul getModul() {
        return modul;
    }

    public void setModul(Modul modul) {
        this.modul = modul;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


}


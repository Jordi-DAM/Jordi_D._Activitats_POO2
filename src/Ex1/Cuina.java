package Ex1;

public class Cuina {

    private boolean esIndependent;
    private int nombreDeFogons;

    public Cuina(){

        esIndependent=false;
        nombreDeFogons=0;
    }

    public void setEsIndependent(boolean esIndependent){
        this.esIndependent = esIndependent;
    }

    public void setNombreDeFogons(int nombreDeFogons){
        this.nombreDeFogons = nombreDeFogons;
    }

    public int getNombreDeFogons() {
        return nombreDeFogons;
    }

}

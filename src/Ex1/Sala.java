package Ex1;

public class Sala {
    private int numeroDeTelevisions;
    private String tipusSala;

    public Sala(){
        numeroDeTelevisions=0;
        tipusSala="Desconegut";
    }

    public int getNumeroDeTelevisions() {
        return numeroDeTelevisions;
    }

    public void setNumeroDeTelevisions(int numeroDeTelevisions) {
        this.numeroDeTelevisions = numeroDeTelevisions;
    }

    public String getTipusSala() {
        return tipusSala;
    }

    public void setTipusSala(String tipusSala) {
        this.tipusSala = tipusSala;
    }
}

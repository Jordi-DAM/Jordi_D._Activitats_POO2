package Ex1;

public class Casa {

    private double superficie;
    private String direcció;
    private Sala salaCasa;
    private Cuina cuinaCasa;

    public Casa(){

        superficie = 0;
        direcció = "Desconegut";
        salaCasa = new Sala();
        cuinaCasa = new Cuina();
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getDirecció() {
        return direcció;
    }

    public void setDirecció(String direcció) {
        this.direcció = direcció;
    }

    public Sala getSalaCasa() {
        return salaCasa;
    }

    public void setSalaCasa(Sala salaCasa) {
        this.salaCasa = salaCasa;
    }

    public Cuina getCuinaCasa() {
        return cuinaCasa;
    }

    public void setCuinaCasa(Cuina cuinaCasa) {
        this.cuinaCasa = cuinaCasa;
    }
}

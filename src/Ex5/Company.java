package Ex5;

public class Company {
    private String cif;
    private String name;
    private String sector;

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Company(String cif, String name, String sector){
         this.cif=cif;
         this.name=name;
         this.sector=sector;
    }

}

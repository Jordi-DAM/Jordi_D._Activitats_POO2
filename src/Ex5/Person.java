package Ex5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Person {
    private String dni;
    private String name;
    private ArrayList<Contract> contracts;

    public Person(String dni, String name) {
        this.dni = dni;
        this.name = name;
        contracts = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(ArrayList<Contract> contracts) {
        this.contracts = contracts;
    }

    public void signContract(Contract contract) {
        contracts.add(contract);
    }

    public int daysAmount() {
        int total = 0;
        for (Contract c : contracts) {
            total += c.getDuration();
        }
        return total;
    }

    public void workedOn() {
        Set<String> uniqueCompanies = new HashSet<>();
        for (Contract c : contracts) {
            uniqueCompanies.add(c.getCompany().getName());
        }
        System.out.println("Ha treballat en " + uniqueCompanies.size() + " empreses");
    }

    public int getContractDuration(String code){
        int duration=0;
        for (Contract c: contracts){
            if (c.getCode().equals(code)){
               duration=c.getDuration();
            }
        }
        return duration;
    }

}


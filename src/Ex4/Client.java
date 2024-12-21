package Ex4;

import java.util.ArrayList;

public class Client {


    private String name;
    private String surname;
    private String DNI;
    private int priceXMin;
    private ArrayList <Call> calls;



    public Client(String name, String surname, String DNI, int priceXMin){
        this.name = name;
        this.surname = surname;
        this.DNI=DNI;
        this.priceXMin = priceXMin;
        calls = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDNI() {
        return DNI;
    }

    public int getPriceXMin() {
        return priceXMin;
    }

    public ArrayList<Call> getCalls() {
        return calls;
    }
    public int getCallSize(){
        return calls.size();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setPriceXMin(int priceXMin) {
        this.priceXMin = priceXMin;
    }

    public void addCall(Call call){
        calls.add(call);
    }


    public int totalPrice(){
        int total = 0;
        for (Call c : this.calls){
            total+= c.getMins() * this.priceXMin;
        }
        return total ;
    }

    public int totalMins(){
        int total = 0;
        for (Call c : this.calls){
            total+= c.getMins();
        }
        return total;
    }

}

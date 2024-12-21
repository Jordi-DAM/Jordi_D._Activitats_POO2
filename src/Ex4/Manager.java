package Ex4;


import java.util.ArrayList;

public class Manager {

        private ArrayList<Client> llistaClients;


    public Manager(){
        llistaClients = new ArrayList<>();
    }



    public Client findClientByDNI(String dni){

        for (Client c: llistaClients){
            if (c.getDNI().equals(dni)){
                return c;
            }
        }
        return null;
    }


    public void addClient(Client client){
        Client existingClient = findClientByDNI(client.getDNI());

        if (existingClient == null){
            llistaClients.add(client);
        }
        else System.out.println("Ja existeix un client amb aquest DNI");
    }


    public void addCallToClient(String dni, Call call) {
        Client client = findClientByDNI(dni);

        if (client != null) {
            client.addCall(call);
        }

    }


    public void printBill(String dni){

        Client client = findClientByDNI(dni);

        if (client != null){

            System.out.println("Detalls de la factura");
            System.out.println("Nom: " + client.getName());
            System.out.println("Cognom: " + client.getSurname());
            System.out.println("DNI: " + client.getDNI());
            System.out.println("Trucades:");
            for (Call c : client.getCalls()){
                System.out.println("Destí: " + c.getDirection() + ", Duració: " + c.getMins() + " minuts ");
            }
            System.out.println();
            System.out.println("Total de minuts parlats: " + client.totalMins() + " minuts");
            System.out.println("Preu per minut del client: " + client.getPriceXMin() + "€");
            System.out.println("El preu total de la factura es de: " + client.totalPrice() + " €") ;
        }
    }


    public void clientsList(){
        for (Client c: llistaClients){
            System.out.println("Detalls del client");
            System.out.println();
            System.out.println("DNI del client: " + c.getDNI());
            System.out.println("Nom del client: " + c.getName());
            System.out.println("Número de trucades actual del client: " + c.getCallSize());
            System.out.println("Número de minuts total en trucada es " + c.totalMins());
            System.out.println("Import total de la factura: " + c.totalPrice()+"€");
            System.out.println();
            System.out.println();
        }
    }

}

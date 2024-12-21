package Ex4;

import java.util.Scanner;

public class TelefoniaTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        Manager manager = new Manager();
        String dni;
        boolean inMenu = true;

        while (inMenu){



            System.out.println("           Menú           ");
            System.out.println();
            System.out.println("1. Afegir un client");
            System.out.println("2. Afegir una trucada a un client");
            System.out.println("3. Imprimir la factura d'un client");
            System.out.println("4. Imprimir un llistat dels clients");
            System.out.println("5. Sortir del programa");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){

                case 1:

                    System.out.println("Introdueix el nom del client");
                    String nom = sc.nextLine();

                    System.out.println("Introdueix el cognom del client");
                    String cognom = sc.nextLine();

                    System.out.println("Introdueix el DNI del client");
                    String DNI = sc.nextLine();

                    System.out.println("Introdueix el preu per minut del client");
                    int preuXMin = sc.nextInt();
                    sc.nextLine();

                    Client client = new Client(nom,cognom,DNI,preuXMin);
                    manager.addClient(client);

                    break;

                case 2:

                    System.out.println("Introdueixi el DNI del client a qui vol afegir una trucada");
                    dni = sc.nextLine();
                    System.out.println("Introdueixi la duració de la trucada en minuts");
                    int duration = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introdueixi la direcció de la trucada");
                    String direction = sc.nextLine();
                    Call call = new Call(duration,direction);
                    manager.addCallToClient(dni,call);
                    break;

                case 3:
                    System.out.println("Introdueixi el DNI del client de qui vol imprimir la factura");
                    dni = sc.nextLine();
                    manager.printBill(dni);

                    break;

                case 4:
                    manager.clientsList();
                    break;

                case 5: inMenu=false; break;


            }

        }

    }

}

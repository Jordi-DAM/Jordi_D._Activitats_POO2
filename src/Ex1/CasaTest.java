package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class CasaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ArrayList<Casa> cases = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            cases.add(crearCasa(sc));
        }

        for(Casa c: cases){
            System.out.println(c);
        }

    }

    public static Casa crearCasa(Scanner sc) {

        Casa casa1 = new Casa();
        casa1.setSuperficie(sc.nextDouble());
        sc.nextLine();
        casa1.setDirecció(sc.nextLine());

        Cuina cuina = crearCuina(sc);
        Sala sala = crearSala(sc);
        casa1.setCuinaCasa(cuina);
        casa1.setSalaCasa(sala);
        return casa1;
    }

    public static Cuina crearCuina(Scanner sc) {


        Cuina cuina1 = new Cuina();

        cuina1.setEsIndependent(sc.nextBoolean());
        cuina1.setNombreDeFogons(sc.nextInt());
        sc.nextLine();
        return cuina1;

    }
    public static Sala crearSala(Scanner sc) {
        Sala sala1 = new Sala();
        sala1.setTipusSala(sc.nextLine());
        sala1.setNumeroDeTelevisions(sc.nextInt());
        sc.nextLine();
        return sala1;
    }




}
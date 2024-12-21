package Ex5;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {

        //Creació d'objecte persona
        Person person = new Person("21755948H","Jordi");

        //Creació de contractes i agregació dels mateixos (3. Signar un contracte)
        Contract contract = new Contract("21245as",LocalDate.of(2024,3,15),LocalDate.of(2024,6,11),"B12345678", "Samsung","Tecnología");
        person.signContract(contract);
        Contract contract1 = new Contract("C12345",LocalDate.of(2023, 6, 15),LocalDate.of(2024, 6, 15),"B98765432","Tech Innovations S.L.","Tecnología");
        person.signContract(contract1);

        //(1.) Total de dies treballats
        System.out.println("La persona ha treballat durant " + person.daysAmount() + " dies.");


        //(2.)Llocs on a ha treballat
        person.workedOn();


        //(4.)Imprimir duració de contracte per codi
        System.out.println("Aquest contracte va durar " + person.getContractDuration("C12345") + " dies");
    }
}

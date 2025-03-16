package ma.enset.présentation;

import ma.enset.extension.DaoImpl2;
import ma.enset.dao.DaoImpl;
import ma.enset.metier.MetierImpl;

public class Pres_InstanciationStatique {
    public static void main(String[] args) {
        // version database using dependency injection with constructor

        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println("Result : " + metier.Calcul());

        // version WebService we will test the injection dependency using the setter
        System.out.println("=====================================");

        DaoImpl2 dao2 = new DaoImpl2();
        MetierImpl metier2 = new MetierImpl(dao2);
        System.out.println("Result : " + metier2.Calcul());


    }
}

package ma.enset.présentation;

import ma.enset.dao.DaoImpl;
import ma.enset.metier.MetierImpl;

public class Pres_InstanciationStatique {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println("Result : " + metier.Calcul());

    }
}

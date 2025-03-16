package ma.enset.présentation;

import ma.enset.dao.DaoImpl;
import ma.enset.dao.IDao;
import ma.enset.metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Scanner;

public class Pres_InstanciationDynamic {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner read = new Scanner(new File("Config.txt"));

        // on va lire le Nom du la class
        String daoClassName = read.nextLine();

        // on va charger la class dans la memoire
        Class daoClass = Class.forName(daoClassName);

        /* on va instancier la classe par l'utilisation de la methode newInstance,
        pour ne pas modifier dans le code source apres, c'est pour ca on va mettre la reference d'objet
        dans un objet IDao(On connait l'interface et n'ont pas la classe) , on a fait un cast
        car la methode newInstance Return un object de type Objects
        */
        IDao dao =  (IDao) daoClass.newInstance();


        String metierClassName = read.nextLine();
        Class cmetier = Class.forName(metierClassName);

        /* on va instancier par le constructeur avec parametre pour faire
           l'injection de dépendance
        */
//        Imetier metier = (Imetier) cmetier.getConstructor(IDao.class).newInstance(dao);
//        System.out.println("Result " + metier.Calcul());


        /*Si on veut faire l'instanciation pas le setter et non pas par le constructeur*/
        Imetier metier = (Imetier) cmetier.getConstructor().newInstance();
        // appel de la methode set
        Method setDao = metier.getClass().getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier, dao);
        System.out.println("Res : " + metier.Calcul());



    }
}

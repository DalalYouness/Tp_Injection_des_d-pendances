package ma.enset.présentation;

import ma.enset.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pres_UsingSpringContextXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Imetier metier = context.getBean("metier", Imetier.class);
        System.out.println("Résultat = " + metier.Calcul());
    }
}

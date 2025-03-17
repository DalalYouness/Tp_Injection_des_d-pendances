package ma.enset.présentation;

import ma.enset.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ma.enset");
        Imetier metier = context.getBean(Imetier.class);
        System.out.println(metier.Calcul());
    }
}

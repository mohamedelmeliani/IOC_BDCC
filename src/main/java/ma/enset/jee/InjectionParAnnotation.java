package ma.enset.jee;

import ma.enset.jee.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectionParAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ma");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Resulat ==> " + metier.calculate());
    }
}

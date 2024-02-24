package ma.enset.jee;

import ma.enset.jee.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class InjectionSpringXml {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConext.xml");

        IMetier metier = (IMetier) applicationContext.getBean("metier");

        System.out.println("Resultat ==> " + metier.calculate());
    }
}

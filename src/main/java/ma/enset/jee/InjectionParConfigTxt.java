package ma.enset.jee;

import ma.enset.jee.dao.IDao;
import ma.enset.jee.metier.IMetier;
import org.springframework.core.io.ClassPathResource;

import java.lang.reflect.Method;
import java.util.Scanner;

public class InjectionParConfigTxt {
    public static void main(String[] args) throws Exception {

        ClassPathResource resource = new ClassPathResource("config.txt");

        try (Scanner scanner = new Scanner(resource.getInputStream())) {
            String daoClassName = scanner.nextLine();
            String metierClassName = scanner.nextLine();

            Class<?> cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.newInstance();


            Class<?> cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.newInstance();
            Method method = cMetier.getMethod("setDao", IDao.class);
            method.invoke(metier,dao);

            System.out.println("Resultat ==> "+metier.calculate());
        }
    }
}

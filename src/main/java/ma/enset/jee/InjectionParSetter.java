package ma.enset.jee;

import ma.enset.jee.dao.DaoImpl;
import ma.enset.jee.metier.MetierImpl;

public class InjectionParSetter {
    public static void main(String[] args) {

        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();

        metier.setDao(dao);

        System.out.println("Resultat ==> " + metier.calculate());
    }
}
package ma.enset.jee.metier;

import ma.enset.jee.dao.IDao;

public class MetierImplBD implements IMetier {

    IDao dao;

    @Override
    public double calculate() {
        System.out.println("Mertier Impl ==> Version Base donnée");
        return dao.getData() * 2;
    }

    //Injection Par Setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

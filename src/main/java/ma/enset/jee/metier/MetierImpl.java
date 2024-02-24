package ma.enset.jee.metier;

import ma.enset.jee.dao.IDao;

public class MetierImpl implements IMetier {
        IDao dao;

    @Override
    public double calculate() {
        System.out.println("Mertier Impl ==> Version capture");
        return dao.getData() * 1;
    }

    //Injection Par Setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

package ma.enset.jee.dao;

public class DaoImplBD implements IDao {


    @Override
    public double getData() {
        System.out.println("Dao Impl ==> Version Base de donnée");
        return 2000;
    }
}

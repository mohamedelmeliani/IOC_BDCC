package ma.enset.jee.dao;

public class DaoImpl implements IDao {


    @Override
    public double getData() {
        System.out.println("Dao Impl ==> Version capture");
        return 1000;
    }
}

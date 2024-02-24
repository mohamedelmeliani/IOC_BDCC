package ma.enset.jee.dao;

import org.springframework.stereotype.Component;


@Component("dao2")
public class DaoImplAnnotation implements IDao {

    @Override
    public double getData() {
        System.out.println("Dao Impl ==> Version Annotation");
        return 3000;
    }
}

package ma.enset.jee.metier;

import ma.enset.jee.dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImplAnnotation implements IMetier {

    private final IDao dao;

    public MetierImplAnnotation(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calculate() {
        System.out.println("Mertier Impl ==> Version Annotation");
        return dao.getData() * 3;
    }
}
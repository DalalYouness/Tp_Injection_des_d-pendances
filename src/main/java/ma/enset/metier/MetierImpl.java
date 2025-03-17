package ma.enset.metier;

import ma.enset.dao.DaoImpl;
import ma.enset.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements Imetier {
    @Autowired @Qualifier("dao2")
    IDao dao;

    public MetierImpl(/*@Qualifier("dao")*/IDao dao) {

        this.dao = dao;
    }
    public MetierImpl() {}

    @Override
    public double Calcul() {
        double A = dao.getData();
        double Res = A * 10 + Math.random() * 100 + Math.PI;
        return Res;
    }

    public void setDao( IDao dao) {

        this.dao = dao;
    }
}

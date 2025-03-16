package ma.enset.metier;

import ma.enset.dao.DaoImpl;
import ma.enset.dao.IDao;

public class MetierImpl implements Imetier {
    IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {}



    @Override
    public double Calcul() {
        double A = dao.getData();
        double Res = A * 10 + Math.random() * 100 + Math.PI;
        return Res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

package ma.enset.metier;

import ma.enset.dao.IDao;

public class MetierImpl implements Imetier {
    IDao dao = null;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {}

    public void SetDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double Calcul() {
        double A = dao.getData();
        double Res = A * 10 + Math.random() * 100 + Math.PI;
        return Res;
    }
}

package ma.enset.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Data Base Version");
        double T = 30;
        return T;
    }
}

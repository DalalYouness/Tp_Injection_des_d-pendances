package ma.enset.extension;

import ma.enset.dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Web Service Version");
        double Temp = Math.random() * 10;
        return Temp;
    }
}

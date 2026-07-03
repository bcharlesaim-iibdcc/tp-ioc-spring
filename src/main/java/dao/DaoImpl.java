package dao;

import org.springframework.stereotype.Repository;

@Repository("daoDb")
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("Version base de données");
        double temp=33;
        return temp;
    }
}

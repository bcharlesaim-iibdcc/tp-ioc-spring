package dao;

import org.springframework.stereotype.Repository;

@Repository("daoWS")
public class DaoImplWS implements IDao{

    @Override


    public double getData() {
        System.out.println("Version web services");
        double t=22;
        return t;
    }
}

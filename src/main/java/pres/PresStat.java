package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.MetierImpl;

public class PresStat {
    public static void main(String[] args) {
        IDao d=new DaoImpl();

        MetierImpl metier=new MetierImpl();

        metier.setDao(d);
        System.out.println(metier.calcul());

    }

    }


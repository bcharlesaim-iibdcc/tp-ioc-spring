package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.util.Scanner;

public class PresDyn {
    public static void main(String[] args) throws Exception {

        //1. on fait de maniere dynamique IDao d=new DaoImpl();
        Scanner scanner=new Scanner(new File("config.txt"));
        //permet de lire la premiere ligne du fichier confi et nous permet
        //de connaitre le nom de la classe
        String daoClasseName=scanner.nextLine();
        //on va instancier la classe de maniere dynamique.
        //de ce fait on va d'abord charger la classe en memoire
        //et ensuite creer un objet de cette classe
        Class cDao=Class.forName(daoClasseName);
        //on peut maintenant instancier notre classe
        // one connait pas le vrai nom de la classe a lire dans config. Donc on fait:
        IDao d=(IDao)cDao.newInstance();
        // sous casting car newInstance() renvoie un objet de type Object.
        // Et on sait que l'object renvoyer est de type IDao

        //on va instancier MetierImpl metier=new MetierImpl(d); dynamiquement
        //et en faisant injection dependance avec constructeur et non avec un setters

        String metierClasseName=scanner.nextLine();
        Class cMetier=Class.forName(metierClasseName);
        // on utilise getConstructeur() pour pouvoir faire appel
        // à un constructeur avec parametre et faire ainsi injection de dependance
        IMetier metier=(IMetier)cMetier.getConstructor(IDao.class).newInstance(d);
        System.out.println("Res="+metier.calcul());

        //metier.setDao(d);


    }

}

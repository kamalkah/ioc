package pres;

import Metier.IMetierImpl;
import dao.DaoImpl;
import ext.DaoImpl2;

public class Presentation {
    public static void main(String[] args){
        DaoImpl2 dao = new DaoImpl2();
        IMetierImpl Metier=new IMetierImpl();
        Metier.setDao(dao);
        System.out.println("resultat="+Metier.calcul());
    }
}

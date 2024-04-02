package pres;

import Metier.IMetier;
import dao.IDao;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String doaClassName=scanner.nextLine();
        Class cDao=Class.forName(doaClassName);
        IDao dao=(IDao) cDao.newInstance();
        String metierClassName=scanner.nextLine();
        Class cmetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cmetier.newInstance();

        Method method=cmetier.getMethod("setDao",IDao.class);
        //metier.setDao(dao);
        method.invoke(metier,dao);

        System.out.println("resultat=>"+metier.calcul());


    }

}

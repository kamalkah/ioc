package dao;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class DaoImpl implements IDao{
    @Override
    public double getData() {

        /*
        SE CONNECTER A LA BD POUR LA TEMPERATURE
         */
        System.out.println("version base de donnée");

        double tmp=Math.random()*40;

        return tmp;
    }
}

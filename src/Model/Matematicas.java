package Model;

import java.util.Random;

public class Matematicas implements IExtremos{
    private int [] a;

    public Matematicas()
    {
        a = new int[3];
        a[0] = 1;
        a[1] = 34;
        a[2] = 123;
    }

    @Override
    public int inicio() {
        int inicio = 0;
        for (int i = 0 ; i< a.length ; i++)
        {
            inicio = a[0];
        }
        return  inicio;
    }

    @Override
    public int fin() {
        int fin = 0;
        for (int i = 0 ; i <a.length ; i++)
        {
            fin = a[(a.length-1)];
        }
        return fin;
    }
}

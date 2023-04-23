package Model;

import java.util.ArrayList;

public class ArrayReales implements IEstadisticas {
    private double [] array;

    public ArrayReales()
    {
        array = new double[3];
        array[0] = 1;
        array[1] = 5;
        array[2] = 9;
    }

    @Override
    public double maximo() {
        double max = 0;
        for (int i  = 0 ; i < array.length ; i++)
        {
            if(array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public double minimo() {
        double min= array[2];
        for (int i  = 0 ; i < array.length ; i++)
        {
            if(array[i] < min)
            {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public double sumatorio() {
        double sum = 0;
        for (int i  = 0 ; i <array.length ; i++)
        {
            sum += array[i];
        }
        return sum;
    }
}

package Model;

public class Numero implements Irelaciones{
    private int numero;


    public Numero()
    {
        numero = 0;
    }
    public Numero ( int numero)
    {
        this.numero = numero;
    }
    @Override
    public boolean esIgual(Object o) {
        boolean esIgual = false;

        if(o != null)
        {
            if(o instanceof Numero)
            {
                Numero aux = (Numero) o;
                if(numero== aux.numero)
                {
                    esIgual = true;
                }
            }
        }
        return esIgual;
    }

    @Override
    public boolean esMayor(Object o) {
        boolean esMayor = false;

        if(o != null)
        {
            if(o instanceof Numero)
            {
                Numero aux = (Numero) o;
                if(aux.numero < numero)
                {
                    esMayor = true;
                }
            }
        }
        return esMayor;
    }

    @Override
    public boolean esMenor(Object o) {
        boolean esIgual = false;

        if(o != null)
        {
            if(o instanceof Numero)
            {
                Numero aux = (Numero) o;
                if(aux.numero > numero)
                {
                    esIgual = true;
                }
            }
        }
        return esIgual;
    }
}

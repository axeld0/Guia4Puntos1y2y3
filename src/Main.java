import Model.ArrayReales;
import Model.Matematicas;
import Model.Numero;

public class Main {
    public static void main(String[] args) {


        //1.
        ArrayReales a = new ArrayReales();
        System.out.println(a.maximo());
        System.out.println(a.minimo());
        System.out.println(a.sumatorio());

        //2.
        Matematicas m = new Matematicas();
        System.out.println(m.inicio());
        System.out.println(m.fin());

        //3.
        Numero n1 = new Numero(2);
        Numero n2 = new Numero(3);
        Numero n3 = new Numero(2);

        System.out.println(n1.esMenor(n3));

        //4.

        

    }
}
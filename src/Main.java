import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Creare una classe Student che accenti nel costruttore il parametro name (String)
 e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console*/
public class Main {
    public static void main(String[] args) {
        Students studente1 = new Students("Mattia" , 18);
        Students studente2 = new Students("Franco" , 19);
        Students studente3 = new Students("Martina" , 18);
        List<Students> lista1 = new ArrayList<>(Arrays.asList(studente1,studente2,studente3));
        System.out.println("elenco vecchio =" + lista1);

        lista1.add(new Students("Giorgio" , 19));
        lista1.add(new Students("Giovanni" ,17));
        lista1.add(new Students("Alessia" , 19));
        lista1.add(new Students("Francesca" , 17));

        System.out.println("elenco aggiornato =" + lista1);
    }


}
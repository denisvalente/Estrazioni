package estrazioni;

//@author Denis Valente
public class Estrazioni {

    public static void main(String[] args) {

        random r = new random();

        r.genera();
        System.out.println(r);
        System.out.println("L'elemento selezionato è: " + r.getElement(3));
        System.out.println("Il numero max è: " + r.trovaMax());
        System.out.println("Il numero min è: " + r.trovaMin());
        System.out.println("La media è: " + r.trovaMedia());
        r.percentuale();
        r.bubbleSort();
        System.out.println(r);
    }
}

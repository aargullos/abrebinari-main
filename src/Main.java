public class Main {
    public static void main(String[] args) {
        // Creem una instància de l 'arbre
        Arbre arbre=new Arbre();

        // Insartem nodes al arbre
        arbre.insertat(25);
        arbre.insertat(37);
        arbre.insertat(54);
        arbre.insertat(72);
        arbre.insertat(12);
        arbre.insertat(17);
        arbre.insertat(23);
        arbre.insertat(51);

        // Indiquem que s'han insertat
        System.out.println("Nodes inserits a l'arbre.");

    }
}
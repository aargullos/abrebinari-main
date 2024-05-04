public class ArbreCaracters {
    private static int instancies = 0;
    private NodoArbreCaracters inicial;
    private int fondaria;

    // Constructor de la classe ArbreCaracters.
    public ArbreCaracters(int fondaria) {
        this.inicial = null;
        this.fondaria = fondaria;
        instancies++;
    }

    public static int getInstancies() {
        return instancies;
    }

    // Insertar un nou caràcter a l'abre
    public void insertaCaracter(char valor) {
        if (this.inicial == null) {
            this.inicial = new NodoArbreCaracters(valor);
        } else {
            this.inicial.insertCaracter(valor);
        }
    }
    // Mostrar valors de les branques esquerres
    public void mostrarBranquesEsquerres() {
        if (this.inicial != null) {
            this.inicial.mostrarBranquesEsquerres();
        }
    }
}

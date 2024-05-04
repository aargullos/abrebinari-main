public class ArbreEnters {
    private static int instancies = 0;
    private NodoArbreEnters inicial;
    private int fondaria;

    // Constructor de la clase ArbreEnters
    public ArbreEnters(int fondaria) {
        this.inicial = null;
        this.fondaria = fondaria;
        instancies++;
    }

    public static int getInstancies() {
        return instancies;
    }

    // Insertar un nou caràcter a l'abre
    public void insertaEnter(int valor) {
        if (this.inicial == null) {
            this.inicial = new NodoArbreEnters(valor);
        } else {
            this.inicial.insertEnter(valor);
        }
    }

    // Mostrar valors de les branques dretes.
    public void mostrarBranquesDretes() {
        if (this.inicial != null) {
            this.inicial.mostrarBranquesDretes();
        }
    }

    // Mostrar valors de les branques esquerras.
    public void mostrarBranquesEsquerres() {
        if (this.inicial != null) {
            this.inicial.mostrarBranquesEsquerres();
        }
    }

}

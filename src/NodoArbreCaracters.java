public class NodoArbreCaracters {
    private char valor;
    private NodoArbreCaracters nodoEsq;
    private NodoArbreCaracters nodoDret;

    // Constructor per crear un nou nodo caracters
    public NodoArbreCaracters(char valor) {
        this.valor = valor;
        this.nodoEsq = null;
        this.nodoDret = null;
    }

    // Funció per insertar un nou valor a l'arbre
    public void insertCaracter(char _valor) {
        if (_valor < this.valor) {
            // Insert esquerra
            if (this.nodoEsq == null) {
                this.nodoEsq = new NodoArbreCaracters(_valor);
            } else {
                this.nodoEsq.insertCaracter(_valor);
            }
        } else {
            // Insert dret
            if (this.nodoDret == null) {
                this.nodoDret = new NodoArbreCaracters(_valor);
            } else {
                this.nodoDret.insertCaracter(_valor);
            }
        }
    }

    // Mostrar les branques esquerras
    public void mostrarBranquesEsquerres() {
        if (this.nodoEsq != null) {
            System.out.println(this.valor);
            this.nodoEsq.mostrarBranquesEsquerres();
        }
    }
}
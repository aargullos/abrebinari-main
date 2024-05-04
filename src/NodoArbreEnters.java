public class NodoArbreEnters {
    private int valor;
    private NodoArbreEnters nodoEsq;
    private NodoArbreEnters nodoDret;

    // Constructor per crear un nou nodo enters
    public NodoArbreEnters(int valor){
        this.valor=valor;
        this.nodoEsq=null;
        this.nodoDret=null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoArbreEnters getNodoEsq() {
        return nodoEsq;
    }

    public NodoArbreEnters getNodoDret() {
        return nodoDret;
    }
    // Funció per insertar un nou valor a l'arbre
    public void insertEnter(int _valor){
        if(_valor < this.valor){
            // Insert esquerra
            if(this.nodoEsq == null){
                this.nodoEsq = new NodoArbreEnters(_valor);
            }else {
                this.nodoEsq.insertEnter(_valor);
            }
        }else {
            // Insert dret
            if (this.nodoDret == null){
                this.nodoDret = new NodoArbreEnters(_valor);
            }else {
                this.nodoDret.insertEnter(_valor);
            }
        }
    }
    // Mostrar les branques dretas
    public void mostrarBranquesDretes() {
        if (this.nodoDret != null) {
            System.out.println(this.valor);
            this.nodoDret.mostrarBranquesDretes();
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

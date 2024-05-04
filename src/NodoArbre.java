public class NodoArbre {
    private int valor;
    private NodoArbre nodoEsq;
    private NodoArbre nodoDret;

    // Constructor per crear un nou nodo
    public NodoArbre(int valor){
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

    public NodoArbre getNodeEsq() {
        return nodoEsq;
    }

    public NodoArbre getNodoDret() {
        return nodoDret;
    }

    // Funció per insertar un nou valor a l'arbre
    public void insert(int _valor){
        if(_valor < this.valor){
            //Insert del costat esquerra
            if(this.nodoEsq == null){
                this.nodoEsq = new NodoArbre(_valor);
            }else {
                this.nodoEsq.insert(_valor);
            }
        }else {
            //Insert del costat dret
            if (this.nodoDret == null){
                this.nodoDret = new NodoArbre(_valor);
            }else {
                this.nodoDret.insert(_valor);
            }
        }
    }
}

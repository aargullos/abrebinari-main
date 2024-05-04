public class Arbre {
    NodoArbre inicial;

    public Arbre(){
        this.inicial = null;
    }

    // Insertar nou valor a l'arbre.
    public void insertat(int valor){
        if(this.inicial == null){
            this.inicial = new NodoArbre(valor);
        }else{
            this.inicial.insert(valor);
        }
    }
}

//Crear una classe Principal que s’encarregui de fer les següents tasques:
public class Principal {
    public static void main(String[] args) {
        //A. Crear 2 Arbres d’enters de fondaria 5
        ArbreEnters arbreEnters1 = new ArbreEnters(5);
        ArbreEnters arbreEnters2 = new ArbreEnters(5);

        //B. Mostrar quantes instàncies existeixen d’arbres
        System.out.println("Instàncies dels arbres enters:" + ArbreEnters.getInstancies());

        //C. Crear 2 Arbres de caràcters de fondaria 3
        ArbreCaracters arbreCaracters1 = new ArbreCaracters(3);
        ArbreCaracters arbreCaracters2 = new ArbreCaracters(3);

        //D. Mostrar quantes instàncies existeixen d’arbres
        System.out.println("Instàncies dels arbres enters:" + ArbreEnters.getInstancies());
        System.out.println("Instàncies dels arbres caràcters:" + ArbreCaracters.getInstancies());

        //E. Forçar al Garbage Collector
        System.gc();

        // F. Recorrer el primer arbre d’enters i mostrant els valors per pantalla,
        // fent servir unica i exclusivament les branques dretes.
        System.out.println("Recorregut del arbre d'enter el 1 per les branques dretes:");
        arbreEnters1.mostrarBranquesDretes();

        // G. Recorrer el segon arbre d’enters i mostrant els valors per pantalla,
        // fent servir unica i exclusivament les branques esquerres.
        System.out.println("Recorregut del arbre d'enter 2 per les branques esquerras:");
        arbreEnters2.mostrarBranquesEsquerres();

        //H. Tornar a mostrar quantes instàncies existeixen d'arbres
        System.out.println("Instàncies dels arbres enters:" + ArbreEnters.getInstancies());
        System.out.println("Instàncies dels arbres caràcters:" + ArbreCaracters.getInstancies());

        //I. Tornar a forçar al Garbage Collector
        System.gc();

        //J. Tornar a mostrar quantes instàncies existeixen
        System.out.println("Instàncies dels arbres enters:" + ArbreEnters.getInstancies());
        System.out.println("Instàncies dels arbres caràcters:" + ArbreCaracters.getInstancies());
    }
}

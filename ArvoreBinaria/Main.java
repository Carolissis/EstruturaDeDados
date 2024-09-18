public class Main{
    public static void main(String []args){

    }
}

class Node{
    public int valor;
    public Node esquerda, direita;

    public Node(int valor){
        this.valor = valor;
        this.direita = this.esquerda = null;
    }
}

class ArvoreBinaria{
    public Node raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }
    
}
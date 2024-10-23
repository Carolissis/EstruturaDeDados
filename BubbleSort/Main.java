public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(5);
        bubbleSort.adicionarElemento(5);
        bubbleSort.adicionarElemento(2);
        bubbleSort.adicionarElemento(9);
        bubbleSort.adicionarElemento(1);
        bubbleSort.adicionarElemento(3);

        System.out.println("Antes da ordenação:");
        bubbleSort.imprimirLista();

        bubbleSort.ordenarBubble();

        System.out.println("Depois da ordenação:");
        bubbleSort.imprimirLista();
    }
}

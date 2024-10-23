public class BubbleSort {
    private StaticList<Integer> listaBubble;
    private int tamanho;

    public BubbleSort(int tam) {
        this.listaBubble = new StaticList<>(tam);
        this.tamanho = tam;
    }

    public void ordenarBubble() {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                int menor = (Integer) listaBubble.getData(j);
                int maior = (Integer) listaBubble.getData(j + 1);

                if (menor > maior) {
                    listaBubble.setData(maior, j);
                    listaBubble.setData(menor, j + 1);
                }
            }
        }
    }

    public void adicionarElemento(int elemento) {
        listaBubble.add(elemento);
    }

    public void imprimirLista() {
        System.out.println(listaBubble.toString());
    }
}

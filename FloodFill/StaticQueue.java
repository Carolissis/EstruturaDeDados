public class StaticQueue<T> {
    private int top = 0;  // Índice para o próximo item a ser inserido (início)
    private int base = 0; // Índice do próximo item a ser removido (fim)
    private T[] data;
    private int size;
    private int count = 0; // Contador de elementos na fila

    public StaticQueue(int size) {
        this.data = (T[]) new Object[size]; // Criando um array de tamanho fixo
        this.size = size;
    }

    // Método para adicionar (enqueue) um elemento à fila
    public void add(T data) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("Fila Cheia");
        }
        this.data[top] = data; // Adiciona o elemento no índice 'top'
        top = (top + 1) % size; // Incrementa o ponteiro de forma circular
        count++; // Aumenta o contador de elementos na fila
    }

    // Método para remover (dequeue) um elemento da fila
    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila Vazia");
        }
        T dataPop = this.data[base]; // Remove o elemento do índice 'base'
        this.data[base] = null; // Limpa a posição (opcional)
        base = (base + 1) % size; // Incrementa o ponteiro de forma circular
        count--; // Diminui o contador de elementos na fila
        return dataPop;
    }

    // Método para verificar se a fila está cheia
    public boolean isFull() {
        return count == size;
    }

    // Método para verificar se a fila está vazia
    public boolean isEmpty() {
        return count == 0;
    }

    // Método para ver o número de elementos na fila
    public int size() {
        return count;
    }
}

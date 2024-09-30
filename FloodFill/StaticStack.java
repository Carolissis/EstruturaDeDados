public class StaticStack<T> {
    private int top = -1;  // Índice do topo da pilha
    private T[] data;
    private int size;

    public StaticStack(int size) {
        this.data = (T[]) new Object[size]; // Criando um array de tamanho fixo
        this.size = size;
    }

    // Método para adicionar (push) um elemento na pilha
    public void push(T data) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("Pilha Cheia");
        }
        this.data[++top] = data; // Incrementa 'top' e insere o elemento
    }

    // Método para remover (pop) um elemento da pilha
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha Vazia");
        }
        T dataPop = this.data[top]; // Armazena o elemento do topo
        this.data[top--] = null; // Limpa o valor do topo e decrementa o índice
        return dataPop;
    }

    // Método para verificar se a pilha está cheia
    public boolean isFull() {
        return top == size - 1;
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {
        return top == -1;
    }

    // Método para ver o número de elementos na pilha
    public int size() {
        return top + 1; // Retorna o número de elementos na pilha
    }
}


import java.util.Arrays;

public class StaticList<T>{
    private T[] data;
    private int size;

    public StaticList(int size){
        this.data = (T[]) new Object[size];
        this.size = size;
    }
    
    public void add(T data){
        if(isFull()) {
            throw new IllegalStateException("Lista cheia");
        }
        for (int i = 0; i < this.size; i++) {
            if(this.data[i] == null){
                this.data[i] = data;
                break;
            }
        }
    }
    public void add(T data, int pos){
        if(isFull()) {
            throw new IllegalStateException("Lista cheia");
        }
        if(this.data[pos-1] == null){
            throw new IllegalStateException("Não é possivel adicionar nessa posição");
        }
        if (this.data[pos] != null) {
            for (int i = this.size - 1; i > pos; i--) {
                this.data[i] = this.data[i - 1];
            }
        }
        this.data[pos] = data;
    }
    
    public T remove(int pos){
        if(isEmpty()){
            throw new IllegalStateException("Pilha Vazia");
        }
        T dataPop = this.data[pos];
        this.data[pos] = null;
        return dataPop;
    }
    
    public T getData(int pos){
        T x = this.data[pos];
        return x;
    }

    public int getSize(){
        return this.size;
    }

    public int find(T data){
        int pos = -1;
        for (int i = 0; i < this.size; i++) {
            if(this.data[i] == data){
                pos = i;
            }
        }
        return pos;
    }
    public void clear(){
        if(isEmpty()){
            System.out.println("A pilha ja esta vazia");
        }
        Arrays.fill(data, null);
    }
    
    public boolean isFull(){
        for (int i = 0; i < this.size; i++) {
            if(this.data[i] == null){
                return false;
            }
        }
        return true;
    }
    
    public boolean isEmpty(){
        for (int i = 0; i < this.size; i++) {
            if(this.data[i] != null){
                return false;
            }
        }
        return true;
    }  
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (T elem : this.data) {
            if(elem == null){
                sb.append("[ ],");
            }
            else { 
            sb.append("[");
            sb.append(elem);
            sb.append("],");
            }
        }
        sb.append("}");
        return sb.toString();
    }
    
}
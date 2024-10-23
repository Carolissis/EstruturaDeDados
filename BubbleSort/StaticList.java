import java.util.Arrays;

public class StaticList<T> {
    private T[] data;
    private int size;

    public StaticList(int size) {
        this.data = (T[]) new Object[size];
        this.size = size;
    }

    public void add(T data) {
        if (isFull()) {
            throw new IllegalStateException("Lista cheia");
        }
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == null) {
                this.data[i] = data;
                break;
            }
        }
    }

    public T getData(int pos) {
        return this.data[pos];
    }

    public void setData(T data, int pos) {
        this.data[pos] = data;
    }

    public boolean isFull() {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == null) {
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
            sb.append(elem == null ? "[ ]" : "[" + elem + "]");
            sb.append(",");
        }
        sb.append("}");
        return sb.toString();
    }
}

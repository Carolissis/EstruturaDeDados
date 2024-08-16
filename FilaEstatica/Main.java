
public class Main{
    public static void main(String []args){

        StaticQueue<Integer> filaEstatica = new StaticQueue<>(7);

        filaEstatica.add(1);
        filaEstatica.add(2);
        filaEstatica.add(3);
        System.out.println(filaEstatica.toString());
        filaEstatica.remove();
        System.out.println(filaEstatica.toString());
        filaEstatica.remove();
        System.out.println(filaEstatica.toString());
        filaEstatica.add(4);
        filaEstatica.add(5);
        System.out.println(filaEstatica.toString());
        filaEstatica.remove();
        System.out.println(filaEstatica.toString());
        filaEstatica.add(6);
        filaEstatica.add(7);
        System.out.println(filaEstatica.toString());
        filaEstatica.remove();
        System.out.println(filaEstatica.toString());
        filaEstatica.remove();
        System.out.println(filaEstatica.toString());
        filaEstatica.remove();
        System.out.println(filaEstatica.toString());
    }
}
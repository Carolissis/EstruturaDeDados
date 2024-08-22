
public class Main{
    public static void main(String []args){

        StaticList<Integer> listaEstatica = new StaticList<>(4);

        listaEstatica.add(1);
        System.out.println(listaEstatica.toString());
        listaEstatica.add(2,1);
        listaEstatica.add(3);
        System.out.println(listaEstatica.toString());
        listaEstatica.add(4,1);
        System.out.println(listaEstatica.toString());
        listaEstatica.clear();
        System.out.println(listaEstatica.toString());
        listaEstatica.add(5);
        listaEstatica.add(6);
        listaEstatica.add(7,2);
        System.out.println(listaEstatica.toString());
        listaEstatica.remove(1);
        System.out.println(listaEstatica.toString());
        listaEstatica.add(8,1);
        System.out.println(listaEstatica.toString());
        System.out.println(listaEstatica.getData(1));
        System.out.println(listaEstatica.find(5));
        listaEstatica.clear();
        System.out.println(listaEstatica.toString());
        listaEstatica.add(7,2);
        System.out.println(listaEstatica.toString());

    }
}
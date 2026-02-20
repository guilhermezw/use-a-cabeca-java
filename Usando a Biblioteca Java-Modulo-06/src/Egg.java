import java.util.ArrayList;

public class Egg {
    static void main() {
        ArrayList<Egg> myList = new ArrayList<Egg>();

        Egg egg1 = new Egg();
        myList.add(egg1);

        Egg egg2 = new Egg();
        myList.add(egg2);

        int theSize = myList.size(); // O ArrayList está armazenando 2 objetos. Logo, o método size() retorna 2.

        boolean isIn = myList.contains(egg1); // O ArrayList CONTÈM o objeto Egg referenciado por "egg", então contains() retorna true

        int idx = myList.indexOf(egg2); // ArrayList é baseado em zero (ou seja, o primeiro índice é 0, e como o objeto referenciado por "egg2" era o segundo item na lista, indexof() retorna 1.

        boolean empty = myList.isEmpty(); // Com certeza NÃO está vazio, então isEmpty() retorna false.

        myList.remove(egg1);
    }
}

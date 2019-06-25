public class Main {

    public static void main(String[] args) {
        DLinkedList<String> DLinkedList = new DLinkedList<String>();
        DLinkedList.addFirst("a");
        DLinkedList.addFirst("b");
        System.out.println("Tamanho: " + DLinkedList.size());
        System.out.println("Está vazia? " + DLinkedList.isEmpty());
        System.out.println(DLinkedList.getFirst());
        System.out.println(DLinkedList.getLast());

    }
}

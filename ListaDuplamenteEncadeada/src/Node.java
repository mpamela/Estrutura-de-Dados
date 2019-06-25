public class Node<T> {
    private Node<T> previous;
    private Node<T> next;
    private T value;
    //Define value do nó.
    public void setValue(T valor) {

        this.value = valor;
    }
    //Retorna value do nó.
    public T getValue() {
        return value;
    }
    //Define nó previous.
    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
    //Retorna nó previous
    public Node<T> getPrevious() {
        return previous;
    }
    //Define next nó.
    public void setNext(Node<T> next) {
        this.next = next;
    }
    //Retorna next nó
    public Node<T> getNext() {
        return next;
    }
}

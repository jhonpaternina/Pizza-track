public class Pila {
    Nodo tope;
    public void push(Pizza p){ Nodo n=new Nodo(p); n.sig=tope; tope=n; }
    public Pizza pop(){ if(tope==null) return null; Pizza p=tope.dato; tope=tope.sig; return p; }
    public Pizza peek(){ if(tope==null) return null; return tope.dato; }
    public boolean isEmpty(){ return tope==null; }
}
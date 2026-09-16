public class GestionPedidos {
    Pila pila1 = new Pila();
    Pila pila2 = new Pila();
    public void registrar(Pizza p){ pila1.push(p); pila2 = new Pila(); }
    public void deshacer(){ if(!pila1.isEmpty()) pila2.push(pila1.pop()); }
    public void rehacer(){ if(!pila2.isEmpty()) pila1.push(pila2.pop()); }
    public void actual(){
        if(pila1.isEmpty()) System.out.println("Pila vacia");
        else System.out.println("Actual: " + pila1.peek());
    }
}
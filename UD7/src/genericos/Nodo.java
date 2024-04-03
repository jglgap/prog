package genericos;

public class Nodo<V>{
	  private Nodo sig;
	  private V dato;
	  public Nodo(V dato) {
	    this.dato = dato;
	    this.sig=null;
	  }
	  public Nodo(V dato, Nodo sig) {
	    this.dato = dato;
	    this.sig = sig;
	  }
	  public void setSiguiente(Nodo sig) {
	    this.sig = sig;
	  }
	  public Nodo getSiguiente() {
	    return sig;
	  }
	  public V getDato() {
	    return dato;
	  }
}

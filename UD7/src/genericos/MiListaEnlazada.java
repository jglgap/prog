package genericos;

public class MiListaEnlazada<T> {
	
	private Nodo<T> primero=null;
    
	public void insertar(int dato){
        if(primero==null){
            primero=new Nodo(dato);
        }else{
            Nodo<T> temp= new Nodo(dato,primero);
            primero=temp;
        }
            
    }
    public int tamano(){
        int i=0;
        Nodo <T> temp=primero;
        while(temp!=null){
            i++;
            temp=temp.getSiguiente();
        }
        return i;
    }
    public int obtener(int indice){
        Nodo<T> temp=primero;
        int i=0;
        while(i<indice){
            temp= temp.getSiguiente();
            i++;
        }
             
        return (int) temp.getDato();
    }
	
}

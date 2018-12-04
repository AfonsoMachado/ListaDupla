package listadupla;

/**
 *
 * @author afonso
 */
public class ListaDupla {
    
    private No first;
    private No last;  
    private int size = 0;
    
    public No Buscar(Object valor){
      No aux = this.first;      
      while(aux != null){
         if(valor.equals(aux.getData())){
            return aux;
         }
         aux = aux.getNext();
      }
        System.out.println("Elemento não existente");
      return null;
   }
    
    public void insereFinal(Object data) {
        No aux = new No(data, null, this.last);
        if(this.last != null)
            this.last.setNext(aux);
        this.last = aux;
        if(this.first == null)
            this.first = aux;
        size++;
       
    }
    
    public void insereInicio(Object data) {
        No aux = new No(data, this.first, null);
        if(this.first != null)
            this.first.setPrev(aux);
        this.first = aux;
        if(this.last == null)
            this.last = aux;
        size++;
    }
    
    public No removeFinal(){
        if(size == 0)
            System.out.println("LISTA VAZIA!");
        No aux = this.last;
        this.last = this.last.getPrev();
        this.last.setNext(null);
        size--;
        return aux;
        
    }
    
    public No removeInicio(){
        if(size == 0)
            System.out.println("LISTA VAZIA!");
        No aux = this.first;
        this.first = this.first.getNext();
        this.first.setPrev(null);
        size--;
        return aux;
    }
    
    public No remove(Object valor) {
        if(this.first == this.last) {
            No aux = this.first;
            this.first = null;
            this.last = null;
            return aux;
        }
        No aux = Buscar(valor);
        No p = aux.getPrev();
        No n = aux.getNext();
        
        p.setNext(n);
        n.setPrev(p);
        
        return aux;
    }
    
    public void insertAfter(Object item, Object valornovo) {
        No novo = new No();
        novo.setData(valornovo);
        No aux = this.first;
        No aux2 = this.first.getNext();
        while (aux.getData() != item) {            
            aux = aux.getNext();
            aux2 = aux2.getNext();
        }
        novo.setNext(aux2);
        aux2.setPrev(novo);
        aux.setNext(novo);
        novo.setPrev(aux);
    }
    
    public void insertBefore(Object item, Object valornovo) {
        No novo = new No();
        novo.setData(valornovo);
        No aux = this.first;
        while (aux.getData() != item) {            
            aux = aux.getNext();
        }
        No aux2 = aux.getPrev();
        aux.setPrev(novo);
        aux2.setNext(novo);
        novo.setNext(aux);
        novo.setPrev(aux2);
    }
    
    public void removeAfter(Object item) {
        No aux = this.first;
        while (aux.getData() != item) {            
            aux = aux.getNext();
        }
        No aux2 = aux.getNext();
        aux2 = aux2.getNext();
        aux.setNext(aux2);
        aux2.setPrev(aux);   
    }
    
    public void removeBefore(Object item) {
        No aux = this.first;
        while (aux.getData() != item) {            
            aux = aux.getNext();
        }
        No aux2 = aux.getPrev();
        aux2 = aux2.getPrev();
        aux.setPrev(aux2);
        aux2.setNext(aux); 
    }
    
    
    
    
}

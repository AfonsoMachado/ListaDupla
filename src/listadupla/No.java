/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadupla;

/**
 *
 * @author afonso
 */
public class No {
    
   private No prev;      
   private No next;
   private Object data;      

    No(Object data, No next, No prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
        
    }

    No() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   //Define data do nó.
   public void setData(Object data) {
      this.data = data;
   }
   //Retorna data do nó.
   public Object getData() {
      return data;
   }
   //Define nó prev.
   public void setPrev(No prev) {
      this.prev = prev;
   }
   //Retorna nó prev
   public No getPrev() {
      return prev;
   }
   //Define next nó.
   public void setNext(No next) {
      this.next = next;
   }
   //Retorna next nó
   public No getNext() {
      return next;
   }
    
    
}

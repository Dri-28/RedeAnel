/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoredeanel;
import No.No;





/**
 *
 * @author adria
 */
public class ListaDuplamenteLigadaCircular<X> {
    
    private No<X>primeiro, ultimo;
   
    
    
    public void insere(X n) throws Exception
    {  
      
       No tmp;
          tmp=new No(n);
        if(n==null)
          throw new Exception("Informação Ausente");
        
        if(this.primeiro==null)//lista vazia
            
        {
            this.primeiro=tmp;
           this.ultimo=primeiro;
            
            this.primeiro.ante=tmp;
            this.primeiro.prox=tmp;
        }
        else
        {
        this.ultimo.prox=tmp;
        this.ultimo=ultimo.prox;
        tmp.prox=ultimo.prox;
        tmp.ante=ultimo;
        }
      
      
   
    }
    
    
    public void remove(X i)throws Exception
    {
        if(i==null)
            throw new Exception("Informação Ausente");
        
        if(primeiro.nome.equals(i)) {
            {
              primeiro=null;
              ultimo=null;
                      
            }
            
            
          No  aux=primeiro;
          No anterior;
            while(!aux.prox.getNome().equals(i))
            {
                aux=aux.prox;
                anterior=aux;
            }
               aux.ante.setProx(aux.prox);
               aux.prox.ante.setAnte(aux.ante);
                   
           
           
        }     
                  
    }

    
    
   public String toString()
   {
       String ret="{";
            
            No atual= this.primeiro;
            
            while(atual!=null)
            {
               ret=ret+ atual.getNome()+" ";
               
               if(atual!=this.primeiro);
                 ret=ret+",";
                 
                 atual=atual.getProx();
            }
        return ret +"}";
            
        }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No;

/**
 *
 * @author adria
 */
public class No<X> {
    
    public  No prox;
    public No ante;
    public X nome;
    private No Ok_Proximo;
    private No Ok_Anterior;
    
    No primeiro;
    
    
    public No(X n,No p,No a)
    {
        this.nome=n;
        this.ante=a;
        this.prox=p;
    }
    
    public No(X n)
    {
        this.nome=n;
        this.prox=this;
        this.ante=this;
    }
    
    public void setNome(X n)
    {
        this.nome=n;
    }
    
    public X getNome()
    {
        return this.nome;
    }
    public No getAnterior()
    {
        return this.ante;
    }    
    
    public No getProx()
    {
        return this.prox;
    }
    
    public void setAnte(No a)
    {
        this.ante=a;
    }
    
    public void setProx(No p)
    {
        this.prox=p;
    }
    
    public String toString()
   {
       String ret="{";
       
       No atual=this.primeiro;
       
       while(atual!=null)
       {
           
       
         ret += "("+atual.getNome()+" "+")";
         atual= atual.getProx();
   }
   return ret;
}
}

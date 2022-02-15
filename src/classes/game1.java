
package classes;


public class game1 {
    
     private String nome;
    
    public void game1(){
        
    }
    public void game1(String nome){
        this.nome = nome;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void recebedados (String nome){
        setNome(nome);
    }
    public void mostradados (String nome){
        System.out.println("Nome:" + this.getNome());
        
        
    }
        
    
    
}

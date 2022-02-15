package telas;
public class ControllerLogado {
    static String nome;
    static String senha;
    static int idLogado;
    static String maiorPontuacao;
    static String ultimaJogada;
    static String dataUltimaJogada;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String user) {
        nome = user;
    }
    
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senh) {
        senha = senh;
    }
    
    public int getId() {
        return idLogado;
    }
    public void setId(int id) {
        idLogado = id;
    }
    
    public String getMaiorPontuacao() {
        return maiorPontuacao;
    }
    public void setMaiorPontuacao(String pt) {
        System.out.println(pt);
        maiorPontuacao = pt;
    }
    
    public String getUltimaJogadaPT() {
        return ultimaJogada;
    }
    public void setUltimaJogadaPT(String pt) {
        System.out.println(pt);
        ultimaJogada = pt;
    }
    
    public String getUltimaJogadaDT() {
        return dataUltimaJogada;
    }
    public void setUltimaJogadaDT(String pt) {
        System.out.println(pt);
        dataUltimaJogada = pt;
    }
}

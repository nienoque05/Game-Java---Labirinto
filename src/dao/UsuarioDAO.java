package dao;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
import telas.ControllerUsuario;
import telas.ControllerLogado;

public class UsuarioDAO { 

    public boolean verificarSeExiste(ControllerUsuario usuario){ 
        boolean result = true; 
        try {
            final String url = "jdbc:mysql://g84t6zfpijzwx08q.cbetxkdyhwsb.us-east-1.rds.amazonaws.com/umd3cq1j5wexzz4d?useUnicode=true&characterEncoding=utf-8";
            final String user = "sgsiihodbv1c08mj";
            final String pass = "zxkuwxse8ddlrata";
            Connection connection = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT * FROM usuarios WHERE nome = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
            result = false;
            }
            stmt.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return result;
    } 
    
        public boolean addUser(ControllerUsuario usuario){ 
        boolean result = true; 
        try {
            final String url = "jdbc:mysql://g84t6zfpijzwx08q.cbetxkdyhwsb.us-east-1.rds.amazonaws.com/umd3cq1j5wexzz4d?useUnicode=true&characterEncoding=utf-8";
            final String user = "sgsiihodbv1c08mj";
            final String pass = "zxkuwxse8ddlrata";
            Connection connection = DriverManager.getConnection(url, user, pass);
            String sql = "INSERT INTO usuarios(nome,senha) VALUES(?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return result;
    } 
        
    public boolean logar(ControllerUsuario usuario){ 
        boolean result = false; 
        try {
            final String url = "jdbc:mysql://g84t6zfpijzwx08q.cbetxkdyhwsb.us-east-1.rds.amazonaws.com/umd3cq1j5wexzz4d?useUnicode=true&characterEncoding=utf-8";
            final String user = "sgsiihodbv1c08mj";
            final String pass = "zxkuwxse8ddlrata";
            Connection connection = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT * FROM usuarios WHERE nome = ? and senha = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());            
            stmt.setString(2, usuario.getSenha());            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                ControllerLogado logado = new ControllerLogado();
                logado.setNome(rs.getString("nome"));
                logado.setSenha(rs.getString("senha"));
                logado.setId(rs.getInt("id_usuarios"));
                System.out.println();
                
            result = true;
            }
            stmt.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return result;
    } 
    
        public void pontuacaoMax(String id){ 
            try {
                ControllerLogado logado = new ControllerLogado();
                final String url = "jdbc:mysql://g84t6zfpijzwx08q.cbetxkdyhwsb.us-east-1.rds.amazonaws.com/umd3cq1j5wexzz4d?useUnicode=true&characterEncoding=utf-8";
                final String user = "sgsiihodbv1c08mj";
                final String pass = "zxkuwxse8ddlrata";
                Connection connection = DriverManager.getConnection(url, user, pass);
                String pontuacao = "SELECT max(pontuacao) as pontuacao, nome, id_usuario FROM rankings where id_usuario = ?";
                PreparedStatement smtp = connection.prepareStatement(pontuacao);
                smtp.setInt(1, logado.getId());    
                ResultSet rs = smtp.executeQuery();
                if(rs.getInt("id_usuario") > 0){
                    System.out.println(rs.getString("pontuacao"));
                    logado.setMaiorPontuacao(rs.getString("pontuacao"));
                }else{
                    logado.setMaiorPontuacao("0");
                }
                smtp.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
            
        }
        
        public void ultimaJogada(String id){ 
            try {
                ControllerLogado logado = new ControllerLogado();
                final String url = "jdbc:mysql://g84t6zfpijzwx08q.cbetxkdyhwsb.us-east-1.rds.amazonaws.com/umd3cq1j5wexzz4d?useUnicode=true&characterEncoding=utf-8";
                final String user = "sgsiihodbv1c08mj";
                final String pass = "zxkuwxse8ddlrata";
                Connection connection = DriverManager.getConnection(url, user, pass);
                String pontuacao = "SELECT max(createdAt) as ultimaJogada, pontuacao, id_usuario FROM rankings where id_usuario = ?;";
                PreparedStatement smtp = connection.prepareStatement(pontuacao);
                smtp.setInt(1, logado.getId());    
                ResultSet rs = smtp.executeQuery();
                System.out.println(rs.next());
                System.out.println(rs.getInt("id_usuario"));
                System.out.println(rs.getInt("pontuacao"));
                if(rs.getInt("id_usuario") > 0){
                    logado.setUltimaJogadaPT(rs.getString("pontuacao"));
                    logado.setUltimaJogadaDT(rs.getString("ultimaJogada"));
                    System.out.println("dao.UsuarioDAO.pontuacaoMax()");
                }else{
                    logado.setUltimaJogadaPT("0");
                    logado.setUltimaJogadaDT("");
                }
                smtp.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
            
        }
       
}

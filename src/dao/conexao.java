
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexao {
    public Connection conexao() throws SQLException{ 

        final String url = "jdbc:mysql://g84t6zfpijzwx08q.cbetxkdyhwsb.us-east-1.rds.amazonaws.com/umd3cq1j5wexzz4d?useUnicode=true&characterEncoding=utf-8";
        final String user = "sgsiihodbv1c08mj";
        final String pass = "zxkuwxse8ddlrata";
        Connection connection = DriverManager.getConnection(url, user, pass);
        return connection;
    }
}

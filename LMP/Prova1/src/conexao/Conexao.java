/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class Conexao {
    public static Connection getConexao() throws SQLException, ClassNotFoundException {
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://143.106.241.3/cl202232";
        String user = "cl202232";
        String senha = "Th30n3Wh0Kn0ck$";
        Class.forName(driver);
        return DriverManager.getConnection(url, user, senha);
    }
}

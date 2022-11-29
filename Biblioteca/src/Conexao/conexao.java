/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
 import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author beatr
 */
public class conexao {
    public Statement stm;
    public ResultSet rs;
    private final String driver = com.microsoft.sqlserverljdbc.SQLServerDriver;
    private final String caminho ="jdbc:sqlserver://localhost:1433;/" + "databaseName=Biblioteca";
    private final String usuario = "root";
    private final String senha = "";
    public Connection con;
    
     public void Conexao () throws SQLException{
         try {
             System.setProperty("jdbc.Drivers", driver);
             con = DriverManager.getConnection(caminho, usuario, senha);
             JOptionPane.showMessageDialog(null, "Conectado");
         } catch (Exception e){
             JOptionPane.showMessageDialog(null, "Erro" + e.getMessage());
         }
     }
    
}

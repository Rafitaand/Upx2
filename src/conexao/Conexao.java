package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    // Definindo os parâmetros de conexão com o banco
    private static final String url = "jdbc:mysql://localhost:3306/exemplobd";
    private static final String user = "rafa";
    private static final String password = "rafaella23";

    // Instância estática de conexão
    private static Connection conn;

    // Método para obter a conexão
    public static Connection getConexao(){

        try{
            // Verifica se a conexão já foi criada
            if (conn == null) {
                // Cria a conexão caso ainda não exista
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            } else {
                // Retorna a conexão existente
                return conn;
            }
        } catch (SQLException e) {
            // Imprime o erro caso a conexão falhe
            e.printStackTrace();
            return null;
        }
    }
}

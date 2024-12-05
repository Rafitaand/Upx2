package DAO;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import entidade.Usuario;
import conexao.Conexao;

public class UsuarioDAO {

    // Método para cadastrar um usuário no banco de dados
    public void cadastrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO USUARIO (CIDADE, NTU, QUALIDADE) VALUES (?, ?, ?)";

        PreparedStatement ps = null;

        try {
            // Obtém a conexão e prepara a declaração SQL
            ps = Conexao.getConexao().prepareStatement(sql);

            // Substitui os parâmetros da consulta com os valores do objeto usuario
            ps.setString(1, usuario.getCidade());
            ps.setString(2, usuario.getNtu());
            ps.setString(3, usuario.getQualidade());

            // Executa a consulta
            ps.executeUpdate(); // Use executeUpdate() para comandos INSERT/UPDATE/DELETE
        } catch (SQLException e) {
            // Caso ocorra um erro, imprime a stack trace da exceção
            e.printStackTrace();
        } finally {
            // Certifique-se de fechar o PreparedStatement após o uso
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

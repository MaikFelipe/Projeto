/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author LASEDi 1781
 */
import model.Usuario;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao {

    public void cadastrarUsuario(Usuario u) throws SQLException {
        String sql = "INSERT INTO usuario (nomeCompleto, cpf, email, telefone, cargo, login, senha, nivelAcesso) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, u.getNomeCompleto());
            stmt.setString(2, u.getCpf());
            stmt.setString(3, u.getEmail());
            stmt.setString(4, u.getTelefone());
            stmt.setString(5, u.getCargo());
            stmt.setString(6, u.getLogin());
            stmt.setString(7, u.getSenha());
            stmt.setString(8, u.getNivelAcesso());
            stmt.executeUpdate();
        }
    }

    public Usuario buscarPorLogin(String login) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE login = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, login);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Usuario u = new Usuario();
                    u.setId(rs.getInt("id"));
                    u.setNomeCompleto(rs.getString("nomeCompleto"));
                    u.setCpf(rs.getString("cpf"));
                    u.setEmail(rs.getString("email"));
                    u.setTelefone(rs.getString("telefone"));
                    u.setCargo(rs.getString("cargo"));
                    u.setLogin(rs.getString("login"));
                    u.setSenha(rs.getString("senha"));
                    u.setNivelAcesso(rs.getString("nivelAcesso"));
                    return u;
                }
            }
        }
        return null;
    }
}

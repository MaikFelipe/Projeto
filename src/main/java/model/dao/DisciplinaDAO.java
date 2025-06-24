/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Disciplina;
import model.util.Conexao;

/**
 *
 * @author LASEDi 1781
 */
public class DisciplinaDAO {
    
    public void inserir(Disciplina disciplina) throws SQLException {
        String sql = "INSERT INTO disciplina (nome) VALUES (?)";
        try (Connection conn = Conexao.getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, disciplina.getNome());
            stmt.executeUpdate();      
        }
    }
    
    public Disciplina buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM disciplina WHERE id = ?";
        try (Connection conn = Conexao.getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return montarDisciplina;
            }
        }
    }
}

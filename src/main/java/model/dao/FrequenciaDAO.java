/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

/**
 *
 * @author LASEDi 1781
 */
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Frequencia;

public class FrequenciaDAO {

    private Connection conexao;

    public FrequenciaDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void salvar(Frequencia f) throws SQLException {
        String sql = "INSERT INTO frequencia (aluno_id, turma_id, data, presente) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, f.getAlunoId());
            stmt.setInt(2, f.getTurmaId());
            stmt.setDate(3, Date.valueOf(f.getData()));
            stmt.setBoolean(4, f.isPresente());
            stmt.executeUpdate();
        }
    }

    public List<Frequencia> listarPorTurma(int turmaId) throws SQLException {
        List<Frequencia> lista = new ArrayList<>();
        String sql = "SELECT * FROM frequencia WHERE turma_id = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, turmaId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Frequencia f = new Frequencia(
                    rs.getInt("aluno_id"),
                    rs.getInt("turma_id"),
                    rs.getDate("data").toLocalDate(),
                    rs.getBoolean("presente")
                );
                lista.add(f);
            }
        }
        return lista;
    }
}
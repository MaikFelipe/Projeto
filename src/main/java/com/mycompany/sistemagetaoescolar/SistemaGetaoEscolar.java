/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemagetaoescolar;

/**
 *
 * @author LASEDi 1781
 */
import model.util.Conexao;
public class SistemaGetaoEscolar {
    public static void main(String[] args) {
        try {
            Conexao.conectar();
            System.out.println("Conexoo bem sucedida!");
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
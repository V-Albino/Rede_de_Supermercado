/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import my.conexao.conexao;
import cadastro.funcionario;
import my.model.funcionarios;
/**
 *
 * @author Acer
 */
public class funcionarioDao {
    public funcionarioDao() {
    }
    
    public void InserirFuncionario(funcionarios a){
    try {
        String SQL="INSERT INTO victor_brandao.FUNCIONARIO (nome, cpf, cargo, email, telefone)VALUES(?,?,?,?,?)";
        Connection c = conexao.getConexao();
        PreparedStatement comando = c.prepareStatement(SQL);
        comando.setString(1, a.getNome());
        comando.setString(2, a.getCpf());
        comando.setString(3, a.getCargo());
        comando.setString(4, a.getEmail());
        comando.setString(5, a.getTelefone());
        int retorno=comando.executeUpdate();
        c.close();
        if(retorno>0){
            JOptionPane.showMessageDialog(null,"Funcionario "+a.getNome()+ " inserido com sucesso");
        }else{
            JOptionPane.showMessageDialog(null,"Erro ao inserir o Funcionario: "+a.getNome()+ ". Verifique os LOGs");
        }
    } catch (SQLException ex) {
        Logger.getLogger(funcionarioDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
        public void AtualizarFuncionario(funcionarios a){
    try {
        String SQL="UPDATE victor_brandao.FUNCIONARIO SET nome = ?, cpf = ?, cargo = ?, email = ?, telefone = ?";
        Connection c = conexao.getConexao();
        PreparedStatement comando = c.prepareStatement(SQL);
        comando.setString(1, a.getNome());
        comando.setString(2, a.getCpf());
        comando.setString(3, a.getCargo());
        comando.setString(4, a.getEmail());
        comando.setString(5, a.getTelefone());
        int retorno=comando.executeUpdate();
        c.close();
        if(retorno>0){
            JOptionPane.showMessageDialog(null,"Funcionario "+a.getNome()+ " inserido com sucesso");
        }else{
            JOptionPane.showMessageDialog(null,"Erro ao inserir o Funcionario: "+a.getNome()+ ". Verifique os LOGs");
        }
    } catch (SQLException ex) {
        Logger.getLogger(funcionarioDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}

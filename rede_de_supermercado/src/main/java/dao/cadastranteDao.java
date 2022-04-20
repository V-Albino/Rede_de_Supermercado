/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import cadastro.cadastrante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import my.conexao.conexao;
import my.model.cadastrantes;
/**
 *
 * @author Acer
 */
public class cadastranteDao {
    public cadastranteDao(){
    
    }
    
    public void InserirCadastrante(cadastrantes a){
        try {
            String SQL="INSERT INTO victor_brandao.CADASTRANTE (cpf, nome, email, telefone)VALUES(?,?,?,?)";
            Connection c = conexao.getConexao();
            PreparedStatement comando = c.prepareStatement(SQL);
            comando.setString(1, a.getCpf());
            comando.setString(2, a.getNome());
            comando.setString(3, a.getEmail());
            comando.setString(4, a.getTelefone());
            int retorno=comando.executeUpdate();
            c.close();
            if(retorno>0){
                JOptionPane.showMessageDialog(null,"Cadastrante "+a.getNome()+ " inserido com sucesso");
            }else{
                JOptionPane.showMessageDialog(null,"Erro ao inserir o cadastrante: "+a.getNome()+ ". Verifique os LOGs");
            }
        } catch (SQLException ex) {
            Logger.getLogger(cadastranteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void AtualizarCadastrante(cadastrantes a){
        try {
            String SQL="UPDATE victor_brandao.CADASTRANTE SET cpf = ?, nome = ?, email = ?, telefone = ?";
            Connection c = conexao.getConexao();
            PreparedStatement comando = c.prepareStatement(SQL);
            comando.setString(1, a.getCpf());
            comando.setString(2, a.getNome());
            comando.setString(3, a.getEmail());
            comando.setString(4, a.getTelefone());
            int retorno=comando.executeUpdate();
            c.close();
            if(retorno>0){
                JOptionPane.showMessageDialog(null,"Cadastrante "+a.getNome()+ " inserido com sucesso");
            }else{
                JOptionPane.showMessageDialog(null,"Erro ao inserir o cadastrante: "+a.getNome()+ ". Verifique os LOGs");
            }
        } catch (SQLException ex) {
            Logger.getLogger(cadastranteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}

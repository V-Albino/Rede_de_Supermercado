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
import my.model.produtos;
/**
 *
 * @author Acer
 */
public class produtoDao {
    public produtoDao() {  
    }
    public void InserirProduto(produtos a){
            try {
        String SQL="INSERT INTO victor_brandao.PRODUTO (nome, qtde, codigo, preco)VALUES(?,?,?,?)";
        Connection c = conexao.getConexao();
        PreparedStatement comando = c.prepareStatement(SQL);
        comando.setString(1, a.getNome());
        comando.setInt(2, a.getQtde());
        comando.setInt(3, a.getCodigo());
        comando.setString(4, a.getPreco());
        int retorno=comando.executeUpdate();
        c.close();
        if(retorno>0){
            JOptionPane.showMessageDialog(null,"Produto "+a.getNome()+ " inserido com sucesso");
        }else{
            JOptionPane.showMessageDialog(null,"Erro ao inserir o Produto: "+a.getNome()+ ". Verifique os LOGs");
        }
    } catch (SQLException ex) {
        Logger.getLogger(produtoDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public void AtualizaProduto(produtos a){
        try {
            String SQL="UPDATE victor_brandao.PRODUTO SET nome = ?, Qtde = ?, codigo = ?, preco = ?";
            Connection c = conexao.getConexao();
            PreparedStatement comando = c.prepareStatement(SQL);
            comando.setString(1, a.getNome());
            comando.setInt(2, a.getQtde());
            comando.setInt(3, a.getCodigo());
            comando.setString(4, a.getPreco());
            int retorno=comando.executeUpdate();
            c.close();
            if(retorno>0){
                JOptionPane.showMessageDialog(null,"Produto "+a.getNome()+ " inserido com sucesso");
            }else{
                JOptionPane.showMessageDialog(null,"Erro ao inserir o Produto: "+a.getNome()+ ". Verifique os LOGs");
            }
        } catch (SQLException ex) {
            Logger.getLogger(produtoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.model;

/**
 *
 * @author Acer
 */
public class produtos {
    private String nome;
    private int qtde;
    private int codigo;
    private String preco;

    public produtos() {
        this.nome = "";
        this.qtde = 0;
        this.codigo = 0;
        this.preco = "";
    }
    
    public produtos(String nome, int qtde, int codigo, String preco) {
        this.nome = nome;
        this.qtde = qtde;
        this.codigo = codigo;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "" + "" + nome + " | " + qtde + " | " + codigo + " | " + preco + "";
    }
    
}

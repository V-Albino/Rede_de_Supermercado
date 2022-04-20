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
public class funcionarios {
    
    private String nome;
    private String cpf;
    private String cargo;
    private String email;
    private String telefone;

    public funcionarios() {
        this.nome = "";
        this.cpf = "";
        this.cargo = "";
        this.email = "";
        this.telefone = "";
    }
    
    public funcionarios(String cpf, String nome, String cargo,String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.email = email;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "" + "" + nome + " | " + cpf + " | " + cargo + " | " + email + " | " + telefone + "";
    }
}

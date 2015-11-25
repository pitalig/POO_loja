package LojaVirtual;

import java.util.ArrayList;

public class Cliente {

    private String nome, endereco, cep, telefone, cpf, dataNasc;

    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public Cliente(String nome, String endereco, String cep, String telefone, String cpf, String dataNasc) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        clientes.add(this);
    }
    
    public static Object[] toObject() {
        Object[] cliente = new Object[clientes.size()];
        for (int i = 0; i < clientes.size(); i++) {
            cliente[i] = clientes.get(i).nome;
        }
        return cliente;
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }
    
    //SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
}

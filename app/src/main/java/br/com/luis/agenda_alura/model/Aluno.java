package br.com.luis.agenda_alura.model;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Aluno implements Serializable {
    private int id = 0;
    private final String nome;
    private final String telefone;
    private final String email;

    public Aluno(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    @NonNull
    @Override
    public String toString() {
        return nome;
    }

    public void setId(int contadorDeId) {
        this.id = contadorDeId;
    }

    public int getId() {
        return id;
    }
}

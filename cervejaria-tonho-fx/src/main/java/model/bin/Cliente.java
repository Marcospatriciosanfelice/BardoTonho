/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bin;

/**
 *
 * @author Marcos
 */
public class Cliente {
    
    private int cod_cli;
    private string nome;
    private string telefone;

    public int getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(int cod_cli) {
        this.cod_cli = cod_cli;
    }

    public string getNome() {
        return nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }

    public string getTelefone() {
        return telefone;
    }

    public void setTelefone(string telefone) {
        this.telefone = telefone;
    }

    private static class string {

        public string() {
        }
    }
    
    
    
    
}

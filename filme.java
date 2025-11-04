package br.senac.locadora.modelo;

public class Filme {
    private String titulo;
    private double valorLocacao;

    public Filme(String titulo, double valorLocacao) {
        this.titulo = titulo;
        this.valorLocacao = valorLocacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    @Override
    public String toString() {
        return titulo;
    }
}

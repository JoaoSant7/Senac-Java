package br.senac.locadora.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Locacao {
    private Date dataLocacao;
    private List<Filme> listaFilmes;
    private double valorTotalAPagar;

    public Locacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
        this.listaFilmes = new ArrayList<>();
        this.valorTotalAPagar = 0.0;
    }

    public void addFilme(Filme filme) {
        listaFilmes.add(filme);
        valorTotalAPagar += filme.getValorLocacao();
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public List<Filme> getListaFilmes() {
        return listaFilmes;
    }

    public double getValorTotalAPagar() {
        return valorTotalAPagar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(dataLocacao.toString()).append(" ");
        for (Filme f : listaFilmes) {
            sb.append(f.getTitulo()).append(", ");
        }
        sb.append("Total: R$ ").append(valorTotalAPagar);
        return sb.toString();
    }
}

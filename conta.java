package br.senac.locadora.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {
    private Cliente cliente;
    private double saldoDevedor;
    private List<Locacao> historicoLocacao;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldoDevedor = 0.0;
        this.historicoLocacao = new ArrayList<>();
    }

    public void locarFilmes(Filme[] filmes) {
        Locacao locacao = new Locacao(new Date());
        for (Filme f : filmes) {
            if (f != null) {
                locacao.addFilme(f);
            }
        }
        historicoLocacao.add(locacao);
        saldoDevedor += locacao.getValorTotalAPagar();
    }

    public void pagarDebito(double valor) {
        saldoDevedor -= valor;
        if (saldoDevedor < 0) saldoDevedor = 0;
    }

    public String extratoHistorico() {
        StringBuilder sb = new StringBuilder();
        sb.append(".:: Histórico de Locações de ").append(cliente.getNome()).append(" ::.\n");
        for (Locacao loc : historicoLocacao) {
            sb.append(loc.toString()).append("\n");
        }
        sb.append("Saldo Devedor: R$ ").append(saldoDevedor).append("\n");
        return sb.toString();
    }
}

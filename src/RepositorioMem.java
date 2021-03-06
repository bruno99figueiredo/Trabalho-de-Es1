import java.util.ArrayList;

public class RepositorioMem implements Repositorio {
    private ArrayList<Utilizador> UTILIZADOR;
    private ArrayList<TipoUtilizador> TIPO;
    private ArrayList<Requisicao> REQUISICAO;
    private ArrayList<Copia> COPIA;
    private ArrayList<Livro> LIVRO;
    private ArrayList<Emprestimo> EMPRESTIMO;
    private ArrayList<Notificacao> NOTIFICACAO;
    private ArrayList<Devolucao> DEVOLUCAO;
    private ArrayList<Coima> COIMA;
    private ArrayList<Encomenda> ENCOMENDA;
    private ArrayList<EntradaNovoLivro> ENTRADANOVOLIVRO;
    private ArrayList<PropostaAquisicao> PROPOSTAAQUISICAO;
    private ArrayList<RequisicaoCompra> REQUISICAOCOMPRA;
    private ArrayList<GestaoLeitura> GESTAOLEITURA;
    private ArrayList<Leitor> LEITOR;
    private ArrayList<Sala> SALA;
    private ArrayList<UtilizadorSala> UTILIZADORSALA;
    private ArrayList<AluguerSala> ALUGUERSALA;
    private ArrayList<SistemaLimpeza> SISTEMALIMPEZA;

    public RepositorioMem(){
        UTILIZADOR = new ArrayList<>();
        TIPO = new ArrayList<>();
        REQUISICAO = new ArrayList<>();
        COPIA = new ArrayList<>();
        LIVRO = new ArrayList<>();
        EMPRESTIMO = new ArrayList<>();
        NOTIFICACAO = new ArrayList<>();
        DEVOLUCAO = new ArrayList<>();
        COIMA = new ArrayList<>();
        ENCOMENDA = new ArrayList<>();
        ENTRADANOVOLIVRO = new ArrayList<>();
        PROPOSTAAQUISICAO = new ArrayList<>();
        REQUISICAOCOMPRA = new ArrayList<>();
        LEITOR = new ArrayList<>();
        SALA = new ArrayList<>();
        UTILIZADORSALA = new ArrayList<>();
        ALUGUERSALA = new ArrayList<>();
        SISTEMALIMPEZA = new ArrayList<>();
        GESTAOLEITURA = new ArrayList<>();
    }

    public void adicionaUtilizador(Utilizador utilizador) {
        UTILIZADOR.add(utilizador);
    }
    public void adicionaTipoUtilizador(TipoUtilizador tipo){
        TIPO.add(tipo);
    }
    public void adicionaRequisicao(Requisicao requisicao){
        REQUISICAO.add(requisicao);
    }
    public void adicionaCopia(Copia copia){
        COPIA.add(copia);
    }

    public void adicionaLivro(Livro livro){
        LIVRO.add(livro);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo){
        EMPRESTIMO.add(emprestimo);
    }

    public void adicionaNotificacao(Notificacao notificacao){
        NOTIFICACAO.add(notificacao);
    }

    public void adicionaDevolucao(Devolucao devolucao){
        DEVOLUCAO.add(devolucao);
    }

    public void adicionaCoima(Coima coima){
        COIMA.add(coima);
    }

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r){
        int n = EMPRESTIMO.size();
        for (int i = 0 ; i < n ; i++){
            if (EMPRESTIMO.get(i).getRequisicao().equals(r)){
                return EMPRESTIMO.get(i);
            }
        }

        return null;
    }


    public void	adicionaEncomenda(Encomenda encomenda){ ENCOMENDA.add( encomenda);}

    public void	adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro){ ENTRADANOVOLIVRO.add(entradaNovoLivro);}

    public void	adicionaPropostaRequisicao(PropostaAquisicao proposta){ PROPOSTAAQUISICAO.add(proposta);}

    public void	adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra){ REQUISICAOCOMPRA.add(requisicaoCompra);}

    /*Novas Classes*/
    public void	adicionaLeitor (Leitor leitor){ LEITOR.add( leitor);}

    public void adicionaSala(Sala sala){SALA.add(sala);}

    public void adicionaUtilizadorSala(UtilizadorSala utilizadorSala){UTILIZADORSALA.add(utilizadorSala);}

    public void adicionaAluguerSala(AluguerSala aluguerSala){ALUGUERSALA.add(aluguerSala);}

    public void adicionaSistemaLimpeza(SistemaLimpeza sistemaLimpeza){SISTEMALIMPEZA.add(sistemaLimpeza);}

    public void	adicionaGestaoLeitura(GestaoLeitura gestaoLeitura){
        GESTAOLEITURA.add(gestaoLeitura);
    }

}

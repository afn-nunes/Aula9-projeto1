package classes;

public class Motorista extends Pessoa{
    private String habilitacao;

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public Motorista(String nome, String cpf, String habilitacao) {
        super(nome, cpf);
        this.habilitacao = habilitacao;
    }

    @Override
    public String cumprimentar(Pessoa outraPessoa){
        String cumprimentoInicial = super.cumprimentar(outraPessoa);
        return String.format("%s Meu nome é %s e serei seu motorista de hoje!", cumprimentoInicial, getNome());
    }
}

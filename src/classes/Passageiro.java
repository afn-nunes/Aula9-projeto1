package classes;

public class Passageiro extends Pessoa{
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Passageiro(String nome, String cpf, int codigo) {
        super(nome, cpf);
        this.codigo = codigo;
    }
    
}

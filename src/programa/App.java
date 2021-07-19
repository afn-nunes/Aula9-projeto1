package programa;

import classes.Motorista;
import classes.Passageiro;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa motorista = new Motorista("André", "10335723730", "B");
        Pessoa passageiro = new Passageiro("Leonardo", "66540654684", 1); 
        
        ((Motorista)motorista).setHabilitacao("123546");
        ((Passageiro)passageiro).setCodigo(1);
        System.out.println(passageiro.cumprimentar(motorista));
        System.out.println(motorista.cumprimentar(passageiro));        
    }
}

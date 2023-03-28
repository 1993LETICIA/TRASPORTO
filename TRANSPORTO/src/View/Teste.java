
package View;
import model.Caminhoneiro;
import model.Carreta;
import model.Cliente;
import model.Viagem;

public class Teste {
    public static void main(String[] args) {
        Carreta carreta1 = new Carreta("ct-7000");
        Caminhoneiro c1 = new Caminhoneiro("João Alves", "12345678901", "1234567890", 5000.00);
        Viagem viagem1 = new Viagem("São Paulo", 4.5,350);
        Cliente cliente1 = new Cliente("Pedro","11215536690", "15622644", c1, viagem1, carreta1);
        
        viagem1.calcularViagem();
        cliente1.visualizarViagem();
       
    }
}
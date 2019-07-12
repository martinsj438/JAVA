
package Concessonaria;

import br.com.concessonaria.model.Carro;
import br.com.concessonaria.model.Dao.CarroDao;
import javax.swing.JOptionPane;

public class Principal {
    public static void main (String args[]){
        
        Carro carro = new Carro();
        
        carro.setNomeCarro(JOptionPane.showInputDialog("Digite o nome do carro"));
        carro.setModelo(JOptionPane.showInputDialog("Digite o modelo"));
        carro.setPlaca(JOptionPane.showInputDialog("Digite a placa"));
        
        CarroDao dao = new CarroDao();
        dao.InserirCarro(carro);
    }
}
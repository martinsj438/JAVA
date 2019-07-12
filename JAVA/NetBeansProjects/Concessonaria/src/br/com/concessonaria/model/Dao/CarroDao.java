
package br.com.concessonaria.model.Dao;

import br.com.concessonaria.model.Carro;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CarroDao {

    private final SessionFactory conexao;
    
    public CarroDao(){
        conexao = new Configuration().configure().buildSessionFactory();
    }
        public void InserirCarro (Carro carro){
        Session session = null;
        Session Session = conexao.openSession();
        Transaction tx = Session.beginTransaction();
        Session.save(carro);
        tx.commit();
        session.close();     
    }
    
}

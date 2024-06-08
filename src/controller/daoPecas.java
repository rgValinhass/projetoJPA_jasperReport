
package controller;

import abstratas.Dados;
import abstratas.dao;
import java.util.List;
import javax.persistence.Query;
import model.Pecas;

public class daoPecas extends dao<Pecas> {
    public List<Pecas> read(){
        String JPQL = "select p from Pecas p order by p.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        return query.getResultList();
    }
    
    public List<Pecas> readByNome(String filtroNome){
        String JPQL = "select p from Pecas p where p.nome like ?1 order by p.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1,"%"+filtroNome.toUpperCase()+"%");
        return query.getResultList();
    }    
}

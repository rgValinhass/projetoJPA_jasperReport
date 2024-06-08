
package controller;

import abstratas.Dados;
import abstratas.dao;
import java.util.List;
import javax.persistence.Query;
import model.Problema;

public class daoProblema extends dao<Problema> {
    public List<Problema> read(){
        String JPQL = "select p from Problema p order by p.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        return query.getResultList();
    }
    
    public List<Problema> readByNome(String filtroNome){
        String JPQL = "select p from Problema p where p.nome like ?1 order by p.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1, "%"+filtroNome.toUpperCase()+"%");
        return query.getResultList();
    }
}

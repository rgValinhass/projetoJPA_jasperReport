
package controller;

import abstratas.Dados;
import abstratas.dao;
import java.util.List;
import javax.persistence.Query;
import model.Tecnico;


public class daoTecnico extends dao<Tecnico>{
    public List<Tecnico> read(){
        String JPQL = "select t from Tecnico t order by t.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        return query.getResultList();
    }
    
    public List<Tecnico> readByNome(String filtroNome){
        String JPQL = "select t from Tecnico t where t.nome like ?1 order by t.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1, "%"+filtroNome.toUpperCase()+"%");
        return query.getResultList();
    }
    
}


package controller;

import abstratas.Dados;
import model.Setor;
import abstratas.dao;
import java.util.List;
import javax.persistence.Query;

public class daoSetor extends dao<Setor>{
    public List<Setor> read(){
        String JPQL = "select s from Setor s order by s.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        return query.getResultList();
    }
    
    public List<Setor> readByNome(String filtroNome){
        String JPQL = "select s from Setor s where s.nome like ?1 order by s.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1, "%"+filtroNome.toUpperCase()+"%");
        return query.getResultList();
    }
    
}

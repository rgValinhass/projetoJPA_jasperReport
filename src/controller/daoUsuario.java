
package controller;

import abstratas.Dados;
import abstratas.dao;
import java.util.List;
import javax.persistence.Query;
import model.Usuario;


public class daoUsuario extends dao<Usuario>{
    public List<Usuario> read(){
        String JPQL = "select u from Usuario u order by u.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        return query.getResultList();
    }
    
    public List<Usuario> readByNome(String filtroNome){
        String JPQL = "select u from Usuario u where u.nome like ?1 order u.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1, "%"+filtroNome.toUpperCase()+"%");
        return query.getResultList();
    }
    
}

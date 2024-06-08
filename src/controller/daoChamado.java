
package controller;

import abstratas.Dados;
import abstratas.dao;
import java.util.List;
import javax.persistence.Query;
import model.Chamado;
import model.Tecnico;
import model.Usuario;

public class daoChamado extends dao<Chamado>{
    public List<Chamado> read(){
        String JPQL = "select c from Chamado c order by c.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        return query.getResultList();
    }
    
    public List<Chamado> readByNome(String filtroNome){
        String JPQL="select c from Chamado c where c.nome like ?1 order by c.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1,"%"+filtroNome.toUpperCase()+"%");
        return query.getResultList();
    }
    
    public List<Chamado> readByTecnico(Tecnico t){
        String JPQL = "select c from Chamado c where c.tecnico = ?1 order by c.tecnico.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1, t);
        return query.getResultList();
    }
    
    public List<Chamado> readByTecnico(Usuario u){
        String JPQL = "select c from Chamado c where c.usuario = ?1 order by c.usuario.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1, u);
        return query.getResultList();
    }
}
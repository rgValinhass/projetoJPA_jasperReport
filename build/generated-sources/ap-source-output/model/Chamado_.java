package model;

import enums.Classificacao;
import enums.Status;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Pecas;
import model.Problema;
import model.Tecnico;
import model.Usuario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-24T17:21:06", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Chamado.class)
public class Chamado_ { 

    public static volatile SingularAttribute<Chamado, LocalDate> data;
    public static volatile SingularAttribute<Chamado, Pecas> pecas;
    public static volatile SingularAttribute<Chamado, Problema> problema;
    public static volatile SingularAttribute<Chamado, Classificacao> classificacao;
    public static volatile SingularAttribute<Chamado, Usuario> usuario;
    public static volatile SingularAttribute<Chamado, Integer> id;
    public static volatile SingularAttribute<Chamado, Tecnico> tecnico;
    public static volatile SingularAttribute<Chamado, String> descricao;
    public static volatile SingularAttribute<Chamado, Status> status;

}

package model;

import enums.Classificacao;
import enums.Status;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_chamado")
public class Chamado implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @SwingColumn(description = "Código")
    private int id;
    
    @Column(name = "data", nullable = false)
    @SwingColumn(description = "Data")
    private LocalDate data;
    
    @Column(name = "descricao", length = 100, nullable = false)
    @SwingColumn(description = "Descrição")
    private String descricao;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "classificacao", length = 1, nullable = false)
    @SwingColumn(description = "Classificação")
    private Classificacao classificacao;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 1, nullable = false)
    @SwingColumn(description = "Status")
    private Status status;
    
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_pecas", nullable = false, referencedColumnName = "id")
    private Pecas pecas;
    
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_tecnico", nullable = false, referencedColumnName = "id")
    @SwingColumn(description = "Técnico")
    private Tecnico tecnico;
    
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_usuario", nullable = false, referencedColumnName = "id")
    @SwingColumn(description = "Usuário")
    private Usuario usuario;
    
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_chamado", nullable = false, referencedColumnName = "id")
    private Problema problema;

    public Chamado() {
        this.setId(0);
        this.setData(null);
        this.setDescricao("Sem descrição");
        this.setClassificacao(null);
        this.setStatus(null);
        this.setPecas(pecas);
        this.setTecnico(tecnico);
        this.setUsuario(usuario);
        this.setProblema(problema);
    }

    public Chamado(int id, LocalDate data, String descricao, Classificacao classificacao, Status status, Pecas pecas, Tecnico tecnico, Usuario usuario, Problema problema) {
        this.setId(id);
        this.setData(data);
        this.setDescricao(descricao);
        this.setClassificacao(classificacao);
        this.setStatus(status);
        this.setPecas(pecas);
        this.setTecnico(tecnico);
        this.setUsuario(usuario);
        this.setProblema(problema);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao.trim().isEmpty() ? "VAZIO" : descricao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPecas(Pecas pecas) {
        this.pecas = pecas == null ? new Pecas() : pecas;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico == null ? new Tecnico() : tecnico;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario == null ? new Usuario() : usuario;
    }

    public void setProblema(Problema problema) {
        this.problema = problema == null ? new Problema() : problema;
    }

    public int getId() {
        return this.id;
    }

    public LocalDate getData() {
        return this.data;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Classificacao getClassificacao() {
        return this.classificacao;
    }

    public Status getStatus() {
        return this.status;
    }

    public Pecas getPecas() {
        return this.pecas;
    }

    public Tecnico getTecnico() {
        return this.tecnico;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public Problema getProblema() {
        return this.problema;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chamado other = (Chamado) obj;
        return this.id == other.id;
    }
}
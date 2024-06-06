
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_setor")
public class Setor implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @SwingColumn(description = "Código")
    private int id;
    
    @Column(name = "nome", nullable = false, length = 80)
    @SwingColumn(description = "Nome")
    private String nome;
    
    @Column(name = "localizacao", nullable = false)
    @SwingColumn(description = "Localização")
    private String localizacao;

    public Setor() {
        this.setId(0);
        this.setNome("Sem nome");
        this.setLocalizacao("Sem localização");
    }

    public Setor(int id, String nome, String localizacao) {
        this.setId(id);
        this.setNome(nome);
        this.setLocalizacao(localizacao);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "Sem nome" : nome.toUpperCase();
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
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
        final Setor other = (Setor) obj;
        return this.id == other.id;
    }
    
  
}




package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tecnico")
public class Tecnico implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @SwingColumn(description = "Código")
    private int id;
    
    @Column(name = "nome", nullable = false, length = 80)
    @SwingColumn(description = "Nome")
    private String nome;
    
    @Column(name = "especialidade")
    @SwingColumn(description = "Especialidade")
    private String especialidade;
    
    @Column(name = "email")
    @SwingColumn(description = "E-mail")
    private String email;

    public Tecnico() {
        this.setId(0);
        this.setNome("Sem nome");
        this.setEspecialidade("Sem especialidade");
        this.setEmail("Sem email");
    }

    public Tecnico(int id, String nome, String especialidade, String email) {
        this.setId(id);
        this.setNome(nome);
        this.setEspecialidade(especialidade);
        this.setEmail(email);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "Sem nome" : nome.toUpperCase();
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setEmail(String email) {
        this.email = email.toLowerCase();
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
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
        final Tecnico other = (Tecnico) obj;
        return this.id == other.id;
    }
    
}

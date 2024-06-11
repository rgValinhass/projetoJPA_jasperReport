
package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @SwingColumn(description = "Código")
    private int id;
    
    @Column(name = "nome", nullable = false, length = 80)
    @SwingColumn(description = "Nome")
    private String nome;
    
    @Column(name = "email")
    @SwingColumn(description = "E-mail")
    private String email;
    
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_setor", nullable = false, referencedColumnName = "id")
    private Setor setor;

    public Usuario() {
        this.setId(0);
        this.setNome("Sem nome");
        this.setEmail("Sem email");
        this.setSetor(setor);
    }

    public Usuario(int id, String nome, String email, Setor setor) {
        this.setId(id);
        this.setNome(nome);
        this.setEmail(email);
        this.setSetor(setor);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "Sem nome" : nome.toUpperCase();
    }

    public void setEmail(String email) {
        this.email = email.toLowerCase();
    }

    public void setSetor(Setor setor) {
        this.setor = setor == null ? new Setor() : setor;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public Setor getSetor() {
        return this.setor;
    }

    @Override
    public String toString() {
        return this.nome +" / "+ this.email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
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
        final Usuario other = (Usuario) obj;
        return this.id == other.id;
    }
}

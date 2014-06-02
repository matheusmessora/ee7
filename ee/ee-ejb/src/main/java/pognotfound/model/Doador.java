package pognotfound.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name = Doador.DOADOR_FIND_ALL, query = "SELECT d from Doador d")
public class Doador {

    public static final String DOADOR_FIND_ALL = "Doador.findAll";

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoSanguineo tipoSangue;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoSanguineo getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(TipoSanguineo tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Doador{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", tipoSangue=").append(tipoSangue);
        sb.append('}');
        return sb.toString();
    }
}

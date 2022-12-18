package aula011;

/**
 *
 * @author ramon
 */
public class Visitante extends Pessoa {
    private int idVisitante;
    private String descricao;
    
    public void imprimeVisitante() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Dados do visitante => Nome: " + this.getNome() + ", Idade: " + this.getIdade() + ", Sexo: " + this.getSexo());
        System.out.println("Razão da visita: " + this.getDescricao() + "\nIndentificação do visitante: " + this.getIdVisitante());
    }

    public int getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(int idVisitante) {
        this.idVisitante = idVisitante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}


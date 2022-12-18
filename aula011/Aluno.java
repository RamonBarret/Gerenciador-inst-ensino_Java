package aula011;

/**
 *
 * @author ramon
 */
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void imprimePerfil() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Dados do aluno(a) => Nome: " + this.getNome() + ", Idade: " + this.getIdade() + ", Sexo: " + this.getSexo());
        System.out.println("Curso: " + getCurso() + ", Matrícula: " + getMatricula());
    }
    
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}

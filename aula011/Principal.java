package aula011;

public class Principal {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Adriana");
        v1.setIdade(45);
        v1.setSexo("F");
        v1.setIdVisitante(0001);
        v1.setDescricao("Assistir - Trabalho de Conclusão de Curso");
        v1.imprimeVisitante();
        
        
        Aluno a1 = new Aluno();
        a1.setNome("Austin");
        a1.setMatricula(2843);
        a1.setCurso("Gestão de Processos");
        a1.setIdade(25);
        a1.setSexo("M");
        a1.imprimePerfil();
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(2844);
        b1.setCurso("Análise e Desenvolvimento de Sistemas");
        b1.setIdade(19);
        b1.setNome("Miguel");
        b1.setBolsa(40.5f);
        b1.setSexo("M");
        b1.imprimePerfil();
        b1.pagarMensalidade();
        
        b1.setMatricula(2845);
        b1.setCurso("Engenharia de Software");
        b1.setIdade(21);
        b1.setNome("Júlia");
        b1.setBolsa(75.0f);
        b1.setSexo("F");
        b1.imprimePerfil();
        b1.pagarMensalidade();
    }
    
}

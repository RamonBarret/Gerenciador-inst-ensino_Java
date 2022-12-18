
package aula011;

/**
 *
 * @author ramon
 */
public class Bolsista extends Aluno{
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Renovando a bolsa de " + this.getNome());
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! \nMensalidade com valor especial de: " + this.getBolsa() + "%(por cento) de desconto no valor bruto.");
    }
}
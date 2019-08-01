package modelo;

/**
 *
 * @author Administrador
 */
public class Endereco {

    int codigo;
    private String Lagradouro;
    private String Complemento;
    private String Bairro;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLagradouro() {
        return Lagradouro;
    }

    public void setLagradouro(String Lagradouro) {
        this.Lagradouro = Lagradouro;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" + "codigo=" + codigo + ", Lagradouro=" + Lagradouro + ", Complemento=" + Complemento + ", Bairro=" + Bairro + '}';
    }
}

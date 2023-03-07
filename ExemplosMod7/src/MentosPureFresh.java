public class MentosPureFresh {
  private  String sabor, embalagem, ingredientes;
  private boolean semAcucar, dentroValidade;

  private  int peso, quantidade;


    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public boolean isSemAcucar() {
        return semAcucar;
    }

    public void setSemAcucar(boolean semAcucar) {
        this.semAcucar = semAcucar;
    }

    public boolean isDentroValidade() {
        return dentroValidade;
    }

    public void setDentroValidade(boolean dentroValidade) {
        this.dentroValidade = dentroValidade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

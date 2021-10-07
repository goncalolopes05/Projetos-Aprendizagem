public abstract class Animal {
    private String tipo;
    private double tamanho;
    private String cor;
    private String raça;
    
    
    public Animal(String tipo, double tamanho, String cor, String raça) {
        this.setTipo(tipo);
        this.setTamanho(tamanho);
        this.setCor(cor);
        this.setRaça(raça);
    }
    
    public abstract void falar();
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getTamanho() {
        return this.tamanho;
    }
    
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getRaça() {
        return this.raça;
    }
    
    public void setRaça(String raça) {
        this.raça = raça;
    }
    
    
    
    
}
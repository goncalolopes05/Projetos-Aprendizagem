public abstract class Animal {
    private String tipo;
    private double tamanho;
    private String cor;
    private String ra�a;
    
    
    public Animal(String tipo, double tamanho, String cor, String ra�a) {
        this.setTipo(tipo);
        this.setTamanho(tamanho);
        this.setCor(cor);
        this.setRa�a(ra�a);
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
    
    public String getRa�a() {
        return this.ra�a;
    }
    
    public void setRa�a(String ra�a) {
        this.ra�a = ra�a;
    }
    
    
    
    
}
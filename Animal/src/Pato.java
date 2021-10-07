public class Pato extends Animal {
    
    public Pato(String tipo, double tamanho, String cor, String raça) {
        super(tipo, tamanho, cor, raça);
    }
    
    public void falar() {
        System.out.println("Pato: Quack Quack");
      }
}
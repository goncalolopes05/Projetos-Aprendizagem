public class Gato extends Animal {
    
    public Gato(String tipo, double tamanho, String cor, String raça) {
        super(tipo, tamanho, cor, raça);
    }
    
    public void falar() {
        System.out.println("Gato: Meow Meow");
    }
}
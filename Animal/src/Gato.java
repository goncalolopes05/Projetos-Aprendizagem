public class Gato extends Animal {
    
    public Gato(String tipo, double tamanho, String cor, String ra�a) {
        super(tipo, tamanho, cor, ra�a);
    }
    
    public void falar() {
        System.out.println("Gato: Meow Meow");
    }
}
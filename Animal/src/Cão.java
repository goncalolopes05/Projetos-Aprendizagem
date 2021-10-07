public class Cão extends Animal {
    
    public Cão(String tipo, double tamanho, String cor, String raça) {
        super(tipo, tamanho, cor, raça);
    }
    
    public void falar() {
        System.out.println("Cão: Woof Woof");
    }
}
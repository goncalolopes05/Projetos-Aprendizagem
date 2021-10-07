public class Programa {

    public static void main(String[] args) {

        Cão cão1 = new Cão("Mamífero", 30, "Bege", "Lavrador");
        
        Gato gato1 = new Gato("Mamífero", 20, "Castanho", "Persa");
        
        Pato pato1 = new Pato("Ave", 15, "Branco", "Cayuga");
        
        
        cão1.falar();
        gato1.falar();
        pato1.falar();
        
    }

}
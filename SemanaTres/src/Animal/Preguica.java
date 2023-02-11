package Animal;

public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }



    void subirArvores(){}

    @Override
    public String emitirSom(){
        System.out.println("zZzZzZzZ");
        return null;
    }
}

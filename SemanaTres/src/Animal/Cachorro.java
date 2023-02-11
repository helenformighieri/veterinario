package Animal;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }


    @Override
    public String emitirSom(){
        System.out.println("Au Au Au");
        return null;
    }
}

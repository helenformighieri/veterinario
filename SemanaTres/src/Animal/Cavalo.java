package Animal;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }


    @Override
    public String emitirSom(){
        System.out.println("iiihhhh");
        return null;
    }

}

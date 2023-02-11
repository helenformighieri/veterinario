package Animal;

public class Animal {
    public String nome;
    public int idade;
    protected String emitirSom;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String emitirSom() {
        System.out.println("cri cri cri");
        return null;
    }
}


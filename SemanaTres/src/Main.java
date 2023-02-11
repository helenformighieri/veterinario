// Exercicios 1, 2 e 3.


import Animal.Cachorro;
import Animal.Cavalo;
import Animal.Preguica;
import Animal.Veterinario;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Sol", 1);

        Cavalo cavalo1 = new Cavalo("Lua",7);

        Preguica preguica1 = new Preguica("Estrela", 3);

        //Exercicio Dois
        cachorro1.emitirSom();
        cavalo1.emitirSom();
        preguica1.emitirSom();


        //Exercicio Três
        Veterinario veterinario = new Veterinario();


        Veterinario.examinar(cachorro1);
        System.out.println();

        Veterinario.examinar(cavalo1);
        System.out.println();

        Veterinario.examinar(preguica1);
        System.out.println();
    }
}
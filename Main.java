package view;

import model.Agenda;
import model.Contato;
import model.Usuario;

public class Main {


    public static void main(String[] args) {

        Usuario usuario = new Usuario("joao@gmail.com","123456");

        Contato maria = new Contato("Maria","maria@gmail.com","83 999999-9999");
        usuario.getAgenda().adicionar(maria);

        Contato pedro = new Contato("Pedro","pedro@gmail.com","83 777777-7777");
        usuario.getAgenda().adicionar(pedro);

        usuario.getAgenda().adicionar(new Contato("Maria","maria@gmail.com","83 999999-9999"));
        usuario.getAgenda().adicionar(new Contato("Roberto","roberto@gmail.com","83 888888-8888"));
        usuario.getAgenda().adicionar(new Contato("Pedro","pedro@gmail.com","83 777777-7777"));
        usuario.getAgenda().adicionar(new Contato("Ana","ana@gmail.com","83 666666-6666"));

        System.out.println(usuario.getAgenda().getContatos());

        //Chamar os métodos de deletar e atualizar

        usuario.getAgenda().remover(maria);


        usuario.getAgenda().atualizar(pedro, new Contato("Pedro da Silva","pedrodasilva@gmail.com","83 555555-5555"));
        System.out.println(usuario.getAgenda().getContatos());

    }
}
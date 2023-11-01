package view;

import dao.UsuarioDao;
import model.Usuario;

public class Main {
    public static void main(String[] args) {

        UsuarioDao dao = new UsuarioDao();

//        if(dao.addUsuario(new Usuario("carlos@gmail.com","123458"))){
//            System.out.println("Salvo com sucesso");
//        }else{
//            System.out.println("Falha ao salvar");
//        }
        System.out.println(dao.listarUsuarios());

    }
}

package view;

import dao.UsuarioDao;
import model.Usuario;

public class Main {
    public static void main(String[] args) {

        UsuarioDao dao = new UsuarioDao();
//        if(dao.addUsuario(new Usuario("joao@gmail.com","963852"))){
//            System.out.println("Salvo com sucesso");
//        }
//        else{
//            System.out.println("Falha ao salvar");
//        }

        System.out.println(dao.listarUsuarios());
//
//        if(dao.deletarUsuario(new Usuario("paulo@gmail.com","456789"))){
//            System.out.println("Deletado com sucesso");
//        }
//         else {
//            System.out.println("Falha ao deletar");
//        }
//
//        System.out.println(dao.listarUsuarios());


        Usuario usuario = dao.buscarPorEmail("roberto@gmail.com");
        usuario.setSenha("741852");
        dao.atualizarUsuario(usuario);
        System.out.println(dao.listarUsuarios());
    }
}
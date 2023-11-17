package view;

import dao.UsuarioDao;
import model.Usuario;
import java.util.List;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        UsuarioDao dao = new UsuarioDao();
        int choice;
        do {
            String input = JOptionPane.showInputDialog("1.Adicionar Usuario\n" + "2.Listar Usuario\n" + "3.Buscar por Email\n" + "0.Sair");
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do usuário:");
                    String email = JOptionPane.showInputDialog("Digite o email do usuário: ");
                    Usuario novoUsario = new Usuario(nome, email);
                    boolean added = UsuarioDao.addUsuario(novoUsario);
                    if (added) {
                        JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Falha ao adicionar usuário.");
                    }
                    break;
                case 2:
                    List<Usuario> usuarios = UsuarioDao.listarUsuarios();
                    JOptionPane.showMessageDialog(null, "Lista de Usuarios:\n" + usuarios);
                    break;
                case 3:
                    String searchEmail = JOptionPane.showInputDialog("Digite o email a ser buscado:");
                    Usuario foundUser = UsuarioDao.buscarPorEmail(searchEmail);
                    if (foundUser != null) {
                        JOptionPane.showMessageDialog(null, "Usuário encontrado:\n" + foundUser);
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuário não encontrado.");
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha inválida. Tente novamente.");

            }

        } while (choice != 0);

    }
}


//        ImageIcon imageIcon = new ImageIcon("icone.png");
//        String nomes[] = {"João", "Maria", "Pedro", "Ana", "Jacaré"};
//        String nome = (String) JOptionPane.showInputDialog(null,
//                "Informe seu nome:", "Entrada de dados",JOptionPane.QUESTION_MESSAGE, imageIcon,nomes,
//                nomes[0]);
//        JOptionPane.showMessageDialog(null,"Vá para casa ! "+nome);

//         int retorno = JOptionPane.showConfirmDialog(null,"Deseja continuar?","Mensagem do Sistema",JOptionPane.YES_NO_CANCEL_OPTION);
//
//        if(retorno == JOptionPane.YES_OPTION){
//            JOptionPane.showMessageDialog(null,"Ecolheu sim");
//        }
//        if(retorno == JOptionPane.NO_OPTION){
//            JOptionPane.showMessageDialog(null,"Ecolheu não");
//        }
//        if(retorno == JOptionPane.CLOSED_OPTION){
//            JOptionPane.showMessageDialog(null,"Fechou");
//        }

//        if(dao.addUsuario(new Usuario("maria@gmail.com","753951"))){



//        UsuarioDao dao = new UsuarioDao();
//        System.out.println(dao.listarUsuarios());

//        Usuario usuario = dao.buscarPorEmail("roberto@gmail.com");
//        usuario.setSenha("741852");
//        dao.atualizarUsuario(usuario);

//        System.out.println(dao.listarUsuarios());
//       if(dao.addUsuario(new Usuario("maria@gmail.com","753951"))){
//           System.out.println("Adicionado");
//       }
//       else {
//           System.out.println("Falha");
//       }
//        System.out.println(dao.listarUsuarios());
//    }

//        if(dao.addUsuario(new Usuario("joao@gmail.com","963852"))){
//            System.out.println("Salvo com sucesso");
//        }
//        else{
//            System.out.println("Falha ao salvar");
//        }


//        if(dao.deletarUsuario(new Usuario("paulo@gmail.com","456789"))){
//            System.out.println("Deletado com sucesso");
//        }
//         else {
//            System.out.println("Falha ao deletar");
//        }
//
//        System.out.println(dao.listarUsuarios());

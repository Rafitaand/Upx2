import entidade.Usuario;
import DAO.UsuarioDAO;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Digite o valor do NTU: ");
        int ntu = scanner.nextInt();

        String qualidade;
        if (ntu >= 0 && ntu <= 5) {
            qualidade = "boa";
            System.out.println("o valor declarado é a faixa ideal para a água potável, conforme recomendado por muitas normas de qualidade da água.");
        } else if (ntu >= 5 && ntu <= 50) {
            qualidade = "intermediária";
            System.out.println("Pode ser aceitável para algumas aplicações industriais, mas pode não ser ideal para consumo humano sem tratamento adicional.");
        } else {
            qualidade = "ruim";
            System.out.println("Líquido altamente turvo. Normalmente não é adequado para consumo ou uso em processos industriais sem tratamento intensivo.");
        }

        Usuario u = new Usuario(0, cidade, String.valueOf(ntu), qualidade);
        
        u.setCodigo(0);
        u.setCidade(cidade);   
        u.setNtu(String.valueOf(ntu));   
        u.setQualidade(qualidade);     

        new UsuarioDAO().cadastrarUsuario(u);

        System.out.println("Usuário cadastrado com sucesso: " + u.toString());

        scanner.close();
    }
}

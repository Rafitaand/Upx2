package entidade;

public class Usuario {

    private int codigo;
    private String cidade;
    private String ntu;
    private String qualidade;

    
    // Construtor
    public Usuario(int codigo, String cidade, String ntu, String qualidade) {
        this.codigo = codigo;
        this.cidade = cidade;
        this.ntu = ntu;
        this.qualidade = qualidade;
    }

    // Getters e Setters com validação simples

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {  // Verifica se o código é válido
            this.codigo = codigo;
        } else {
            System.out.println("Código Validado.");
        }
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade) {
        if (cidade != null && !cidade.trim().isEmpty()) {
            this.cidade = cidade;
        } else {
            System.out.println("Nome inválido");
        }
    }

    public String getNtu(){
        return ntu;
    }

    public void setNtu(String ntu) {
        if (ntu != null && !ntu.trim().isEmpty()) {
            this.ntu = ntu;
        } else {
            System.out.println("Código inválido");
        }
    }

    public String getQualidade(){
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        if (qualidade != null && !qualidade.trim().isEmpty()) {
            this.qualidade = qualidade;
        } else {
            System.out.println("Código inválida");
        }
    }

    // Método toString para facilitar a visualização dos dados
    @Override
    public String toString() {
        return "Usuario{" +
                "codigo=" + codigo +
                ", CIDADE '" + cidade + '\'' +
                ", NTU '" + ntu + '\'' +
                ", QUALIDADE '" + qualidade + '\'' +
                '}';
    }
}
import java.util.Arrays;

class Autor {
    private String nome;
    private String email;
    private String[] pseudonimos; // Alteração para um array de Strings
    private int numeroDeVendas;

    public Autor(String nome, String email, String pseudonimosString, int numeroDeVendas) {
        this.nome = nome;
        this.email = email;
        this.pseudonimos = parsePseudonimosFromString(pseudonimosString);
        this.numeroDeVendas = numeroDeVendas;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // Validando o email (um exemplo simples)
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email inválido. O email não foi alterado.");
        }
    }

    public int getNumeroDeVendas() {
        return numeroDeVendas;
    }

    public String[] getPseudonimos() {
        return pseudonimos;
    }

    // Método para adicionar pseudônimos a partir de uma String
    public String[] parsePseudonimosFromString(String pseudonimosString) {
        return pseudonimosString.split(",");
    }

    @Override
    public String toString() {
        return "Autor: " + nome + "\nEmail: " + email + "\nPseudônimos: " + Arrays.toString(pseudonimos) + "\nNúmero de Vendas: " + numeroDeVendas;
    }
}
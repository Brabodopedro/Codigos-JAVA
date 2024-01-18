class Autor {
    private String nome;
    private String email;
    private String pseudonimo;
    private int numeroDeVendas;

    public Autor(String nome, String email, String pseudonimo, int numeroDeVendas) {
        this.nome = nome;
        this.email = email;
        this.pseudonimo = pseudonimo;
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

    @Override
    public String toString() {
        return "Autor: " + nome + "\nEmail: " + email + "\nPseudônimo: " + pseudonimo + "\nNúmero de Vendas: " + numeroDeVendas;
    }
}
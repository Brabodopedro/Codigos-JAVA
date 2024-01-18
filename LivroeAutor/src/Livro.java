class Livro {
    private String nome;
    private int numeroDeCopias;
    private double preco;
    private Autor autor;
    private String genero;

    public Livro(String nome, int numeroDeCopias, double preco, Autor autor, String genero) {
        this.nome = nome;
        this.numeroDeCopias = numeroDeCopias;
        this.preco = preco;
        this.autor = autor;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDeCopias() {
        return numeroDeCopias;
    }

    public void setNumeroDeCopias(int numeroDeCopias) {
        // Validando o número de cópias (não permitindo valores negativos)
        if (numeroDeCopias >= 0) {
            this.numeroDeCopias = numeroDeCopias;
        } else {
            System.out.println("Número de cópias inválido. O valor não foi alterado.");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        // Validando o preço (não permitindo valores negativos)
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido. O valor não foi alterado.");
        }
    }

    @Override
    public String toString() {
        return "Livro: " + nome + "\nNúmero de Cópias: " + numeroDeCopias + "\nPreço: " + preco + "\nAutor: \n" + autor + "\nGênero: " + genero;
    }
}

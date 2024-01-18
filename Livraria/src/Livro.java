import java.util.List;
import java.util.ArrayList;

class Livro {
    private String nome;
    private int numeroDeCopias;
    private double preco;
    private List<Autor> autores = new ArrayList<>(); // Alteração para uma lista de Autores
    private String genero;

    public Livro(String nome, int numeroDeCopias, double preco, String genero) {
        this.nome = nome;
        this.numeroDeCopias = numeroDeCopias;
        this.preco = preco;
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

    // Método para adicionar um autor ao livro
    public void adicionaAutor(Autor autor) {
        autores.add(autor);
    }

    // Método para mostrar os autores do livro
    public void mostraAutores() {
        for (Autor autor : autores) {
            System.out.println("Autor: " + autor.getNome());
        }
    }

    @Override
    public String toString() {
        return "Livro: " + nome + "\nNúmero de Cópias: " + numeroDeCopias + "\nPreço: " + preco + "\nGênero: " + genero;
    }
}
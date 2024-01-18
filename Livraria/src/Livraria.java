public class Livraria {
    public static void main(String[] args) {
        // Criando instâncias de Autor com pseudônimos
        Autor autor1 = new Autor("Autor 1", "autor1@email.com", "Pseudônimo1,Pseudônimo2", 100);
        Autor autor2 = new Autor("Autor 2", "autor2@email.com", "Pseudônimo3,Pseudônimo4", 200);

        // Criando instância de Livro
        Livro livro1 = new Livro("Livro 1", 50, 29.99, "Ficção");
        Livro livro2 = new Livro("Livro 2", 30, 19.99, "Não-ficção");

        // Adicionando autores aos livros
        livro1.adicionaAutor(autor1);
        livro1.adicionaAutor(autor2);
        livro2.adicionaAutor(autor2);

        // Mostrando os autores dos livros
        System.out.println("Autores do Livro 1:");
        livro1.mostraAutores();

        System.out.println("\nAutores do Livro 2:");
        livro2.mostraAutores();
    }
}
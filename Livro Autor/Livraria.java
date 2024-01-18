public class Livraria {
   
	public static void main(String[] args) {
        // Criando instâncias de Autor
        Autor autor1 = new Autor("Autor 1", "autor1@email.com", "Pseudônimo1", 100);
        Autor autor2 = new Autor("Autor 2", "autor2@email.com", "Pseudônimo2", 200);

        // Criando instâncias de Livro e associando aos Autores
        Livro livro1 = new Livro("Livro 1", 50, 29.99, autor1, "Ficção");
        Livro livro2 = new Livro("Livro 2", 30, 19.99, autor2, "Não-ficção");

        // Exibindo informações dos Autores e Livros
        System.out.println("Informações do Autor 1:");
        System.out.println(autor1);

        System.out.println("\nInformações do Livro 1:");
        System.out.println(livro1);

        System.out.println("\nInformações do Autor 2:");
        System.out.println(autor2);

        System.out.println("\nInformações do Livro 2:");
        System.out.println(livro2);
    }
}
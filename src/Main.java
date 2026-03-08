public class Main{
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("1984","Geoge Orwell", 1949);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.listarLivros();

        biblioteca.emprestarLivro(livro1);

    }
}
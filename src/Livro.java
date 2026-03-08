public class Livro {
    String titulo;
    String autor;
    int ano;
    boolean disponivel;

    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
    }

    public void emprestarLivro(){
        if(disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso!");
        }else{
            System.out.println("Livro já emprestado.");
        }
    }
    public void devolverLivro(){
        disponivel = true;
        System.out.println("Livro devolvido com sucesso!");
    }
    public void exibirInformacoes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: "+ ano);
        System.out.println("Disponível: "+disponivel);
    }
}

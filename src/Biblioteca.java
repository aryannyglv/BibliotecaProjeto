import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> listaLivros = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        listaLivros.add(livro);
    }
    public void listarLivros(){
        for(Livro livro: listaLivros){
            livro.exibirInformacoes();
            System.out.println("----------------");
        }
    }
   public void emprestarLivro(Livro livro){
        livro.emprestarLivro();
   }
   public void devolverLivro(Livro livro){
        livro.devolverLivro();
   }
}

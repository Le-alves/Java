package javaPOO.biblioteca;

public class Livro {
	/*Atributos*/	
 private String Nome;
 private String Descricao;
 private double Valor;
 private String Isbn;
 Autor autor;
 

 					/*métodos de entrada dos valores*/
 public void SetNome(String nome) {
	 this.Nome = nome;
 } 
 public String GetNome() {
	 return this.Nome;
 }
 
 public void SetDescricao (String descricao) {
	 this.Descricao = descricao;
 }
 public String GetDescricao() {
	 return this.Descricao;
 }
 
 public void SetValor (double valor) {
	 this.Valor = valor;
 }
 public double GetValor() {
	 return this.Valor;
 }

 public void SetIsbn(String isbn) {
	 this.Isbn = isbn;
 }
 public String GetIsbn() {
	 return this.Isbn;
 }
 					/*Métodos gerais*/
 
 void ImprimeNaTela() {
	 System.out.println("----------------");
	 System.out.println(GetNome());
	 System.out.println(GetDescricao());
	 System.out.println(GetValor());
	 System.out.println(GetIsbn());
	 //System.out.println(autor.ImprimeNaTela()); /* Se utilizarmos somente "autor" irá imprimir o endereço de memoria que foi reservado a variável autor*/
 }
 
 public void desconto (double porcentagem) {
	 this.Valor = this.Valor * porcentagem;
 }

 boolean TemAutor() {
	 return this.autor != null; // 
 }

}

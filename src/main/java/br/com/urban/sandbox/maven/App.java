package br.com.urban.sandbox.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Produto produto = new Produto("Bala Juquinha", 0.15);
		System.out.println(produto.getNome());
	}
}

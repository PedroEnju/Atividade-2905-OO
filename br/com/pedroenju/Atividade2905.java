package br.com.pedroenju;

import javax.swing.JOptionPane;

public class Atividade2905 {

    static int numCad = 3;
    static LivroDeLivraria_extends[] livraria = new LivroDeLivraria_extends[numCad];
    static LivroDeBiblioteca_extends[] biblioteca = new LivroDeBiblioteca_extends[numCad];

    public static void main(String[] args) {
        for (int i = 0; i < numCad; i++) {
            livraria[i] = new LivroDeLivraria_extends();
            biblioteca[i] = new LivroDeBiblioteca_extends();
            valores(i);
        }
        
        for (int i = 0; i < numCad; i++) {
            biblioteca[i].setExemplares(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de exemplares do " + (i + 1) + " livro")));
        }

        for (int i = 0; i < numCad; i++) {
            livraria[i].setValor(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do " + (i + 1) + " livro")));
        }

        for (LivroDeBiblioteca_extends b : biblioteca) {
            System.out.println("Título.: " + b.getTitulo());
            System.out.println("Autor.: " + b.getAutor());
            System.out.println("Ano de Publicação.: " + b.getAnoPublicacao());
            System.out.println("Editora.: " + b.getEditora());
            System.out.println("Exemplares.: " + b.getExemplares());
        }

        for (LivroDeLivraria_extends l : livraria) {
            System.out.println("Título.: " + l.getTitulo());
            System.out.println("Autor.: " + l.getAutor());
            System.out.println("Ano de Publicação.: " + l.getAnoPublicacao());
            System.out.println("Editora.: " + l.getEditora());
            System.out.println("Valor.: " + l.getValor());
        }
    }

    public static void valores(int num) {
        String[] titulo = {"The Hitchhiker's Guide to the Galaxy", "As Aventuras de Sherlock Holmes", "A Pirâmide Vermelha"};
        int[] ano = {1979, 1892, 2010};
        String[] autor = {"Douglas Adams", "Arthur Conan Doyle", "Rick Riordan"};
        String[] editora = {"Pan Books", "George Newnes", "Disney Publishing Worldwide"};

        biblioteca[num].setTitulo(titulo[num]);
        biblioteca[num].setAnoPublicacao(ano[num]);
        biblioteca[num].setAutor(autor[num]);
        biblioteca[num].setEditora(editora[num]);

        livraria[num].setTitulo(titulo[num]);
        livraria[num].setAnoPublicacao(ano[num]);
        livraria[num].setAutor(autor[num]);
        livraria[num].setEditora(editora[num]);
    }

}
    
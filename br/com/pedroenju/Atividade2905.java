package br.com.pedroenju;

import javax.swing.JOptionPane;

public class Atividade2905 {

    static int numCad = 3;
    static LivroDeLivraria_extends[] livraria;
    static LivroDeBiblioteca_extends[] biblioteca;

    public static void main(String[] args) {
        livraria = new LivroDeLivraria_extends[numCad];
        biblioteca = new LivroDeBiblioteca_extends[numCad];
        
        for (int i = 0; i < numCad; i++) {
            livraria[i] = new LivroDeLivraria_extends();
            biblioteca[i] = new LivroDeBiblioteca_extends();
            cadastroPadrao(i);
        }

        for (int i = 0; i < numCad; i++) {
            biblioteca[i].setExemplares(Integer.parseInt(JOptionPane.showInputDialog(
                    "Nº EXEMPLARES\r\n" + biblioteca[i].getTitulo())));
        }

        for (int i = 0; i < numCad; i++) {
            livraria[i].setValor(Float.parseFloat(JOptionPane.showInputDialog(
                    "VALOR em R$\r\n" + biblioteca[i].getTitulo())));
        }
        
        imprimirBiblioteca();
        imprimirLivraria();
        
    }

    public static void imprimirBiblioteca() {
        for (LivroDeBiblioteca_extends b : biblioteca) {
            System.out.println("Título.: " + b.getTitulo());
            System.out.println("Autor.: " + b.getAutor());
            System.out.println("Ano de Publicação.: " + b.getAnoPublicacao());
            System.out.println("Páginas.: " + b.getNumPagina());
            System.out.println("Editora.: " + b.getEditora());
            System.out.println("Exemplares.: " + b.getExemplares() + "\r\n");
        }
    }

    public static void imprimirLivraria() {
        for (LivroDeLivraria_extends l : livraria) {
            System.out.println("Título.: " + l.getTitulo());
            System.out.println("Autor.: " + l.getAutor());
            System.out.println("Ano de Publicação.: " + l.getAnoPublicacao());
            System.out.println("Páginas.: " + l.getNumPagina());
            System.out.println("Editora.: " + l.getEditora());
            System.out.println("Valor.: R$" + l.getValor() + "\r\n");
        }
    }

    public static void cadastroPadrao(int num) {
        String[] titulo = {"The Hitchhiker's Guide to the Galaxy", "As Aventuras de Sherlock Holmes", "A Pirâmide Vermelha"};
        int[] ano = {1979, 1892, 2010};
        String[] autor = {"Douglas Adams", "Arthur Conan Doyle", "Rick Riordan"};
        String[] editora = {"Pan Books", "George Newnes", "Disney Publishing Worldwide"};
        int[] numPagina = {224, 416, 516};

        if (num < 3) {
            biblioteca[num].setTitulo(titulo[num]);
            biblioteca[num].setAnoPublicacao(ano[num]);
            biblioteca[num].setAutor(autor[num]);
            biblioteca[num].setEditora(editora[num]);
            biblioteca[num].setNumPagina(numPagina[num]);

            livraria[num].setTitulo(titulo[num]);
            livraria[num].setAnoPublicacao(ano[num]);
            livraria[num].setAutor(autor[num]);
            livraria[num].setEditora(editora[num]);
            livraria[num].setNumPagina(numPagina[num]);
        }
    }

}

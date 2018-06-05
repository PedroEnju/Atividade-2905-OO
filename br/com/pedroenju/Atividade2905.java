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
            cadastroManual(i);
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
            System.out.printf("Título.: %s\r\n"
                    + "Autor.: %s\r\n"
                    + "Ano de Publicação.: %d\r\n"
                    + "Páginas.: %d\r\n"
                    + "Editora.: %s\r\n"
                    + "Exemplares.: %d\r\n\r\n",
                    b.getTitulo(),
                    b.getAutor(),
                    b.getAnoPublicacao(),
                    b.getNumPagina(),
                    b.getEditora(),
                    b.getExemplares());
        }
    }

    public static void imprimirLivraria() {
        for (LivroDeLivraria_extends l : livraria) {
            System.out.printf("Título.: %s\r\n"
                    + "Autor.: %s\r\n"
                    + "Ano de Publicação.: %d\r\n"
                    + "Páginas.: %d\r\n"
                    + "Editora.: %s\r\n"
                    + "ISBN.: %s\r\n"
                    + "Valor.: R$%.2f\r\n\r\n",
                    l.getTitulo(),
                    l.getAutor(),
                    l.getAnoPublicacao(),
                    l.getNumPagina(),
                    l.getEditora(),
                    l.getIsbn(),
                    l.getValor());
        }
    }

    public static void cadastroManual(int num) {
        String[] titulo = {
            "The Hitchhiker's Guide to the Galaxy",
            "As Aventuras de Sherlock Holmes",
            "A Pirâmide Vermelha"};
        int[] ano = {
            1979,
            1892,
            2010};
        String[] autor = {
            "Douglas Adams",
            "Arthur Conan Doyle",
            "Rick Riordan"};
        String[] editora = {
            "Pan Books",
            "George Newnes",
            "Disney Publishing Worldwide"};
        int[] numPagina = {
            224,
            416,
            516};

        String[] isbn = {
            "9812371813",
            "9083192387",
            "9731923816"};

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
            livraria[num].setIsbn(isbn[num]);
        }
    }

}

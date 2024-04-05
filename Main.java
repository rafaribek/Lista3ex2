package br.cesul;

public class Main {
    public static void main(String[] args) {
        Election eleicao = new Election();

        eleicao.votarCandidatoA();
        eleicao.votarCandidatoA();
        eleicao.votarCandidatoB();
        eleicao.votarBranco();
        eleicao.votarNulo();

        System.out.println("Resultado da eleição: " + eleicao.apurarResultado());
    }
}
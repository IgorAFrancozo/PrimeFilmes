package br.com.primefilmes.calculo;

class AcessorioPlaneta {
    int c;
    void c(int c) {
        c = c;
    }
}
class Planeta {
    public static void main(String[] args) {
        AcessorioPlaneta b = new AcessorioPlaneta();
        b.c = 10;
        System.out.println(b.c);
        b.c(30);
        System.out.println(b.c);
    }
}
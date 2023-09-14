package br.com.primefilmes.calculo;


class AcessorioClasseta {
    int v = 15;
}
class Classeta {
    public static void main(String[] args) {
        AcessorioClasseta x = new AcessorioClasseta();
        AcessorioClasseta y = x;
        y.v++;
        x.v++;
        AcessorioClasseta z = y;
        z.v--;
        System.out.println(x.v + y.v + z.v);
    }
}
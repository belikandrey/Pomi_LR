package by.bsuir.task5;

public class Fraction {
    private int m;
    private int n;

    public Fraction() {
    }

    public Fraction(int m) {
        this.m = m;
        this.n = 1;
    }

    public Fraction(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public Fraction sum(Fraction fraction){
        return new Fraction(fraction.m * this.n + fraction.n * this.m, fraction.n * this.n);
    }



}

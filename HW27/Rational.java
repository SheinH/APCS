public class Rational{
    private int numerator;
    private int denominator;
    public Rational(){
	numerator = 0;
	denominator = 1;
    }
    public Rational(int x, int y){
	if (y == 0){
	    System.out.println("Invalid denominator.");
	    this();
	}
	else{
	    numerator = x;
	    denominator = y;
	}
    }
    public String toString(){
	return numerator + " / " + denominator;
    }
    public double floatValue(){
	return ((double)numerator) / denominator;
    }
    public void multiply(Rational x){
	numerator *= x.numerator;
	denominator *= x.denominator;
    }
    public void divide(Rational x){
	numerator *= x.denominator;
	denominator *= x.numerator;
    }
}

/* Shein Htike
   Period 8
   HW#27
   2013/11/19
*/
public class Rational{
    // Phase 1
    private int numerator;
    private int denominator;
    public Rational(){
	numerator = 0;
	denominator = 1;
    }
    public Rational(int x, int y){
	if (y == 0){
	    System.out.println("Invalid denominator.");
	    numerator = 0;
	    denominator = 1;
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
    //Phase 2
    public static int gcd(int x, int y){
	if (Math.max(x,y) % Math.min(x,y) == 0){
	    return Math.min(x,y);
	}
	else {
	    return gcd(Math.min(x,y), (Math.max(x,y) % Math.min(x,y)));
	}
    }
    public int gcd(){
	return gcd(numerator,denominator);
    }
    // Phase 3
    public void add(Rational x){
	numerator *= x.denominator;
	numerator += x.numerator * denominator;
	denominator *= x.denominator;
    }    
    public void subtract(Rational x){
	numerator *= x.denominator;
	numerator -= x.numerator * denominator;
	denominator *= x.denominator;
    }
    public void reduce(){
	int gcd = gcd();
	numerator /= gcd;
	denominator /= gcd;
    }
    public int compareTo(Rational x){
	int a = numerator * x.denominator;
	int b = x.numerator * denominator;
	if (a == b){
	    return 0;
	}
	else if (a > b){
	    return 1;
	}
	else {
	    return -1;
	}
    }
    public static void main(String[] args){
	Rational x = new Rational(2,3);
	Rational y = new Rational(1,6);
	System.out.println(x);
	System.out.println(y);
	System.out.println("Add X and Y:");
	x.add(y);
	System.out.println(x);
	System.out.println("X - Y:");
	x.subtract(y);
	System.out.println(x);
	System.out.println("Reduce this:");
	x.reduce();
	System.out.println(x);
	System.out.println("Float point form:");
	System.out.println(x.floatValue());
	System.out.println("Compare X to Y:");
	System.out.println(x.compareTo(y));
	
    }
}

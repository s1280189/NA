/**
 *  Numerical Analysis. Exercise 03.
 */
public class ex03 {

    static double errorTolerance = 1e-7;

    public static void main(String[] args) {

	System.out.println();
	System.out.println("f(x) = x^3 -3*x^2 + 2*x - 0.2 = 0");

	new Bisection().solve();
	new Newton().solve();

    }

    static double f(double x) { return x*x*x -3*x*x + 2*x - 0.2; }
    static double fprime(double x) { return 3*x*x -6*x + 2; }
}

class Bisection {

    void solve() {

	System.out.println();
	System.out.println("Bisection method");
	double x, xneg=1.5, xpos=3;
	double e=ex03.errorTolerance;
	int n=1;
	String s;

	while(Math.abs(xpos-xneg) > e){
	    x=(xpos+xneg)/2;
	    if(ex03.f(x) > 0) xpos=x;
	    else xneg=x;
	    s=String.format("%.7f", x);

	    System.out.println("Iteration  "+ n + "   "
				   + "x =  " + s);
	    n++;

	}
    }

}

class Newton {

    void solve() {

	System.out.println();
	System.out.println("Newton's method");

	double x1, x0=3;
	double e=ex03.errorTolerance;
	double fx0, fx0p;
	String s;
	int n=1;
	fx0=ex03.f(x0);
	fx0p=ex03.fprime(x0);
	x1=x0;

	
	if(ex03.f(x0) != 0 && ex03.fprime(x0) != 0 ){
	    while(true){
    
		x0=x1;
		x1=x0 - ex03.f(x0)/ex03.fprime(x0);
		s=String.format("%.7f", x1);
		System.out.println("Iteration " + n + "   "
				   +"x = " + s);
		n++;

		if(Math.abs(x0-x1) < e) break;

	    }

	}
    }

}


/**
 *  Numerical Analysis. Exercise 09
 *  ODE
 */
public class ex09 {

    public static void main(String[] args) {

	System.out.println();
	System.out.println("dy/dx = xy, a=0, b=1, y(a) = 1");
	System.out.println();

	ex09 e = new ex09();
	e.Euler(0.1);
	e.RungeKutta(0.1);
	e.Euler(0.01);
	e.RungeKutta(0.01);

    }

    static double f(double x,double y) { return x*y; }

    static double a=0, b=1, ya = 1;

    void Euler(double h) {
	double x=0;
	double y=ya;
	double i=0;
	while(i<=1){
	    ya=ya+h*f(x,y);
	    i=i+h;
	    x=x+h;
	    y=ya;
	}
	double error= ya - Math.exp(0.5*x*x);

	System.out.println("Euler:  h=" + h +
			   " x=" + x +
			   " y=" + ya +
			   " Error="+ error);
	    
    }

    void RungeKutta(double h) {
    }

}

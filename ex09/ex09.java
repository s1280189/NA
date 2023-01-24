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
	double y_last=ya;
	double i=0;
	double key=(b-a)/h;
	while(i<key){
	    y_last=y_last+h*f(x,y);
	    x=x+h;
	    y=y_last;
	    i++;;
	}
	double error= y_last - Math.exp(0.5*x*x);

	System.out.println("Euler:  h=" + h +
			   " x=" + x  +
			   " y=" + y_last +
			   " Error="+ error);
	    
    }

    void RungeKutta(double h) {
	 double x=0;
	    double y=ya;
	    double y_last=ya;
	    double k1, k2, k3, k4;
	    double i=0;
	    double key=(b-a)/h;
	    while(i<key){
		   k1=h*f(x, y);
		    k2=h*f(x+h/2, y+k1/2);
		    k3=h*f(x+h/2, y+k2/2);
		    k4=h*f(x+h, y+k3);
		    y_last=y_last+(k1 + 2*k2 + 2*k3 + k4)/6;
		    x=x+h;
		    y=y_last;
		    i++;
	    }
	    double error= y_last - Math.exp(0.5*x*x);

	System.out.println("RungeKutta:  h=" + h +
			   " x=" + x +
			   " y=" + y_last +
			   " Error="+ error);
    }

}

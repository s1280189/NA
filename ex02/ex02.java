/**
 *  Numerical Analysis. Exercise 02.
 */
public class ex02 {
    public static void main(String[] args) {
	new QuadEquation().evaluate();
	new Cancellation().evaluate();
    }
}

class QuadEquation {
    void evaluate() {

	float x1f, x2f, af=1, bf=-8000, cf=1;
	x1f= (-bf + (float)Math.sqrt(bf*bf - 4*af*cf))/(2*af);
	x2f= (-bf - (float)Math.sqrt(bf*bf - 4*af*cf))/(2*af);
	System.out.println("Task1.Quadratic equation ax^2+bx+c=0");
	System.out.println("-----------------------------");
	System.out.println("a=1.0  b=-8000.0   c=1.0");
	System.out.println("Single precision x1 = " + x1f + " x2= " + x2f); 

	double x1d, x2d , ad= 1, bd=-8000, cd=1;

	x1d= (-bd + Math.sqrt(bd*bd - 4*ad*cd))/(2*ad);
	x2d= 2*cd/(-bd +Math.sqrt(bd*bd - 4*ad*cd));

	System.out.println("Double precision x1 = " + x1d + " x2= " + x2d);

	System.out.println(" ");



    }
}

class Cancellation {
    void evaluate(){
	System.out.println("Task2.Cancellation");
	System.out.println("------------");

	//a)------------------------------
	double x=1e12,result;
	result=Math.log(x+1) - Math.log(x);
	System.out.println("ln(x+1) - ln(x), x=1.0E12 : " +result);

	result=Math.log((x+1)/x);
	System.out.println("ln((x+1)/x), x=1.0E12 : " + result);
	System.out.println(" ");
	
	//b)------------------------------
	x=1e9;
	result=Math.sqrt(x*x + 1) - x;
	System.out.println("sqrt(x^2+1) - x , x=1.0E9 : " +result);

	result = 1/(Math.sqrt(x*x+1) + x);
	System.out.println("1/(sqrt(x^2+1) + x), x=1.0E9 : " +result);
	System.out.println(" ");

	//c)------------------------------

	x=44.999999999999;
	result=Math.cos(x)*Math.cos(x) - Math.sin(x)*Math.sin(x);
	System.out.println("cos^2(x)-sin^2(x), x = 44.999999999999 : "+ result);

	result=Math.cos(2*x);
	System.out.println("cos(2x), x=44.999999999999 : " +result);
	
     



    }
}
       

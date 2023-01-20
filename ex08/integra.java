public class integra {
    public static void main(String[] args){
	System.out.println("Numeral integration");
	System.out.println("Integral(1/(x^2 + 1)),  limit:[0,1]");
	System.out.println();
	new Trapezoidal().solve();
	new Simpson().solve();
    }
}

class Trapezoidal{
    void solve(){
	//double h=1/24;
	    int n=24;
	    double h = 1.0 / (double)n;
	    double result=0;
	    double x=0;
	    for(int i=0;i<n;i++){
		result=result + ((1/(x*x+1)) + (1/((x+h)*(x+h)+1)));
		x+=h;
	    }

	    System.out.println("Trapezoidal rule, nsub=24-----------");

	    result=(double)(h)*result /2;
	    System.out.println("I= " +result);
	    double error=result-Math.PI/4;
	    System.out.println("Error= " +error);
	    double relative=error/(Math.PI/4)*100;
	    System.out.println("R= "+ relative + "   %");
	    System.out.println();

    }
}

class Simpson{
    void solve(){
	    int n=24;
	    double h=1.0 / (double)n;
	    double result=0;
	    double x=0;
	    for(int i=0;i<=n-2;i=i+2){
		    result=result + ((1/(x*x+1)) +
					  ( 4* 1 /((x+h)*(x+h)+1) ) +
					  ( 1/ ((x+2*h)*(x+2*h)+1) ));
		    x=x + 2*h;
	    }

	    System.out.println("Simpson 1/3 rule, nsub=24--------");
	    result=(double)h * result /3.0;
	    
	    System.out.println("I= "+result);
	    double error=result-(Math.PI/4);
	    System.out.println("Error= "+error);
	    double relative=error/(Math.PI/4)*100;
	    System.out.println("R= "+relative + "%");
				 

    }
}

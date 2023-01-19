public class integra {
    public static void main(String[] args){
	    System.out.println("Numeral integration");
	    System.out.println("Integral(1/(x^2 + 1)),  limit:[0,1]");
	    
	     new Trapezoidal().solve();
	    new Simpson().solve();
	    
    }
}

class Trapezoidal{
    void solve(){
	    int h=1-0;
	    int n=24;
	    double result=0;
	    for(int i=0;i<24;i++){
		    result+=h/2*((1/(i*i+1))+(1/((i+1)*(i+1)+1)));
	    }
	    
	    System.out.println("I= " + result);
	    double error=result-M_PI/4;
	    System.out.println("Error = " +error);
	    double relative=error/(M_PI/4);
	    System.out.println("R= "+ relative);

    }
}

class Simpson{
    void solve(){
	    int h=1;
	    int n=24;
	    double result=0;
	    for(int i=0;i<=i-2;i=i+2){
		    result=h/3 *((1/(i*i+1)) + ( 1 /((i+1)*(i+1)+1) ) + ( 1/ ((i+2)*(i+2)+1) ));
	    }
	    
	    System.out.println("I= "+result);
	    double error=result-(M_PI/4);
	    System.out.println("Error= "+error);
	    double relative=error/(M_PI/4);
	    System.out.println("R= "+relative);
				 

    }
}

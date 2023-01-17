public class diff {

    public static void main(String[] args){
	System.out.println();
	System.out.println("f(x) = sin(x)");

	new Forward().solve();
	new Central().solve();

    }
}


class Forward{

    void solve(){
	System.out.println();
	System.out.println("Forward difference-----------");
	System.out.println();
	double[] x = new double[]{0, 0.1*Math.PI, 0.2*Math.PI,
	    0.3*Math.PI, 0.4*Math.PI, 0.5*Math.PI};
	double result;
	double h=0.025*Math.PI;

	for(int i=0;i<=5;i++){
	    result=(Math.sin(x[i]+h) - Math.sin(x[i]))/h;
	    System.out.println("Point:" + x[i]);
	    System.out.println("Derivative value: " + result);
	    result = result - Math.cos(x[i]);
	    System.out.println("Error: " + result);
	    System.out.println();
	}
    }
}

class Central{
    void solve(){
		System.out.println();
	System.out.println("Central difference----------");
	System.out.println();
	double[] x = new double[]{0, 0.1*Math.PI, 0.2*Math.PI,
	    0.3*Math.PI, 0.4*Math.PI, 0.5*Math.PI};
	double result;
	double h=0.025*Math.PI;

	for(int i=0;i<=5;i++){
	    result=(Math.sin(x[i]+h) - Math.sin(x[i]-h))/(2*h);
	    System.out.println("Point:" + x[i]);
	    System.out.println("Derivative value: " + result);
	    result=result - Math.cos(x[i]);
	    System.out.println("Error: " +result);
	    System.out.println();
	}
    }
}
	

	
	

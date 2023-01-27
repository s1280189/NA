public class ex10 {
    public static void main(String[] args){
	System.out.println("d^2u/dx^2 + d^2u/dy^2 + 2 = 0, edge length=1");

	ex10 e = new ex10();
	e.Liebman(0.1);

	e.Liebman(0.05);



    }


    void Liebman(double h){
	int n;
	if(h==0.1)n=10;
	else n=20;
	double x=0;
	double y=0.5;
	int itr=0;
	
	double[][] u;
	double[][] u2;
	u= new double[n+1][];
	u2=new double[n+1][];
	for(int i=0;i<n+1;i++){
	    u[i]=new double[n+1];
	    u2[i]=new double[n+1];
	}
	
	for(int i=0;i<n+1;i++){
	    for(int j=0;j<n+1;j++){
		u[i][j]=0;
		if(i==0 || j==0 || i==n || j==n){
		    u2[i][j]=0;
		}
	    }
	}

	boolean flag = true;
	while(flag) {
	    flag = false;
	for(int i=1;i<n;i++){
	    for(int j=1;j<n;j++){
		u2[i][j]=(u[i+1][j]+u2[i-1][j]+u[i][j+1]+u2[i][j-1]+2*h*h)/4;
	    }
	}

	for(int i=1;i<n+1;i++){
	    for(int j=0;j<n+1;j++){
		if(Math.abs((u2[i][j]-u[i][j])/u2[i][j])>1.0e-10){
		    flag = true;
		}
	    }
	}
	}

	System.out.println("Liebman method");
	System.out.println("n=" +n +"  h="+h );
	System.out.println("Iter ="+ itr);

	for(int i=0;i<n+1;i++){
	    System.out.println("x= " + x  +" u =" + u2[i][n/2]);
	    x=x+h;
	}

	System.out.println();
		    
	





    }


    void SOR(double h){

    }

}

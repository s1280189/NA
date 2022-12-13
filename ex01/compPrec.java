/**
 *  Numerical Analysis. Exercise 01.
 */

public class compPrec {

    /** Radix used by floating-point numbers    */
    static private int fRadix = 2;

    /** Largest positive value which, when subtracted to 1.0, yields 0.0   */
    static private double negativeMachinePrecision = 0;

    /** Largest possible number   */
    static private double largestNumber = 0;

    /** Smallest number different from zero     */
    //    static private double smallestNumber = 0;

    static private double eps=1.0; //EPS
    static private int n=0;
    static private double a=0;
    static private double f=0;
    static private double t = 0;


    public static double getNegativeMachinePrecision() {

	while(a<1){
	    eps=eps/(double)fRadix;
	    a=1-eps;
	    n++;
	}
	negativeMachinePrecision=eps;

	return negativeMachinePrecision;
    }
    
    public static double getLargestNumber() {
	largestNumber=1-(double)fRadix*getNegativeMachinePrecision();

	//double t=0;
	while(Double.isFinite(largestNumber) ){
	    t = largestNumber;
	    largestNumber*=fRadix;	    
	}

	

	return t;
    }


    public static void printParameters() {
	System.out.println( "Floating-point machine parameters");
	System.out.println( "---------------------------------");
	System.out.println( " ");
	System.out.println( "Negative machine precision = "
			    + getNegativeMachinePrecision());
	System.out.println( "Largest number = "+ getLargestNumber());
	//	System.out.println( "Smallest number = "+ getSmallestNumber());
	return;
    }


    public static void main(String[] args) {

	compPrec cp = new compPrec();

	cp.printParameters();

    }

}

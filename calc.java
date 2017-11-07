package calc;


public class calc {
	double plus(double a, double b) {
		return a+b;
	}
	double minus(double a, double b) {
		return a-b;
	}
	double kobeitu(double a, double b) {
		return a*b;
	}
	double bolu(double a, double b) {
		return (double)a/b;
	}
	
	
	double plus_minus(double a) {
		return a*(-1);
	}
	double fac(double a) {
		int b=1;
		for(int i=1;i<=a; i++) {
			b*=i;
		}
		return b;
	}
	double koren(double a) {
		return Math.sqrt(a);
	}
	double square(double a) {
		return a*a;
	}
	double stepen(double a, double b) {
		return Math.pow(a,b);
	}
	
	double C() {
		return 0;
	}
	
	
	
	
}


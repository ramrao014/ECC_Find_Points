import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x=0, y, a=2, b=4, p=7919;
		int cnt = 0;
		
		for(x = 0; x<=p-1; x++) {
			double aa = (Math.pow(x, 3) + a*x + b);
			y = aa%p;
			int ba1 = (int) aa;

			BigInteger ba, bp, v, i, r1, r2, exp1, exp2, sqrtchk;
			ba = new BigInteger(Integer.toString(ba1));
			bp = new BigInteger("7919");
			sqrtchk = ba.modPow((bp.subtract(new BigInteger("1"))).divide(new BigInteger("2")), bp);
			
			
				
			//CONGRUENT TO 4 MOD 3
			if(p%4 == 3) {
				if(sqrtchk.equals(new BigInteger("1"))) { //Check if square root exists
				exp1 = (bp.add(new BigInteger("1"))).divide(new BigInteger("4")); // Computing exponent value for r1
				r1 = ba.modPow(exp1, bp); // 1st root
				r2 = bp.subtract(r1); // 2nd root
				
				System.out.println("["+x+",  ("+r1+", "+r2+")"+"]");
				cnt++;
			}
			}
			//CONGRUENT TO 5 MOD 8
				else if(p%8 == 5) {
					if(sqrtchk.equals(new BigInteger("1"))) { //Check if square root exists
				exp2 = (bp.subtract(new BigInteger("5"))).divide(new BigInteger("8")); // Computing exponent value for v
				v = (ba.multiply(new BigInteger("2"))).modPow(exp2, bp); // Computing v
				i = (ba.multiply(new BigInteger("2")).multiply(v).multiply(v)).mod(bp); // Computing i
				r1 = (ba.multiply(v).multiply(i.subtract(new BigInteger("1")))).mod(bp); // 1st root
				r2 = bp.subtract(r1); // 2nd root
				
				System.out.println("["+x+",  ("+r1+", "+r2+")"+"]");
				cnt++;
			}
			//CONGRUENT TO 1 MOD 8
				else if(p%8 == 1) {
				
				
				
				System.out.println("1mod8");
			}
			}
			
			
		
	}
		System.out.println("Total no. of points : "+cnt);
		}}

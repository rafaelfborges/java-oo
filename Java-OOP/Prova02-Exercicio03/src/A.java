public class A {
	public int totalizar(int[] v) throws NumeroNegativo
	{
		int total = 0;
		for (int i = 0; i < v.length; i++){
			if ( v[i] < 0 )
				throw new NumeroNegativo( i, v[i] );
			total = total + v[i];
		}
		return total;
	}
}
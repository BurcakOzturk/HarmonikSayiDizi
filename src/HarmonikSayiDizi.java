public class HarmonikSayiDizi {

	public static void main(String[] args) {
		double[] harmonikDizi= {1,2,3,4,5,6,7,8,9,10};
		  
		double harmonikOrt,harmonikHesap = 0;
		   
		for (int i=0 ; i<=((harmonikDizi.length)-1) ;i++ ) {
			   		
			harmonikHesap=harmonikHesap+(1/(harmonikDizi[i]));			   
			   
		  	}
		   
		harmonikOrt=(harmonikDizi.length/harmonikHesap);
		
		System.out.println("dizideki elemanların harmonik degerlerinin toplamının ortalaması : "+ harmonikOrt );
	}
}

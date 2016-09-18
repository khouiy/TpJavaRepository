
public class TestIP {

	
	public static void verificationIP (String str){
		
		String [] tab = str.split("\\.");
		
		if (tab.length == 4){
			  
			int count =0;
			for (String i  : tab){
				if (Integer.parseInt(i) >=0 && Integer.parseInt(i) <= 255){
					
					count ++;
				}
				
			}
			
			if (count == 4 ){
				
				System.out.println("IP valide ");
				
			}else{
				
				System.out.println("IP Non  valide ");
			}
		}else {
			
			System.out.println("IP Non  valide ");
			
		}
	
		
	}
	
	
	
	
	
	public static double calculate(String chaine){
		
		double  resultat =0.0;
		String operateur ="" ;
		 String [] formule  = chaine.split(" ");
		for ( String str  : formule ){
			
			if (str.matches("[0-9]+")){
				 
				if (operateur.equals("")){
				resultat  = Double.parseDouble(str);
				}else if (operateur.equals("+")){
					
					resultat += Double.parseDouble(str);
				}else if (operateur.equals("*")){
					
					resultat *= Double.parseDouble(str);
				}
				
		}else {
			
			operateur = str;
		}
			
		}
		
		
		return resultat;
	}

	
/*	public static double calculateWithPriority(String chaine){
		
		double  resultat =0.0;
		String operateur ="" ;
		String [] formule  = chaine.split(" ");
		 
	  for (int i = 0 ; i<=formule.length-2 ;i++){
		  
		  
		  if (formule[i].matches("[0-9]+")){
				 
				if (operateur.equals("")){
				resultat  = Double.parseDouble(formule[i]);
				}else if (operateur.equals("+") && formule[i+1].equals("*") ){
					
					resultat = resultat + ( Double.parseDouble(formule[i]) *  Double.parseDouble(formule[i+2]));
					i =i+1;
				}else if ( operateur.equals("*") && !formule[i+1].equals("*")){
					
					resultat *= Double.parseDouble(formule[i]);
				}else if ( operateur.equals("+") && !formule[i+1].equals("*") ){
					
					resultat += Double.parseDouble(formule[i+2]);
					i--;
				}else if ( operateur.equals("*") && formule[i+1].equals("*")){
					
					resultat = resultat * Double.parseDouble(formule[i]) * Double.parseDouble(formule[i+2]) ;
				}
				
		}else {
			
			operateur = formule[i];
			i--;
		}
			 
		  
	  }
	  return resultat; 
	}
	
*/	
	
	
	public static double calculateWithPriority(String chaine , int i, double resultat){
		
		  
		 double temp = resultat ;
		 
		String [] formule  = chaine.split(" ");
	  
			if (i <formule.length){
		  if (formule[i].matches("[0-9]+")){
			  if (temp == 0.0) {
	     			temp = Double.parseDouble(formule[i]);
				}
				else {
					  temp *= Double.parseDouble(formule[i]);

				}
			  
			 
			 
			 return calculateWithPriority(chaine , i+1,  temp); 
			 
		  }else{
			   String c = formule[i];
			  switch (c) {
			  case "+" :
				     
				       return  resultat =  temp + calculateWithPriority(chaine , i+1,  0); 
			  
			                
			    
			  case "*" :    
				  
				  return  temp =  calculateWithPriority(chaine , i+1,  temp); 
				  
				   
			  }
			  
			  
			  
				  
			  
		  }
		
	}
		//}
		return resultat;
	}

	public static void main(String[] args) {
		
		
		
		//String ip = ".255.256.255.1";
		
	
		// verificationIP(ip);
		
		//System.out.println(calculate("12 + 8 * 2 + 5"));
		
		// 12 + 8 * 2+5
		
		// 
		System.out.println(calculateWithPriority("1 + 2 * 4",0,0.0));
	}
}


public class AmazonFlipcountStingExample {

	public static void main(String[] args) {
	 System.out.println(countCoinFlips("TTHHTHT"));

	}
	
	public static int countCoinFlips(String s){

	       int flipCount = 0  ;
	       int count = 0 ; 
	       int countHeads = 0; 
	       int countTails = 0 ; 
	       Character comp = 'H';

	      for(char ch : s.toCharArray()){
	          countHeads+=ch=='H'?1 : 0 ; 
	          countTails+=ch=='T'?1:0 ;
	          count = Math.max(countHeads,countTails);
	          comp = countHeads>countTails?'H':'T';  
	      }
	     int curr = 0 ;
	        
	      for(char ch : s.toCharArray()){
	          if(ch==comp){
	              if(curr!=0) flipCount++;
	          }
	          else{
	              curr++;
	          }
	          flipCount = Math.min(flipCount,curr);
	      }
	       return flipCount ;   
	    }

}

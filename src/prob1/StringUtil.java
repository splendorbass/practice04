package prob1;

public class StringUtil {
    public static String concatenate( String[] str ){
       String temp = str[0].concat(str[1]);
       String result = temp.concat(str[2]);
    	
//    	String temp = str[0]+str[1];
//        String result = temp+str[2];
       
       return result;
    }
    
  
}


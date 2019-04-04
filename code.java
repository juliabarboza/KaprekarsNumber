import java.util.*; 
import java.io.*;

class Main {  
  public static int KaprekarsConstant(int num) { 
  
  if (num == 6174) 
    {
        return 0;
    }
    
  int[] numArrayAsc = {num / 1000, num % 1000 / 100, num % 1000 % 100 / 10, num % 1000 % 100 % 10};
  Arrays.sort(numArrayAsc);
  
  int descnum= 0;
  int ascnum =0;
  
  for(int i = 0; i <4; i++)
  {
      descnum += (numArrayAsc[i] * (int)Math.pow(10, i));
      ascnum += (numArrayAsc[i] * (int)Math.pow(10, 3-i));
  }
  
  return 1 + KaprekarsConstant(descnum - ascnum);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(KaprekarsConstant(s.nextLine())); 
  }   
  
}

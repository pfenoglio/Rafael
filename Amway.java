import java.io.*;
import java.util.*;

public class Amway {

	static ArrayList<int[]> list = new ArrayList();
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		list.add(arr);
		for(int i = 1; i<=128; i++){
			int[] toAdd = new int[15];
			int counter = 1;
			arr = list.get(i-1);
			if(arr[0]+1>128){
				counter++;
				toAdd[0]=1;
			}
			else	
			toAdd[0]= arr[0]+1;
			
			if(arr[1]+1>128){
				counter++;
				toAdd[1]= 1;
			}
			else	
				toAdd[1]= arr[2]+1;
			
			if(toAdd[1]+1>128){
				counter++;
				toAdd[2]= 1;
			}
			else	
				toAdd[2]= toAdd[1]+1;
			
			if(arr[6]+1>128){
				counter++;
				toAdd[3]= 1;
			}
			else	
				toAdd[3]= arr[6]+1;
			
			if(toAdd[3]+1>128){
				counter++;
				toAdd[4]= 1;
			}
			else	
				toAdd[4]= toAdd[3]+1;
			
			if(toAdd[4]+1>128){
				counter++;
				toAdd[5]= 1;
			}
			else	
				toAdd[5]= toAdd[4]+1;
			
			if(toAdd[5]+1>128){
				counter++;
				toAdd[6]= 1;
			}
			else	
				toAdd[6]= toAdd[5]+1;
			if(arr[15]+1>128){
				counter++;
				toAdd[7]= 1;
			}
			else	
				toAdd[7]= arr[15]+1;
			
			if(arr[15]+1>128){
				counter++;
				toAdd[7]= 1;
			}
			else	
				toAdd[7]= arr[15]+1;
			
			toAdd[8]= toAdd[17]+1;
			toAdd[9]= toAdd[8]+1;
			toAdd[10]= toAdd[9]+1;
			toAdd[11]= toAdd[10]+1;
			toAdd[12]= toAdd[11]+1;
			toAdd[13]= toAdd[12]+1;
			toAdd[14]= toAdd[13]+1;
			toAdd[15]= toAdd[14]+1;
			list.add(toAdd);
			
			
			
			
			
			
			
		}
		
	}

}

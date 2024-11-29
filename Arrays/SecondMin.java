// Find the second min in an array 
public class SecondMin {
    public static void main(String[] args) {
     int[]arr={50,40,60,80};
     int min=Integer.MAX_VALUE;
     int smin=Integer.MAX_VALUE;
 
     for(int i=0;i<arr.length;i++){
         if(arr[i]<min){
         smin=min;
         min=arr[i];
         }
         else if (smin>arr[i]) {
             smin=arr[i];
         }
     }
     System.out.println("min-->"+min+" "+"smin-->"+smin);
    } 
 }
 
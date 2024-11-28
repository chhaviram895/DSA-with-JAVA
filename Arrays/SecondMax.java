// Find the second max in an array 
public class SecondMax {
   public static void main(String[] args) {
    int[]arr={50,40,60,80};
    int max=Integer.MIN_VALUE;
    int smax=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
        smax=max;
        max=arr[i];
        }
        else if (smax<arr[i]) {
            smax=arr[i];
        }
    }
    System.out.println("max-->"+max+" "+"smax-->"+smax);
   } 
}

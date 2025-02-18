public class Array{
    public static void main(String[] args){
        int[] arr={5,2,3,7,8,10};
        int temp;
        int i;
        temp=arr[0];
        for(i=0;i<arr.length-1;i++){
            if(arr[i+1]<temp){
                temp=arr[i+1];

            }
        }     
        System.out.println(temp);
    }
}
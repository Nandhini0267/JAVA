public class ArrayExample {
    public static void main(String[] args) {
        int[] num1=new int[5];
        int[] numbers = {2,8,4,7,6};
        System.out.println("First Elements:"+numbers[0]);
        System.out.println("Second number:"+numbers[1]);
        numbers[4]=20;
        System.out.println("Modified second element:"+numbers[2]);
        System.out.println("Length of the array:"+numbers.length);
        for(int i=0;i<numbers.length;i++){
            System.out.println("Element at index"+i+":"+numbers[i]);
        }
    }
}
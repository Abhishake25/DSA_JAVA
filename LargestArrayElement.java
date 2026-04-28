//Here I write only the logic of Problem
class LargestArrayElement{
    public static int largest(int[] arr) {
        // code here
        int max=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,67,89,90};
        int result = largest(arr);
        System.out.println(result);
    }
}

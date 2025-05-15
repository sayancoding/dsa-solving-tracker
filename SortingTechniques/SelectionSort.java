class SelectionSort{
    public static void main(String[] args) {
        int[] arr = new int[] {64, 25, 12, 22, 11};
        arr = sort(arr);
        for(int el : arr){
            System.out.print(el +" ");
        }
    }

    public static int[] sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            /*
             * Select one index and try to find small element from left side
             * and at last place that element on that selected index
             * each outer iteration left -> sorted && right -> unsorted manner
             */
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }
}

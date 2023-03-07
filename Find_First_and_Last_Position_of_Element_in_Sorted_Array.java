class First_Last {
    public static int[] search(int[] nums, int target) {

        int[] output=new int[2];

        output[0]=firstOcc(nums,target);
        output[1]=lastOcc(nums,target);
        return output;
    }

    public static int firstOcc(int[] arr,int target){
        int Start=0;
        int End=arr.length-1;

        int index=-1;

        while(Start<=End) {

            int mid=Start+(End-Start)/2;

            if(arr[mid]<target) {
                Start=mid+1;
            }
            else if(arr[mid]>target) {
                End=mid-1;
            }
            else {
                index=mid;
                End=mid-1;
            }
        }
        return index;
    }

    public static int lastOcc(int[] arr,int target){
        int Start=0;
        int End=arr.length-1;

        int index=-1;

        while(Start<=End) {

            int mid=Start+(End-Start)/2;

            if(arr[mid]<target) {
                Start=mid+1;
            }
            else if(arr[mid]>target) {
                End=mid-1;
            }
            else {
                index=mid;
                Start=mid+1;
            }
        }
        return index;
    }
    public static void main(String[] args)
    {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        System.out.println(search(nums,target));

    }
}

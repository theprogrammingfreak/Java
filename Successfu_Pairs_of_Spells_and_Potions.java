import java.util.Arrays;

public class SpellsandPotions {
//    public int[] successfulPairs(int[] spells,int[] potions,long succes) Time complexity O(n2) 51/56 test cases passed
//    {
//        int count=0;
//        int[] finalProduct=new int[spells.length];
//        for(int i=0;i<spells.length;i++)
//        {
//            for(int j=0;j<potions.length;j++)
//            {
//                if((long)spells[i]*potions[j]>=success) 
//                {
//                    count++;
//                }
//            }
//            finalProduct[i]=count;
//            count=0;
//        }
//        return finalProduct;
//    }
//
    public int[] successfulPairs(int[] spells, int[] potions, long success) {// efficient solutio
        int [] result = new int[spells.length];
        int length = potions.length;
        Arrays.sort(potions);

        for(int i=0; i<spells.length; i++){
            int minIdx = binarySearch(potions, success, spells[i]);
            result[i] = length - minIdx;
        }
        return result;
    }

    private int binarySearch(int [] potions, long success, int spell){
        int left= 0;
        int right= potions.length;

        while(left<right){
            int mid = left + (right-left)/2;
            long pro = (1l * spell) * potions[mid];
            if(pro<success){
                left=mid+1;
            }else{
                right=mid;
            }
        }

        return left;
    }
}


package volume4;

public class lesson05EnhancedForLoopArrayExercice {
    public static void main (String args[]){
        int array[]={1,2,3,4,5,6,7,8};
        int smallestNum=array[0];
        int largestNum=array[0];
        for(int element:array){
            if (smallestNum<element)smallestNum=element;
            if (largestNum>element)largestNum=element;
        }
        System.out.println(smallestNum);
        System.out.println(largestNum);
        }
    }


import java.util.Scanner;
public class MedhtodgetArrayReturn {
    public static void main(String[] args) {
        int [] numberone = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Min value in numberone is : " + fileMininArray(numberone));
        System.out.println("Max value in numberone is : " + fileMaxinArray(numberone));
        int [] numbertwo = {11,12,13,14,15,16,17,18,19,20};
        System.out.println("Min value in numbertwo is : " + fileMininArray(numbertwo));
        System.out.println("Max value in numbertwo is : " + fileMaxinArray(numbertwo));
        int [] numberthree = {21,22,23,24,25,26,27,28,29,30};
        System.out.println("Min value in numberthree is : " + fileMininArray(numberthree));
        System.out.println("Max value in numberthree is : " + fileMaxinArray(numberthree));
        int [] numberfour = {31,32,33,34,35,36,37,38,39,40};
        System.out.println("Min value in numberfour is : " + fileMininArray(numberfour));   
        System.out.println("Max value in numberfour is : " + fileMaxinArray(numberfour));
    }
    static int fileMaxinArray (int [] arr){
        //get the max number in the array and reqturns the array
        int maxvalue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
    static int fileMininArray (int [] arr){
        //get the max number in the array and reqturns the array
        int minvalue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minvalue){
                minvalue = arr[i];
            }
        }
        return minvalue;
    }
}

package Task;

public class Practice_12_MissingNumberFromArray {

    /* How to find Missing Number In Array */

    // Logic = (1+2+3+4+5) = 15 - (1+2+4+5) = 13 > Missing number: 15-12 = 3

    public static void main(String[] args) {
            int a[] = {1,2,4,5};

            //1+2+4+5 = 12
            //1+2+3+4+5= 15;
            //15-12=3
            //* To satisfy += condition in any loop first we need to declare the value.

        int total = 0;
        for(int num : a){
            total += num; //total = total + num;
        }
        System.out.println(total);
        int total1 = 0;
        for(int j=0; j<=5; j++){
            total1 += j;
        }
        System.out.println(total1);
        System.out.println("missing number: " + (total1 - total));
        }
    }

// Box Pattern 


/*

Input:
4

Output:
* * * *
*     *
*     *
* * * *

*/
public class MyJavaPrg1{
    public static void main(String[] args) {
        int $a=4;
        for(int i=1;i<=$a;i++){
            for(int j=1;j<=$a;j++){
                if(i==1 || i==$a){
                    System.out.print("* ");
                }
                else{
                    if(j==1 || j==$a){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");;
                    }
                }
            }
            System.out.println();
        }
    }
}

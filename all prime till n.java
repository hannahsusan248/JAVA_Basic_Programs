import java.util.*;
class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        for(int i=2;i<=n;i++){
            int flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
/*OUTPUT:
Enter a number:5
2 3 5 
*/

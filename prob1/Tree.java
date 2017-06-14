import java.io.*;
import java.util.*;

class TreeTest{

  void formTree(int no){
    int temp1 = no;
    int temp2 = no/2;
    int temp3 = no;
    int cnt, start, i, j, k1, k2;
    for(i=1; i<=no; i++)
    {
        cnt=0;
        if(no%2 == 0){
          for(j=1; j<=no+1; j++)
          {

            if(i%2 == 0)
            {
              // when i is even
              start=temp3/2;
              for(k1=1; k1<=temp2; k1++)
              {
                if(!(k1<start) && (cnt<i)){
                  System.out.print("*");
                  cnt ++;
                }
                else{
                  System.out.print("_");
                  // System.out.print("k1:"+k1);
                }
              }
              System.out.print("_");
              for(k2=temp2; k2>=1; k2--)
              {
                if(!(k2<start) && (cnt<i)){
                  System.out.print("*");
                  cnt ++;
                }
                else{
                  System.out.print("_");
                  // System.out.print("k2:"+k2);
                }
              }
              break;
            }
            else{
              // when i is odd
              start = temp1/2+1;
              if((cnt<i) && !(j<start)){
                System.out.print("*");
                // System.out.println("i:"+i+",cnt:"+cnt);
                cnt ++;
              }
              else{
                System.out.print("_");
              }
            }
          }
          System.out.println();
          if(i%2==0){
            temp3 = temp3 -2;
          }
          else{
            temp1 = temp1 -2;
          }
        }
        else{
            for(j=1; j<=no; j++)
            {

              if(i%2 == 0)
              {
                // when i is even
                start=temp3/2;
                for(k1=1; k1<=temp2; k1++)
                {
                  if(!(k1<start) && (cnt<i)){
                    System.out.print("*");
                    cnt ++;
                  }
                  else{
                    System.out.print("_");
                    // System.out.print("k1:"+k1);
                  }
                }
                System.out.print("_");
                for(k2=temp2; k2>=1; k2--)
                {
                  if(!(k2<start) && (cnt<i)){
                    System.out.print("*");
                    cnt ++;
                  }
                  else{
                    System.out.print("_");
                    // System.out.print("k2:"+k2);
                  }
                }
                break;
              }
              else{
                // when i is odd
                start = temp1/2+1;
                if((cnt<i) && !(j<start)){
                  System.out.print("*");
                  // System.out.println("i:"+i+",cnt:"+cnt);
                  cnt ++;
                }
                else{
                  System.out.print("_");
                }
              }
            }
            System.out.println();
            if(i%2==0){
              temp3 = temp3 -2;
            }
            else{
              temp1 = temp1 -2;
            }
          }


    }
  }

}

public class Tree{

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    TreeTest tree = new TreeTest();
    System.out.println("----\t Here we are going to form a TREE \t----");
    System.out.println("Enter any no:");
    int no = sc.nextInt();
    tree.formTree(no);
  }

}

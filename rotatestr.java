import java.io.*;
import java.util.*;
public class Solution
{
    public static void main(String[] args) 
    {
        Scanner f=new Scanner(System.in);
        String str1=f.nextLine();
        String str2=f.nextLine();
        if((str1.length()==str2.length()) && ((str1+str1).contains(str2)))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}

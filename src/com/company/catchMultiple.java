package com.company;

//try, catch, finally.
//one main use of finally is that if we use some file and after applying try catch..we can close the file in finally
//even if ther eis no try catch ..or even there is not a particular handling which leads to exit the code, still finally will work

public class catchMultiple {
    public static void main(String[] args) {
        int l=0;
        try {
            int k=5;
            int ary[]={2,3,4};
            System.out.println(ary[k]);
        }
        catch (ArithmeticException exp)
        {
            System.out.println("div by 0 not valid");
        }
        catch (ArrayIndexOutOfBoundsException exr)
        {
            System.out.println(exr.getMessage());
        }
        finally {
            System.out.println("code finished");
        }
    }
}

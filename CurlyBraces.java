package IFstatement;

public class CurlyBraces {
    public static void main(String[] args) {

        int x = 5;
        int r = 4;

        if (r>=x)    // no curly braces
            x++;    // first line will not be executed because FALSE
            --x;     // 5 - 1 = 4   if false second line will be executed
            x--;     // 4 - 1 = 3   same with second line

        System.out.println(x);



        int num = 6;
        int num1 = 10;

        if (num > num1) {   // with curly braces. result is FALSE
            num1++;         // that's why all lines will not be executed
            num1--;
            --num1;
        }
        System.out.println(num1);    // num1 = 10 still










    }
}

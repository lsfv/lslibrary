package app.lslibrary.dataHelper;

import java.util.ArrayList;
import java.util.List;

import app.lslibrary.androidHelper.LSLog;

public abstract class LSNumber
{
    //eg.521 get res.res[0]=1.res[1]=2. res[2]=5;
    public static List<Integer> getEachNumber(int number)
    {
        List<Integer> res=new ArrayList<>();
        number=Math.abs(number);
        String strNumber=number+"";
        for(int i=strNumber.length()-1;i>=0;i--)
        {
            res.add(Integer.valueOf(strNumber.substring(i,i+1)));
        }
        return res;
    }
}
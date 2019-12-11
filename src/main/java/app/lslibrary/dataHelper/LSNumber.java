package app.lslibrary.dataHelper;

import java.util.ArrayList;
import java.util.List;

import app.lslibrary.androidHelper.LSLog;

public abstract class LSNumber
{
    public static List<Integer> getEachNumber(int number)
    {
        List<Integer> res=new ArrayList<>();
        number=Math.abs(number);
        String strNumber=number+"";
        for(int i=0;i<strNumber.length();i++)
        {
            res.add(Integer.valueOf(strNumber.substring(i,i+1)));
        }
        return res;
    }
}
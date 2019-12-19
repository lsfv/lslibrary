package app.lslibrary.pattern;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import app.lslibrary.androidHelper.LSLog;

public class LSListen<T>
{
    public interface IOrder<A >
    {
        void onHappen(A data);
        void onFieldChange(Field field, Object value);
    }

    public List<IOrder> LISTENERS = new ArrayList<>();

    public void addOrder(IOrder<T> order)
    {
        LISTENERS.add(order);
    }

    public void unOrder(IOrder<T> order)
    {
        LISTENERS.remove(order);
    }

    public void NoticeOrder(T parameter)
    {
        for (IOrder item : LISTENERS)
        {
            if (item != null)
            {
                try
                {
                    item.onHappen(parameter);
                }
                catch (Exception e)
                {
                    LSLog.Log_Exception(e);
                }
            }
        }
    }

    public void NoticeOrder_field(Field field,Object value)
    {
        for (IOrder item : LISTENERS)
        {
            if (item != null)
            {
                try
                {
                    item.onFieldChange(field, value);
                }
                catch (Exception e)
                {
                    LSLog.Log_Exception(e);
                }
            }
        }
    }
}
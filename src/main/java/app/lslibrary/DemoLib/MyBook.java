package app.lslibrary.DemoLib;

public class MyBook
{
    private int mID;
    private String mName;

    public MyBook(int id,String name)
    {
        mID=id;
        mName=name;
    }

    public int getID()
    {
        return mID;
    }

    public void setID(int ID)
    {
        mID = ID;
    }

    public String getName()
    {
        return mName;
    }

    public void setName(String name)
    {
        mName = name;
    }
}
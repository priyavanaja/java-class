interface college
{
    void watching();

}
interface school
{
    void study();
}
    class smartclass implements college,school
{
    
    public void watching()
{
System.out.println("watching the class");
}

public void study()
{
System.out.println("studying the class");
}

}
public class Tech{
    public static void main(String[] args){
        smartclass s=new smartclass();
        s.watching();

    }
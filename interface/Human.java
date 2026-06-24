interface pepole{
    void eating();
    default void gendertype()
    {
System.out.println("male");

    }
}
class sasi implements pepole{
    public void eating(){
        System.out.println("sasi is eating ");
    }
}
public class Human{
    public static void main (String[] args){
        sasi s=new sasi();
        s.eating();
        s.gendertype();
    }
    
}
    
}

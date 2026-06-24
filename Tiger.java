interface Animal{
    void sound();

}
public class Tiger{
    public static void main(String[]args){
        Animal a= new Animal(){
            public void sound(){
                System.out.println("Tiger roars");
                      };
        };
        a.sound();
    }
}
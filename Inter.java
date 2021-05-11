package Action;
interface I{
    public void speak();
}
class J implements I{
    public void speak(){
        System.out.println("I can speak");
    }
}

class K implements I{
  public void speak(){
      System.out.println("I can also speak");
  }
}
public class Inter{
    public static void main(String args[]){
        J O = new J();
        O.speak();

        K o1 = new K();
        o1.speak();

        //With lembda expression
        I o = () -> {
          System.out.println("i am your papa");
          };
      o.speak();
        //With anaoymose class
        I O1 = new I() {
            @Override
            public void speak() {
                System.out.println("i can dance.");
            }
        };O1.speak();
        }

    }

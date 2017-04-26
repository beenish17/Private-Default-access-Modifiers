
package pond.swan;
import pond.duck.MotherDuck;

public class BadCygnet extends MotherDuck{
    public void makeNoise(){
        MotherDuck bunny=new MotherDuck();
           // bunny.quack();        cant access
        // cant access anything because mother only gives lesson to members within the same pakage she is using default access.
    }
}

package OOP.abstraction;
/*An abstraction is a way of hiding the implementation details and showing only the functionality to the users.
 In other words, it ignores the irrelevant details and shows only the required one
 _the methodes should be public
 -we can not make the methodes static because static should have a body and in interface all the methodes should
  be with out  body
  -interface is a prototype
  -abstraction is an implementation hiding
*/
public interface Mobile {
    String storage="";
    String camera="";
    double cameraResulution=0.0;
    String clavier="";
    public void storage();
    public void camera();
    public void CameraResulution();
    public void tClavier();

}

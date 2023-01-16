package objectsandstudents;
/**
 * This class +++ Insert class description here +++
 * @author Gabriel Montemayor
 */
public class ObjectsAndStudents 
{
    public static void main(String[] args) 
    {
        Student [] list = new Student [3];
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.setName("Simon");
        s1.setAge(16);
        
        s2.setName("Gabriel");
        s2.setAge(19);
        
        s3.setName("Freddy");
        s3.setAge(31);
        
        list [0] = s1;
        list [1] = s2;
        list [2] = s3;
        
        for(int i = 0; i < list.length; i++)
        {
            System.out.println(list[i].getName() + ", " + list[i].getAge());
        }       
    }
}

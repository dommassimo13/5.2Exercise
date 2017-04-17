/**
 * Created by dominic massimo on 4/17/2017.
 */
public class PersonDriver {
    public static void main(String[] args) {
        Person dom = new Person();
        dom.setName("Dom");
        dom.setAge(24);

        Person john = new Person("John",21);

        if (dom.getName().equals(john.getName()) && dom.getAge() ==john.getAge()){
            System.out.println("The two people have the same name and age");
        }else{
            System.out.println("The two peoples age and name are not equal");
        }
        if (dom.getName().equals(john.getName())){
            System.out.println("The two people have the same name");
        }else {
            System.out.println("The two people have different names");
        }
        if (dom.getAge() == john.getAge()){
            System.out.println("The two people are the same age");
        }else {
            System.out.println("The two people have different ages");
        }
        if (dom.getAge()>john.getAge()){
            System.out.println("Dom is older than john");
        }else {
            System.out.println("John is older than dom");
        }
        if(dom.getAge()<john.getAge()){
            System.out.println("Dom is younger than john");
        }else{
            System.out.println("John is younger than john");
        }
        System.out.println(dom);
        System.out.println(john);
    }
}

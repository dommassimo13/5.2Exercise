/**
 * Created by dom on 4/17/2017.
 * purpose: create classes for name and ages of two people
 */
public class Person {
    private String name;
    private int age;

    /**
     * Construct new person with name frank and age=0
     */
    public Person(){
        name="frank";
        age=0;
    }
    /**
     * Construct new person with values provided from name and age param
     * @param name the name of a person
     * @param age the age of a person
     */

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    /**
     * Get the name of a person
     * @return name of a person
     */
    public String getName(){
        return name;
    }
    /**
     * Set the name of a person according to name param
     * @param name of a person
     */
    public void setName(String name){
        this.name=name;
    }
    /**
     * Get the age of a person
     * @return age of a person
     */
    public int getAge(){
        return age;
    }
    /**
     * set the age of a person accoring to param
     * @param age of person
     */
    public void setAge(int age){
        this.age=age;
    }
    /**
     * return a name and age of a person
     */
    public String toString(){
        return "Name: " +name+"Age: "+age;
    }
}
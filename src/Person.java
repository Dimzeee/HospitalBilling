public class Person {
    private String name;

    public Person(){
        this("No name");
    }
    public Person(String name){
        setName(name);
    }
    public Person(Person otherPerson){
        this(otherPerson.name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return getName();
    }
    public boolean equals(Person otherPerson){
        return getName().equals(otherPerson.getName());
    }
}// end Person

package placement;

public class Employee1 implements SpecialEntity{
	
    private String name;
    private int id;

    public Employee1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + '}';
    }

}

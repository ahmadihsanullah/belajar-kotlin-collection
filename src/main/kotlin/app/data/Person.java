package app.data;

public class Person {
    String data;
    public Person(String data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        return this.data.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            return data == ((Person)obj).data;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "data='" + data + '\'' +
                '}';
    }
}

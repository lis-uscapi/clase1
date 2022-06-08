//
//import java.util.Objects;
//
//public class Person {
//
//    private String id;
//    private String name;
//    private String country;
//
//
//    public  Person(String id, String name, String country) {
//        this.id = id;
//        this.name = name;
//        this.country = country;
//    }
//    public String getId() {
//        return id;
//    }
//    public String getName() {
//        return name;
//    }
//    public String getCountry() {
//        return country;
//    }
//    public void setId(String id) {
//        this.id = id;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    //metodo que muestra_todo en un string
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", country='" + country + '\'' +
//                '}';
//    }
//
//    //que no sea igual al objeto que estamos crendo
//
//    @Override
//    public boolean equals(Object o) {
//        if(this == o) return true;
//        if(o == null || getClass() != o.getClass()) return false;
//        //se iguala
//        Person person = (Person) o;
//        return Objects.equals(id, person.id) &&
//                Objects.equals(name, person.name) &&
//                Objects.equals(country, person.country);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, country);
//    }
//}
//


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> hashSet = new HashSet<>();
        Set<Student> linkedHashSet = new LinkedHashSet<>();
        Set<Student> treeSetStudent = new TreeSet<>();
        Set<Car> treeSetCar = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.year - o2.year;
            }
        });

        Student st1 = new Student("Bob",2,14);
        Student st2 = new Student("Tom",3,16);
        Student st3 = new Student("Jack",5,13);
        Student st4 = new Student("Sam",1,15);
        Student st5 = new Student("Kell",4,17);

        hashSet.add(st1);
        hashSet.add(st1);
        hashSet.add(st2);
        hashSet.add(st3);
        hashSet.add(st4);
        hashSet.add(st5);

        linkedHashSet.add(st1);
        linkedHashSet.add(st1);
        linkedHashSet.add(st2);
        linkedHashSet.add(st3);
        linkedHashSet.add(st4);
        linkedHashSet.add(st5);

        treeSetStudent.add(st1);
        treeSetStudent.add(st1);
        treeSetStudent.add(st2);
        treeSetStudent.add(st3);
        treeSetStudent.add(st4);
        treeSetStudent.add(st5);

        Car car1 = new Car("Ford", 2007, 12999);
        Car car2 = new Car("BMW", 2002, 15000);
        Car car3 = new Car("Mercedes", 1995, 17555);
        Car car4 = new Car("KIA", 2001, 25111);
        Car car5 = new Car("Honda", 2016, 35112);

        treeSetCar.add(car1);
        treeSetCar.add(car2);
        treeSetCar.add(car3);
        treeSetCar.add(car4);
        treeSetCar.add(car5);

        for(Student st : hashSet){
            System.out.println(st);
        }

        for(Student st : linkedHashSet){
            System.out.println(st);
        }

        for(Student st : treeSetStudent){
            System.out.println(st);
        }

        for(Car cr : treeSetCar){
            System.out.println(cr);
        }


    }
}

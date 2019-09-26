import com.sun.tools.javac.Main;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Maintest {
    public void mainFunction(ArrayList<Student> studentArrayList){
        Comparator<Student> studentComparator=new StudentSorter();
        Collections.sort(studentArrayList,studentComparator);
        System.out.println(studentArrayList);
    }

    public static void main(String[] args) {
        ArrayList<Student>  studentArrayList=new ArrayList<>();
        Student student1= new Student(1,"Aryan",22);
        Student student2= new Student(3,"Akansha",22);
        Student student3= new Student(5,"Messi",32);
        Student student4= new Student(2,"Ronaldo",34);
        Student student5= new Student(4,"Akruti",22);

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);

        Maintest maintest=new Maintest();
        maintest.mainFunction(studentArrayList);

    }
}

class Student {
    private int id;
    private String Name;
    private int  age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.Name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "{Name: "+Name+" Age: "+age+" Id: "+id+"} ";
    }
}

 class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()==o2.getAge()){
           return o1.getName().compareTo(o2.getName());
        }
        if (o1.getAge()<o2.getAge()){
            return 1;
        }
        else{
            return -1;
        }

    }
}
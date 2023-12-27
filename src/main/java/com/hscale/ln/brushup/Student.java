package com.hscale.ln.brushup;

public class Student {

    private String name;

    public long getId() {
        return id;
    }

    private long id;


    private static int counter;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        counter=10;
    }

    public static void findGrade(){
        String grade ="A";
        System.out.println(" Garde is "+grade);
    }

    public int getCounter(){
        counter++;
        System.out.println(" counter is "+counter);
        return counter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

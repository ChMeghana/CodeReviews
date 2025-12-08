package org.example.basics;

class Student {
    String name;
    int rollNo;

    // Constructor
    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    // Override equals method
   /* @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Student2 other = (Student2) obj;
        return this.rollNo == other.rollNo; // equal if rollNo is same
    }
*/
    @Override
    public String toString(){
        return name + " (" + rollNo + ")";
    }
}



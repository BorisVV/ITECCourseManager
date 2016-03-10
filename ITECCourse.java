package com.BorisV.java;

        import java.util.ArrayList;

public class ITECCourse {
    private String name;
    private int code;
    private int maxStudents;
    private String roomNumber;
    private ArrayList<String> students;

    //I added the roomNumber var and made it private too.

    public ITECCourse(String courseName, int courseCode, int coursemaxStudents, String courseRoomNumber) {
        this.name = courseName;
        this.code = courseCode;
        this.maxStudents = coursemaxStudents;
        this.roomNumber = courseRoomNumber;
        this.students = new ArrayList<String>();

        //I added the new CourseRoomNumber in the constructor, so it is added in the main.
    }


    public void addStudent(String studentName) {
        //don't need to check if students is null - the constructor set it up
        //If the number of students is the same as the max allowed, cant add any more
        if (students.size() < this.maxStudents) {
            students.add(studentName);
            System.out.println(studentName + " was added to " + this.name);
        }else{
            //There is no room for this student
            System.out.println(this.name + " is full, max number of students is " + this.maxStudents + ". " + studentName +
                    " not added");
        }
    }


    //I created this new method so it will only print the name and total of the free spaces only on the
    //ITECCourseManager.
    public void addStudent2(String studentName) {
        if (students.size() < this.maxStudents) {
            students.add(studentName);
        }    //This is used in the ITECCourseManager to add names but no print outs.
    }


    //This is the getFreeSpace method for ITECCourseManager to get the total free space available.
    public int getFreeSpace() {
        return maxStudents - students.size();
    }


    public int getNumberOfStudents() {
        return this.students.size();
    }


    public void writeCourseInfo2() {
        System.out.println("Course Name: " + this.name);
        System.out.println("The number of free spaces: " + getFreeSpace());

    }

    public void writeCourseInfo() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Course Room Number: " + this.roomNumber);
        System.out.println("Course Max Number of Students: " + this.maxStudents);
        System.out.println("Students enrolled:");
        for (String sturdent : this.students) {
            System.out.println(sturdent);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled.");
        System.out.println("The max number of students that can enroll in this course is " + this.maxStudents);

    }



    public String getCourseName() {
        return this.name;
    }

    public void setCourseName(String newName) {
        this.name = newName;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    //This is the new setRoomNumber for the homework.

    public String getRoomNumber() {
        return this.roomNumber;
    }
//    This is the getmethod for RoomNumber.


    public void removestudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        }
    }


    public static void main(String[] args) {
        ITECCourse infoTechConcepts = new ITECCourse("Info Tech Concepts ", 1110, 30, "T3050");
        infoTechConcepts.writeCourseInfo();
        infoTechConcepts.addStudent("Max");
        infoTechConcepts.addStudent("Nancy");
        infoTechConcepts.addStudent("Orson");

        //This is the Object generator that creates the new object. Also stores the new name the
        //the code number the max students allowed and the room number inside the parenthesis.
        //Three students were added and will show on the print out.
    }
}

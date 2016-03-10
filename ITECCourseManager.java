package com.BorisV.java;

import java.util.ArrayList;

public class ITECCourseManager {

    public static void main(String[] args) {
        //This creates the array list for the names of the courses.
        ArrayList<ITECCourse> coursesNames = new ArrayList<ITECCourse>();
        //Next is the object so it can be added to array list.
        ITECCourse newName = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20, "T3030");
        coursesNames.add(newName); // Add the course names and info to the array
        newName.addStudent2("Anna"); //This add the names to the new array.
        newName.addStudent2("Bill");
        newName.addStudent2("Carl"); //Look in the ITECCourse Class for the new addStudent2 method in the github website.

        //Now I can use the newName to add more course names to the array.
        //The following get added to the array.
        newName = new ITECCourse("Data Communications", 1425, 30, "T3050");
        newName.addStudent2("Dave"); //Same in this block this is added to the new arraylist.
        newName.addStudent2("Ed");
        newName.addStudent2("Flora");
        coursesNames.add(newName);


        //The for loop is used below to check and call each array on the ArrayList.
        //It prints only the name and the number of free spaces.
        for (ITECCourse obj : coursesNames) {
            obj.writeCourseInfo2(); //This prints each item in the ArrayList.
            System.out.println();
            //Look for the new method called writeCourseInfo2 in the ITECCourse in the github website.
        }
    }
}



package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Set<Task> carolsTasks = new HashSet<>();
//        Task carolsTask = new Task("workintech1" , "blabla1" ,"11" , Status.ASSIGNED , Priority.HIGH );
//        Task carolsTask2 = new Task("workintech2" , "blabla2" ,"112" , Status.ASSIGNED , Priority.HIGH );
//        carolsTasks.add(carolsTask);
//        carolsTasks.add(carolsTask2);
//        Set<Task> bobsTasks = new HashSet<>();
//        Task bobTask = new Task("workintech3" , "blabla3" ,"1122" , Status.IN_QUEUE , Priority.LOW );
//        Task bobTask2 = new Task("workintech4" , "blabla4" ,"1122" , Status.IN_PROGRESS , Priority.MED );
//        bobsTasks.add(bobTask);
//        bobsTasks.add(bobTask2);
//        Set<Task> unassignedTasks = new HashSet<>();
//        Task unassignedTask = new Task("workintech5" , "blabla5" ,"11333" , Status.IN_PROGRESS , Priority.MED );
//        Task unassignedTask2 = new Task("workintech6" , "blabla6" ,"11244" , Status.ASSIGNED , Priority.HIGH );
//        unassignedTasks.add(unassignedTask);
//        unassignedTasks.add(unassignedTask2);
//        Set<Task> annsTasks = new HashSet<>();
//        Task annTask = new Task("workintech7" , "blabla7" ,"11888" , Status.ASSIGNED , Priority.LOW );
//        Task annTask2 = new Task("workintech8" , "blabla8" ,null , Status.ASSIGNED , Priority.HIGH );
//        annsTasks.add(annTask);
//        annsTasks.add(annTask2);
//        TaskData taskData = new TaskData(annsTasks , bobsTasks , carolsTasks , unassignedTasks);
//        System.out.println("bob tasks:"+ taskData.getTasks("bob"));
//        System.out.println("ann tasks:"+ taskData.getTasks("ann"));
//        System.out.println("carol tasks:"+ taskData.getTasks("carol"));
//        System.out.println("all tasks:"+ taskData.getTasks("all"));
//        System.out.println("unnasigned: " + taskData.getDifferences(unassignedTasks,taskData.getTasks("ann")));
//        taskData.getIntersection(bobsTasks,annsTasks);
//        taskData.getIntersection(bobsTasks,carolsTasks);
    //    taskData.getIntersection(carolsTasks,annsTasks);
        StringSet.findUniqueWords();

    }
}
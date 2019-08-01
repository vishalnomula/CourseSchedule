package com.example.courseschedule;

import java.util.ArrayList;

public class Schedule {
    private String weekNo;
    private String date;
    private String lectureTopic;
    private String labTopic;

    public Schedule() {

    }

    public Schedule(String weekNo, String date, String lectureTopic, String labTopic) {
        this.weekNo = weekNo;
        this.date = date;
        this.lectureTopic = lectureTopic;
        this.labTopic = labTopic;
    }

    public String getWeekNo() {return weekNo;}

    public void setWeekNo(String weekNo) {this.weekNo = weekNo;}

    public String getDate() {return date;}

    public void setDate(String date) {this.date = date;}

    public String getLectureTopic() {return lectureTopic;}

    public void setLectureTopic(String lectureTopic) {this.lectureTopic = lectureTopic;}

    public String getLabTopic() {return labTopic;}

    public void setLabTopic(String labTopic) {this.labTopic = labTopic;}

    public static ArrayList<Schedule> getDummySchedule() {
        ArrayList<Schedule> schedules = new ArrayList<>();
        schedules.add(new Schedule("Week 1", "18 February", "Introduction & Android Fundamentals", "Android Studio, Git & App basics"));
        schedules.add(new Schedule("Week 2", "25 February", "Activities, Lifecycle & Intents", "Activities & Intents"));
        schedules.add(new Schedule("Week 3", "4 March", "Layouts & UI", "Designing a UI"));
        schedules.add(new Schedule("Week 4", "11 March", "Lists & Adapters", "Displaying Items in a List"));
        schedules.add(new Schedule("Week 5", "18 March", "Fragments & Multi-layout Apps", "Fragments for Multi-layout Apps"));
        schedules.add(new Schedule("Week 6", "25 March", "APIs, Permissions & Libraries", "APIs & JSON"));
        schedules.add(new Schedule("Week 7", "1 April", "Networking", "Networking"));
        schedules.add(new Schedule("Week 8", "8 April", "Threads & Async Tasks", "Async Tasks"));
        schedules.add(new Schedule("Week 9", "15 April", "Data Saving", "Database"));
        schedules.add(new Schedule("Week 10", "22 April", "Outlook & Course Summary", "Revision"));
        return schedules;
    }

}

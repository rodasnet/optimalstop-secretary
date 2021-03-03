package com.rodasnet.optimalstop.secretary;

public class Candidate {
    
    private int speed;
    private int experience;
    private int personality;
    private String name;

    public Candidate() {
        
    }

    public Candidate(String name, int speed, int experience, int personality) {
        this.name=name;
        this.speed=speed;
        this.experience=experience;
        this.personality=personality;
    }

    public void setSpeed(int value) {
        this.speed = value;
    }
    public void setExperience(int value) {
        this.experience = value;
    }
    public void setPersonality(int value) {
        this.personality = value;
    }
    public void setName(String value) {
        this.name = value;
    }

    public int getSpeed() {
        return this.speed;
    }
    public int getExperience() {
        return this.experience;
    }
    public int getPersonality() {
        return this.personality;
    }
    public String getName(){
        return this.name;
    }
}


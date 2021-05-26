# optimalstop-secretary
optimalstop-secretary

```
List<Candidate> candies = Arrays.asList(
            new Candidate("Bob",7,6,6), 
            new Candidate("Alice",7,4,3), 
            new Candidate("Lisa",5,8,7),
            new Candidate("John",4,6,6),
            new Candidate("Ema",6,4,15),
            new Candidate("Chris",1,6,4),
            new Candidate("Nancy",3,4,5),
            new Candidate("James",1,3,4),
            new Candidate("Saly",8,1,5),
            new Candidate("Eric",9,4,6)
        );
```

```
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

```

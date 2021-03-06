import java.util.ArrayList;

public class Player
{
    private String name;
    private int experience;
    //private int ArrayList <Location> goLocation;

    private ArrayList <Items> itemList;
    private int score;
    private int health;

    public Player ( String name)
    {
        score = 0;
        health = 100;
        experience = 0;
        //location = 0;
        itemList =  new ArrayList<>();
    }
    public boolean hasItem(Items targetItem)
    {
        for (Items item : itemList)
        {
            if (item == targetItem)
                return true;
        }
        return false;
    }

    public void takeItem(Items item)
    {
        itemList.add(item);
        if (item == Items.COIN)
        {
            score = score + 2;
        }
    }
    //public boolean enterLocation()
       // for ()

    public void incScore(int amount)
    {
        this.score = score + amount;
    }

    public int getScore()
    {
        return score;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public int getHealth()
    {
        return health;
    }

    public void incExperience(int amount)
    {
        this.experience = experience + amount;
    }

    public int getExperience()
    {
        return experience;

    }

    public void printStatus()
    {
        System.out.println("player status! ");
        System.out.println("score = " + score);
        System.out.println("Health = " + health);
        System.out.println("experience = " + experience);

    }
}

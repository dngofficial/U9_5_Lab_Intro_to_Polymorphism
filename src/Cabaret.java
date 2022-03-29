import java.util.ArrayList;

public class Cabaret
{
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name)
    {
        this.name = name;
         performers = new ArrayList<Performer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Performer> getPerformers() {
        return performers;
    }

    public boolean addPerformer(Performer newPerformer)
    {
        if(performers.contains(newPerformer))
        {
            return false;
        }
        else
        {
            performers.add(newPerformer);
            return true;
        }
    }

    public boolean removePerformer(Performer newPerformer)
    {
        if(performers.contains(newPerformer))
        {
            performers.remove(newPerformer);
            return true;
        }
        else
        {
            return false;
        }
    }

    public double averagePerformerAge()
    {
        double total = 0;
        for(Performer performer : performers)
        {
            total += performer.getAge();
        }
        return total/performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age)
    {
        ArrayList<Performer> returnArr = new ArrayList<>();
        for(Performer performer : performers)
        {
            if(performer.getAge() >= age)
            {
                returnArr.add(performer);
            }
        }
        return returnArr;
    }

    public void groupRehearsal()
    {
        for(Performer performer : performers)
        {
            System.out.println("REHEARSAL CALL !" + performer.getName());

            if(performer instanceof Comedian)
            {
                Comedian temp = (Comedian) performer;
                temp.rehearse(false);
            }
            else
            {
                performer.rehearse();
            }
        }

    }






}

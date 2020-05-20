package responseData;

public class First_stage {

    private Cores[] cores;

    public Cores[] getCores ()
    {
        return cores;
    }

    public void setCores (Cores[] cores)
    {
        this.cores = cores;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [cores = "+cores+"]";
    }
}

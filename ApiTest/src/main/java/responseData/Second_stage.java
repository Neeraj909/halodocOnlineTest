package responseData;

public class Second_stage {
    private Payloads[] payloads;

    private String block;

    public Payloads[] getPayloads ()
    {
        return payloads;
    }

    public void setPayloads (Payloads[] payloads)
    {
        this.payloads = payloads;
    }

    public String getBlock ()
    {
        return block;
    }

    public void setBlock (String block)
    {
        this.block = block;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [payloads = "+payloads+", block = "+block+"]";
    }
}

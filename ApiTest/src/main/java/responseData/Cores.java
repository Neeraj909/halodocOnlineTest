package responseData;

public class Cores {
    private String flight;

    private String landing_type;

    private String gridfins;

    private String landing_intent;

    private String legs;

    private String land_success;

    private String landing_vehicle;

    private String block;

    private String reused;

    private String core_serial;

    public String getFlight ()
    {
        return flight;
    }

    public void setFlight (String flight)
    {
        this.flight = flight;
    }

    public String getLanding_type ()
    {
        return landing_type;
    }

    public void setLanding_type (String landing_type)
    {
        this.landing_type = landing_type;
    }

    public String getGridfins ()
    {
        return gridfins;
    }

    public void setGridfins (String gridfins)
    {
        this.gridfins = gridfins;
    }

    public String getLanding_intent ()
    {
        return landing_intent;
    }

    public void setLanding_intent (String landing_intent)
    {
        this.landing_intent = landing_intent;
    }

    public String getLegs ()
    {
        return legs;
    }

    public void setLegs (String legs)
    {
        this.legs = legs;
    }

    public String getLand_success ()
    {
        return land_success;
    }

    public void setLand_success (String land_success)
    {
        this.land_success = land_success;
    }

    public String getLanding_vehicle ()
    {
        return landing_vehicle;
    }

    public void setLanding_vehicle (String landing_vehicle)
    {
        this.landing_vehicle = landing_vehicle;
    }

    public String getBlock ()
    {
        return block;
    }

    public void setBlock (String block)
    {
        this.block = block;
    }

    public String getReused ()
    {
        return reused;
    }

    public void setReused (String reused)
    {
        this.reused = reused;
    }

    public String getCore_serial ()
    {
        return core_serial;
    }

    public void setCore_serial (String core_serial)
    {
        this.core_serial = core_serial;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [flight = "+flight+", landing_type = "+landing_type+", gridfins = "+gridfins+", landing_intent = "+landing_intent+", legs = "+legs+", land_success = "+land_success+", landing_vehicle = "+landing_vehicle+", block = "+block+", reused = "+reused+", core_serial = "+core_serial+"]";
    }
}

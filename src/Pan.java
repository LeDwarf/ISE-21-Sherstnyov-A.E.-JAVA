
public class Pan {
	private Tomato_Sauce[] sauce;
    private Water[] water;
    private Papper[] pappers;
    private Salt salt;
    public boolean ReadyToGo;
    public boolean getReadyToGo() {
    	return Check();
    }
    
    
    public void Init(int CountPapper, int CountSauce)
    {
        water = new Water[3];
        pappers = new Papper[CountPapper];
        sauce = new Tomato_Sauce[CountSauce];
    }


    public void AddPapper(Papper e)
    {
        for (int i = 0; i < pappers.length; i++)
        {
            if (pappers[i] == null)
            {
                pappers[i] = e;
                return;
            }
        }
    }

    public boolean Check()
    {
     
        if (pappers.length == 0)
        {
            return false;
        }         
        for (int i = 0; i < pappers.length; ++i)
        {
            if (pappers[i] == null)
            {
                return false;
            }
        }
        return true;
    }

    public void AddSalt(Salt s)
    {
                salt = s;
    }

    public void AddSauce(Tomato_Sauce m)
    {
        for (int i = 0; i < sauce.length; i++)
        {
            if (sauce == null)
            {
                sauce[i] = m;
                return;
            }
        }         
    }

    public void GetHeat()
    {
        if (!Check())
        {
            return;
        }
        if (pappers.length > 0)
        {
            for (int i=0; i < pappers.length; i++)
            {
                pappers[i].GetHeat();
            }
        }
    }


    public boolean IsReady()
    {
        for (int i=0; i < pappers.length; i++)
        {
            if (pappers[i].Has_ready < 10)
            {
                return false;
            }
        }
        return true;
    }

    public Papper[] GetPapper()
    {
        return pappers;
    }
}


public class Stove {
	private Pan pan;
    public boolean State;
    public Pan Pan;
    
    public void setPan (Pan value){
    	pan=value;
    }
    
    public Pan getPan (){
    	return pan;
    }
        
    public void Cook()
    {
        if (State)
        {
            while (!pan.IsReady())
            {
                pan.GetHeat();
            }
        }
    }
}

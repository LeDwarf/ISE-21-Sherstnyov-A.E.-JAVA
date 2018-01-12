
public class Water {
	private int temperature = 0;
    public int Temperature;
    public int getTemperature (int value){
    	return value;
    }
    public void GetHeat()
    {
        if (temperature < 100)
        {
            temperature++;
        }
    }
}

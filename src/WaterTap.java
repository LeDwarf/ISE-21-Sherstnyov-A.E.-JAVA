
public class WaterTap {

        public boolean State; 
        public void Wash(Papper p)
        {
            if (State)
            {
                p.Dirty = 0;
            }
        }
}

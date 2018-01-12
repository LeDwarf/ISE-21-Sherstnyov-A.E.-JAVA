
public class Papper {
	 public int CountPapper;
     private int dirty = 10;
     public boolean Have_salt;

     public boolean Mixed;
     public boolean Mixed_with_salt;
     public boolean Have_shell;
     public int Has_ready=0;
    

     public int Dirty =10;
     public int getDirty() { 
         return this.Dirty;
      }
      public void setDirty(int dirty) { 
    	  if (dirty > -1 && dirty < 11)
         this.Dirty=dirty;
      }
      
    
     public void GetHeat()
     {
         if (Has_ready < 10)
         {
             Has_ready++;
         }
         else return;        		 
     }
}

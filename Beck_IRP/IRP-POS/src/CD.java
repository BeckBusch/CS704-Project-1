import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class CD extends ClockDomain{
  public CD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  private int test_thread_1;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 10, column: 3
  private int S13 = 1;
  private int S3 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S13){
        case 0 : 
          S13=0;
          break RUN;
        
        case 1 : 
          S13=2;
          S13=2;
          S3=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S3){
            case 0 : 
              if(bottleAtPos1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 7, column: 9
                S3=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(!bottleAtPos1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 8, column: 9
                test_thread_1 = (bottleAtPos1.getpreval() == null ? 0 : ((Integer)bottleAtPos1.getpreval()).intValue());//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 10, column: 3
                System.out.println(test_thread_1);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 12, column: 3
                System.out.println("received");//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 14, column: 3
                S3=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1};
    char [] paused1 = {0, 0};
    char [] suspended1 = {0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          bottleAtPos1.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos1.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

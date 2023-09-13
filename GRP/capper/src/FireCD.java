import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class FireCD extends ClockDomain{
  public FireCD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal temp17 = new Signal("temp17", Signal.INPUT);
  public Signal temp23 = new Signal("temp23", Signal.INPUT);
  public Signal temp456 = new Signal("temp456", Signal.INPUT);
  public Signal smoke1 = new Signal("smoke1", Signal.INPUT);
  public Signal smoke2 = new Signal("smoke2", Signal.INPUT);
  public Signal smoke3 = new Signal("smoke3", Signal.INPUT);
  public Signal smoke4 = new Signal("smoke4", Signal.INPUT);
  public Signal smoke5 = new Signal("smoke5", Signal.INPUT);
  public Signal smoke6 = new Signal("smoke6", Signal.INPUT);
  public Signal smoke7 = new Signal("smoke7", Signal.INPUT);
  public output_Channel fireHappening_o = new output_Channel();
  private Signal fire_12;
  private double temperatureThreshold_thread_13;//sysj\controller.sysj line: 179, column: 3
  private int S308 = 1;
  private int S273 = 1;
  private int S281 = 1;
  private int S306 = 1;
  private int S288 = 1;
  private int S283 = 1;
  
  private int[] ends = new int[40];
  private int[] tdone = new int[40];
  
  public void thread1261(int [] tdone, int [] ends){
        switch(S306){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S288){
          case 0 : 
            if(!fireHappening_o.isPartnerPresent() || fireHappening_o.isPartnerPreempted()){//sysj\controller.sysj line: 204, column: 4
              fireHappening_o.setREQ(false);//sysj\controller.sysj line: 204, column: 4
              S288=1;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              switch(S283){
                case 0 : 
                  if(fireHappening_o.isACK()){//sysj\controller.sysj line: 204, column: 4
                    fireHappening_o.setVal(true);//sysj\controller.sysj line: 204, column: 4
                    S283=1;
                    if(!fireHappening_o.isACK()){//sysj\controller.sysj line: 204, column: 4
                      fireHappening_o.setREQ(false);//sysj\controller.sysj line: 204, column: 4
                      ends[15]=2;
                      ;//sysj\controller.sysj line: 204, column: 4
                      S306=0;
                      active[15]=0;
                      ends[15]=0;
                      tdone[15]=1;
                    }
                    else {
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                  }
                  else {
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                  break;
                
                case 1 : 
                  if(!fireHappening_o.isACK()){//sysj\controller.sysj line: 204, column: 4
                    fireHappening_o.setREQ(false);//sysj\controller.sysj line: 204, column: 4
                    ends[15]=2;
                    ;//sysj\controller.sysj line: 204, column: 4
                    S306=0;
                    active[15]=0;
                    ends[15]=0;
                    tdone[15]=1;
                  }
                  else {
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 1 : 
            S288=1;
            S288=0;
            if(!fireHappening_o.isPartnerPresent() || fireHappening_o.isPartnerPreempted()){//sysj\controller.sysj line: 204, column: 4
              fireHappening_o.setREQ(false);//sysj\controller.sysj line: 204, column: 4
              S288=1;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              S283=0;
              if(fireHappening_o.isACK()){//sysj\controller.sysj line: 204, column: 4
                fireHappening_o.setVal(true);//sysj\controller.sysj line: 204, column: 4
                S283=1;
                if(!fireHappening_o.isACK()){//sysj\controller.sysj line: 204, column: 4
                  fireHappening_o.setREQ(false);//sysj\controller.sysj line: 204, column: 4
                  ends[15]=2;
                  ;//sysj\controller.sysj line: 204, column: 4
                  S306=0;
                  active[15]=0;
                  ends[15]=0;
                  tdone[15]=1;
                }
                else {
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
              }
              else {
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1260(int [] tdone, int [] ends){
        switch(S281){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(smoke1.getprestatus() || smoke2.getprestatus() || smoke3.getprestatus() || smoke4.getprestatus() || smoke5.getprestatus() || smoke6.getprestatus() || smoke7.getprestatus()){//sysj\controller.sysj line: 193, column: 12
          fire_12.setPresent();//sysj\controller.sysj line: 194, column: 5
          currsigs.addElement(fire_12);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread1259(int [] tdone, int [] ends){
        switch(S273){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if((temp17.getpreval() == null ? 0.0d : ((Double)temp17.getpreval()).doubleValue()) > temperatureThreshold_thread_13 || (temp23.getpreval() == null ? 0.0d : ((Double)temp23.getpreval()).doubleValue()) > temperatureThreshold_thread_13 || (temp456.getpreval() == null ? 0.0d : ((Double)temp456.getpreval()).doubleValue()) > temperatureThreshold_thread_13){//sysj\controller.sysj line: 182, column: 8
          fire_12.setPresent();//sysj\controller.sysj line: 183, column: 5
          currsigs.addElement(fire_12);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread1257(int [] tdone, int [] ends){
        S306=1;
    if(fire_12.getprestatus()){//sysj\controller.sysj line: 203, column: 11
      S288=0;
      if(!fireHappening_o.isPartnerPresent() || fireHappening_o.isPartnerPreempted()){//sysj\controller.sysj line: 204, column: 4
        fireHappening_o.setREQ(false);//sysj\controller.sysj line: 204, column: 4
        S288=1;
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
      else {
        S283=0;
        if(fireHappening_o.isACK()){//sysj\controller.sysj line: 204, column: 4
          fireHappening_o.setVal(true);//sysj\controller.sysj line: 204, column: 4
          S283=1;
          if(!fireHappening_o.isACK()){//sysj\controller.sysj line: 204, column: 4
            fireHappening_o.setREQ(false);//sysj\controller.sysj line: 204, column: 4
            ends[15]=2;
            ;//sysj\controller.sysj line: 204, column: 4
            S306=0;
            active[15]=0;
            ends[15]=0;
            tdone[15]=1;
          }
          else {
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
          }
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
    }
    else {
      S306=0;
      active[15]=0;
      ends[15]=0;
      tdone[15]=1;
    }
  }

  public void thread1256(int [] tdone, int [] ends){
        S281=1;
    if(smoke1.getprestatus() || smoke2.getprestatus() || smoke3.getprestatus() || smoke4.getprestatus() || smoke5.getprestatus() || smoke6.getprestatus() || smoke7.getprestatus()){//sysj\controller.sysj line: 193, column: 12
      fire_12.setPresent();//sysj\controller.sysj line: 194, column: 5
      currsigs.addElement(fire_12);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread1255(int [] tdone, int [] ends){
        S273=1;
    temperatureThreshold_thread_13 = 50.0;//sysj\controller.sysj line: 179, column: 3
    if((temp17.getpreval() == null ? 0.0d : ((Double)temp17.getpreval()).doubleValue()) > temperatureThreshold_thread_13 || (temp23.getpreval() == null ? 0.0d : ((Double)temp23.getpreval()).doubleValue()) > temperatureThreshold_thread_13 || (temp456.getpreval() == null ? 0.0d : ((Double)temp456.getpreval()).doubleValue()) > temperatureThreshold_thread_13){//sysj\controller.sysj line: 182, column: 8
      fire_12.setPresent();//sysj\controller.sysj line: 183, column: 5
      currsigs.addElement(fire_12);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S308){
        case 0 : 
          S308=0;
          break RUN;
        
        case 1 : 
          S308=2;
          S308=2;
          fire_12.setClear();//sysj\controller.sysj line: 175, column: 2
          thread1255(tdone,ends);
          thread1256(tdone,ends);
          thread1257(tdone,ends);
          int biggest1258 = 0;
          if(ends[13]>=biggest1258){
            biggest1258=ends[13];
          }
          if(ends[14]>=biggest1258){
            biggest1258=ends[14];
          }
          if(ends[15]>=biggest1258){
            biggest1258=ends[15];
          }
          if(biggest1258 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
        
        case 2 : 
          fire_12.setClear();//sysj\controller.sysj line: 175, column: 2
          thread1259(tdone,ends);
          thread1260(tdone,ends);
          thread1261(tdone,ends);
          int biggest1262 = 0;
          if(ends[13]>=biggest1262){
            biggest1262=ends[13];
          }
          if(ends[14]>=biggest1262){
            biggest1262=ends[14];
          }
          if(ends[15]>=biggest1262){
            biggest1262=ends[15];
          }
          if(biggest1262 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1262 == 0){
            S308=0;
            active[12]=0;
            ends[12]=0;
            S308=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    fire_12 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[12] != 0){
      int index = 12;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
        if(!df){
          fireHappening_o.gethook();
          temp17.gethook();
          temp23.gethook();
          temp456.gethook();
          smoke1.gethook();
          smoke2.gethook();
          smoke3.gethook();
          smoke4.gethook();
          smoke5.gethook();
          smoke6.gethook();
          smoke7.gethook();
          df = true;
        }
        runClockDomain();
      }
      temp17.setpreclear();
      temp23.setpreclear();
      temp456.setpreclear();
      smoke1.setpreclear();
      smoke2.setpreclear();
      smoke3.setpreclear();
      smoke4.setpreclear();
      smoke5.setpreclear();
      smoke6.setpreclear();
      smoke7.setpreclear();
      fire_12.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = temp17.getStatus() ? temp17.setprepresent() : temp17.setpreclear();
      temp17.setpreval(temp17.getValue());
      temp17.setClear();
      dummyint = temp23.getStatus() ? temp23.setprepresent() : temp23.setpreclear();
      temp23.setpreval(temp23.getValue());
      temp23.setClear();
      dummyint = temp456.getStatus() ? temp456.setprepresent() : temp456.setpreclear();
      temp456.setpreval(temp456.getValue());
      temp456.setClear();
      dummyint = smoke1.getStatus() ? smoke1.setprepresent() : smoke1.setpreclear();
      smoke1.setpreval(smoke1.getValue());
      smoke1.setClear();
      dummyint = smoke2.getStatus() ? smoke2.setprepresent() : smoke2.setpreclear();
      smoke2.setpreval(smoke2.getValue());
      smoke2.setClear();
      dummyint = smoke3.getStatus() ? smoke3.setprepresent() : smoke3.setpreclear();
      smoke3.setpreval(smoke3.getValue());
      smoke3.setClear();
      dummyint = smoke4.getStatus() ? smoke4.setprepresent() : smoke4.setpreclear();
      smoke4.setpreval(smoke4.getValue());
      smoke4.setClear();
      dummyint = smoke5.getStatus() ? smoke5.setprepresent() : smoke5.setpreclear();
      smoke5.setpreval(smoke5.getValue());
      smoke5.setClear();
      dummyint = smoke6.getStatus() ? smoke6.setprepresent() : smoke6.setpreclear();
      smoke6.setpreval(smoke6.getValue());
      smoke6.setClear();
      dummyint = smoke7.getStatus() ? smoke7.setprepresent() : smoke7.setpreclear();
      smoke7.setpreval(smoke7.getValue());
      smoke7.setClear();
      fire_12.setClear();
      fireHappening_o.sethook();
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
        fireHappening_o.gethook();
        temp17.gethook();
        temp23.gethook();
        temp456.gethook();
        smoke1.gethook();
        smoke2.gethook();
        smoke3.gethook();
        smoke4.gethook();
        smoke5.gethook();
        smoke6.gethook();
        smoke7.gethook();
      }
      runFinisher();
      if(active[12] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

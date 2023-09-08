import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal empty = new Signal("empty", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  private int currentMode_thread_1;//sysj\controller.sysj line: 7, column: 4
  private int S699 = 1;
  private int S58 = 1;
  private int S11 = 1;
  private int S2 = 1;
  private int S5 = 1;
  private int S8 = 1;
  private int S88 = 1;
  private int S62 = 1;
  private int S106 = 1;
  private int S93 = 1;
  private int S114 = 1;
  private int S111 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread730(int [] tdone, int [] ends){
        S114=1;
    S111=0;
    armSource.setPresent();//sysj\controller.sysj line: 59, column: 11
    currsigs.addElement(armSource);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread729(int [] tdone, int [] ends){
        S106=1;
    S93=0;
    if(WPgripped.getprestatus()){//sysj\controller.sysj line: 48, column: 20
      armDest.setPresent();//sysj\controller.sysj line: 49, column: 13
      currsigs.addElement(armDest);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S93=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread728(int [] tdone, int [] ends){
        S88=1;
    S62=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread726(int [] tdone, int [] ends){
        S8=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread725(int [] tdone, int [] ends){
        S5=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread724(int [] tdone, int [] ends){
        S2=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread723(int [] tdone, int [] ends){
        S58=1;
    S11=0;
    thread724(tdone,ends);
    thread725(tdone,ends);
    thread726(tdone,ends);
    int biggest727 = 0;
    if(ends[3]>=biggest727){
      biggest727=ends[3];
    }
    if(ends[4]>=biggest727){
      biggest727=ends[4];
    }
    if(ends[5]>=biggest727){
      biggest727=ends[5];
    }
    if(biggest727 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread721(int [] tdone, int [] ends){
        switch(S114){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(armDest.getprestatus()){//sysj\controller.sysj line: 58, column: 16
          S114=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        else {
          switch(S111){
            case 0 : 
              armSource.setPresent();//sysj\controller.sysj line: 59, column: 11
              currsigs.addElement(armSource);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
              break;
            
            case 1 : 
              if(armAtSource.getprestatus()){//sysj\controller.sysj line: 60, column: 17
                S114=0;
                active[8]=0;
                ends[8]=0;
                tdone[8]=1;
              }
              else {
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread720(int [] tdone, int [] ends){
        switch(S106){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\controller.sysj line: 46, column: 16
          S106=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        else {
          switch(S93){
            case 0 : 
              armDest.setPresent();//sysj\controller.sysj line: 49, column: 13
              currsigs.addElement(armDest);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
              break;
            
            case 1 : 
              S93=1;
              S93=0;
              if(WPgripped.getprestatus()){//sysj\controller.sysj line: 48, column: 20
                armDest.setPresent();//sysj\controller.sysj line: 49, column: 13
                currsigs.addElement(armDest);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S93=1;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread719(int [] tdone, int [] ends){
        switch(S88){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S62){
          case 0 : 
            if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 34, column: 17
              S62=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(armAtSource.getprestatus()){//sysj\controller.sysj line: 35, column: 17
              S62=2;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 2 : 
            if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 36, column: 17
              S62=3;
              vacOn.setPresent();//sysj\controller.sysj line: 38, column: 12
              currsigs.addElement(vacOn);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 3 : 
            if(armAtDest.getprestatus()){//sysj\controller.sysj line: 37, column: 17
              S62=4;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              vacOn.setPresent();//sysj\controller.sysj line: 38, column: 12
              currsigs.addElement(vacOn);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 4 : 
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread717(int [] tdone, int [] ends){
        S8=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread716(int [] tdone, int [] ends){
        S5=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread715(int [] tdone, int [] ends){
        S2=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread713(int [] tdone, int [] ends){
        switch(S8){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(!vacOn.getprestatus()){//sysj\controller.sysj line: 17, column: 72
          S8=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread712(int [] tdone, int [] ends){
        switch(S5){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\controller.sysj line: 17, column: 47
          S5=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread711(int [] tdone, int [] ends){
        switch(S2){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 17, column: 18
          S2=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread710(int [] tdone, int [] ends){
        switch(S58){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S11){
          case 0 : 
            thread711(tdone,ends);
            thread712(tdone,ends);
            thread713(tdone,ends);
            int biggest714 = 0;
            if(ends[3]>=biggest714){
              biggest714=ends[3];
            }
            if(ends[4]>=biggest714){
              biggest714=ends[4];
            }
            if(ends[5]>=biggest714){
              biggest714=ends[5];
            }
            if(biggest714 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest714 == 0){
              S11=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(request.getprestatus()){//sysj\controller.sysj line: 21, column: 17
              S11=2;
              pusherExtend.setPresent();//sysj\controller.sysj line: 25, column: 11
              currsigs.addElement(pusherExtend);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            pusherExtend.setPresent();//sysj\controller.sysj line: 25, column: 11
            currsigs.addElement(pusherExtend);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 26, column: 17
              S11=0;
              thread715(tdone,ends);
              thread716(tdone,ends);
              thread717(tdone,ends);
              int biggest718 = 0;
              if(ends[3]>=biggest718){
                biggest718=ends[3];
              }
              if(ends[4]>=biggest718){
                biggest718=ends[4];
              }
              if(ends[5]>=biggest718){
                biggest718=ends[5];
              }
              if(biggest718 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread708(int [] tdone, int [] ends){
        S114=1;
    S111=0;
    armSource.setPresent();//sysj\controller.sysj line: 59, column: 11
    currsigs.addElement(armSource);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread707(int [] tdone, int [] ends){
        S106=1;
    S93=0;
    if(WPgripped.getprestatus()){//sysj\controller.sysj line: 48, column: 20
      armDest.setPresent();//sysj\controller.sysj line: 49, column: 13
      currsigs.addElement(armDest);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S93=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread706(int [] tdone, int [] ends){
        S88=1;
    S62=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread704(int [] tdone, int [] ends){
        S8=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread703(int [] tdone, int [] ends){
        S5=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread702(int [] tdone, int [] ends){
        S2=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread701(int [] tdone, int [] ends){
        S58=1;
    S11=0;
    thread702(tdone,ends);
    thread703(tdone,ends);
    thread704(tdone,ends);
    int biggest705 = 0;
    if(ends[3]>=biggest705){
      biggest705=ends[3];
    }
    if(ends[4]>=biggest705){
      biggest705=ends[4];
    }
    if(ends[5]>=biggest705){
      biggest705=ends[5];
    }
    if(biggest705 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S699){
        case 0 : 
          S699=0;
          break RUN;
        
        case 1 : 
          S699=2;
          S699=2;
          currentMode_thread_1 = (Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval()));//sysj\controller.sysj line: 7, column: 4
          if(currentMode_thread_1 != 1){//sysj\controller.sysj line: 14, column: 12
            thread701(tdone,ends);
            thread706(tdone,ends);
            thread707(tdone,ends);
            thread708(tdone,ends);
            int biggest709 = 0;
            if(ends[2]>=biggest709){
              biggest709=ends[2];
            }
            if(ends[6]>=biggest709){
              biggest709=ends[6];
            }
            if(ends[7]>=biggest709){
              biggest709=ends[7];
            }
            if(ends[8]>=biggest709){
              biggest709=ends[8];
            }
            if(biggest709 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
          else {
            ends[1]=2;
            ;//sysj\controller.sysj line: 14, column: 6
            S699=0;
            active[1]=0;
            ends[1]=0;
            S699=0;
            break RUN;
          }
        
        case 2 : 
          thread710(tdone,ends);
          thread719(tdone,ends);
          thread720(tdone,ends);
          thread721(tdone,ends);
          int biggest722 = 0;
          if(ends[2]>=biggest722){
            biggest722=ends[2];
          }
          if(ends[6]>=biggest722){
            biggest722=ends[6];
          }
          if(ends[7]>=biggest722){
            biggest722=ends[7];
          }
          if(ends[8]>=biggest722){
            biggest722=ends[8];
          }
          if(biggest722 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest722 == 0){
            if(currentMode_thread_1 != 1){//sysj\controller.sysj line: 14, column: 12
              thread723(tdone,ends);
              thread728(tdone,ends);
              thread729(tdone,ends);
              thread730(tdone,ends);
              int biggest731 = 0;
              if(ends[2]>=biggest731){
                biggest731=ends[2];
              }
              if(ends[6]>=biggest731){
                biggest731=ends[6];
              }
              if(ends[7]>=biggest731){
                biggest731=ends[7];
              }
              if(ends[8]>=biggest731){
                biggest731=ends[8];
              }
              if(biggest731 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
            else {
              ends[1]=2;
              ;//sysj\controller.sysj line: 14, column: 6
              S699=0;
              active[1]=0;
              ends[1]=0;
              S699=0;
              break RUN;
            }
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          empty.gethook();
          request.gethook();
          mode.gethook();
          pusherExtendM.gethook();
          vacOnM.gethook();
          armSourceM.gethook();
          armDestM.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      request.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = pusherExtendM.getStatus() ? pusherExtendM.setprepresent() : pusherExtendM.setpreclear();
      pusherExtendM.setpreval(pusherExtendM.getValue());
      pusherExtendM.setClear();
      dummyint = vacOnM.getStatus() ? vacOnM.setprepresent() : vacOnM.setpreclear();
      vacOnM.setpreval(vacOnM.getValue());
      vacOnM.setClear();
      dummyint = armSourceM.getStatus() ? armSourceM.setprepresent() : armSourceM.setpreclear();
      armSourceM.setpreval(armSourceM.getValue());
      armSourceM.setClear();
      dummyint = armDestM.getStatus() ? armDestM.setprepresent() : armDestM.setpreclear();
      armDestM.setpreval(armDestM.getValue());
      armDestM.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

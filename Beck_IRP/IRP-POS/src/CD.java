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
  public Signal bottleAtPos1GUI = new Signal("bottleAtPos1GUI", Signal.OUTPUT);
  public Signal bottleLeftPos5GUI = new Signal("bottleLeftPos5GUI", Signal.OUTPUT);
  public Signal tableAlignedWithSensorGUI = new Signal("tableAlignedWithSensorGUI", Signal.OUTPUT);
  public Signal bottleAtPos5GUI = new Signal("bottleAtPos5GUI", Signal.OUTPUT);
  public Signal capOnBottleAtPos1GUI = new Signal("capOnBottleAtPos1GUI", Signal.OUTPUT);
  public Signal bottleAtPos4GUI = new Signal("bottleAtPos4GUI", Signal.OUTPUT);
  public Signal gripperZAxisLoweredGUI = new Signal("gripperZAxisLoweredGUI", Signal.OUTPUT);
  public Signal gripperZAxisLiftedGUI = new Signal("gripperZAxisLiftedGUI", Signal.OUTPUT);
  public Signal gripperTurnHomePosGUI = new Signal("gripperTurnHomePosGUI", Signal.OUTPUT);
  public Signal gripperTurnFinalPosGUI = new Signal("gripperTurnFinalPosGUI", Signal.OUTPUT);
  public Signal bottleAtPos2GUI = new Signal("bottleAtPos2GUI", Signal.OUTPUT);
  public Signal dosUnitEvacGUI = new Signal("dosUnitEvacGUI", Signal.OUTPUT);
  public Signal dosUnitFilledGUI = new Signal("dosUnitFilledGUI", Signal.OUTPUT);
  public Signal motConveyorOnOffGUI = new Signal("motConveyorOnOffGUI", Signal.OUTPUT);
  public Signal rotaryTableTriggerGUI = new Signal("rotaryTableTriggerGUI", Signal.OUTPUT);
  public Signal cylPos5ZaxisExtendGUI = new Signal("cylPos5ZaxisExtendGUI", Signal.OUTPUT);
  public Signal gripperTurnRetractGUI = new Signal("gripperTurnRetractGUI", Signal.OUTPUT);
  public Signal gripperTurnExtendGUI = new Signal("gripperTurnExtendGUI", Signal.OUTPUT);
  public Signal capGripperPos5ExtendGUI = new Signal("capGripperPos5ExtendGUI", Signal.OUTPUT);
  public Signal cylClampBottleExtendGUI = new Signal("cylClampBottleExtendGUI", Signal.OUTPUT);
  public Signal valveInjectorOnOffGUI = new Signal("valveInjectorOnOffGUI", Signal.OUTPUT);
  public Signal valveInletOnOffGUI = new Signal("valveInletOnOffGUI", Signal.OUTPUT);
  public Signal dosUnitValveRetractGUI = new Signal("dosUnitValveRetractGUI", Signal.OUTPUT);
  public Signal dosUnitValveExtendGUI = new Signal("dosUnitValveExtendGUI", Signal.OUTPUT);
  private Signal A_1;
  private long __start_thread_4;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 23, column: 3
  private long __start_thread_6;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 36, column: 3
  private int S94 = 1;
  private int S90 = 1;
  private int S45 = 1;
  private int S6 = 1;
  private int S22 = 1;
  private int S8 = 1;
  private int S51 = 1;
  private int S67 = 1;
  private int S92 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread112(int [] tdone, int [] ends){
        switch(S92){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        S92=0;
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread110(int [] tdone, int [] ends){
        switch(S67){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_6 >= 1500){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 36, column: 3
          ends[6]=2;
          ;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 36, column: 3
          A_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 38, column: 4
          currsigs.addElement(A_1);
          System.out.println("Emitted A_1");
          S67=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread109(int [] tdone, int [] ends){
        switch(S51){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(A_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 31, column: 11
          S51=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        else {
          motConveyorOnOffGUI.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 32, column: 5
          currsigs.addElement(motConveyorOnOffGUI);
          System.out.println("Emitted motConveyorOnOffGUI");
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread107(int [] tdone, int [] ends){
        S67=1;
    __start_thread_6 = com.systemj.Timer.getMs();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 36, column: 3
    if(com.systemj.Timer.getMs() - __start_thread_6 >= 1500){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 36, column: 3
      ends[6]=2;
      ;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 36, column: 3
      A_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 38, column: 4
      currsigs.addElement(A_1);
      System.out.println("Emitted A_1");
      S67=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread106(int [] tdone, int [] ends){
        S51=1;
    motConveyorOnOffGUI.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 32, column: 5
    currsigs.addElement(motConveyorOnOffGUI);
    System.out.println("Emitted motConveyorOnOffGUI");
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread104(int [] tdone, int [] ends){
        switch(S22){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S8){
          case 0 : 
            S8=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= 1500){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 23, column: 3
              ends[4]=2;
              ;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 23, column: 3
              A_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 25, column: 4
              currsigs.addElement(A_1);
              System.out.println("Emitted A_1");
              S22=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            else {
              S8=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S8=1;
            S8=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= 1500){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 23, column: 3
              ends[4]=2;
              ;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 23, column: 3
              A_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 25, column: 4
              currsigs.addElement(A_1);
              System.out.println("Emitted A_1");
              S22=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            else {
              S8=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread103(int [] tdone, int [] ends){
        switch(S6){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(A_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 18, column: 11
          S6=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        else {
          bottleAtPos1GUI.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 19, column: 5
          currsigs.addElement(bottleAtPos1GUI);
          System.out.println("Emitted bottleAtPos1GUI");
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread102(int [] tdone, int [] ends){
        switch(S90){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        A_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 14, column: 3
        switch(S45){
          case 0 : 
            thread103(tdone,ends);
            thread104(tdone,ends);
            int biggest105 = 0;
            if(ends[3]>=biggest105){
              biggest105=ends[3];
            }
            if(ends[4]>=biggest105){
              biggest105=ends[4];
            }
            if(biggest105 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest105 == 0){
              dosUnitValveExtendGUI.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 28, column: 3
              currsigs.addElement(dosUnitValveExtendGUI);
              System.out.println("Emitted dosUnitValveExtendGUI");
              S45=1;
              thread106(tdone,ends);
              thread107(tdone,ends);
              int biggest108 = 0;
              if(ends[5]>=biggest108){
                biggest108=ends[5];
              }
              if(ends[6]>=biggest108){
                biggest108=ends[6];
              }
              if(biggest108 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 1 : 
            thread109(tdone,ends);
            thread110(tdone,ends);
            int biggest111 = 0;
            if(ends[5]>=biggest111){
              biggest111=ends[5];
            }
            if(ends[6]>=biggest111){
              biggest111=ends[6];
            }
            if(biggest111 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest111 == 0){
              S45=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread100(int [] tdone, int [] ends){
        S92=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread98(int [] tdone, int [] ends){
        S22=1;
    __start_thread_4 = com.systemj.Timer.getMs();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 23, column: 3
    S8=0;
    if(com.systemj.Timer.getMs() - __start_thread_4 >= 1500){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 23, column: 3
      ends[4]=2;
      ;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 23, column: 3
      A_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 25, column: 4
      currsigs.addElement(A_1);
      System.out.println("Emitted A_1");
      S22=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
    else {
      S8=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread97(int [] tdone, int [] ends){
        S6=1;
    bottleAtPos1GUI.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 19, column: 5
    currsigs.addElement(bottleAtPos1GUI);
    System.out.println("Emitted bottleAtPos1GUI");
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread96(int [] tdone, int [] ends){
        S90=1;
    A_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 14, column: 3
    dosUnitValveRetractGUI.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\guiTest.sysj line: 15, column: 3
    currsigs.addElement(dosUnitValveRetractGUI);
    System.out.println("Emitted dosUnitValveRetractGUI");
    S45=0;
    thread97(tdone,ends);
    thread98(tdone,ends);
    int biggest99 = 0;
    if(ends[3]>=biggest99){
      biggest99=ends[3];
    }
    if(ends[4]>=biggest99){
      biggest99=ends[4];
    }
    if(biggest99 == 1){
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
      switch(S94){
        case 0 : 
          S94=0;
          break RUN;
        
        case 1 : 
          S94=2;
          S94=2;
          thread96(tdone,ends);
          thread100(tdone,ends);
          int biggest101 = 0;
          if(ends[2]>=biggest101){
            biggest101=ends[2];
          }
          if(ends[7]>=biggest101){
            biggest101=ends[7];
          }
          if(biggest101 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread102(tdone,ends);
          thread112(tdone,ends);
          int biggest113 = 0;
          if(ends[2]>=biggest113){
            biggest113=ends[2];
          }
          if(ends[7]>=biggest113){
            biggest113=ends[7];
          }
          if(biggest113 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest113 == 0){
            S94=0;
            active[1]=0;
            ends[1]=0;
            S94=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    A_1 = new Signal();
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
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1GUI.setpreclear();
      bottleLeftPos5GUI.setpreclear();
      tableAlignedWithSensorGUI.setpreclear();
      bottleAtPos5GUI.setpreclear();
      capOnBottleAtPos1GUI.setpreclear();
      bottleAtPos4GUI.setpreclear();
      gripperZAxisLoweredGUI.setpreclear();
      gripperZAxisLiftedGUI.setpreclear();
      gripperTurnHomePosGUI.setpreclear();
      gripperTurnFinalPosGUI.setpreclear();
      bottleAtPos2GUI.setpreclear();
      dosUnitEvacGUI.setpreclear();
      dosUnitFilledGUI.setpreclear();
      motConveyorOnOffGUI.setpreclear();
      rotaryTableTriggerGUI.setpreclear();
      cylPos5ZaxisExtendGUI.setpreclear();
      gripperTurnRetractGUI.setpreclear();
      gripperTurnExtendGUI.setpreclear();
      capGripperPos5ExtendGUI.setpreclear();
      cylClampBottleExtendGUI.setpreclear();
      valveInjectorOnOffGUI.setpreclear();
      valveInletOnOffGUI.setpreclear();
      dosUnitValveRetractGUI.setpreclear();
      dosUnitValveExtendGUI.setpreclear();
      A_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      bottleAtPos1GUI.sethook();
      bottleAtPos1GUI.setClear();
      bottleLeftPos5GUI.sethook();
      bottleLeftPos5GUI.setClear();
      tableAlignedWithSensorGUI.sethook();
      tableAlignedWithSensorGUI.setClear();
      bottleAtPos5GUI.sethook();
      bottleAtPos5GUI.setClear();
      capOnBottleAtPos1GUI.sethook();
      capOnBottleAtPos1GUI.setClear();
      bottleAtPos4GUI.sethook();
      bottleAtPos4GUI.setClear();
      gripperZAxisLoweredGUI.sethook();
      gripperZAxisLoweredGUI.setClear();
      gripperZAxisLiftedGUI.sethook();
      gripperZAxisLiftedGUI.setClear();
      gripperTurnHomePosGUI.sethook();
      gripperTurnHomePosGUI.setClear();
      gripperTurnFinalPosGUI.sethook();
      gripperTurnFinalPosGUI.setClear();
      bottleAtPos2GUI.sethook();
      bottleAtPos2GUI.setClear();
      dosUnitEvacGUI.sethook();
      dosUnitEvacGUI.setClear();
      dosUnitFilledGUI.sethook();
      dosUnitFilledGUI.setClear();
      motConveyorOnOffGUI.sethook();
      motConveyorOnOffGUI.setClear();
      rotaryTableTriggerGUI.sethook();
      rotaryTableTriggerGUI.setClear();
      cylPos5ZaxisExtendGUI.sethook();
      cylPos5ZaxisExtendGUI.setClear();
      gripperTurnRetractGUI.sethook();
      gripperTurnRetractGUI.setClear();
      gripperTurnExtendGUI.sethook();
      gripperTurnExtendGUI.setClear();
      capGripperPos5ExtendGUI.sethook();
      capGripperPos5ExtendGUI.setClear();
      cylClampBottleExtendGUI.sethook();
      cylClampBottleExtendGUI.setClear();
      valveInjectorOnOffGUI.sethook();
      valveInjectorOnOffGUI.setClear();
      valveInletOnOffGUI.sethook();
      valveInletOnOffGUI.setClear();
      dosUnitValveRetractGUI.sethook();
      dosUnitValveRetractGUI.setClear();
      dosUnitValveExtendGUI.sethook();
      dosUnitValveExtendGUI.setClear();
      A_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

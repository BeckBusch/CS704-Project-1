import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ConveyorCD extends ClockDomain{
  public ConveyorCD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.OUTPUT);
  private int state_thread_1;//sysj/conveyor.sysj line: 3, column: 2
  private int dataBottleAtPos1_thread_1;//sysj/conveyor.sysj line: 7, column: 3
  private int dataBottleLeftPos5_thread_1;//sysj/conveyor.sysj line: 8, column: 3
  private int dataMotConveyorOnOff_thread_1;//sysj/conveyor.sysj line: 11, column: 3
  private int S68 = 1;
  private int S1 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S68){
        case 0 : 
          S68=0;
          break RUN;
        
        case 1 : 
          S68=2;
          S68=2;
          state_thread_1 = 0;//sysj/conveyor.sysj line: 3, column: 2
          dataBottleAtPos1_thread_1 = 0;//sysj/conveyor.sysj line: 7, column: 3
          dataBottleLeftPos5_thread_1 = 0;//sysj/conveyor.sysj line: 8, column: 3
          dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 11, column: 3
          S1=0;
          if(bottleAtPos1.getprestatus()){//sysj/conveyor.sysj line: 14, column: 11
            dataBottleAtPos1_thread_1 = 1;//sysj/conveyor.sysj line: 15, column: 4
            if(bottleLeftPos5.getprestatus()){//sysj/conveyor.sysj line: 18, column: 11
              dataBottleLeftPos5_thread_1 = 1;//sysj/conveyor.sysj line: 19, column: 4
              switch (state_thread_1) {//sysj/conveyor.sysj line: 23, column: 3
                case 1://sysj/conveyor.sysj line: 24, column: 3
                  dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 25, column: 4
                  if(dataBottleLeftPos5_thread_1 == 0) {//sysj/conveyor.sysj line: 27, column: 33
                    state_thread_1 = 2;//sysj/conveyor.sysj line: 28, column: 5
                  }
                  break ;//sysj/conveyor.sysj line: 31, column: 4
                case 2://sysj/conveyor.sysj line: 33, column: 3
                  dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 34, column: 4
                  if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 0) {//sysj/conveyor.sysj line: 36, column: 58
                    state_thread_1 = 3;//sysj/conveyor.sysj line: 37, column: 5
                  }
                  else {//sysj/conveyor.sysj line: 36, column: 4
                    if(dataBottleLeftPos5_thread_1 == 0 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 40, column: 63
                      state_thread_1 = 4;//sysj/conveyor.sysj line: 41, column: 5
                    }
                    else {//sysj/conveyor.sysj line: 40, column: 9
                      if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 44, column: 63
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 45, column: 5
                      }
                    }
                  }
                  break ;//sysj/conveyor.sysj line: 48, column: 4
                case 3://sysj/conveyor.sysj line: 50, column: 3
                  dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 51, column: 4
                  if(dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 53, column: 31
                    state_thread_1 = 1;//sysj/conveyor.sysj line: 54, column: 5
                  }
                  break ;//sysj/conveyor.sysj line: 57, column: 4
                case 4://sysj/conveyor.sysj line: 59, column: 3
                  dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 60, column: 4
                  if(dataBottleLeftPos5_thread_1 == 1) {//sysj/conveyor.sysj line: 62, column: 33
                    state_thread_1 = 1;//sysj/conveyor.sysj line: 63, column: 5
                  }
                  break ;//sysj/conveyor.sysj line: 66, column: 4
                default://sysj/conveyor.sysj line: 68, column: 3
                  break ;//sysj/conveyor.sysj line: 69, column: 4
              }
              if(dataMotConveyorOnOff_thread_1 == 1){//sysj/conveyor.sysj line: 73, column: 7
                motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 74, column: 4
                currsigs.addElement(motConveyorOnOff);
                System.out.println("Emitted motConveyorOnOff");
                S1=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S1=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
            else {
              switch (state_thread_1) {//sysj/conveyor.sysj line: 23, column: 3
                case 1://sysj/conveyor.sysj line: 24, column: 3
                  dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 25, column: 4
                  if(dataBottleLeftPos5_thread_1 == 0) {//sysj/conveyor.sysj line: 27, column: 33
                    state_thread_1 = 2;//sysj/conveyor.sysj line: 28, column: 5
                  }
                  break ;//sysj/conveyor.sysj line: 31, column: 4
                case 2://sysj/conveyor.sysj line: 33, column: 3
                  dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 34, column: 4
                  if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 0) {//sysj/conveyor.sysj line: 36, column: 58
                    state_thread_1 = 3;//sysj/conveyor.sysj line: 37, column: 5
                  }
                  else {//sysj/conveyor.sysj line: 36, column: 4
                    if(dataBottleLeftPos5_thread_1 == 0 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 40, column: 63
                      state_thread_1 = 4;//sysj/conveyor.sysj line: 41, column: 5
                    }
                    else {//sysj/conveyor.sysj line: 40, column: 9
                      if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 44, column: 63
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 45, column: 5
                      }
                    }
                  }
                  break ;//sysj/conveyor.sysj line: 48, column: 4
                case 3://sysj/conveyor.sysj line: 50, column: 3
                  dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 51, column: 4
                  if(dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 53, column: 31
                    state_thread_1 = 1;//sysj/conveyor.sysj line: 54, column: 5
                  }
                  break ;//sysj/conveyor.sysj line: 57, column: 4
                case 4://sysj/conveyor.sysj line: 59, column: 3
                  dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 60, column: 4
                  if(dataBottleLeftPos5_thread_1 == 1) {//sysj/conveyor.sysj line: 62, column: 33
                    state_thread_1 = 1;//sysj/conveyor.sysj line: 63, column: 5
                  }
                  break ;//sysj/conveyor.sysj line: 66, column: 4
                default://sysj/conveyor.sysj line: 68, column: 3
                  break ;//sysj/conveyor.sysj line: 69, column: 4
              }
              if(dataMotConveyorOnOff_thread_1 == 1){//sysj/conveyor.sysj line: 73, column: 7
                motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 74, column: 4
                currsigs.addElement(motConveyorOnOff);
                System.out.println("Emitted motConveyorOnOff");
                S1=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S1=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
          }
          else {
            if(bottleLeftPos5.getprestatus()){//sysj/conveyor.sysj line: 18, column: 11
              dataBottleLeftPos5_thread_1 = 1;//sysj/conveyor.sysj line: 19, column: 4
              switch (state_thread_1) {//sysj/conveyor.sysj line: 23, column: 3
                case 1://sysj/conveyor.sysj line: 24, column: 3
                  dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 25, column: 4
                  if(dataBottleLeftPos5_thread_1 == 0) {//sysj/conveyor.sysj line: 27, column: 33
                    state_thread_1 = 2;//sysj/conveyor.sysj line: 28, column: 5
                  }
                  break ;//sysj/conveyor.sysj line: 31, column: 4
                case 2://sysj/conveyor.sysj line: 33, column: 3
                  dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 34, column: 4
                  if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 0) {//sysj/conveyor.sysj line: 36, column: 58
                    state_thread_1 = 3;//sysj/conveyor.sysj line: 37, column: 5
                  }
                  else {//sysj/conveyor.sysj line: 36, column: 4
                    if(dataBottleLeftPos5_thread_1 == 0 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 40, column: 63
                      state_thread_1 = 4;//sysj/conveyor.sysj line: 41, column: 5
                    }
                    else {//sysj/conveyor.sysj line: 40, column: 9
                      if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 44, column: 63
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 45, column: 5
                      }
                    }
                  }
                  break ;//sysj/conveyor.sysj line: 48, column: 4
                case 3://sysj/conveyor.sysj line: 50, column: 3
                  dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 51, column: 4
                  if(dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 53, column: 31
                    state_thread_1 = 1;//sysj/conveyor.sysj line: 54, column: 5
                  }
                  break ;//sysj/conveyor.sysj line: 57, column: 4
                case 4://sysj/conveyor.sysj line: 59, column: 3
                  dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 60, column: 4
                  if(dataBottleLeftPos5_thread_1 == 1) {//sysj/conveyor.sysj line: 62, column: 33
                    state_thread_1 = 1;//sysj/conveyor.sysj line: 63, column: 5
                  }
                  break ;//sysj/conveyor.sysj line: 66, column: 4
                default://sysj/conveyor.sysj line: 68, column: 3
                  break ;//sysj/conveyor.sysj line: 69, column: 4
              }
              if(dataMotConveyorOnOff_thread_1 == 1){//sysj/conveyor.sysj line: 73, column: 7
                motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 74, column: 4
                currsigs.addElement(motConveyorOnOff);
                System.out.println("Emitted motConveyorOnOff");
                S1=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S1=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
            else {
              switch (state_thread_1) {//sysj/conveyor.sysj line: 23, column: 3
                case 1://sysj/conveyor.sysj line: 24, column: 3
                  dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 25, column: 4
                  if(dataBottleLeftPos5_thread_1 == 0) {//sysj/conveyor.sysj line: 27, column: 33
                    state_thread_1 = 2;//sysj/conveyor.sysj line: 28, column: 5
                  }
                  break ;//sysj/conveyor.sysj line: 31, column: 4
                case 2://sysj/conveyor.sysj line: 33, column: 3
                  dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 34, column: 4
                  if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 0) {//sysj/conveyor.sysj line: 36, column: 58
                    state_thread_1 = 3;//sysj/conveyor.sysj line: 37, column: 5
                  }
                  else {//sysj/conveyor.sysj line: 36, column: 4
                    if(dataBottleLeftPos5_thread_1 == 0 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 40, column: 63
                      state_thread_1 = 4;//sysj/conveyor.sysj line: 41, column: 5
                    }
                    else {//sysj/conveyor.sysj line: 40, column: 9
                      if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 44, column: 63
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 45, column: 5
                      }
                    }
                  }
                  break ;//sysj/conveyor.sysj line: 48, column: 4
                case 3://sysj/conveyor.sysj line: 50, column: 3
                  dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 51, column: 4
                  if(dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 53, column: 31
                    state_thread_1 = 1;//sysj/conveyor.sysj line: 54, column: 5
                  }
                  break ;//sysj/conveyor.sysj line: 57, column: 4
                case 4://sysj/conveyor.sysj line: 59, column: 3
                  dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 60, column: 4
                  if(dataBottleLeftPos5_thread_1 == 1) {//sysj/conveyor.sysj line: 62, column: 33
                    state_thread_1 = 1;//sysj/conveyor.sysj line: 63, column: 5
                  }
                  break ;//sysj/conveyor.sysj line: 66, column: 4
                default://sysj/conveyor.sysj line: 68, column: 3
                  break ;//sysj/conveyor.sysj line: 69, column: 4
              }
              if(dataMotConveyorOnOff_thread_1 == 1){//sysj/conveyor.sysj line: 73, column: 7
                motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 74, column: 4
                currsigs.addElement(motConveyorOnOff);
                System.out.println("Emitted motConveyorOnOff");
                S1=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S1=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
          }
        
        case 2 : 
          switch(S1){
            case 0 : 
              dataBottleAtPos1_thread_1 = 0;//sysj/conveyor.sysj line: 7, column: 3
              dataBottleLeftPos5_thread_1 = 0;//sysj/conveyor.sysj line: 8, column: 3
              dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 11, column: 3
              S1=0;
              if(bottleAtPos1.getprestatus()){//sysj/conveyor.sysj line: 14, column: 11
                dataBottleAtPos1_thread_1 = 1;//sysj/conveyor.sysj line: 15, column: 4
                if(bottleLeftPos5.getprestatus()){//sysj/conveyor.sysj line: 18, column: 11
                  dataBottleLeftPos5_thread_1 = 1;//sysj/conveyor.sysj line: 19, column: 4
                  switch (state_thread_1) {//sysj/conveyor.sysj line: 23, column: 3
                    case 1://sysj/conveyor.sysj line: 24, column: 3
                      dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 25, column: 4
                      if(dataBottleLeftPos5_thread_1 == 0) {//sysj/conveyor.sysj line: 27, column: 33
                        state_thread_1 = 2;//sysj/conveyor.sysj line: 28, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 31, column: 4
                    case 2://sysj/conveyor.sysj line: 33, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 34, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 0) {//sysj/conveyor.sysj line: 36, column: 58
                        state_thread_1 = 3;//sysj/conveyor.sysj line: 37, column: 5
                      }
                      else {//sysj/conveyor.sysj line: 36, column: 4
                        if(dataBottleLeftPos5_thread_1 == 0 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 40, column: 63
                          state_thread_1 = 4;//sysj/conveyor.sysj line: 41, column: 5
                        }
                        else {//sysj/conveyor.sysj line: 40, column: 9
                          if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 44, column: 63
                            state_thread_1 = 1;//sysj/conveyor.sysj line: 45, column: 5
                          }
                        }
                      }
                      break ;//sysj/conveyor.sysj line: 48, column: 4
                    case 3://sysj/conveyor.sysj line: 50, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 51, column: 4
                      if(dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 53, column: 31
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 54, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 57, column: 4
                    case 4://sysj/conveyor.sysj line: 59, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 60, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1) {//sysj/conveyor.sysj line: 62, column: 33
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 63, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 66, column: 4
                    default://sysj/conveyor.sysj line: 68, column: 3
                      break ;//sysj/conveyor.sysj line: 69, column: 4
                  }
                  if(dataMotConveyorOnOff_thread_1 == 1){//sysj/conveyor.sysj line: 73, column: 7
                    motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 74, column: 4
                    currsigs.addElement(motConveyorOnOff);
                    System.out.println("Emitted motConveyorOnOff");
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  switch (state_thread_1) {//sysj/conveyor.sysj line: 23, column: 3
                    case 1://sysj/conveyor.sysj line: 24, column: 3
                      dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 25, column: 4
                      if(dataBottleLeftPos5_thread_1 == 0) {//sysj/conveyor.sysj line: 27, column: 33
                        state_thread_1 = 2;//sysj/conveyor.sysj line: 28, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 31, column: 4
                    case 2://sysj/conveyor.sysj line: 33, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 34, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 0) {//sysj/conveyor.sysj line: 36, column: 58
                        state_thread_1 = 3;//sysj/conveyor.sysj line: 37, column: 5
                      }
                      else {//sysj/conveyor.sysj line: 36, column: 4
                        if(dataBottleLeftPos5_thread_1 == 0 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 40, column: 63
                          state_thread_1 = 4;//sysj/conveyor.sysj line: 41, column: 5
                        }
                        else {//sysj/conveyor.sysj line: 40, column: 9
                          if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 44, column: 63
                            state_thread_1 = 1;//sysj/conveyor.sysj line: 45, column: 5
                          }
                        }
                      }
                      break ;//sysj/conveyor.sysj line: 48, column: 4
                    case 3://sysj/conveyor.sysj line: 50, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 51, column: 4
                      if(dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 53, column: 31
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 54, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 57, column: 4
                    case 4://sysj/conveyor.sysj line: 59, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 60, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1) {//sysj/conveyor.sysj line: 62, column: 33
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 63, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 66, column: 4
                    default://sysj/conveyor.sysj line: 68, column: 3
                      break ;//sysj/conveyor.sysj line: 69, column: 4
                  }
                  if(dataMotConveyorOnOff_thread_1 == 1){//sysj/conveyor.sysj line: 73, column: 7
                    motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 74, column: 4
                    currsigs.addElement(motConveyorOnOff);
                    System.out.println("Emitted motConveyorOnOff");
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
              else {
                if(bottleLeftPos5.getprestatus()){//sysj/conveyor.sysj line: 18, column: 11
                  dataBottleLeftPos5_thread_1 = 1;//sysj/conveyor.sysj line: 19, column: 4
                  switch (state_thread_1) {//sysj/conveyor.sysj line: 23, column: 3
                    case 1://sysj/conveyor.sysj line: 24, column: 3
                      dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 25, column: 4
                      if(dataBottleLeftPos5_thread_1 == 0) {//sysj/conveyor.sysj line: 27, column: 33
                        state_thread_1 = 2;//sysj/conveyor.sysj line: 28, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 31, column: 4
                    case 2://sysj/conveyor.sysj line: 33, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 34, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 0) {//sysj/conveyor.sysj line: 36, column: 58
                        state_thread_1 = 3;//sysj/conveyor.sysj line: 37, column: 5
                      }
                      else {//sysj/conveyor.sysj line: 36, column: 4
                        if(dataBottleLeftPos5_thread_1 == 0 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 40, column: 63
                          state_thread_1 = 4;//sysj/conveyor.sysj line: 41, column: 5
                        }
                        else {//sysj/conveyor.sysj line: 40, column: 9
                          if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 44, column: 63
                            state_thread_1 = 1;//sysj/conveyor.sysj line: 45, column: 5
                          }
                        }
                      }
                      break ;//sysj/conveyor.sysj line: 48, column: 4
                    case 3://sysj/conveyor.sysj line: 50, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 51, column: 4
                      if(dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 53, column: 31
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 54, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 57, column: 4
                    case 4://sysj/conveyor.sysj line: 59, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 60, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1) {//sysj/conveyor.sysj line: 62, column: 33
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 63, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 66, column: 4
                    default://sysj/conveyor.sysj line: 68, column: 3
                      break ;//sysj/conveyor.sysj line: 69, column: 4
                  }
                  if(dataMotConveyorOnOff_thread_1 == 1){//sysj/conveyor.sysj line: 73, column: 7
                    motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 74, column: 4
                    currsigs.addElement(motConveyorOnOff);
                    System.out.println("Emitted motConveyorOnOff");
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  switch (state_thread_1) {//sysj/conveyor.sysj line: 23, column: 3
                    case 1://sysj/conveyor.sysj line: 24, column: 3
                      dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 25, column: 4
                      if(dataBottleLeftPos5_thread_1 == 0) {//sysj/conveyor.sysj line: 27, column: 33
                        state_thread_1 = 2;//sysj/conveyor.sysj line: 28, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 31, column: 4
                    case 2://sysj/conveyor.sysj line: 33, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 34, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 0) {//sysj/conveyor.sysj line: 36, column: 58
                        state_thread_1 = 3;//sysj/conveyor.sysj line: 37, column: 5
                      }
                      else {//sysj/conveyor.sysj line: 36, column: 4
                        if(dataBottleLeftPos5_thread_1 == 0 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 40, column: 63
                          state_thread_1 = 4;//sysj/conveyor.sysj line: 41, column: 5
                        }
                        else {//sysj/conveyor.sysj line: 40, column: 9
                          if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 44, column: 63
                            state_thread_1 = 1;//sysj/conveyor.sysj line: 45, column: 5
                          }
                        }
                      }
                      break ;//sysj/conveyor.sysj line: 48, column: 4
                    case 3://sysj/conveyor.sysj line: 50, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 51, column: 4
                      if(dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 53, column: 31
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 54, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 57, column: 4
                    case 4://sysj/conveyor.sysj line: 59, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 60, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1) {//sysj/conveyor.sysj line: 62, column: 33
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 63, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 66, column: 4
                    default://sysj/conveyor.sysj line: 68, column: 3
                      break ;//sysj/conveyor.sysj line: 69, column: 4
                  }
                  if(dataMotConveyorOnOff_thread_1 == 1){//sysj/conveyor.sysj line: 73, column: 7
                    motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 74, column: 4
                    currsigs.addElement(motConveyorOnOff);
                    System.out.println("Emitted motConveyorOnOff");
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            
            case 1 : 
              S1=1;
              dataBottleAtPos1_thread_1 = 0;//sysj/conveyor.sysj line: 7, column: 3
              dataBottleLeftPos5_thread_1 = 0;//sysj/conveyor.sysj line: 8, column: 3
              dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 11, column: 3
              S1=0;
              if(bottleAtPos1.getprestatus()){//sysj/conveyor.sysj line: 14, column: 11
                dataBottleAtPos1_thread_1 = 1;//sysj/conveyor.sysj line: 15, column: 4
                if(bottleLeftPos5.getprestatus()){//sysj/conveyor.sysj line: 18, column: 11
                  dataBottleLeftPos5_thread_1 = 1;//sysj/conveyor.sysj line: 19, column: 4
                  switch (state_thread_1) {//sysj/conveyor.sysj line: 23, column: 3
                    case 1://sysj/conveyor.sysj line: 24, column: 3
                      dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 25, column: 4
                      if(dataBottleLeftPos5_thread_1 == 0) {//sysj/conveyor.sysj line: 27, column: 33
                        state_thread_1 = 2;//sysj/conveyor.sysj line: 28, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 31, column: 4
                    case 2://sysj/conveyor.sysj line: 33, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 34, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 0) {//sysj/conveyor.sysj line: 36, column: 58
                        state_thread_1 = 3;//sysj/conveyor.sysj line: 37, column: 5
                      }
                      else {//sysj/conveyor.sysj line: 36, column: 4
                        if(dataBottleLeftPos5_thread_1 == 0 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 40, column: 63
                          state_thread_1 = 4;//sysj/conveyor.sysj line: 41, column: 5
                        }
                        else {//sysj/conveyor.sysj line: 40, column: 9
                          if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 44, column: 63
                            state_thread_1 = 1;//sysj/conveyor.sysj line: 45, column: 5
                          }
                        }
                      }
                      break ;//sysj/conveyor.sysj line: 48, column: 4
                    case 3://sysj/conveyor.sysj line: 50, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 51, column: 4
                      if(dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 53, column: 31
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 54, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 57, column: 4
                    case 4://sysj/conveyor.sysj line: 59, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 60, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1) {//sysj/conveyor.sysj line: 62, column: 33
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 63, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 66, column: 4
                    default://sysj/conveyor.sysj line: 68, column: 3
                      break ;//sysj/conveyor.sysj line: 69, column: 4
                  }
                  if(dataMotConveyorOnOff_thread_1 == 1){//sysj/conveyor.sysj line: 73, column: 7
                    motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 74, column: 4
                    currsigs.addElement(motConveyorOnOff);
                    System.out.println("Emitted motConveyorOnOff");
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  switch (state_thread_1) {//sysj/conveyor.sysj line: 23, column: 3
                    case 1://sysj/conveyor.sysj line: 24, column: 3
                      dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 25, column: 4
                      if(dataBottleLeftPos5_thread_1 == 0) {//sysj/conveyor.sysj line: 27, column: 33
                        state_thread_1 = 2;//sysj/conveyor.sysj line: 28, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 31, column: 4
                    case 2://sysj/conveyor.sysj line: 33, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 34, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 0) {//sysj/conveyor.sysj line: 36, column: 58
                        state_thread_1 = 3;//sysj/conveyor.sysj line: 37, column: 5
                      }
                      else {//sysj/conveyor.sysj line: 36, column: 4
                        if(dataBottleLeftPos5_thread_1 == 0 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 40, column: 63
                          state_thread_1 = 4;//sysj/conveyor.sysj line: 41, column: 5
                        }
                        else {//sysj/conveyor.sysj line: 40, column: 9
                          if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 44, column: 63
                            state_thread_1 = 1;//sysj/conveyor.sysj line: 45, column: 5
                          }
                        }
                      }
                      break ;//sysj/conveyor.sysj line: 48, column: 4
                    case 3://sysj/conveyor.sysj line: 50, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 51, column: 4
                      if(dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 53, column: 31
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 54, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 57, column: 4
                    case 4://sysj/conveyor.sysj line: 59, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 60, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1) {//sysj/conveyor.sysj line: 62, column: 33
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 63, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 66, column: 4
                    default://sysj/conveyor.sysj line: 68, column: 3
                      break ;//sysj/conveyor.sysj line: 69, column: 4
                  }
                  if(dataMotConveyorOnOff_thread_1 == 1){//sysj/conveyor.sysj line: 73, column: 7
                    motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 74, column: 4
                    currsigs.addElement(motConveyorOnOff);
                    System.out.println("Emitted motConveyorOnOff");
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
              else {
                if(bottleLeftPos5.getprestatus()){//sysj/conveyor.sysj line: 18, column: 11
                  dataBottleLeftPos5_thread_1 = 1;//sysj/conveyor.sysj line: 19, column: 4
                  switch (state_thread_1) {//sysj/conveyor.sysj line: 23, column: 3
                    case 1://sysj/conveyor.sysj line: 24, column: 3
                      dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 25, column: 4
                      if(dataBottleLeftPos5_thread_1 == 0) {//sysj/conveyor.sysj line: 27, column: 33
                        state_thread_1 = 2;//sysj/conveyor.sysj line: 28, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 31, column: 4
                    case 2://sysj/conveyor.sysj line: 33, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 34, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 0) {//sysj/conveyor.sysj line: 36, column: 58
                        state_thread_1 = 3;//sysj/conveyor.sysj line: 37, column: 5
                      }
                      else {//sysj/conveyor.sysj line: 36, column: 4
                        if(dataBottleLeftPos5_thread_1 == 0 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 40, column: 63
                          state_thread_1 = 4;//sysj/conveyor.sysj line: 41, column: 5
                        }
                        else {//sysj/conveyor.sysj line: 40, column: 9
                          if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 44, column: 63
                            state_thread_1 = 1;//sysj/conveyor.sysj line: 45, column: 5
                          }
                        }
                      }
                      break ;//sysj/conveyor.sysj line: 48, column: 4
                    case 3://sysj/conveyor.sysj line: 50, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 51, column: 4
                      if(dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 53, column: 31
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 54, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 57, column: 4
                    case 4://sysj/conveyor.sysj line: 59, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 60, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1) {//sysj/conveyor.sysj line: 62, column: 33
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 63, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 66, column: 4
                    default://sysj/conveyor.sysj line: 68, column: 3
                      break ;//sysj/conveyor.sysj line: 69, column: 4
                  }
                  if(dataMotConveyorOnOff_thread_1 == 1){//sysj/conveyor.sysj line: 73, column: 7
                    motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 74, column: 4
                    currsigs.addElement(motConveyorOnOff);
                    System.out.println("Emitted motConveyorOnOff");
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  switch (state_thread_1) {//sysj/conveyor.sysj line: 23, column: 3
                    case 1://sysj/conveyor.sysj line: 24, column: 3
                      dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 25, column: 4
                      if(dataBottleLeftPos5_thread_1 == 0) {//sysj/conveyor.sysj line: 27, column: 33
                        state_thread_1 = 2;//sysj/conveyor.sysj line: 28, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 31, column: 4
                    case 2://sysj/conveyor.sysj line: 33, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 34, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 0) {//sysj/conveyor.sysj line: 36, column: 58
                        state_thread_1 = 3;//sysj/conveyor.sysj line: 37, column: 5
                      }
                      else {//sysj/conveyor.sysj line: 36, column: 4
                        if(dataBottleLeftPos5_thread_1 == 0 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 40, column: 63
                          state_thread_1 = 4;//sysj/conveyor.sysj line: 41, column: 5
                        }
                        else {//sysj/conveyor.sysj line: 40, column: 9
                          if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 44, column: 63
                            state_thread_1 = 1;//sysj/conveyor.sysj line: 45, column: 5
                          }
                        }
                      }
                      break ;//sysj/conveyor.sysj line: 48, column: 4
                    case 3://sysj/conveyor.sysj line: 50, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 51, column: 4
                      if(dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 53, column: 31
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 54, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 57, column: 4
                    case 4://sysj/conveyor.sysj line: 59, column: 3
                      dataMotConveyorOnOff_thread_1 = 1;//sysj/conveyor.sysj line: 60, column: 4
                      if(dataBottleLeftPos5_thread_1 == 1) {//sysj/conveyor.sysj line: 62, column: 33
                        state_thread_1 = 1;//sysj/conveyor.sysj line: 63, column: 5
                      }
                      break ;//sysj/conveyor.sysj line: 66, column: 4
                    default://sysj/conveyor.sysj line: 68, column: 3
                      break ;//sysj/conveyor.sysj line: 69, column: 4
                  }
                  if(dataMotConveyorOnOff_thread_1 == 1){//sysj/conveyor.sysj line: 73, column: 7
                    motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 74, column: 4
                    currsigs.addElement(motConveyorOnOff);
                    System.out.println("Emitted motConveyorOnOff");
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
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
          bottleLeftPos5.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      motConveyorOnOff.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      motConveyorOnOff.sethook();
      motConveyorOnOff.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos1.gethook();
        bottleLeftPos5.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

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
  private int state_thread_1;//sysj/conveyor.sysj line: 5, column: 2
  private int dataBottleAtPos1_thread_1;//sysj/conveyor.sysj line: 9, column: 3
  private int dataBottleLeftPos5_thread_1;//sysj/conveyor.sysj line: 10, column: 3
  private int dataMotConveyorOnOff_thread_1;//sysj/conveyor.sysj line: 13, column: 3
  private int S818 = 1;
  private int S2 = 1;
  private int S33 = 1;
  private int S32 = 1;
  private int S31 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S818){
        case 0 : 
          S818=0;
          break RUN;
        
        case 1 : 
          S818=2;
          S818=2;
          System.out.println("Initializing state machine for conveyor controller.");//sysj/conveyor.sysj line: 3, column: 2
          state_thread_1 = 1;//sysj/conveyor.sysj line: 5, column: 2
          dataBottleAtPos1_thread_1 = 0;//sysj/conveyor.sysj line: 9, column: 3
          dataBottleLeftPos5_thread_1 = 0;//sysj/conveyor.sysj line: 10, column: 3
          dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 13, column: 3
          S2=0;
          if(bottleAtPos1.getprestatus()){//sysj/conveyor.sysj line: 16, column: 11
            dataBottleAtPos1_thread_1 = 1;//sysj/conveyor.sysj line: 17, column: 4
            if(bottleLeftPos5.getprestatus()){//sysj/conveyor.sysj line: 20, column: 11
              dataBottleLeftPos5_thread_1 = 1;//sysj/conveyor.sysj line: 21, column: 4
              System.out.printf("Entered state %d\n", state_thread_1);//sysj/conveyor.sysj line: 25, column: 3
              S2=1;
              if(state_thread_1 == 1){//sysj/conveyor.sysj line: 28, column: 3
                S33=0;
                dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 29, column: 4
                System.out.print("Conveyor turned off.\n");//sysj/conveyor.sysj line: 31, column: 4
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S33=1;
                if(state_thread_1 == 2){//sysj/conveyor.sysj line: 38, column: 3
                  S32=0;
                  System.out.println("Conveyor is turned on.");//sysj/conveyor.sysj line: 40, column: 4
                  motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 43, column: 5
                  currsigs.addElement(motConveyorOnOff);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S32=1;
                  if(state_thread_1 == 3){//sysj/conveyor.sysj line: 60, column: 3
                    S31=0;
                    motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 63, column: 5
                    currsigs.addElement(motConveyorOnOff);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S31=1;
                    if(state_thread_1 == 4){//sysj/conveyor.sysj line: 70, column: 3
                      motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 73, column: 5
                      currsigs.addElement(motConveyorOnOff);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S2=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
              }
            }
            else {
              System.out.printf("Entered state %d\n", state_thread_1);//sysj/conveyor.sysj line: 25, column: 3
              S2=1;
              if(state_thread_1 == 1){//sysj/conveyor.sysj line: 28, column: 3
                S33=0;
                dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 29, column: 4
                System.out.print("Conveyor turned off.\n");//sysj/conveyor.sysj line: 31, column: 4
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S33=1;
                if(state_thread_1 == 2){//sysj/conveyor.sysj line: 38, column: 3
                  S32=0;
                  System.out.println("Conveyor is turned on.");//sysj/conveyor.sysj line: 40, column: 4
                  motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 43, column: 5
                  currsigs.addElement(motConveyorOnOff);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S32=1;
                  if(state_thread_1 == 3){//sysj/conveyor.sysj line: 60, column: 3
                    S31=0;
                    motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 63, column: 5
                    currsigs.addElement(motConveyorOnOff);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S31=1;
                    if(state_thread_1 == 4){//sysj/conveyor.sysj line: 70, column: 3
                      motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 73, column: 5
                      currsigs.addElement(motConveyorOnOff);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S2=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
              }
            }
          }
          else {
            if(bottleLeftPos5.getprestatus()){//sysj/conveyor.sysj line: 20, column: 11
              dataBottleLeftPos5_thread_1 = 1;//sysj/conveyor.sysj line: 21, column: 4
              System.out.printf("Entered state %d\n", state_thread_1);//sysj/conveyor.sysj line: 25, column: 3
              S2=1;
              if(state_thread_1 == 1){//sysj/conveyor.sysj line: 28, column: 3
                S33=0;
                dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 29, column: 4
                System.out.print("Conveyor turned off.\n");//sysj/conveyor.sysj line: 31, column: 4
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S33=1;
                if(state_thread_1 == 2){//sysj/conveyor.sysj line: 38, column: 3
                  S32=0;
                  System.out.println("Conveyor is turned on.");//sysj/conveyor.sysj line: 40, column: 4
                  motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 43, column: 5
                  currsigs.addElement(motConveyorOnOff);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S32=1;
                  if(state_thread_1 == 3){//sysj/conveyor.sysj line: 60, column: 3
                    S31=0;
                    motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 63, column: 5
                    currsigs.addElement(motConveyorOnOff);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S31=1;
                    if(state_thread_1 == 4){//sysj/conveyor.sysj line: 70, column: 3
                      motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 73, column: 5
                      currsigs.addElement(motConveyorOnOff);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S2=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
              }
            }
            else {
              System.out.printf("Entered state %d\n", state_thread_1);//sysj/conveyor.sysj line: 25, column: 3
              S2=1;
              if(state_thread_1 == 1){//sysj/conveyor.sysj line: 28, column: 3
                S33=0;
                dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 29, column: 4
                System.out.print("Conveyor turned off.\n");//sysj/conveyor.sysj line: 31, column: 4
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S33=1;
                if(state_thread_1 == 2){//sysj/conveyor.sysj line: 38, column: 3
                  S32=0;
                  System.out.println("Conveyor is turned on.");//sysj/conveyor.sysj line: 40, column: 4
                  motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 43, column: 5
                  currsigs.addElement(motConveyorOnOff);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S32=1;
                  if(state_thread_1 == 3){//sysj/conveyor.sysj line: 60, column: 3
                    S31=0;
                    motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 63, column: 5
                    currsigs.addElement(motConveyorOnOff);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S31=1;
                    if(state_thread_1 == 4){//sysj/conveyor.sysj line: 70, column: 3
                      motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 73, column: 5
                      currsigs.addElement(motConveyorOnOff);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S2=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
              }
            }
          }
        
        case 2 : 
          switch(S2){
            case 0 : 
              dataBottleAtPos1_thread_1 = 0;//sysj/conveyor.sysj line: 9, column: 3
              dataBottleLeftPos5_thread_1 = 0;//sysj/conveyor.sysj line: 10, column: 3
              dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 13, column: 3
              S2=0;
              if(bottleAtPos1.getprestatus()){//sysj/conveyor.sysj line: 16, column: 11
                dataBottleAtPos1_thread_1 = 1;//sysj/conveyor.sysj line: 17, column: 4
                if(bottleLeftPos5.getprestatus()){//sysj/conveyor.sysj line: 20, column: 11
                  dataBottleLeftPos5_thread_1 = 1;//sysj/conveyor.sysj line: 21, column: 4
                  System.out.printf("Entered state %d\n", state_thread_1);//sysj/conveyor.sysj line: 25, column: 3
                  S2=1;
                  if(state_thread_1 == 1){//sysj/conveyor.sysj line: 28, column: 3
                    S33=0;
                    dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 29, column: 4
                    System.out.print("Conveyor turned off.\n");//sysj/conveyor.sysj line: 31, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S33=1;
                    if(state_thread_1 == 2){//sysj/conveyor.sysj line: 38, column: 3
                      S32=0;
                      System.out.println("Conveyor is turned on.");//sysj/conveyor.sysj line: 40, column: 4
                      motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 43, column: 5
                      currsigs.addElement(motConveyorOnOff);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S32=1;
                      if(state_thread_1 == 3){//sysj/conveyor.sysj line: 60, column: 3
                        S31=0;
                        motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 63, column: 5
                        currsigs.addElement(motConveyorOnOff);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S31=1;
                        if(state_thread_1 == 4){//sysj/conveyor.sysj line: 70, column: 3
                          motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 73, column: 5
                          currsigs.addElement(motConveyorOnOff);
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S2=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    }
                  }
                }
                else {
                  System.out.printf("Entered state %d\n", state_thread_1);//sysj/conveyor.sysj line: 25, column: 3
                  S2=1;
                  if(state_thread_1 == 1){//sysj/conveyor.sysj line: 28, column: 3
                    S33=0;
                    dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 29, column: 4
                    System.out.print("Conveyor turned off.\n");//sysj/conveyor.sysj line: 31, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S33=1;
                    if(state_thread_1 == 2){//sysj/conveyor.sysj line: 38, column: 3
                      S32=0;
                      System.out.println("Conveyor is turned on.");//sysj/conveyor.sysj line: 40, column: 4
                      motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 43, column: 5
                      currsigs.addElement(motConveyorOnOff);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S32=1;
                      if(state_thread_1 == 3){//sysj/conveyor.sysj line: 60, column: 3
                        S31=0;
                        motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 63, column: 5
                        currsigs.addElement(motConveyorOnOff);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S31=1;
                        if(state_thread_1 == 4){//sysj/conveyor.sysj line: 70, column: 3
                          motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 73, column: 5
                          currsigs.addElement(motConveyorOnOff);
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S2=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    }
                  }
                }
              }
              else {
                if(bottleLeftPos5.getprestatus()){//sysj/conveyor.sysj line: 20, column: 11
                  dataBottleLeftPos5_thread_1 = 1;//sysj/conveyor.sysj line: 21, column: 4
                  System.out.printf("Entered state %d\n", state_thread_1);//sysj/conveyor.sysj line: 25, column: 3
                  S2=1;
                  if(state_thread_1 == 1){//sysj/conveyor.sysj line: 28, column: 3
                    S33=0;
                    dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 29, column: 4
                    System.out.print("Conveyor turned off.\n");//sysj/conveyor.sysj line: 31, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S33=1;
                    if(state_thread_1 == 2){//sysj/conveyor.sysj line: 38, column: 3
                      S32=0;
                      System.out.println("Conveyor is turned on.");//sysj/conveyor.sysj line: 40, column: 4
                      motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 43, column: 5
                      currsigs.addElement(motConveyorOnOff);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S32=1;
                      if(state_thread_1 == 3){//sysj/conveyor.sysj line: 60, column: 3
                        S31=0;
                        motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 63, column: 5
                        currsigs.addElement(motConveyorOnOff);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S31=1;
                        if(state_thread_1 == 4){//sysj/conveyor.sysj line: 70, column: 3
                          motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 73, column: 5
                          currsigs.addElement(motConveyorOnOff);
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S2=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    }
                  }
                }
                else {
                  System.out.printf("Entered state %d\n", state_thread_1);//sysj/conveyor.sysj line: 25, column: 3
                  S2=1;
                  if(state_thread_1 == 1){//sysj/conveyor.sysj line: 28, column: 3
                    S33=0;
                    dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 29, column: 4
                    System.out.print("Conveyor turned off.\n");//sysj/conveyor.sysj line: 31, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S33=1;
                    if(state_thread_1 == 2){//sysj/conveyor.sysj line: 38, column: 3
                      S32=0;
                      System.out.println("Conveyor is turned on.");//sysj/conveyor.sysj line: 40, column: 4
                      motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 43, column: 5
                      currsigs.addElement(motConveyorOnOff);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S32=1;
                      if(state_thread_1 == 3){//sysj/conveyor.sysj line: 60, column: 3
                        S31=0;
                        motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 63, column: 5
                        currsigs.addElement(motConveyorOnOff);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S31=1;
                        if(state_thread_1 == 4){//sysj/conveyor.sysj line: 70, column: 3
                          motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 73, column: 5
                          currsigs.addElement(motConveyorOnOff);
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S2=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    }
                  }
                }
              }
            
            case 1 : 
              switch(S33){
                case 0 : 
                  if(!bottleLeftPos5.getprestatus()){//sysj/conveyor.sysj line: 32, column: 10
                    state_thread_1 = 2;//sysj/conveyor.sysj line: 34, column: 4
                    S2=2;
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
                  switch(S32){
                    case 0 : 
                      if(bottleAtPos1.getprestatus() || bottleLeftPos5.getprestatus()){//sysj/conveyor.sysj line: 42, column: 10
                        if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 0) {//sysj/conveyor.sysj line: 46, column: 58
                          state_thread_1 = 3;//sysj/conveyor.sysj line: 47, column: 5
                        }
                        else {//sysj/conveyor.sysj line: 46, column: 4
                          if(dataBottleLeftPos5_thread_1 == 0 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 50, column: 63
                            state_thread_1 = 4;//sysj/conveyor.sysj line: 51, column: 5
                          }
                          else {//sysj/conveyor.sysj line: 50, column: 9
                            if(dataBottleLeftPos5_thread_1 == 1 && dataBottleAtPos1_thread_1 == 1) {//sysj/conveyor.sysj line: 54, column: 63
                              state_thread_1 = 1;//sysj/conveyor.sysj line: 55, column: 5
                            }
                          }
                        }
                        S2=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 43, column: 5
                        currsigs.addElement(motConveyorOnOff);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S31){
                        case 0 : 
                          if(bottleAtPos1.getprestatus()){//sysj/conveyor.sysj line: 62, column: 10
                            state_thread_1 = 1;//sysj/conveyor.sysj line: 66, column: 4
                            S2=2;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 63, column: 5
                            currsigs.addElement(motConveyorOnOff);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(bottleLeftPos5.getprestatus()){//sysj/conveyor.sysj line: 72, column: 10
                            state_thread_1 = 1;//sysj/conveyor.sysj line: 76, column: 4
                            S2=2;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 73, column: 5
                            currsigs.addElement(motConveyorOnOff);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                      }
                      break;
                    
                  }
                  break;
                
              }
              break;
            
            case 2 : 
              S2=2;
              dataBottleAtPos1_thread_1 = 0;//sysj/conveyor.sysj line: 9, column: 3
              dataBottleLeftPos5_thread_1 = 0;//sysj/conveyor.sysj line: 10, column: 3
              dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 13, column: 3
              S2=0;
              if(bottleAtPos1.getprestatus()){//sysj/conveyor.sysj line: 16, column: 11
                dataBottleAtPos1_thread_1 = 1;//sysj/conveyor.sysj line: 17, column: 4
                if(bottleLeftPos5.getprestatus()){//sysj/conveyor.sysj line: 20, column: 11
                  dataBottleLeftPos5_thread_1 = 1;//sysj/conveyor.sysj line: 21, column: 4
                  System.out.printf("Entered state %d\n", state_thread_1);//sysj/conveyor.sysj line: 25, column: 3
                  S2=1;
                  if(state_thread_1 == 1){//sysj/conveyor.sysj line: 28, column: 3
                    S33=0;
                    dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 29, column: 4
                    System.out.print("Conveyor turned off.\n");//sysj/conveyor.sysj line: 31, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S33=1;
                    if(state_thread_1 == 2){//sysj/conveyor.sysj line: 38, column: 3
                      S32=0;
                      System.out.println("Conveyor is turned on.");//sysj/conveyor.sysj line: 40, column: 4
                      motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 43, column: 5
                      currsigs.addElement(motConveyorOnOff);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S32=1;
                      if(state_thread_1 == 3){//sysj/conveyor.sysj line: 60, column: 3
                        S31=0;
                        motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 63, column: 5
                        currsigs.addElement(motConveyorOnOff);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S31=1;
                        if(state_thread_1 == 4){//sysj/conveyor.sysj line: 70, column: 3
                          motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 73, column: 5
                          currsigs.addElement(motConveyorOnOff);
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S2=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    }
                  }
                }
                else {
                  System.out.printf("Entered state %d\n", state_thread_1);//sysj/conveyor.sysj line: 25, column: 3
                  S2=1;
                  if(state_thread_1 == 1){//sysj/conveyor.sysj line: 28, column: 3
                    S33=0;
                    dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 29, column: 4
                    System.out.print("Conveyor turned off.\n");//sysj/conveyor.sysj line: 31, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S33=1;
                    if(state_thread_1 == 2){//sysj/conveyor.sysj line: 38, column: 3
                      S32=0;
                      System.out.println("Conveyor is turned on.");//sysj/conveyor.sysj line: 40, column: 4
                      motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 43, column: 5
                      currsigs.addElement(motConveyorOnOff);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S32=1;
                      if(state_thread_1 == 3){//sysj/conveyor.sysj line: 60, column: 3
                        S31=0;
                        motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 63, column: 5
                        currsigs.addElement(motConveyorOnOff);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S31=1;
                        if(state_thread_1 == 4){//sysj/conveyor.sysj line: 70, column: 3
                          motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 73, column: 5
                          currsigs.addElement(motConveyorOnOff);
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S2=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    }
                  }
                }
              }
              else {
                if(bottleLeftPos5.getprestatus()){//sysj/conveyor.sysj line: 20, column: 11
                  dataBottleLeftPos5_thread_1 = 1;//sysj/conveyor.sysj line: 21, column: 4
                  System.out.printf("Entered state %d\n", state_thread_1);//sysj/conveyor.sysj line: 25, column: 3
                  S2=1;
                  if(state_thread_1 == 1){//sysj/conveyor.sysj line: 28, column: 3
                    S33=0;
                    dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 29, column: 4
                    System.out.print("Conveyor turned off.\n");//sysj/conveyor.sysj line: 31, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S33=1;
                    if(state_thread_1 == 2){//sysj/conveyor.sysj line: 38, column: 3
                      S32=0;
                      System.out.println("Conveyor is turned on.");//sysj/conveyor.sysj line: 40, column: 4
                      motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 43, column: 5
                      currsigs.addElement(motConveyorOnOff);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S32=1;
                      if(state_thread_1 == 3){//sysj/conveyor.sysj line: 60, column: 3
                        S31=0;
                        motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 63, column: 5
                        currsigs.addElement(motConveyorOnOff);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S31=1;
                        if(state_thread_1 == 4){//sysj/conveyor.sysj line: 70, column: 3
                          motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 73, column: 5
                          currsigs.addElement(motConveyorOnOff);
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S2=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    }
                  }
                }
                else {
                  System.out.printf("Entered state %d\n", state_thread_1);//sysj/conveyor.sysj line: 25, column: 3
                  S2=1;
                  if(state_thread_1 == 1){//sysj/conveyor.sysj line: 28, column: 3
                    S33=0;
                    dataMotConveyorOnOff_thread_1 = 0;//sysj/conveyor.sysj line: 29, column: 4
                    System.out.print("Conveyor turned off.\n");//sysj/conveyor.sysj line: 31, column: 4
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S33=1;
                    if(state_thread_1 == 2){//sysj/conveyor.sysj line: 38, column: 3
                      S32=0;
                      System.out.println("Conveyor is turned on.");//sysj/conveyor.sysj line: 40, column: 4
                      motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 43, column: 5
                      currsigs.addElement(motConveyorOnOff);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S32=1;
                      if(state_thread_1 == 3){//sysj/conveyor.sysj line: 60, column: 3
                        S31=0;
                        motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 63, column: 5
                        currsigs.addElement(motConveyorOnOff);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S31=1;
                        if(state_thread_1 == 4){//sysj/conveyor.sysj line: 70, column: 3
                          motConveyorOnOff.setPresent();//sysj/conveyor.sysj line: 73, column: 5
                          currsigs.addElement(motConveyorOnOff);
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S2=2;
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

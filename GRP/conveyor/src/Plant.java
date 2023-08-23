import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.Gui;//sysj/plant.sysj line: 1, column: 1
import Rotate.Rotator;//sysj/plant.sysj line: 2, column: 1

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal rotate = new Signal("rotate", Signal.INPUT);
  public Signal spawnBottle = new Signal("spawnBottle", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal bottle1E = new Signal("bottle1E", Signal.OUTPUT);
  public Signal bottle2E = new Signal("bottle2E", Signal.OUTPUT);
  public Signal bottle3E = new Signal("bottle3E", Signal.OUTPUT);
  public Signal bottle4E = new Signal("bottle4E", Signal.OUTPUT);
  public Signal bottle5E = new Signal("bottle5E", Signal.OUTPUT);
  public Signal bottle6E = new Signal("bottle6E", Signal.OUTPUT);
  public Signal before1E = new Signal("before1E", Signal.OUTPUT);
  public Signal after5E = new Signal("after5E", Signal.OUTPUT);
  public Signal con1onE = new Signal("con1onE", Signal.OUTPUT);
  public Signal con5onE = new Signal("con5onE", Signal.OUTPUT);
  private Signal conveyorOn_1;
  private Signal bottleAfter5Sig_1;
  private Signal spawnBottleSig_1;
  private Signal removeSpawnBottle_1;
  private Signal addBottleSig_1;
  private Signal removeBottleSig_1;
  private Signal bottle5_1;
  private Rotator r_thread_2;//sysj/plant.sysj line: 33, column: 3
  private boolean bottlebefore1_thread_2;//sysj/plant.sysj line: 35, column: 3
  private boolean bottleafter5_thread_2;//sysj/plant.sysj line: 36, column: 3
  private int S7255 = 1;
  private int S3942 = 1;
  private int S848 = 1;
  private int S3974 = 1;
  private int S3944 = 1;
  private int S3985 = 1;
  private int S4035 = 1;
  private int S3993 = 1;
  private int S4001 = 1;
  private int S4009 = 1;
  private int S4017 = 1;
  private int S4025 = 1;
  private int S4033 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread7278(int [] tdone, int [] ends){
        switch(S4033){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(spawnBottleSig_1.getprestatus()){//sysj/plant.sysj line: 132, column: 24
          before1E.setPresent();//sysj/plant.sysj line: 132, column: 40
          currsigs.addElement(before1E);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread7277(int [] tdone, int [] ends){
        switch(S4025){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(bottle5_1.getprestatus()){//sysj/plant.sysj line: 126, column: 24
          bottle5E.setPresent();//sysj/plant.sysj line: 126, column: 33
          currsigs.addElement(bottle5E);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread7276(int [] tdone, int [] ends){
        switch(S4017){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(conveyorOn_1.getprestatus()){//sysj/plant.sysj line: 116, column: 24
          con5onE.setPresent();//sysj/plant.sysj line: 116, column: 36
          currsigs.addElement(con5onE);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread7275(int [] tdone, int [] ends){
        switch(S4009){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(conveyorOn_1.getprestatus()){//sysj/plant.sysj line: 114, column: 24
          con1onE.setPresent();//sysj/plant.sysj line: 114, column: 36
          currsigs.addElement(con1onE);
          active[8]=1;
          ends[8]=1;
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

  public void thread7274(int [] tdone, int [] ends){
        switch(S4001){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottleAfter5Sig_1.getprestatus()){//sysj/plant.sysj line: 112, column: 24
          after5E.setPresent();//sysj/plant.sysj line: 112, column: 41
          currsigs.addElement(after5E);
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread7273(int [] tdone, int [] ends){
        switch(S3993){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj/plant.sysj line: 110, column: 24
          bottle1E.setPresent();//sysj/plant.sysj line: 110, column: 38
          currsigs.addElement(bottle1E);
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
      
    }
  }

  public void thread7272(int [] tdone, int [] ends){
        switch(S4035){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread7273(tdone,ends);
        thread7274(tdone,ends);
        thread7275(tdone,ends);
        thread7276(tdone,ends);
        thread7277(tdone,ends);
        thread7278(tdone,ends);
        int biggest7279 = 0;
        if(ends[6]>=biggest7279){
          biggest7279=ends[6];
        }
        if(ends[7]>=biggest7279){
          biggest7279=ends[7];
        }
        if(ends[8]>=biggest7279){
          biggest7279=ends[8];
        }
        if(ends[9]>=biggest7279){
          biggest7279=ends[9];
        }
        if(ends[10]>=biggest7279){
          biggest7279=ends[10];
        }
        if(ends[11]>=biggest7279){
          biggest7279=ends[11];
        }
        if(biggest7279 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest7279 == 0){
          S4035=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread7271(int [] tdone, int [] ends){
        switch(S3985){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(motConveyorOnOff.getprestatus() && enable.getprestatus()){//sysj/plant.sysj line: 97, column: 12
          conveyorOn_1.setPresent();//sysj/plant.sysj line: 99, column: 5
          currsigs.addElement(conveyorOn_1);
          addBottleSig_1.setPresent();//sysj/plant.sysj line: 101, column: 5
          currsigs.addElement(addBottleSig_1);
          removeBottleSig_1.setPresent();//sysj/plant.sysj line: 102, column: 5
          currsigs.addElement(removeBottleSig_1);
          active[4]=1;
          ends[4]=1;
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

  public void thread7270(int [] tdone, int [] ends){
        switch(S3974){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S3944){
          case 0 : 
            if(spawnBottle.getprestatus()){//sysj/plant.sysj line: 80, column: 11
              System.out.println("Bottle has been spawned.");//sysj/plant.sysj line: 82, column: 4
              S3944=1;
              spawnBottleSig_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(spawnBottleSig_1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(removeSpawnBottle_1.getprestatus()){//sysj/plant.sysj line: 84, column: 10
              System.out.println("Bottle has been removed from spawn.");//sysj/plant.sysj line: 88, column: 4
              S3944=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              spawnBottleSig_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(spawnBottleSig_1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            S3944=2;
            S3944=0;
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread7269(int [] tdone, int [] ends){
        switch(S3942){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S848){
          case 0 : 
            if(!rotate.getprestatus()){//sysj/plant.sysj line: 73, column: 10
              S848=1;
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
          
          case 1 : 
            S848=1;
            if(rotate.getprestatus()){//sysj/plant.sysj line: 39, column: 12
              System.out.println("Rotated.");//sysj/plant.sysj line: 40, column: 5
              r_thread_2.rotateRotate();//sysj/plant.sysj line: 41, column: 5
              if(addBottleSig_1.getprestatus()){//sysj/plant.sysj line: 44, column: 12
                if(spawnBottleSig_1.getprestatus()){//sysj/plant.sysj line: 45, column: 13
                  bottlebefore1_thread_2 = true;//sysj/plant.sysj line: 46, column: 6
                  bottlebefore1_thread_2 = r_thread_2.addBottle(bottlebefore1_thread_2);//sysj/plant.sysj line: 48, column: 5
                  if(bottlebefore1_thread_2 == false){//sysj/plant.sysj line: 49, column: 9
                    removeSpawnBottle_1.setPresent();//sysj/plant.sysj line: 50, column: 6
                    currsigs.addElement(removeSpawnBottle_1);
                    if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
                      bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                        bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                        currsigs.addElement(bottleAfter5Sig_1);
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                        bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                        currsigs.addElement(bottleAtPos1);
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                  else {
                    if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
                      bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                        bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                        currsigs.addElement(bottleAfter5Sig_1);
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                        bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                        currsigs.addElement(bottleAtPos1);
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                }
                else {
                  bottlebefore1_thread_2 = r_thread_2.addBottle(bottlebefore1_thread_2);//sysj/plant.sysj line: 48, column: 5
                  if(bottlebefore1_thread_2 == false){//sysj/plant.sysj line: 49, column: 9
                    removeSpawnBottle_1.setPresent();//sysj/plant.sysj line: 50, column: 6
                    currsigs.addElement(removeSpawnBottle_1);
                    if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
                      bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                        bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                        currsigs.addElement(bottleAfter5Sig_1);
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                        bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                        currsigs.addElement(bottleAtPos1);
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                  else {
                    if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
                      bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                        bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                        currsigs.addElement(bottleAfter5Sig_1);
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                        bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                        currsigs.addElement(bottleAtPos1);
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                }
              }
              else {
                if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
                  bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                    bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                    currsigs.addElement(bottleAfter5Sig_1);
                    if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                      bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                      currsigs.addElement(bottleAtPos1);
                      if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                        bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                        currsigs.addElement(bottle5_1);
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                    else {
                      if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                        bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                        currsigs.addElement(bottle5_1);
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                  }
                  else {
                    if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                      bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                      currsigs.addElement(bottleAtPos1);
                      if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                        bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                        currsigs.addElement(bottle5_1);
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                    else {
                      if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                        bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                        currsigs.addElement(bottle5_1);
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                    bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                    currsigs.addElement(bottleAtPos1);
                    if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                      bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                      currsigs.addElement(bottle5_1);
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                        bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                        currsigs.addElement(bottleLeftPos5);
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                        bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                        currsigs.addElement(bottleLeftPos5);
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                  else {
                    if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                      bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                      currsigs.addElement(bottle5_1);
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                        bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                        currsigs.addElement(bottleLeftPos5);
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                        bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                        currsigs.addElement(bottleLeftPos5);
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                }
              }
            }
            else {
              if(addBottleSig_1.getprestatus()){//sysj/plant.sysj line: 44, column: 12
                if(spawnBottleSig_1.getprestatus()){//sysj/plant.sysj line: 45, column: 13
                  bottlebefore1_thread_2 = true;//sysj/plant.sysj line: 46, column: 6
                  bottlebefore1_thread_2 = r_thread_2.addBottle(bottlebefore1_thread_2);//sysj/plant.sysj line: 48, column: 5
                  if(bottlebefore1_thread_2 == false){//sysj/plant.sysj line: 49, column: 9
                    removeSpawnBottle_1.setPresent();//sysj/plant.sysj line: 50, column: 6
                    currsigs.addElement(removeSpawnBottle_1);
                    if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
                      bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                        bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                        currsigs.addElement(bottleAfter5Sig_1);
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                        bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                        currsigs.addElement(bottleAtPos1);
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                  else {
                    if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
                      bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                        bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                        currsigs.addElement(bottleAfter5Sig_1);
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                        bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                        currsigs.addElement(bottleAtPos1);
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                }
                else {
                  bottlebefore1_thread_2 = r_thread_2.addBottle(bottlebefore1_thread_2);//sysj/plant.sysj line: 48, column: 5
                  if(bottlebefore1_thread_2 == false){//sysj/plant.sysj line: 49, column: 9
                    removeSpawnBottle_1.setPresent();//sysj/plant.sysj line: 50, column: 6
                    currsigs.addElement(removeSpawnBottle_1);
                    if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
                      bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                        bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                        currsigs.addElement(bottleAfter5Sig_1);
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                        bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                        currsigs.addElement(bottleAtPos1);
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                  else {
                    if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
                      bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                        bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                        currsigs.addElement(bottleAfter5Sig_1);
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                          bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                          currsigs.addElement(bottleAtPos1);
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                            bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                            currsigs.addElement(bottle5_1);
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                              bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                              currsigs.addElement(bottleLeftPos5);
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S848=0;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                        bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                        currsigs.addElement(bottleAtPos1);
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                          bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                          currsigs.addElement(bottle5_1);
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                            bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                            currsigs.addElement(bottleLeftPos5);
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S848=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                }
              }
              else {
                if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
                  bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                    bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                    currsigs.addElement(bottleAfter5Sig_1);
                    if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                      bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                      currsigs.addElement(bottleAtPos1);
                      if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                        bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                        currsigs.addElement(bottle5_1);
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                    else {
                      if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                        bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                        currsigs.addElement(bottle5_1);
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                  }
                  else {
                    if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                      bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                      currsigs.addElement(bottleAtPos1);
                      if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                        bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                        currsigs.addElement(bottle5_1);
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                    else {
                      if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                        bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                        currsigs.addElement(bottle5_1);
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                          currsigs.addElement(bottleLeftPos5);
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S848=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                    bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                    currsigs.addElement(bottleAtPos1);
                    if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                      bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                      currsigs.addElement(bottle5_1);
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                        bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                        currsigs.addElement(bottleLeftPos5);
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                        bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                        currsigs.addElement(bottleLeftPos5);
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                  else {
                    if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                      bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                      currsigs.addElement(bottle5_1);
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                        bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                        currsigs.addElement(bottleLeftPos5);
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                        bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                        currsigs.addElement(bottleLeftPos5);
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S848=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                }
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread7266(int [] tdone, int [] ends){
        S4033=1;
    if(spawnBottleSig_1.getprestatus()){//sysj/plant.sysj line: 132, column: 24
      before1E.setPresent();//sysj/plant.sysj line: 132, column: 40
      currsigs.addElement(before1E);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread7265(int [] tdone, int [] ends){
        S4025=1;
    if(bottle5_1.getprestatus()){//sysj/plant.sysj line: 126, column: 24
      bottle5E.setPresent();//sysj/plant.sysj line: 126, column: 33
      currsigs.addElement(bottle5E);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread7264(int [] tdone, int [] ends){
        S4017=1;
    if(conveyorOn_1.getprestatus()){//sysj/plant.sysj line: 116, column: 24
      con5onE.setPresent();//sysj/plant.sysj line: 116, column: 36
      currsigs.addElement(con5onE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread7263(int [] tdone, int [] ends){
        S4009=1;
    if(conveyorOn_1.getprestatus()){//sysj/plant.sysj line: 114, column: 24
      con1onE.setPresent();//sysj/plant.sysj line: 114, column: 36
      currsigs.addElement(con1onE);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread7262(int [] tdone, int [] ends){
        S4001=1;
    if(bottleAfter5Sig_1.getprestatus()){//sysj/plant.sysj line: 112, column: 24
      after5E.setPresent();//sysj/plant.sysj line: 112, column: 41
      currsigs.addElement(after5E);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread7261(int [] tdone, int [] ends){
        S3993=1;
    if(bottleAtPos1.getprestatus()){//sysj/plant.sysj line: 110, column: 24
      bottle1E.setPresent();//sysj/plant.sysj line: 110, column: 38
      currsigs.addElement(bottle1E);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread7260(int [] tdone, int [] ends){
        S4035=1;
    thread7261(tdone,ends);
    thread7262(tdone,ends);
    thread7263(tdone,ends);
    thread7264(tdone,ends);
    thread7265(tdone,ends);
    thread7266(tdone,ends);
    int biggest7267 = 0;
    if(ends[6]>=biggest7267){
      biggest7267=ends[6];
    }
    if(ends[7]>=biggest7267){
      biggest7267=ends[7];
    }
    if(ends[8]>=biggest7267){
      biggest7267=ends[8];
    }
    if(ends[9]>=biggest7267){
      biggest7267=ends[9];
    }
    if(ends[10]>=biggest7267){
      biggest7267=ends[10];
    }
    if(ends[11]>=biggest7267){
      biggest7267=ends[11];
    }
    if(biggest7267 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread7259(int [] tdone, int [] ends){
        S3985=1;
    if(motConveyorOnOff.getprestatus() && enable.getprestatus()){//sysj/plant.sysj line: 97, column: 12
      conveyorOn_1.setPresent();//sysj/plant.sysj line: 99, column: 5
      currsigs.addElement(conveyorOn_1);
      addBottleSig_1.setPresent();//sysj/plant.sysj line: 101, column: 5
      currsigs.addElement(addBottleSig_1);
      removeBottleSig_1.setPresent();//sysj/plant.sysj line: 102, column: 5
      currsigs.addElement(removeBottleSig_1);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread7258(int [] tdone, int [] ends){
        S3974=1;
    S3944=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread7257(int [] tdone, int [] ends){
        S3942=1;
    r_thread_2 = new Rotator();//sysj/plant.sysj line: 33, column: 3
    bottlebefore1_thread_2 = false;//sysj/plant.sysj line: 35, column: 3
    bottleafter5_thread_2 = false;//sysj/plant.sysj line: 36, column: 3
    if(rotate.getprestatus()){//sysj/plant.sysj line: 39, column: 12
      System.out.println("Rotated.");//sysj/plant.sysj line: 40, column: 5
      r_thread_2.rotateRotate();//sysj/plant.sysj line: 41, column: 5
      if(addBottleSig_1.getprestatus()){//sysj/plant.sysj line: 44, column: 12
        if(spawnBottleSig_1.getprestatus()){//sysj/plant.sysj line: 45, column: 13
          bottlebefore1_thread_2 = true;//sysj/plant.sysj line: 46, column: 6
          bottlebefore1_thread_2 = r_thread_2.addBottle(bottlebefore1_thread_2);//sysj/plant.sysj line: 48, column: 5
          if(bottlebefore1_thread_2 == false){//sysj/plant.sysj line: 49, column: 9
            removeSpawnBottle_1.setPresent();//sysj/plant.sysj line: 50, column: 6
            currsigs.addElement(removeSpawnBottle_1);
            if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
              bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                currsigs.addElement(bottleAfter5Sig_1);
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
              else {
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
            }
            else {
              if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                currsigs.addElement(bottleAtPos1);
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
            }
          }
          else {
            if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
              bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                currsigs.addElement(bottleAfter5Sig_1);
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
              else {
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
            }
            else {
              if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                currsigs.addElement(bottleAtPos1);
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
            }
          }
        }
        else {
          bottlebefore1_thread_2 = r_thread_2.addBottle(bottlebefore1_thread_2);//sysj/plant.sysj line: 48, column: 5
          if(bottlebefore1_thread_2 == false){//sysj/plant.sysj line: 49, column: 9
            removeSpawnBottle_1.setPresent();//sysj/plant.sysj line: 50, column: 6
            currsigs.addElement(removeSpawnBottle_1);
            if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
              bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                currsigs.addElement(bottleAfter5Sig_1);
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
              else {
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
            }
            else {
              if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                currsigs.addElement(bottleAtPos1);
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
            }
          }
          else {
            if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
              bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                currsigs.addElement(bottleAfter5Sig_1);
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
              else {
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
            }
            else {
              if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                currsigs.addElement(bottleAtPos1);
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
            }
          }
        }
      }
      else {
        if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
          bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
          if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
            bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
            currsigs.addElement(bottleAfter5Sig_1);
            if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
              bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
              currsigs.addElement(bottleAtPos1);
              if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                currsigs.addElement(bottle5_1);
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                currsigs.addElement(bottle5_1);
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
          }
          else {
            if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
              bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
              currsigs.addElement(bottleAtPos1);
              if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                currsigs.addElement(bottle5_1);
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                currsigs.addElement(bottle5_1);
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
          }
        }
        else {
          if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
            bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
            currsigs.addElement(bottleAtPos1);
            if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
              bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
              currsigs.addElement(bottle5_1);
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                currsigs.addElement(bottleLeftPos5);
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                currsigs.addElement(bottleLeftPos5);
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
          }
          else {
            if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
              bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
              currsigs.addElement(bottle5_1);
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                currsigs.addElement(bottleLeftPos5);
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                currsigs.addElement(bottleLeftPos5);
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
          }
        }
      }
    }
    else {
      if(addBottleSig_1.getprestatus()){//sysj/plant.sysj line: 44, column: 12
        if(spawnBottleSig_1.getprestatus()){//sysj/plant.sysj line: 45, column: 13
          bottlebefore1_thread_2 = true;//sysj/plant.sysj line: 46, column: 6
          bottlebefore1_thread_2 = r_thread_2.addBottle(bottlebefore1_thread_2);//sysj/plant.sysj line: 48, column: 5
          if(bottlebefore1_thread_2 == false){//sysj/plant.sysj line: 49, column: 9
            removeSpawnBottle_1.setPresent();//sysj/plant.sysj line: 50, column: 6
            currsigs.addElement(removeSpawnBottle_1);
            if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
              bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                currsigs.addElement(bottleAfter5Sig_1);
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
              else {
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
            }
            else {
              if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                currsigs.addElement(bottleAtPos1);
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
            }
          }
          else {
            if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
              bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                currsigs.addElement(bottleAfter5Sig_1);
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
              else {
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
            }
            else {
              if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                currsigs.addElement(bottleAtPos1);
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
            }
          }
        }
        else {
          bottlebefore1_thread_2 = r_thread_2.addBottle(bottlebefore1_thread_2);//sysj/plant.sysj line: 48, column: 5
          if(bottlebefore1_thread_2 == false){//sysj/plant.sysj line: 49, column: 9
            removeSpawnBottle_1.setPresent();//sysj/plant.sysj line: 50, column: 6
            currsigs.addElement(removeSpawnBottle_1);
            if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
              bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                currsigs.addElement(bottleAfter5Sig_1);
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
              else {
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
            }
            else {
              if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                currsigs.addElement(bottleAtPos1);
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
            }
          }
          else {
            if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
              bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
                bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
                currsigs.addElement(bottleAfter5Sig_1);
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
              else {
                if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                  bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                  currsigs.addElement(bottleAtPos1);
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                    bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                    currsigs.addElement(bottle5_1);
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                      currsigs.addElement(bottleLeftPos5);
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S848=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
            }
            else {
              if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
                bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
                currsigs.addElement(bottleAtPos1);
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                  bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                  currsigs.addElement(bottle5_1);
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                    bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                    currsigs.addElement(bottleLeftPos5);
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S848=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
            }
          }
        }
      }
      else {
        if(removeBottleSig_1.getprestatus()){//sysj/plant.sysj line: 55, column: 12
          bottleafter5_thread_2 = r_thread_2.removeBottle();//sysj/plant.sysj line: 56, column: 5
          if(bottleafter5_thread_2){//sysj/plant.sysj line: 57, column: 5
            bottleAfter5Sig_1.setPresent();//sysj/plant.sysj line: 58, column: 6
            currsigs.addElement(bottleAfter5Sig_1);
            if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
              bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
              currsigs.addElement(bottleAtPos1);
              if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                currsigs.addElement(bottle5_1);
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                currsigs.addElement(bottle5_1);
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
          }
          else {
            if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
              bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
              currsigs.addElement(bottleAtPos1);
              if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                currsigs.addElement(bottle5_1);
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
                bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
                currsigs.addElement(bottle5_1);
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                  bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                  currsigs.addElement(bottleLeftPos5);
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S848=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
          }
        }
        else {
          if(r_thread_2.get(0)){//sysj/plant.sysj line: 63, column: 4
            bottleAtPos1.setPresent();//sysj/plant.sysj line: 63, column: 17
            currsigs.addElement(bottleAtPos1);
            if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
              bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
              currsigs.addElement(bottle5_1);
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                currsigs.addElement(bottleLeftPos5);
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                currsigs.addElement(bottleLeftPos5);
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
          }
          else {
            if(r_thread_2.get(4)){//sysj/plant.sysj line: 69, column: 4
              bottle5_1.setPresent();//sysj/plant.sysj line: 69, column: 17
              currsigs.addElement(bottle5_1);
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                currsigs.addElement(bottleLeftPos5);
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              if(bottleafter5_thread_2){//sysj/plant.sysj line: 71, column: 4
                bottleLeftPos5.setPresent();//sysj/plant.sysj line: 71, column: 21
                currsigs.addElement(bottleLeftPos5);
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S848=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
          }
        }
      }
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S7255){
        case 0 : 
          S7255=0;
          break RUN;
        
        case 1 : 
          S7255=2;
          S7255=2;
          new Thread(new Gui()).start();//sysj/plant.sysj line: 12, column: 2
          conveyorOn_1.setClear();//sysj/plant.sysj line: 14, column: 2
          bottleAfter5Sig_1.setClear();//sysj/plant.sysj line: 16, column: 2
          spawnBottleSig_1.setClear();//sysj/plant.sysj line: 17, column: 2
          removeSpawnBottle_1.setClear();//sysj/plant.sysj line: 18, column: 2
          addBottleSig_1.setClear();//sysj/plant.sysj line: 20, column: 2
          removeBottleSig_1.setClear();//sysj/plant.sysj line: 21, column: 2
          bottle5_1.setClear();//sysj/plant.sysj line: 27, column: 2
          thread7257(tdone,ends);
          thread7258(tdone,ends);
          thread7259(tdone,ends);
          thread7260(tdone,ends);
          int biggest7268 = 0;
          if(ends[2]>=biggest7268){
            biggest7268=ends[2];
          }
          if(ends[3]>=biggest7268){
            biggest7268=ends[3];
          }
          if(ends[4]>=biggest7268){
            biggest7268=ends[4];
          }
          if(ends[5]>=biggest7268){
            biggest7268=ends[5];
          }
          if(biggest7268 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          conveyorOn_1.setClear();//sysj/plant.sysj line: 14, column: 2
          bottleAfter5Sig_1.setClear();//sysj/plant.sysj line: 16, column: 2
          spawnBottleSig_1.setClear();//sysj/plant.sysj line: 17, column: 2
          removeSpawnBottle_1.setClear();//sysj/plant.sysj line: 18, column: 2
          addBottleSig_1.setClear();//sysj/plant.sysj line: 20, column: 2
          removeBottleSig_1.setClear();//sysj/plant.sysj line: 21, column: 2
          bottle5_1.setClear();//sysj/plant.sysj line: 27, column: 2
          thread7269(tdone,ends);
          thread7270(tdone,ends);
          thread7271(tdone,ends);
          thread7272(tdone,ends);
          int biggest7280 = 0;
          if(ends[2]>=biggest7280){
            biggest7280=ends[2];
          }
          if(ends[3]>=biggest7280){
            biggest7280=ends[3];
          }
          if(ends[4]>=biggest7280){
            biggest7280=ends[4];
          }
          if(ends[5]>=biggest7280){
            biggest7280=ends[5];
          }
          if(biggest7280 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest7280 == 0){
            S7255=0;
            active[1]=0;
            ends[1]=0;
            S7255=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    conveyorOn_1 = new Signal();
    bottleAfter5Sig_1 = new Signal();
    spawnBottleSig_1 = new Signal();
    removeSpawnBottle_1 = new Signal();
    addBottleSig_1 = new Signal();
    removeBottleSig_1 = new Signal();
    bottle5_1 = new Signal();
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
          motConveyorOnOff.gethook();
          enable.gethook();
          rotate.gethook();
          spawnBottle.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      enable.setpreclear();
      rotate.setpreclear();
      spawnBottle.setpreclear();
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottle1E.setpreclear();
      bottle2E.setpreclear();
      bottle3E.setpreclear();
      bottle4E.setpreclear();
      bottle5E.setpreclear();
      bottle6E.setpreclear();
      before1E.setpreclear();
      after5E.setpreclear();
      con1onE.setpreclear();
      con5onE.setpreclear();
      conveyorOn_1.setpreclear();
      bottleAfter5Sig_1.setpreclear();
      spawnBottleSig_1.setpreclear();
      removeSpawnBottle_1.setpreclear();
      addBottleSig_1.setpreclear();
      removeBottleSig_1.setpreclear();
      bottle5_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = rotate.getStatus() ? rotate.setprepresent() : rotate.setpreclear();
      rotate.setpreval(rotate.getValue());
      rotate.setClear();
      dummyint = spawnBottle.getStatus() ? spawnBottle.setprepresent() : spawnBottle.setpreclear();
      spawnBottle.setpreval(spawnBottle.getValue());
      spawnBottle.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
      bottle1E.sethook();
      bottle1E.setClear();
      bottle2E.sethook();
      bottle2E.setClear();
      bottle3E.sethook();
      bottle3E.setClear();
      bottle4E.sethook();
      bottle4E.setClear();
      bottle5E.sethook();
      bottle5E.setClear();
      bottle6E.sethook();
      bottle6E.setClear();
      before1E.sethook();
      before1E.setClear();
      after5E.sethook();
      after5E.setClear();
      con1onE.sethook();
      con1onE.setClear();
      con5onE.sethook();
      con5onE.setClear();
      conveyorOn_1.setClear();
      bottleAfter5Sig_1.setClear();
      spawnBottleSig_1.setClear();
      removeSpawnBottle_1.setClear();
      addBottleSig_1.setClear();
      removeBottleSig_1.setClear();
      bottle5_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motConveyorOnOff.gethook();
        enable.gethook();
        rotate.gethook();
        spawnBottle.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

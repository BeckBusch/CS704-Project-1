import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class PlantRotaryCD extends ClockDomain{
  public PlantRotaryCD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.INPUT);
  public Signal manualRemovePos1 = new Signal("manualRemovePos1", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.OUTPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal bottleAtPos6 = new Signal("bottleAtPos6", Signal.OUTPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.OUTPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.OUTPUT);
  public input_Channel plantConveyorActive_in = new input_Channel();
  public input_Channel plantConveyorBottleBeforePos1_in = new input_Channel();
  public input_Channel plantCapperPos4_in = new input_Channel();
  public output_Channel receivedPos1_o = new output_Channel();
  public output_Channel sentPos5_o = new output_Channel();
  private Signal rotationInProgress_1;
  private Signal finishedRotating_1;
  private Signal deadSignal_1;
  private Signal conveyorToPos1_1;
  private Signal pos5ToConveyor_1;
  private Signal removePos1_1;
  private Signal pos12_1;
  private Signal pos23_1;
  private Signal pos34_1;
  private Signal pos45_1;
  private Signal pos56_1;
  private Signal pos61_1;
  private Signal pos1_1;
  private Signal pos2_1;
  private Signal pos3_1;
  private Signal pos4_1;
  private Signal pos5_1;
  private Signal pos6_1;
  private Signal cap1_1;
  private Signal cap2_1;
  private Signal cap3_1;
  private Signal cap4_1;
  private Signal cap5_1;
  private Signal cap6_1;
  private Signal cap12_1;
  private Signal cap23_1;
  private Signal cap34_1;
  private Signal cap45_1;
  private Signal cap56_1;
  private Signal cap61_1;
  private Signal conveyorActive_1;
  private Signal conveyorBottleBeforePos1_1;
  private Signal capperPos4_1;
  private Signal beginSustain_14;
  private Signal endSustain_14;
  private Signal beginSustain_21;
  private Signal endSustain_21;
  private Signal beginSustain_28;
  private Signal endSustain_28;
  private Signal beginSustain_35;
  private Signal endSustain_35;
  private Signal beginSustain_42;
  private Signal endSustain_42;
  private Signal beginSustain_49;
  private Signal endSustain_49;
  private Signal beginSustain_62;
  private Signal endSustain_62;
  private Signal beginSustain_69;
  private Signal endSustain_69;
  private Signal beginSustain_76;
  private Signal endSustain_76;
  private Signal beginSustain_83;
  private Signal endSustain_83;
  private Signal beginSustain_90;
  private Signal endSustain_90;
  private Signal beginSustain_97;
  private Signal endSustain_97;
  private int S1754 = 1;
  private int S103 = 1;
  private int S55 = 1;
  private int S39 = 1;
  private int S34 = 1;
  private int S174 = 1;
  private int S126 = 1;
  private int S110 = 1;
  private int S105 = 1;
  private int S245 = 1;
  private int S197 = 1;
  private int S181 = 1;
  private int S176 = 1;
  private int S266 = 1;
  private int S265 = 1;
  private int S249 = 1;
  private int S254 = 1;
  private int S274 = 1;
  private int S268 = 1;
  private int S282 = 1;
  private int S425 = 1;
  private int S329 = 1;
  private int S289 = 1;
  private int S284 = 1;
  private int S568 = 1;
  private int S472 = 1;
  private int S432 = 1;
  private int S427 = 1;
  private int S662 = 1;
  private int S660 = 1;
  private int S580 = 1;
  private int S588 = 1;
  private int S626 = 1;
  private int S592 = 1;
  private int S658 = 1;
  private int S636 = 1;
  private int S756 = 1;
  private int S754 = 1;
  private int S674 = 1;
  private int S682 = 1;
  private int S720 = 1;
  private int S686 = 1;
  private int S752 = 1;
  private int S730 = 1;
  private int S850 = 1;
  private int S848 = 1;
  private int S768 = 1;
  private int S776 = 1;
  private int S814 = 1;
  private int S780 = 1;
  private int S846 = 1;
  private int S824 = 1;
  private int S944 = 1;
  private int S942 = 1;
  private int S862 = 1;
  private int S870 = 1;
  private int S908 = 1;
  private int S874 = 1;
  private int S940 = 1;
  private int S918 = 1;
  private int S1038 = 1;
  private int S1036 = 1;
  private int S956 = 1;
  private int S964 = 1;
  private int S1002 = 1;
  private int S968 = 1;
  private int S1034 = 1;
  private int S1012 = 1;
  private int S1132 = 1;
  private int S1130 = 1;
  private int S1050 = 1;
  private int S1058 = 1;
  private int S1096 = 1;
  private int S1062 = 1;
  private int S1128 = 1;
  private int S1106 = 1;
  private int S1140 = 1;
  private int S1148 = 1;
  private int S1156 = 1;
  private int S1164 = 1;
  private int S1172 = 1;
  private int S1180 = 1;
  private int S1274 = 1;
  private int S1272 = 1;
  private int S1192 = 1;
  private int S1200 = 1;
  private int S1238 = 1;
  private int S1204 = 1;
  private int S1270 = 1;
  private int S1248 = 1;
  private int S1368 = 1;
  private int S1366 = 1;
  private int S1286 = 1;
  private int S1294 = 1;
  private int S1332 = 1;
  private int S1298 = 1;
  private int S1364 = 1;
  private int S1342 = 1;
  private int S1462 = 1;
  private int S1460 = 1;
  private int S1380 = 1;
  private int S1388 = 1;
  private int S1426 = 1;
  private int S1392 = 1;
  private int S1458 = 1;
  private int S1436 = 1;
  private int S1556 = 1;
  private int S1554 = 1;
  private int S1474 = 1;
  private int S1482 = 1;
  private int S1520 = 1;
  private int S1486 = 1;
  private int S1552 = 1;
  private int S1530 = 1;
  private int S1650 = 1;
  private int S1648 = 1;
  private int S1568 = 1;
  private int S1576 = 1;
  private int S1614 = 1;
  private int S1580 = 1;
  private int S1646 = 1;
  private int S1624 = 1;
  private int S1744 = 1;
  private int S1742 = 1;
  private int S1662 = 1;
  private int S1670 = 1;
  private int S1708 = 1;
  private int S1674 = 1;
  private int S1740 = 1;
  private int S1718 = 1;
  private int S1752 = 1;
  
  private int[] ends = new int[115];
  private int[] tdone = new int[115];
  
  public void thread2384(int [] tdone, int [] ends){
        switch(S1752){
      case 0 : 
        active[102]=0;
        ends[102]=0;
        tdone[102]=1;
        break;
      
      case 1 : 
        if(cap1_1.getprestatus()){//sysj/plant.sysj line: 345, column: 24
          capOnBottleAtPos1.setPresent();//sysj/plant.sysj line: 345, column: 30
          currsigs.addElement(capOnBottleAtPos1);
          active[102]=1;
          ends[102]=1;
          tdone[102]=1;
        }
        else {
          active[102]=1;
          ends[102]=1;
          tdone[102]=1;
        }
        break;
      
    }
  }

  public void thread2381(int [] tdone, int [] ends){
        switch(S1740){
      case 0 : 
        active[101]=0;
        ends[101]=0;
        tdone[101]=1;
        break;
      
      case 1 : 
        switch(S1718){
          case 0 : 
            if(beginSustain_97.getprestatus()){//sysj/plant.sysj line: 82, column: 11
              S1718=1;
              cap6_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(cap6_1);
              active[101]=1;
              ends[101]=1;
              tdone[101]=1;
            }
            else {
              active[101]=1;
              ends[101]=1;
              tdone[101]=1;
            }
            break;
          
          case 1 : 
            if(endSustain_97.getprestatus()){//sysj/plant.sysj line: 84, column: 10
              S1718=0;
              active[101]=1;
              ends[101]=1;
              tdone[101]=1;
            }
            else {
              cap6_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(cap6_1);
              active[101]=1;
              ends[101]=1;
              tdone[101]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2380(int [] tdone, int [] ends){
        switch(S1708){
      case 0 : 
        active[100]=0;
        ends[100]=0;
        tdone[100]=1;
        break;
      
      case 1 : 
        switch(S1674){
          case 0 : 
            if(finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 63, column: 11
              if(cap6_1.getprestatus()){//sysj/plant.sysj line: 65, column: 12
                cap61_1.setPresent();//sysj/plant.sysj line: 66, column: 5
                currsigs.addElement(cap61_1);
                if(cap5_1.getprestatus() && cap56_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_97.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_97);
                  S1674=1;
                  active[100]=1;
                  ends[100]=1;
                  tdone[100]=1;
                }
                else {
                  endSustain_97.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_97);
                  S1674=1;
                  active[100]=1;
                  ends[100]=1;
                  tdone[100]=1;
                }
              }
              else {
                if(cap5_1.getprestatus() && cap56_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_97.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_97);
                  S1674=1;
                  active[100]=1;
                  ends[100]=1;
                  tdone[100]=1;
                }
                else {
                  endSustain_97.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_97);
                  S1674=1;
                  active[100]=1;
                  ends[100]=1;
                  tdone[100]=1;
                }
              }
            }
            else {
              active[100]=1;
              ends[100]=1;
              tdone[100]=1;
            }
            break;
          
          case 1 : 
            if(!finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 75, column: 11
              S1674=0;
              active[100]=1;
              ends[100]=1;
              tdone[100]=1;
            }
            else {
              active[100]=1;
              ends[100]=1;
              tdone[100]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2379(int [] tdone, int [] ends){
        switch(S1670){
      case 0 : 
        active[99]=0;
        ends[99]=0;
        tdone[99]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
          beginSustain_97.setPresent();//sysj/plant.sysj line: 53, column: 5
          currsigs.addElement(beginSustain_97);
          active[99]=1;
          ends[99]=1;
          tdone[99]=1;
        }
        else {
          active[99]=1;
          ends[99]=1;
          tdone[99]=1;
        }
        break;
      
    }
  }

  public void thread2378(int [] tdone, int [] ends){
        switch(S1662){
      case 0 : 
        active[98]=0;
        ends[98]=0;
        tdone[98]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
          endSustain_97.setPresent();//sysj/plant.sysj line: 43, column: 5
          currsigs.addElement(endSustain_97);
          active[98]=1;
          ends[98]=1;
          tdone[98]=1;
        }
        else {
          active[98]=1;
          ends[98]=1;
          tdone[98]=1;
        }
        break;
      
    }
  }

  public void thread2377(int [] tdone, int [] ends){
        switch(S1742){
      case 0 : 
        active[97]=0;
        ends[97]=0;
        tdone[97]=1;
        break;
      
      case 1 : 
        beginSustain_97.setClear();//sysj/plant.sysj line: 37, column: 2
        endSustain_97.setClear();//sysj/plant.sysj line: 38, column: 2
        thread2378(tdone,ends);
        thread2379(tdone,ends);
        thread2380(tdone,ends);
        thread2381(tdone,ends);
        int biggest2382 = 0;
        if(ends[98]>=biggest2382){
          biggest2382=ends[98];
        }
        if(ends[99]>=biggest2382){
          biggest2382=ends[99];
        }
        if(ends[100]>=biggest2382){
          biggest2382=ends[100];
        }
        if(ends[101]>=biggest2382){
          biggest2382=ends[101];
        }
        if(biggest2382 == 1){
          active[97]=1;
          ends[97]=1;
          tdone[97]=1;
        }
        //FINXME code
        if(biggest2382 == 0){
          S1742=0;
          active[97]=0;
          ends[97]=0;
          tdone[97]=1;
        }
        break;
      
    }
  }

  public void thread2376(int [] tdone, int [] ends){
        active[96]=0;
    ends[96]=0;
    tdone[96]=1;
  }

  public void thread2375(int [] tdone, int [] ends){
        switch(S1744){
      case 0 : 
        active[95]=0;
        ends[95]=0;
        tdone[95]=1;
        break;
      
      case 1 : 
        thread2376(tdone,ends);
        thread2377(tdone,ends);
        int biggest2383 = 0;
        if(ends[96]>=biggest2383){
          biggest2383=ends[96];
        }
        if(ends[97]>=biggest2383){
          biggest2383=ends[97];
        }
        if(biggest2383 == 1){
          active[95]=1;
          ends[95]=1;
          tdone[95]=1;
        }
        //FINXME code
        if(biggest2383 == 0){
          S1744=0;
          active[95]=0;
          ends[95]=0;
          tdone[95]=1;
        }
        break;
      
    }
  }

  public void thread2372(int [] tdone, int [] ends){
        switch(S1646){
      case 0 : 
        active[94]=0;
        ends[94]=0;
        tdone[94]=1;
        break;
      
      case 1 : 
        switch(S1624){
          case 0 : 
            if(beginSustain_90.getprestatus()){//sysj/plant.sysj line: 82, column: 11
              S1624=1;
              cap5_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(cap5_1);
              active[94]=1;
              ends[94]=1;
              tdone[94]=1;
            }
            else {
              active[94]=1;
              ends[94]=1;
              tdone[94]=1;
            }
            break;
          
          case 1 : 
            if(endSustain_90.getprestatus()){//sysj/plant.sysj line: 84, column: 10
              S1624=0;
              active[94]=1;
              ends[94]=1;
              tdone[94]=1;
            }
            else {
              cap5_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(cap5_1);
              active[94]=1;
              ends[94]=1;
              tdone[94]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2371(int [] tdone, int [] ends){
        switch(S1614){
      case 0 : 
        active[93]=0;
        ends[93]=0;
        tdone[93]=1;
        break;
      
      case 1 : 
        switch(S1580){
          case 0 : 
            if(finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 63, column: 11
              if(cap5_1.getprestatus()){//sysj/plant.sysj line: 65, column: 12
                cap56_1.setPresent();//sysj/plant.sysj line: 66, column: 5
                currsigs.addElement(cap56_1);
                if(cap4_1.getprestatus() && cap45_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_90.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_90);
                  S1580=1;
                  active[93]=1;
                  ends[93]=1;
                  tdone[93]=1;
                }
                else {
                  endSustain_90.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_90);
                  S1580=1;
                  active[93]=1;
                  ends[93]=1;
                  tdone[93]=1;
                }
              }
              else {
                if(cap4_1.getprestatus() && cap45_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_90.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_90);
                  S1580=1;
                  active[93]=1;
                  ends[93]=1;
                  tdone[93]=1;
                }
                else {
                  endSustain_90.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_90);
                  S1580=1;
                  active[93]=1;
                  ends[93]=1;
                  tdone[93]=1;
                }
              }
            }
            else {
              active[93]=1;
              ends[93]=1;
              tdone[93]=1;
            }
            break;
          
          case 1 : 
            if(!finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 75, column: 11
              S1580=0;
              active[93]=1;
              ends[93]=1;
              tdone[93]=1;
            }
            else {
              active[93]=1;
              ends[93]=1;
              tdone[93]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2370(int [] tdone, int [] ends){
        switch(S1576){
      case 0 : 
        active[92]=0;
        ends[92]=0;
        tdone[92]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
          beginSustain_90.setPresent();//sysj/plant.sysj line: 53, column: 5
          currsigs.addElement(beginSustain_90);
          active[92]=1;
          ends[92]=1;
          tdone[92]=1;
        }
        else {
          active[92]=1;
          ends[92]=1;
          tdone[92]=1;
        }
        break;
      
    }
  }

  public void thread2369(int [] tdone, int [] ends){
        switch(S1568){
      case 0 : 
        active[91]=0;
        ends[91]=0;
        tdone[91]=1;
        break;
      
      case 1 : 
        if(pos5ToConveyor_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
          endSustain_90.setPresent();//sysj/plant.sysj line: 43, column: 5
          currsigs.addElement(endSustain_90);
          active[91]=1;
          ends[91]=1;
          tdone[91]=1;
        }
        else {
          active[91]=1;
          ends[91]=1;
          tdone[91]=1;
        }
        break;
      
    }
  }

  public void thread2368(int [] tdone, int [] ends){
        switch(S1648){
      case 0 : 
        active[90]=0;
        ends[90]=0;
        tdone[90]=1;
        break;
      
      case 1 : 
        beginSustain_90.setClear();//sysj/plant.sysj line: 37, column: 2
        endSustain_90.setClear();//sysj/plant.sysj line: 38, column: 2
        thread2369(tdone,ends);
        thread2370(tdone,ends);
        thread2371(tdone,ends);
        thread2372(tdone,ends);
        int biggest2373 = 0;
        if(ends[91]>=biggest2373){
          biggest2373=ends[91];
        }
        if(ends[92]>=biggest2373){
          biggest2373=ends[92];
        }
        if(ends[93]>=biggest2373){
          biggest2373=ends[93];
        }
        if(ends[94]>=biggest2373){
          biggest2373=ends[94];
        }
        if(biggest2373 == 1){
          active[90]=1;
          ends[90]=1;
          tdone[90]=1;
        }
        //FINXME code
        if(biggest2373 == 0){
          S1648=0;
          active[90]=0;
          ends[90]=0;
          tdone[90]=1;
        }
        break;
      
    }
  }

  public void thread2367(int [] tdone, int [] ends){
        active[89]=0;
    ends[89]=0;
    tdone[89]=1;
  }

  public void thread2366(int [] tdone, int [] ends){
        switch(S1650){
      case 0 : 
        active[88]=0;
        ends[88]=0;
        tdone[88]=1;
        break;
      
      case 1 : 
        thread2367(tdone,ends);
        thread2368(tdone,ends);
        int biggest2374 = 0;
        if(ends[89]>=biggest2374){
          biggest2374=ends[89];
        }
        if(ends[90]>=biggest2374){
          biggest2374=ends[90];
        }
        if(biggest2374 == 1){
          active[88]=1;
          ends[88]=1;
          tdone[88]=1;
        }
        //FINXME code
        if(biggest2374 == 0){
          S1650=0;
          active[88]=0;
          ends[88]=0;
          tdone[88]=1;
        }
        break;
      
    }
  }

  public void thread2363(int [] tdone, int [] ends){
        switch(S1552){
      case 0 : 
        active[87]=0;
        ends[87]=0;
        tdone[87]=1;
        break;
      
      case 1 : 
        switch(S1530){
          case 0 : 
            if(beginSustain_83.getprestatus()){//sysj/plant.sysj line: 82, column: 11
              S1530=1;
              cap4_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(cap4_1);
              active[87]=1;
              ends[87]=1;
              tdone[87]=1;
            }
            else {
              active[87]=1;
              ends[87]=1;
              tdone[87]=1;
            }
            break;
          
          case 1 : 
            if(endSustain_83.getprestatus()){//sysj/plant.sysj line: 84, column: 10
              S1530=0;
              active[87]=1;
              ends[87]=1;
              tdone[87]=1;
            }
            else {
              cap4_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(cap4_1);
              active[87]=1;
              ends[87]=1;
              tdone[87]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2362(int [] tdone, int [] ends){
        switch(S1520){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        switch(S1486){
          case 0 : 
            if(finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 63, column: 11
              if(cap4_1.getprestatus()){//sysj/plant.sysj line: 65, column: 12
                cap45_1.setPresent();//sysj/plant.sysj line: 66, column: 5
                currsigs.addElement(cap45_1);
                if(cap3_1.getprestatus() && cap34_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_83.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_83);
                  S1486=1;
                  active[86]=1;
                  ends[86]=1;
                  tdone[86]=1;
                }
                else {
                  endSustain_83.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_83);
                  S1486=1;
                  active[86]=1;
                  ends[86]=1;
                  tdone[86]=1;
                }
              }
              else {
                if(cap3_1.getprestatus() && cap34_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_83.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_83);
                  S1486=1;
                  active[86]=1;
                  ends[86]=1;
                  tdone[86]=1;
                }
                else {
                  endSustain_83.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_83);
                  S1486=1;
                  active[86]=1;
                  ends[86]=1;
                  tdone[86]=1;
                }
              }
            }
            else {
              active[86]=1;
              ends[86]=1;
              tdone[86]=1;
            }
            break;
          
          case 1 : 
            if(!finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 75, column: 11
              S1486=0;
              active[86]=1;
              ends[86]=1;
              tdone[86]=1;
            }
            else {
              active[86]=1;
              ends[86]=1;
              tdone[86]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2361(int [] tdone, int [] ends){
        switch(S1482){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
          beginSustain_83.setPresent();//sysj/plant.sysj line: 53, column: 5
          currsigs.addElement(beginSustain_83);
          active[85]=1;
          ends[85]=1;
          tdone[85]=1;
        }
        else {
          active[85]=1;
          ends[85]=1;
          tdone[85]=1;
        }
        break;
      
    }
  }

  public void thread2360(int [] tdone, int [] ends){
        switch(S1474){
      case 0 : 
        active[84]=0;
        ends[84]=0;
        tdone[84]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
          endSustain_83.setPresent();//sysj/plant.sysj line: 43, column: 5
          currsigs.addElement(endSustain_83);
          active[84]=1;
          ends[84]=1;
          tdone[84]=1;
        }
        else {
          active[84]=1;
          ends[84]=1;
          tdone[84]=1;
        }
        break;
      
    }
  }

  public void thread2359(int [] tdone, int [] ends){
        switch(S1554){
      case 0 : 
        active[83]=0;
        ends[83]=0;
        tdone[83]=1;
        break;
      
      case 1 : 
        beginSustain_83.setClear();//sysj/plant.sysj line: 37, column: 2
        endSustain_83.setClear();//sysj/plant.sysj line: 38, column: 2
        thread2360(tdone,ends);
        thread2361(tdone,ends);
        thread2362(tdone,ends);
        thread2363(tdone,ends);
        int biggest2364 = 0;
        if(ends[84]>=biggest2364){
          biggest2364=ends[84];
        }
        if(ends[85]>=biggest2364){
          biggest2364=ends[85];
        }
        if(ends[86]>=biggest2364){
          biggest2364=ends[86];
        }
        if(ends[87]>=biggest2364){
          biggest2364=ends[87];
        }
        if(biggest2364 == 1){
          active[83]=1;
          ends[83]=1;
          tdone[83]=1;
        }
        //FINXME code
        if(biggest2364 == 0){
          S1554=0;
          active[83]=0;
          ends[83]=0;
          tdone[83]=1;
        }
        break;
      
    }
  }

  public void thread2358(int [] tdone, int [] ends){
        active[82]=0;
    ends[82]=0;
    tdone[82]=1;
  }

  public void thread2357(int [] tdone, int [] ends){
        switch(S1556){
      case 0 : 
        active[81]=0;
        ends[81]=0;
        tdone[81]=1;
        break;
      
      case 1 : 
        thread2358(tdone,ends);
        thread2359(tdone,ends);
        int biggest2365 = 0;
        if(ends[82]>=biggest2365){
          biggest2365=ends[82];
        }
        if(ends[83]>=biggest2365){
          biggest2365=ends[83];
        }
        if(biggest2365 == 1){
          active[81]=1;
          ends[81]=1;
          tdone[81]=1;
        }
        //FINXME code
        if(biggest2365 == 0){
          S1556=0;
          active[81]=0;
          ends[81]=0;
          tdone[81]=1;
        }
        break;
      
    }
  }

  public void thread2354(int [] tdone, int [] ends){
        switch(S1458){
      case 0 : 
        active[80]=0;
        ends[80]=0;
        tdone[80]=1;
        break;
      
      case 1 : 
        switch(S1436){
          case 0 : 
            if(beginSustain_76.getprestatus()){//sysj/plant.sysj line: 82, column: 11
              S1436=1;
              cap3_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(cap3_1);
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            else {
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            break;
          
          case 1 : 
            if(endSustain_76.getprestatus()){//sysj/plant.sysj line: 84, column: 10
              S1436=0;
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            else {
              cap3_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(cap3_1);
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2353(int [] tdone, int [] ends){
        switch(S1426){
      case 0 : 
        active[79]=0;
        ends[79]=0;
        tdone[79]=1;
        break;
      
      case 1 : 
        switch(S1392){
          case 0 : 
            if(finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 63, column: 11
              if(cap3_1.getprestatus()){//sysj/plant.sysj line: 65, column: 12
                cap34_1.setPresent();//sysj/plant.sysj line: 66, column: 5
                currsigs.addElement(cap34_1);
                if(cap2_1.getprestatus() && cap23_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_76.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_76);
                  S1392=1;
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
                else {
                  endSustain_76.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_76);
                  S1392=1;
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
              }
              else {
                if(cap2_1.getprestatus() && cap23_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_76.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_76);
                  S1392=1;
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
                else {
                  endSustain_76.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_76);
                  S1392=1;
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
              }
            }
            else {
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            break;
          
          case 1 : 
            if(!finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 75, column: 11
              S1392=0;
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            else {
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2352(int [] tdone, int [] ends){
        switch(S1388){
      case 0 : 
        active[78]=0;
        ends[78]=0;
        tdone[78]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
          beginSustain_76.setPresent();//sysj/plant.sysj line: 53, column: 5
          currsigs.addElement(beginSustain_76);
          active[78]=1;
          ends[78]=1;
          tdone[78]=1;
        }
        else {
          active[78]=1;
          ends[78]=1;
          tdone[78]=1;
        }
        break;
      
    }
  }

  public void thread2351(int [] tdone, int [] ends){
        switch(S1380){
      case 0 : 
        active[77]=0;
        ends[77]=0;
        tdone[77]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
          endSustain_76.setPresent();//sysj/plant.sysj line: 43, column: 5
          currsigs.addElement(endSustain_76);
          active[77]=1;
          ends[77]=1;
          tdone[77]=1;
        }
        else {
          active[77]=1;
          ends[77]=1;
          tdone[77]=1;
        }
        break;
      
    }
  }

  public void thread2350(int [] tdone, int [] ends){
        switch(S1460){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        beginSustain_76.setClear();//sysj/plant.sysj line: 37, column: 2
        endSustain_76.setClear();//sysj/plant.sysj line: 38, column: 2
        thread2351(tdone,ends);
        thread2352(tdone,ends);
        thread2353(tdone,ends);
        thread2354(tdone,ends);
        int biggest2355 = 0;
        if(ends[77]>=biggest2355){
          biggest2355=ends[77];
        }
        if(ends[78]>=biggest2355){
          biggest2355=ends[78];
        }
        if(ends[79]>=biggest2355){
          biggest2355=ends[79];
        }
        if(ends[80]>=biggest2355){
          biggest2355=ends[80];
        }
        if(biggest2355 == 1){
          active[76]=1;
          ends[76]=1;
          tdone[76]=1;
        }
        //FINXME code
        if(biggest2355 == 0){
          S1460=0;
          active[76]=0;
          ends[76]=0;
          tdone[76]=1;
        }
        break;
      
    }
  }

  public void thread2349(int [] tdone, int [] ends){
        active[75]=0;
    ends[75]=0;
    tdone[75]=1;
  }

  public void thread2348(int [] tdone, int [] ends){
        switch(S1462){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        thread2349(tdone,ends);
        thread2350(tdone,ends);
        int biggest2356 = 0;
        if(ends[75]>=biggest2356){
          biggest2356=ends[75];
        }
        if(ends[76]>=biggest2356){
          biggest2356=ends[76];
        }
        if(biggest2356 == 1){
          active[74]=1;
          ends[74]=1;
          tdone[74]=1;
        }
        //FINXME code
        if(biggest2356 == 0){
          S1462=0;
          active[74]=0;
          ends[74]=0;
          tdone[74]=1;
        }
        break;
      
    }
  }

  public void thread2345(int [] tdone, int [] ends){
        switch(S1364){
      case 0 : 
        active[73]=0;
        ends[73]=0;
        tdone[73]=1;
        break;
      
      case 1 : 
        switch(S1342){
          case 0 : 
            if(beginSustain_69.getprestatus()){//sysj/plant.sysj line: 82, column: 11
              S1342=1;
              cap2_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(cap2_1);
              active[73]=1;
              ends[73]=1;
              tdone[73]=1;
            }
            else {
              active[73]=1;
              ends[73]=1;
              tdone[73]=1;
            }
            break;
          
          case 1 : 
            if(endSustain_69.getprestatus()){//sysj/plant.sysj line: 84, column: 10
              S1342=0;
              active[73]=1;
              ends[73]=1;
              tdone[73]=1;
            }
            else {
              cap2_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(cap2_1);
              active[73]=1;
              ends[73]=1;
              tdone[73]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2344(int [] tdone, int [] ends){
        switch(S1332){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        switch(S1298){
          case 0 : 
            if(finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 63, column: 11
              if(cap2_1.getprestatus()){//sysj/plant.sysj line: 65, column: 12
                cap23_1.setPresent();//sysj/plant.sysj line: 66, column: 5
                currsigs.addElement(cap23_1);
                if(cap1_1.getprestatus() && cap12_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_69.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_69);
                  S1298=1;
                  active[72]=1;
                  ends[72]=1;
                  tdone[72]=1;
                }
                else {
                  endSustain_69.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_69);
                  S1298=1;
                  active[72]=1;
                  ends[72]=1;
                  tdone[72]=1;
                }
              }
              else {
                if(cap1_1.getprestatus() && cap12_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_69.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_69);
                  S1298=1;
                  active[72]=1;
                  ends[72]=1;
                  tdone[72]=1;
                }
                else {
                  endSustain_69.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_69);
                  S1298=1;
                  active[72]=1;
                  ends[72]=1;
                  tdone[72]=1;
                }
              }
            }
            else {
              active[72]=1;
              ends[72]=1;
              tdone[72]=1;
            }
            break;
          
          case 1 : 
            if(!finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 75, column: 11
              S1298=0;
              active[72]=1;
              ends[72]=1;
              tdone[72]=1;
            }
            else {
              active[72]=1;
              ends[72]=1;
              tdone[72]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2343(int [] tdone, int [] ends){
        switch(S1294){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
          beginSustain_69.setPresent();//sysj/plant.sysj line: 53, column: 5
          currsigs.addElement(beginSustain_69);
          active[71]=1;
          ends[71]=1;
          tdone[71]=1;
        }
        else {
          active[71]=1;
          ends[71]=1;
          tdone[71]=1;
        }
        break;
      
    }
  }

  public void thread2342(int [] tdone, int [] ends){
        switch(S1286){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
          endSustain_69.setPresent();//sysj/plant.sysj line: 43, column: 5
          currsigs.addElement(endSustain_69);
          active[70]=1;
          ends[70]=1;
          tdone[70]=1;
        }
        else {
          active[70]=1;
          ends[70]=1;
          tdone[70]=1;
        }
        break;
      
    }
  }

  public void thread2341(int [] tdone, int [] ends){
        switch(S1366){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        beginSustain_69.setClear();//sysj/plant.sysj line: 37, column: 2
        endSustain_69.setClear();//sysj/plant.sysj line: 38, column: 2
        thread2342(tdone,ends);
        thread2343(tdone,ends);
        thread2344(tdone,ends);
        thread2345(tdone,ends);
        int biggest2346 = 0;
        if(ends[70]>=biggest2346){
          biggest2346=ends[70];
        }
        if(ends[71]>=biggest2346){
          biggest2346=ends[71];
        }
        if(ends[72]>=biggest2346){
          biggest2346=ends[72];
        }
        if(ends[73]>=biggest2346){
          biggest2346=ends[73];
        }
        if(biggest2346 == 1){
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
        //FINXME code
        if(biggest2346 == 0){
          S1366=0;
          active[69]=0;
          ends[69]=0;
          tdone[69]=1;
        }
        break;
      
    }
  }

  public void thread2340(int [] tdone, int [] ends){
        active[68]=0;
    ends[68]=0;
    tdone[68]=1;
  }

  public void thread2339(int [] tdone, int [] ends){
        switch(S1368){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        thread2340(tdone,ends);
        thread2341(tdone,ends);
        int biggest2347 = 0;
        if(ends[68]>=biggest2347){
          biggest2347=ends[68];
        }
        if(ends[69]>=biggest2347){
          biggest2347=ends[69];
        }
        if(biggest2347 == 1){
          active[67]=1;
          ends[67]=1;
          tdone[67]=1;
        }
        //FINXME code
        if(biggest2347 == 0){
          S1368=0;
          active[67]=0;
          ends[67]=0;
          tdone[67]=1;
        }
        break;
      
    }
  }

  public void thread2336(int [] tdone, int [] ends){
        switch(S1270){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        switch(S1248){
          case 0 : 
            if(beginSustain_62.getprestatus()){//sysj/plant.sysj line: 82, column: 11
              S1248=1;
              cap1_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(cap1_1);
              active[66]=1;
              ends[66]=1;
              tdone[66]=1;
            }
            else {
              active[66]=1;
              ends[66]=1;
              tdone[66]=1;
            }
            break;
          
          case 1 : 
            if(endSustain_62.getprestatus()){//sysj/plant.sysj line: 84, column: 10
              S1248=0;
              active[66]=1;
              ends[66]=1;
              tdone[66]=1;
            }
            else {
              cap1_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(cap1_1);
              active[66]=1;
              ends[66]=1;
              tdone[66]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2335(int [] tdone, int [] ends){
        switch(S1238){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        switch(S1204){
          case 0 : 
            if(finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 63, column: 11
              if(cap1_1.getprestatus()){//sysj/plant.sysj line: 65, column: 12
                cap12_1.setPresent();//sysj/plant.sysj line: 66, column: 5
                currsigs.addElement(cap12_1);
                if(cap6_1.getprestatus() && cap61_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_62.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_62);
                  S1204=1;
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
                else {
                  endSustain_62.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_62);
                  S1204=1;
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
              }
              else {
                if(cap6_1.getprestatus() && cap61_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_62.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_62);
                  S1204=1;
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
                else {
                  endSustain_62.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_62);
                  S1204=1;
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
              }
            }
            else {
              active[65]=1;
              ends[65]=1;
              tdone[65]=1;
            }
            break;
          
          case 1 : 
            if(!finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 75, column: 11
              S1204=0;
              active[65]=1;
              ends[65]=1;
              tdone[65]=1;
            }
            else {
              active[65]=1;
              ends[65]=1;
              tdone[65]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2334(int [] tdone, int [] ends){
        switch(S1200){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
          beginSustain_62.setPresent();//sysj/plant.sysj line: 53, column: 5
          currsigs.addElement(beginSustain_62);
          active[64]=1;
          ends[64]=1;
          tdone[64]=1;
        }
        else {
          active[64]=1;
          ends[64]=1;
          tdone[64]=1;
        }
        break;
      
    }
  }

  public void thread2333(int [] tdone, int [] ends){
        switch(S1192){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        if(removePos1_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
          endSustain_62.setPresent();//sysj/plant.sysj line: 43, column: 5
          currsigs.addElement(endSustain_62);
          active[63]=1;
          ends[63]=1;
          tdone[63]=1;
        }
        else {
          active[63]=1;
          ends[63]=1;
          tdone[63]=1;
        }
        break;
      
    }
  }

  public void thread2332(int [] tdone, int [] ends){
        switch(S1272){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        beginSustain_62.setClear();//sysj/plant.sysj line: 37, column: 2
        endSustain_62.setClear();//sysj/plant.sysj line: 38, column: 2
        thread2333(tdone,ends);
        thread2334(tdone,ends);
        thread2335(tdone,ends);
        thread2336(tdone,ends);
        int biggest2337 = 0;
        if(ends[63]>=biggest2337){
          biggest2337=ends[63];
        }
        if(ends[64]>=biggest2337){
          biggest2337=ends[64];
        }
        if(ends[65]>=biggest2337){
          biggest2337=ends[65];
        }
        if(ends[66]>=biggest2337){
          biggest2337=ends[66];
        }
        if(biggest2337 == 1){
          active[62]=1;
          ends[62]=1;
          tdone[62]=1;
        }
        //FINXME code
        if(biggest2337 == 0){
          S1272=0;
          active[62]=0;
          ends[62]=0;
          tdone[62]=1;
        }
        break;
      
    }
  }

  public void thread2331(int [] tdone, int [] ends){
        active[61]=0;
    ends[61]=0;
    tdone[61]=1;
  }

  public void thread2330(int [] tdone, int [] ends){
        switch(S1274){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        thread2331(tdone,ends);
        thread2332(tdone,ends);
        int biggest2338 = 0;
        if(ends[61]>=biggest2338){
          biggest2338=ends[61];
        }
        if(ends[62]>=biggest2338){
          biggest2338=ends[62];
        }
        if(biggest2338 == 1){
          active[60]=1;
          ends[60]=1;
          tdone[60]=1;
        }
        //FINXME code
        if(biggest2338 == 0){
          S1274=0;
          active[60]=0;
          ends[60]=0;
          tdone[60]=1;
        }
        break;
      
    }
  }

  public void thread2329(int [] tdone, int [] ends){
        switch(S1180){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        if(pos6_1.getprestatus()){//sysj/plant.sysj line: 270, column: 23
          bottleAtPos6.setPresent();//sysj/plant.sysj line: 270, column: 29
          currsigs.addElement(bottleAtPos6);
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
        else {
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
        break;
      
    }
  }

  public void thread2328(int [] tdone, int [] ends){
        switch(S1172){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        if(pos5_1.getprestatus()){//sysj/plant.sysj line: 268, column: 23
          bottleAtPos5.setPresent();//sysj/plant.sysj line: 268, column: 29
          currsigs.addElement(bottleAtPos5);
          active[58]=1;
          ends[58]=1;
          tdone[58]=1;
        }
        else {
          active[58]=1;
          ends[58]=1;
          tdone[58]=1;
        }
        break;
      
    }
  }

  public void thread2327(int [] tdone, int [] ends){
        switch(S1164){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        if(pos4_1.getprestatus()){//sysj/plant.sysj line: 266, column: 23
          bottleAtPos4.setPresent();//sysj/plant.sysj line: 266, column: 29
          currsigs.addElement(bottleAtPos4);
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        else {
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        break;
      
    }
  }

  public void thread2326(int [] tdone, int [] ends){
        switch(S1156){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        if(pos3_1.getprestatus()){//sysj/plant.sysj line: 264, column: 23
          bottleAtPos3.setPresent();//sysj/plant.sysj line: 264, column: 29
          currsigs.addElement(bottleAtPos3);
          active[56]=1;
          ends[56]=1;
          tdone[56]=1;
        }
        else {
          active[56]=1;
          ends[56]=1;
          tdone[56]=1;
        }
        break;
      
    }
  }

  public void thread2325(int [] tdone, int [] ends){
        switch(S1148){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        if(pos2_1.getprestatus()){//sysj/plant.sysj line: 262, column: 23
          bottleAtPos2.setPresent();//sysj/plant.sysj line: 262, column: 29
          currsigs.addElement(bottleAtPos2);
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
        break;
      
    }
  }

  public void thread2324(int [] tdone, int [] ends){
        switch(S1140){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        if(pos1_1.getprestatus()){//sysj/plant.sysj line: 260, column: 23
          bottleAtPos1.setPresent();//sysj/plant.sysj line: 260, column: 29
          currsigs.addElement(bottleAtPos1);
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
        else {
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
        break;
      
    }
  }

  public void thread2321(int [] tdone, int [] ends){
        switch(S1128){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        switch(S1106){
          case 0 : 
            if(beginSustain_49.getprestatus()){//sysj/plant.sysj line: 82, column: 11
              S1106=1;
              pos6_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(pos6_1);
              active[53]=1;
              ends[53]=1;
              tdone[53]=1;
            }
            else {
              active[53]=1;
              ends[53]=1;
              tdone[53]=1;
            }
            break;
          
          case 1 : 
            if(endSustain_49.getprestatus()){//sysj/plant.sysj line: 84, column: 10
              S1106=0;
              active[53]=1;
              ends[53]=1;
              tdone[53]=1;
            }
            else {
              pos6_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(pos6_1);
              active[53]=1;
              ends[53]=1;
              tdone[53]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2320(int [] tdone, int [] ends){
        switch(S1096){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        switch(S1062){
          case 0 : 
            if(finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 63, column: 11
              if(pos6_1.getprestatus()){//sysj/plant.sysj line: 65, column: 12
                pos61_1.setPresent();//sysj/plant.sysj line: 66, column: 5
                currsigs.addElement(pos61_1);
                if(pos5_1.getprestatus() && pos56_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_49.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_49);
                  S1062=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  endSustain_49.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_49);
                  S1062=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
              else {
                if(pos5_1.getprestatus() && pos56_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_49.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_49);
                  S1062=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  endSustain_49.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_49);
                  S1062=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 1 : 
            if(!finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 75, column: 11
              S1062=0;
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2319(int [] tdone, int [] ends){
        switch(S1058){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
          beginSustain_49.setPresent();//sysj/plant.sysj line: 53, column: 5
          currsigs.addElement(beginSustain_49);
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
        break;
      
    }
  }

  public void thread2318(int [] tdone, int [] ends){
        switch(S1050){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
          endSustain_49.setPresent();//sysj/plant.sysj line: 43, column: 5
          currsigs.addElement(endSustain_49);
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        else {
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        break;
      
    }
  }

  public void thread2317(int [] tdone, int [] ends){
        switch(S1130){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        beginSustain_49.setClear();//sysj/plant.sysj line: 37, column: 2
        endSustain_49.setClear();//sysj/plant.sysj line: 38, column: 2
        thread2318(tdone,ends);
        thread2319(tdone,ends);
        thread2320(tdone,ends);
        thread2321(tdone,ends);
        int biggest2322 = 0;
        if(ends[50]>=biggest2322){
          biggest2322=ends[50];
        }
        if(ends[51]>=biggest2322){
          biggest2322=ends[51];
        }
        if(ends[52]>=biggest2322){
          biggest2322=ends[52];
        }
        if(ends[53]>=biggest2322){
          biggest2322=ends[53];
        }
        if(biggest2322 == 1){
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        //FINXME code
        if(biggest2322 == 0){
          S1130=0;
          active[49]=0;
          ends[49]=0;
          tdone[49]=1;
        }
        break;
      
    }
  }

  public void thread2316(int [] tdone, int [] ends){
        active[48]=0;
    ends[48]=0;
    tdone[48]=1;
  }

  public void thread2315(int [] tdone, int [] ends){
        switch(S1132){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        thread2316(tdone,ends);
        thread2317(tdone,ends);
        int biggest2323 = 0;
        if(ends[48]>=biggest2323){
          biggest2323=ends[48];
        }
        if(ends[49]>=biggest2323){
          biggest2323=ends[49];
        }
        if(biggest2323 == 1){
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        //FINXME code
        if(biggest2323 == 0){
          S1132=0;
          active[47]=0;
          ends[47]=0;
          tdone[47]=1;
        }
        break;
      
    }
  }

  public void thread2312(int [] tdone, int [] ends){
        switch(S1034){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        switch(S1012){
          case 0 : 
            if(beginSustain_42.getprestatus()){//sysj/plant.sysj line: 82, column: 11
              S1012=1;
              pos5_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(pos5_1);
              active[46]=1;
              ends[46]=1;
              tdone[46]=1;
            }
            else {
              active[46]=1;
              ends[46]=1;
              tdone[46]=1;
            }
            break;
          
          case 1 : 
            if(endSustain_42.getprestatus()){//sysj/plant.sysj line: 84, column: 10
              S1012=0;
              active[46]=1;
              ends[46]=1;
              tdone[46]=1;
            }
            else {
              pos5_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(pos5_1);
              active[46]=1;
              ends[46]=1;
              tdone[46]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2311(int [] tdone, int [] ends){
        switch(S1002){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        switch(S968){
          case 0 : 
            if(finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 63, column: 11
              if(pos5_1.getprestatus()){//sysj/plant.sysj line: 65, column: 12
                pos56_1.setPresent();//sysj/plant.sysj line: 66, column: 5
                currsigs.addElement(pos56_1);
                if(pos4_1.getprestatus() && pos45_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_42.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_42);
                  S968=1;
                  active[45]=1;
                  ends[45]=1;
                  tdone[45]=1;
                }
                else {
                  endSustain_42.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_42);
                  S968=1;
                  active[45]=1;
                  ends[45]=1;
                  tdone[45]=1;
                }
              }
              else {
                if(pos4_1.getprestatus() && pos45_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_42.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_42);
                  S968=1;
                  active[45]=1;
                  ends[45]=1;
                  tdone[45]=1;
                }
                else {
                  endSustain_42.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_42);
                  S968=1;
                  active[45]=1;
                  ends[45]=1;
                  tdone[45]=1;
                }
              }
            }
            else {
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
          case 1 : 
            if(!finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 75, column: 11
              S968=0;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            else {
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2310(int [] tdone, int [] ends){
        switch(S964){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
          beginSustain_42.setPresent();//sysj/plant.sysj line: 53, column: 5
          currsigs.addElement(beginSustain_42);
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        break;
      
    }
  }

  public void thread2309(int [] tdone, int [] ends){
        switch(S956){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        if(pos5ToConveyor_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
          endSustain_42.setPresent();//sysj/plant.sysj line: 43, column: 5
          currsigs.addElement(endSustain_42);
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        break;
      
    }
  }

  public void thread2308(int [] tdone, int [] ends){
        switch(S1036){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        beginSustain_42.setClear();//sysj/plant.sysj line: 37, column: 2
        endSustain_42.setClear();//sysj/plant.sysj line: 38, column: 2
        thread2309(tdone,ends);
        thread2310(tdone,ends);
        thread2311(tdone,ends);
        thread2312(tdone,ends);
        int biggest2313 = 0;
        if(ends[43]>=biggest2313){
          biggest2313=ends[43];
        }
        if(ends[44]>=biggest2313){
          biggest2313=ends[44];
        }
        if(ends[45]>=biggest2313){
          biggest2313=ends[45];
        }
        if(ends[46]>=biggest2313){
          biggest2313=ends[46];
        }
        if(biggest2313 == 1){
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        //FINXME code
        if(biggest2313 == 0){
          S1036=0;
          active[42]=0;
          ends[42]=0;
          tdone[42]=1;
        }
        break;
      
    }
  }

  public void thread2307(int [] tdone, int [] ends){
        active[41]=0;
    ends[41]=0;
    tdone[41]=1;
  }

  public void thread2306(int [] tdone, int [] ends){
        switch(S1038){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        thread2307(tdone,ends);
        thread2308(tdone,ends);
        int biggest2314 = 0;
        if(ends[41]>=biggest2314){
          biggest2314=ends[41];
        }
        if(ends[42]>=biggest2314){
          biggest2314=ends[42];
        }
        if(biggest2314 == 1){
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        //FINXME code
        if(biggest2314 == 0){
          S1038=0;
          active[40]=0;
          ends[40]=0;
          tdone[40]=1;
        }
        break;
      
    }
  }

  public void thread2303(int [] tdone, int [] ends){
        switch(S940){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        switch(S918){
          case 0 : 
            if(beginSustain_35.getprestatus()){//sysj/plant.sysj line: 82, column: 11
              S918=1;
              pos4_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(pos4_1);
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            else {
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            break;
          
          case 1 : 
            if(endSustain_35.getprestatus()){//sysj/plant.sysj line: 84, column: 10
              S918=0;
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            else {
              pos4_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(pos4_1);
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2302(int [] tdone, int [] ends){
        switch(S908){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S874){
          case 0 : 
            if(finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 63, column: 11
              if(pos4_1.getprestatus()){//sysj/plant.sysj line: 65, column: 12
                pos45_1.setPresent();//sysj/plant.sysj line: 66, column: 5
                currsigs.addElement(pos45_1);
                if(pos3_1.getprestatus() && pos34_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_35.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_35);
                  S874=1;
                  active[38]=1;
                  ends[38]=1;
                  tdone[38]=1;
                }
                else {
                  endSustain_35.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_35);
                  S874=1;
                  active[38]=1;
                  ends[38]=1;
                  tdone[38]=1;
                }
              }
              else {
                if(pos3_1.getprestatus() && pos34_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_35.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_35);
                  S874=1;
                  active[38]=1;
                  ends[38]=1;
                  tdone[38]=1;
                }
                else {
                  endSustain_35.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_35);
                  S874=1;
                  active[38]=1;
                  ends[38]=1;
                  tdone[38]=1;
                }
              }
            }
            else {
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 1 : 
            if(!finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 75, column: 11
              S874=0;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            else {
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2301(int [] tdone, int [] ends){
        switch(S870){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(capperPos4_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
          beginSustain_35.setPresent();//sysj/plant.sysj line: 53, column: 5
          currsigs.addElement(beginSustain_35);
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        break;
      
    }
  }

  public void thread2300(int [] tdone, int [] ends){
        switch(S862){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
          endSustain_35.setPresent();//sysj/plant.sysj line: 43, column: 5
          currsigs.addElement(endSustain_35);
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        break;
      
    }
  }

  public void thread2299(int [] tdone, int [] ends){
        switch(S942){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        beginSustain_35.setClear();//sysj/plant.sysj line: 37, column: 2
        endSustain_35.setClear();//sysj/plant.sysj line: 38, column: 2
        thread2300(tdone,ends);
        thread2301(tdone,ends);
        thread2302(tdone,ends);
        thread2303(tdone,ends);
        int biggest2304 = 0;
        if(ends[36]>=biggest2304){
          biggest2304=ends[36];
        }
        if(ends[37]>=biggest2304){
          biggest2304=ends[37];
        }
        if(ends[38]>=biggest2304){
          biggest2304=ends[38];
        }
        if(ends[39]>=biggest2304){
          biggest2304=ends[39];
        }
        if(biggest2304 == 1){
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        //FINXME code
        if(biggest2304 == 0){
          S942=0;
          active[35]=0;
          ends[35]=0;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread2298(int [] tdone, int [] ends){
        active[34]=0;
    ends[34]=0;
    tdone[34]=1;
  }

  public void thread2297(int [] tdone, int [] ends){
        switch(S944){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        thread2298(tdone,ends);
        thread2299(tdone,ends);
        int biggest2305 = 0;
        if(ends[34]>=biggest2305){
          biggest2305=ends[34];
        }
        if(ends[35]>=biggest2305){
          biggest2305=ends[35];
        }
        if(biggest2305 == 1){
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        //FINXME code
        if(biggest2305 == 0){
          S944=0;
          active[33]=0;
          ends[33]=0;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread2294(int [] tdone, int [] ends){
        switch(S846){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        switch(S824){
          case 0 : 
            if(beginSustain_28.getprestatus()){//sysj/plant.sysj line: 82, column: 11
              S824=1;
              pos3_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(pos3_1);
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            else {
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
          case 1 : 
            if(endSustain_28.getprestatus()){//sysj/plant.sysj line: 84, column: 10
              S824=0;
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            else {
              pos3_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(pos3_1);
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2293(int [] tdone, int [] ends){
        switch(S814){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        switch(S780){
          case 0 : 
            if(finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 63, column: 11
              if(pos3_1.getprestatus()){//sysj/plant.sysj line: 65, column: 12
                pos34_1.setPresent();//sysj/plant.sysj line: 66, column: 5
                currsigs.addElement(pos34_1);
                if(pos2_1.getprestatus() && pos23_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_28.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_28);
                  S780=1;
                  active[31]=1;
                  ends[31]=1;
                  tdone[31]=1;
                }
                else {
                  endSustain_28.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_28);
                  S780=1;
                  active[31]=1;
                  ends[31]=1;
                  tdone[31]=1;
                }
              }
              else {
                if(pos2_1.getprestatus() && pos23_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_28.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_28);
                  S780=1;
                  active[31]=1;
                  ends[31]=1;
                  tdone[31]=1;
                }
                else {
                  endSustain_28.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_28);
                  S780=1;
                  active[31]=1;
                  ends[31]=1;
                  tdone[31]=1;
                }
              }
            }
            else {
              active[31]=1;
              ends[31]=1;
              tdone[31]=1;
            }
            break;
          
          case 1 : 
            if(!finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 75, column: 11
              S780=0;
              active[31]=1;
              ends[31]=1;
              tdone[31]=1;
            }
            else {
              active[31]=1;
              ends[31]=1;
              tdone[31]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2292(int [] tdone, int [] ends){
        switch(S776){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
          beginSustain_28.setPresent();//sysj/plant.sysj line: 53, column: 5
          currsigs.addElement(beginSustain_28);
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        break;
      
    }
  }

  public void thread2291(int [] tdone, int [] ends){
        switch(S768){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
          endSustain_28.setPresent();//sysj/plant.sysj line: 43, column: 5
          currsigs.addElement(endSustain_28);
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread2290(int [] tdone, int [] ends){
        switch(S848){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        beginSustain_28.setClear();//sysj/plant.sysj line: 37, column: 2
        endSustain_28.setClear();//sysj/plant.sysj line: 38, column: 2
        thread2291(tdone,ends);
        thread2292(tdone,ends);
        thread2293(tdone,ends);
        thread2294(tdone,ends);
        int biggest2295 = 0;
        if(ends[29]>=biggest2295){
          biggest2295=ends[29];
        }
        if(ends[30]>=biggest2295){
          biggest2295=ends[30];
        }
        if(ends[31]>=biggest2295){
          biggest2295=ends[31];
        }
        if(ends[32]>=biggest2295){
          biggest2295=ends[32];
        }
        if(biggest2295 == 1){
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        //FINXME code
        if(biggest2295 == 0){
          S848=0;
          active[28]=0;
          ends[28]=0;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread2289(int [] tdone, int [] ends){
        active[27]=0;
    ends[27]=0;
    tdone[27]=1;
  }

  public void thread2288(int [] tdone, int [] ends){
        switch(S850){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        thread2289(tdone,ends);
        thread2290(tdone,ends);
        int biggest2296 = 0;
        if(ends[27]>=biggest2296){
          biggest2296=ends[27];
        }
        if(ends[28]>=biggest2296){
          biggest2296=ends[28];
        }
        if(biggest2296 == 1){
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        //FINXME code
        if(biggest2296 == 0){
          S850=0;
          active[26]=0;
          ends[26]=0;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread2285(int [] tdone, int [] ends){
        switch(S752){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S730){
          case 0 : 
            if(beginSustain_21.getprestatus()){//sysj/plant.sysj line: 82, column: 11
              S730=1;
              pos2_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(pos2_1);
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
          case 1 : 
            if(endSustain_21.getprestatus()){//sysj/plant.sysj line: 84, column: 10
              S730=0;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              pos2_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(pos2_1);
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2284(int [] tdone, int [] ends){
        switch(S720){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S686){
          case 0 : 
            if(finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 63, column: 11
              if(pos2_1.getprestatus()){//sysj/plant.sysj line: 65, column: 12
                pos23_1.setPresent();//sysj/plant.sysj line: 66, column: 5
                currsigs.addElement(pos23_1);
                if(pos1_1.getprestatus() && pos12_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_21.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_21);
                  S686=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  endSustain_21.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_21);
                  S686=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
              }
              else {
                if(pos1_1.getprestatus() && pos12_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_21.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_21);
                  S686=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  endSustain_21.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_21);
                  S686=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
              }
            }
            else {
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 1 : 
            if(!finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 75, column: 11
              S686=0;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2283(int [] tdone, int [] ends){
        switch(S682){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
          beginSustain_21.setPresent();//sysj/plant.sysj line: 53, column: 5
          currsigs.addElement(beginSustain_21);
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread2282(int [] tdone, int [] ends){
        switch(S674){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
          endSustain_21.setPresent();//sysj/plant.sysj line: 43, column: 5
          currsigs.addElement(endSustain_21);
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        break;
      
    }
  }

  public void thread2281(int [] tdone, int [] ends){
        switch(S754){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        beginSustain_21.setClear();//sysj/plant.sysj line: 37, column: 2
        endSustain_21.setClear();//sysj/plant.sysj line: 38, column: 2
        thread2282(tdone,ends);
        thread2283(tdone,ends);
        thread2284(tdone,ends);
        thread2285(tdone,ends);
        int biggest2286 = 0;
        if(ends[22]>=biggest2286){
          biggest2286=ends[22];
        }
        if(ends[23]>=biggest2286){
          biggest2286=ends[23];
        }
        if(ends[24]>=biggest2286){
          biggest2286=ends[24];
        }
        if(ends[25]>=biggest2286){
          biggest2286=ends[25];
        }
        if(biggest2286 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest2286 == 0){
          S754=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread2280(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread2279(int [] tdone, int [] ends){
        switch(S756){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        thread2280(tdone,ends);
        thread2281(tdone,ends);
        int biggest2287 = 0;
        if(ends[20]>=biggest2287){
          biggest2287=ends[20];
        }
        if(ends[21]>=biggest2287){
          biggest2287=ends[21];
        }
        if(biggest2287 == 1){
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        //FINXME code
        if(biggest2287 == 0){
          S756=0;
          active[19]=0;
          ends[19]=0;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread2276(int [] tdone, int [] ends){
        switch(S658){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S636){
          case 0 : 
            if(beginSustain_14.getprestatus()){//sysj/plant.sysj line: 82, column: 11
              S636=1;
              pos1_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(pos1_1);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 1 : 
            if(endSustain_14.getprestatus()){//sysj/plant.sysj line: 84, column: 10
              S636=0;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              pos1_1.setPresent();//sysj/plant.sysj line: 85, column: 5
              currsigs.addElement(pos1_1);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2275(int [] tdone, int [] ends){
        switch(S626){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S592){
          case 0 : 
            if(finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 63, column: 11
              if(pos1_1.getprestatus()){//sysj/plant.sysj line: 65, column: 12
                pos12_1.setPresent();//sysj/plant.sysj line: 66, column: 5
                currsigs.addElement(pos12_1);
                if(pos6_1.getprestatus() && pos61_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_14.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_14);
                  S592=1;
                  active[17]=1;
                  ends[17]=1;
                  tdone[17]=1;
                }
                else {
                  endSustain_14.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_14);
                  S592=1;
                  active[17]=1;
                  ends[17]=1;
                  tdone[17]=1;
                }
              }
              else {
                if(pos6_1.getprestatus() && pos61_1.getprestatus()){//sysj/plant.sysj line: 69, column: 12
                  beginSustain_14.setPresent();//sysj/plant.sysj line: 70, column: 5
                  currsigs.addElement(beginSustain_14);
                  S592=1;
                  active[17]=1;
                  ends[17]=1;
                  tdone[17]=1;
                }
                else {
                  endSustain_14.setPresent();//sysj/plant.sysj line: 72, column: 5
                  currsigs.addElement(endSustain_14);
                  S592=1;
                  active[17]=1;
                  ends[17]=1;
                  tdone[17]=1;
                }
              }
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            if(!finishedRotating_1.getprestatus()){//sysj/plant.sysj line: 75, column: 11
              S592=0;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2274(int [] tdone, int [] ends){
        switch(S588){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(conveyorToPos1_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
          beginSustain_14.setPresent();//sysj/plant.sysj line: 53, column: 5
          currsigs.addElement(beginSustain_14);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread2273(int [] tdone, int [] ends){
        switch(S580){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(removePos1_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
          endSustain_14.setPresent();//sysj/plant.sysj line: 43, column: 5
          currsigs.addElement(endSustain_14);
          active[15]=1;
          ends[15]=1;
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

  public void thread2272(int [] tdone, int [] ends){
        switch(S660){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        beginSustain_14.setClear();//sysj/plant.sysj line: 37, column: 2
        endSustain_14.setClear();//sysj/plant.sysj line: 38, column: 2
        thread2273(tdone,ends);
        thread2274(tdone,ends);
        thread2275(tdone,ends);
        thread2276(tdone,ends);
        int biggest2277 = 0;
        if(ends[15]>=biggest2277){
          biggest2277=ends[15];
        }
        if(ends[16]>=biggest2277){
          biggest2277=ends[16];
        }
        if(ends[17]>=biggest2277){
          biggest2277=ends[17];
        }
        if(ends[18]>=biggest2277){
          biggest2277=ends[18];
        }
        if(biggest2277 == 1){
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        //FINXME code
        if(biggest2277 == 0){
          S660=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread2271(int [] tdone, int [] ends){
        active[13]=0;
    ends[13]=0;
    tdone[13]=1;
  }

  public void thread2270(int [] tdone, int [] ends){
        switch(S662){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        thread2271(tdone,ends);
        thread2272(tdone,ends);
        int biggest2278 = 0;
        if(ends[13]>=biggest2278){
          biggest2278=ends[13];
        }
        if(ends[14]>=biggest2278){
          biggest2278=ends[14];
        }
        if(biggest2278 == 1){
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        //FINXME code
        if(biggest2278 == 0){
          S662=0;
          active[12]=0;
          ends[12]=0;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread2269(int [] tdone, int [] ends){
        switch(S568){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S472){
          case 0 : 
            switch(S432){
              case 0 : 
                if(!sentPos5_o.isPartnerPresent() || sentPos5_o.isPartnerPreempted()){//sysj/plant.sysj line: 180, column: 5
                  sentPos5_o.setREQ(false);//sysj/plant.sysj line: 180, column: 5
                  S432=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S427){
                    case 0 : 
                      if(sentPos5_o.isACK()){//sysj/plant.sysj line: 180, column: 5
                        sentPos5_o.setVal(true);//sysj/plant.sysj line: 180, column: 5
                        S427=1;
                        if(!sentPos5_o.isACK()){//sysj/plant.sysj line: 180, column: 5
                          sentPos5_o.setREQ(false);//sysj/plant.sysj line: 180, column: 5
                          ends[11]=2;
                          ;//sysj/plant.sysj line: 180, column: 5
                          S472=1;
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
                      else {
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!sentPos5_o.isACK()){//sysj/plant.sysj line: 180, column: 5
                        sentPos5_o.setREQ(false);//sysj/plant.sysj line: 180, column: 5
                        ends[11]=2;
                        ;//sysj/plant.sysj line: 180, column: 5
                        S472=1;
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
                break;
              
              case 1 : 
                S432=1;
                S432=0;
                if(!sentPos5_o.isPartnerPresent() || sentPos5_o.isPartnerPreempted()){//sysj/plant.sysj line: 180, column: 5
                  sentPos5_o.setREQ(false);//sysj/plant.sysj line: 180, column: 5
                  S432=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S427=0;
                  if(sentPos5_o.isACK()){//sysj/plant.sysj line: 180, column: 5
                    sentPos5_o.setVal(true);//sysj/plant.sysj line: 180, column: 5
                    S427=1;
                    if(!sentPos5_o.isACK()){//sysj/plant.sysj line: 180, column: 5
                      sentPos5_o.setREQ(false);//sysj/plant.sysj line: 180, column: 5
                      ends[11]=2;
                      ;//sysj/plant.sysj line: 180, column: 5
                      S472=1;
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
                  else {
                    active[11]=1;
                    ends[11]=1;
                    tdone[11]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S472=1;
            S472=0;
            if(pos5_1.getprestatus() && conveyorActive_1.getprestatus()){//sysj/plant.sysj line: 178, column: 12
              pos5ToConveyor_1.setPresent();//sysj/plant.sysj line: 179, column: 5
              currsigs.addElement(pos5ToConveyor_1);
              S432=0;
              if(!sentPos5_o.isPartnerPresent() || sentPos5_o.isPartnerPreempted()){//sysj/plant.sysj line: 180, column: 5
                sentPos5_o.setREQ(false);//sysj/plant.sysj line: 180, column: 5
                S432=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S427=0;
                if(sentPos5_o.isACK()){//sysj/plant.sysj line: 180, column: 5
                  sentPos5_o.setVal(true);//sysj/plant.sysj line: 180, column: 5
                  S427=1;
                  if(!sentPos5_o.isACK()){//sysj/plant.sysj line: 180, column: 5
                    sentPos5_o.setREQ(false);//sysj/plant.sysj line: 180, column: 5
                    ends[11]=2;
                    ;//sysj/plant.sysj line: 180, column: 5
                    S472=1;
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
                else {
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
              }
            }
            else {
              S472=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2268(int [] tdone, int [] ends){
        switch(S425){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S329){
          case 0 : 
            switch(S289){
              case 0 : 
                if(!receivedPos1_o.isPartnerPresent() || receivedPos1_o.isPartnerPreempted()){//sysj/plant.sysj line: 167, column: 5
                  receivedPos1_o.setREQ(false);//sysj/plant.sysj line: 167, column: 5
                  S289=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S284){
                    case 0 : 
                      if(receivedPos1_o.isACK()){//sysj/plant.sysj line: 167, column: 5
                        receivedPos1_o.setVal(true);//sysj/plant.sysj line: 167, column: 5
                        S284=1;
                        if(!receivedPos1_o.isACK()){//sysj/plant.sysj line: 167, column: 5
                          receivedPos1_o.setREQ(false);//sysj/plant.sysj line: 167, column: 5
                          ends[10]=2;
                          ;//sysj/plant.sysj line: 167, column: 5
                          S329=1;
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
                      else {
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!receivedPos1_o.isACK()){//sysj/plant.sysj line: 167, column: 5
                        receivedPos1_o.setREQ(false);//sysj/plant.sysj line: 167, column: 5
                        ends[10]=2;
                        ;//sysj/plant.sysj line: 167, column: 5
                        S329=1;
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
                break;
              
              case 1 : 
                S289=1;
                S289=0;
                if(!receivedPos1_o.isPartnerPresent() || receivedPos1_o.isPartnerPreempted()){//sysj/plant.sysj line: 167, column: 5
                  receivedPos1_o.setREQ(false);//sysj/plant.sysj line: 167, column: 5
                  S289=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S284=0;
                  if(receivedPos1_o.isACK()){//sysj/plant.sysj line: 167, column: 5
                    receivedPos1_o.setVal(true);//sysj/plant.sysj line: 167, column: 5
                    S284=1;
                    if(!receivedPos1_o.isACK()){//sysj/plant.sysj line: 167, column: 5
                      receivedPos1_o.setREQ(false);//sysj/plant.sysj line: 167, column: 5
                      ends[10]=2;
                      ;//sysj/plant.sysj line: 167, column: 5
                      S329=1;
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
                  else {
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S329=1;
            S329=0;
            if(!pos1_1.getprestatus() && conveyorActive_1.getprestatus() && conveyorBottleBeforePos1_1.getprestatus() && !rotationInProgress_1.getprestatus()){//sysj/plant.sysj line: 165, column: 12
              conveyorToPos1_1.setPresent();//sysj/plant.sysj line: 166, column: 5
              currsigs.addElement(conveyorToPos1_1);
              S289=0;
              if(!receivedPos1_o.isPartnerPresent() || receivedPos1_o.isPartnerPreempted()){//sysj/plant.sysj line: 167, column: 5
                receivedPos1_o.setREQ(false);//sysj/plant.sysj line: 167, column: 5
                S289=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S284=0;
                if(receivedPos1_o.isACK()){//sysj/plant.sysj line: 167, column: 5
                  receivedPos1_o.setVal(true);//sysj/plant.sysj line: 167, column: 5
                  S284=1;
                  if(!receivedPos1_o.isACK()){//sysj/plant.sysj line: 167, column: 5
                    receivedPos1_o.setREQ(false);//sysj/plant.sysj line: 167, column: 5
                    ends[10]=2;
                    ;//sysj/plant.sysj line: 167, column: 5
                    S329=1;
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
                else {
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
              }
            }
            else {
              S329=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2267(int [] tdone, int [] ends){
        switch(S282){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(manualRemovePos1.getprestatus()){//sysj/plant.sysj line: 154, column: 12
          removePos1_1.setPresent();//sysj/plant.sysj line: 155, column: 5
          currsigs.addElement(removePos1_1);
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

  public void thread2266(int [] tdone, int [] ends){
        switch(S274){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S268){
          case 0 : 
            S268=0;
            if(!rotationInProgress_1.getprestatus()){//sysj/plant.sysj line: 144, column: 12
              tableAlignedWithSensor.setPresent();//sysj/plant.sysj line: 145, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              S268=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S268=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S268=1;
            S268=0;
            if(!rotationInProgress_1.getprestatus()){//sysj/plant.sysj line: 144, column: 12
              tableAlignedWithSensor.setPresent();//sysj/plant.sysj line: 145, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              S268=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S268=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2264(int [] tdone, int [] ends){
        switch(S254){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        rotationInProgress_1.setPresent();//sysj/plant.sysj line: 135, column: 5
        currsigs.addElement(rotationInProgress_1);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread2263(int [] tdone, int [] ends){
        switch(S249){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(!rotaryTableTrigger.getprestatus()){//sysj/plant.sysj line: 130, column: 11
          ends[6]=2;
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

  public void thread2261(int [] tdone, int [] ends){
        S254=1;
    rotationInProgress_1.setPresent();//sysj/plant.sysj line: 135, column: 5
    currsigs.addElement(rotationInProgress_1);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2260(int [] tdone, int [] ends){
        S249=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2259(int [] tdone, int [] ends){
        switch(S266){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S265){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj/plant.sysj line: 126, column: 9
              S265=1;
              thread2260(tdone,ends);
              thread2261(tdone,ends);
              int biggest2262 = 0;
              if(ends[6]>=biggest2262){
                biggest2262=ends[6];
              }
              if(ends[7]>=biggest2262){
                biggest2262=ends[7];
              }
              if(biggest2262 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            thread2263(tdone,ends);
            thread2264(tdone,ends);
            int biggest2265 = 0;
            if(ends[6]>=biggest2265){
              biggest2265=ends[6];
            }
            if(ends[7]>=biggest2265){
              biggest2265=ends[7];
            }
            if(biggest2265 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest2265 == 2){
              ends[5]=2;
              ;//sysj/plant.sysj line: 128, column: 3
              finishedRotating_1.setPresent();//sysj/plant.sysj line: 139, column: 3
              currsigs.addElement(finishedRotating_1);
              S266=0;
              active[5]=0;
              ends[5]=0;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest2265 == 0){
              finishedRotating_1.setPresent();//sysj/plant.sysj line: 139, column: 3
              currsigs.addElement(finishedRotating_1);
              S266=0;
              active[5]=0;
              ends[5]=0;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2258(int [] tdone, int [] ends){
        switch(S245){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S197){
          case 0 : 
            switch(S181){
              case 0 : 
                if(!plantCapperPos4_in.isPartnerPresent() || plantCapperPos4_in.isPartnerPreempted()){//sysj/plant.sysj line: 122, column: 17
                  plantCapperPos4_in.setACK(false);//sysj/plant.sysj line: 122, column: 17
                  S181=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S176){
                    case 0 : 
                      if(!plantCapperPos4_in.isREQ()){//sysj/plant.sysj line: 122, column: 17
                        plantCapperPos4_in.setACK(true);//sysj/plant.sysj line: 122, column: 17
                        S176=1;
                        if(plantCapperPos4_in.isREQ()){//sysj/plant.sysj line: 122, column: 17
                          plantCapperPos4_in.setACK(false);//sysj/plant.sysj line: 122, column: 17
                          ends[4]=2;
                          ;//sysj/plant.sysj line: 122, column: 17
                          capperPos4_1.setPresent();//sysj/plant.sysj line: 122, column: 42
                          currsigs.addElement(capperPos4_1);
                          S197=1;
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
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(plantCapperPos4_in.isREQ()){//sysj/plant.sysj line: 122, column: 17
                        plantCapperPos4_in.setACK(false);//sysj/plant.sysj line: 122, column: 17
                        ends[4]=2;
                        ;//sysj/plant.sysj line: 122, column: 17
                        capperPos4_1.setPresent();//sysj/plant.sysj line: 122, column: 42
                        currsigs.addElement(capperPos4_1);
                        S197=1;
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
                break;
              
              case 1 : 
                S181=1;
                S181=0;
                if(!plantCapperPos4_in.isPartnerPresent() || plantCapperPos4_in.isPartnerPreempted()){//sysj/plant.sysj line: 122, column: 17
                  plantCapperPos4_in.setACK(false);//sysj/plant.sysj line: 122, column: 17
                  S181=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S176=0;
                  if(!plantCapperPos4_in.isREQ()){//sysj/plant.sysj line: 122, column: 17
                    plantCapperPos4_in.setACK(true);//sysj/plant.sysj line: 122, column: 17
                    S176=1;
                    if(plantCapperPos4_in.isREQ()){//sysj/plant.sysj line: 122, column: 17
                      plantCapperPos4_in.setACK(false);//sysj/plant.sysj line: 122, column: 17
                      ends[4]=2;
                      ;//sysj/plant.sysj line: 122, column: 17
                      capperPos4_1.setPresent();//sysj/plant.sysj line: 122, column: 42
                      currsigs.addElement(capperPos4_1);
                      S197=1;
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
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S197=1;
            S197=0;
            S181=0;
            if(!plantCapperPos4_in.isPartnerPresent() || plantCapperPos4_in.isPartnerPreempted()){//sysj/plant.sysj line: 122, column: 17
              plantCapperPos4_in.setACK(false);//sysj/plant.sysj line: 122, column: 17
              S181=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S176=0;
              if(!plantCapperPos4_in.isREQ()){//sysj/plant.sysj line: 122, column: 17
                plantCapperPos4_in.setACK(true);//sysj/plant.sysj line: 122, column: 17
                S176=1;
                if(plantCapperPos4_in.isREQ()){//sysj/plant.sysj line: 122, column: 17
                  plantCapperPos4_in.setACK(false);//sysj/plant.sysj line: 122, column: 17
                  ends[4]=2;
                  ;//sysj/plant.sysj line: 122, column: 17
                  capperPos4_1.setPresent();//sysj/plant.sysj line: 122, column: 42
                  currsigs.addElement(capperPos4_1);
                  S197=1;
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
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2257(int [] tdone, int [] ends){
        switch(S174){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S126){
          case 0 : 
            switch(S110){
              case 0 : 
                if(!plantConveyorBottleBeforePos1_in.isPartnerPresent() || plantConveyorBottleBeforePos1_in.isPartnerPreempted()){//sysj/plant.sysj line: 120, column: 17
                  plantConveyorBottleBeforePos1_in.setACK(false);//sysj/plant.sysj line: 120, column: 17
                  S110=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S105){
                    case 0 : 
                      if(!plantConveyorBottleBeforePos1_in.isREQ()){//sysj/plant.sysj line: 120, column: 17
                        plantConveyorBottleBeforePos1_in.setACK(true);//sysj/plant.sysj line: 120, column: 17
                        S105=1;
                        if(plantConveyorBottleBeforePos1_in.isREQ()){//sysj/plant.sysj line: 120, column: 17
                          plantConveyorBottleBeforePos1_in.setACK(false);//sysj/plant.sysj line: 120, column: 17
                          ends[3]=2;
                          ;//sysj/plant.sysj line: 120, column: 17
                          conveyorBottleBeforePos1_1.setPresent();//sysj/plant.sysj line: 120, column: 56
                          currsigs.addElement(conveyorBottleBeforePos1_1);
                          S126=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(plantConveyorBottleBeforePos1_in.isREQ()){//sysj/plant.sysj line: 120, column: 17
                        plantConveyorBottleBeforePos1_in.setACK(false);//sysj/plant.sysj line: 120, column: 17
                        ends[3]=2;
                        ;//sysj/plant.sysj line: 120, column: 17
                        conveyorBottleBeforePos1_1.setPresent();//sysj/plant.sysj line: 120, column: 56
                        currsigs.addElement(conveyorBottleBeforePos1_1);
                        S126=1;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S110=1;
                S110=0;
                if(!plantConveyorBottleBeforePos1_in.isPartnerPresent() || plantConveyorBottleBeforePos1_in.isPartnerPreempted()){//sysj/plant.sysj line: 120, column: 17
                  plantConveyorBottleBeforePos1_in.setACK(false);//sysj/plant.sysj line: 120, column: 17
                  S110=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S105=0;
                  if(!plantConveyorBottleBeforePos1_in.isREQ()){//sysj/plant.sysj line: 120, column: 17
                    plantConveyorBottleBeforePos1_in.setACK(true);//sysj/plant.sysj line: 120, column: 17
                    S105=1;
                    if(plantConveyorBottleBeforePos1_in.isREQ()){//sysj/plant.sysj line: 120, column: 17
                      plantConveyorBottleBeforePos1_in.setACK(false);//sysj/plant.sysj line: 120, column: 17
                      ends[3]=2;
                      ;//sysj/plant.sysj line: 120, column: 17
                      conveyorBottleBeforePos1_1.setPresent();//sysj/plant.sysj line: 120, column: 56
                      currsigs.addElement(conveyorBottleBeforePos1_1);
                      S126=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                  }
                  else {
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S126=1;
            S126=0;
            S110=0;
            if(!plantConveyorBottleBeforePos1_in.isPartnerPresent() || plantConveyorBottleBeforePos1_in.isPartnerPreempted()){//sysj/plant.sysj line: 120, column: 17
              plantConveyorBottleBeforePos1_in.setACK(false);//sysj/plant.sysj line: 120, column: 17
              S110=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S105=0;
              if(!plantConveyorBottleBeforePos1_in.isREQ()){//sysj/plant.sysj line: 120, column: 17
                plantConveyorBottleBeforePos1_in.setACK(true);//sysj/plant.sysj line: 120, column: 17
                S105=1;
                if(plantConveyorBottleBeforePos1_in.isREQ()){//sysj/plant.sysj line: 120, column: 17
                  plantConveyorBottleBeforePos1_in.setACK(false);//sysj/plant.sysj line: 120, column: 17
                  ends[3]=2;
                  ;//sysj/plant.sysj line: 120, column: 17
                  conveyorBottleBeforePos1_1.setPresent();//sysj/plant.sysj line: 120, column: 56
                  currsigs.addElement(conveyorBottleBeforePos1_1);
                  S126=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2256(int [] tdone, int [] ends){
        switch(S103){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S55){
          case 0 : 
            switch(S39){
              case 0 : 
                if(!plantConveyorActive_in.isPartnerPresent() || plantConveyorActive_in.isPartnerPreempted()){//sysj/plant.sysj line: 118, column: 17
                  plantConveyorActive_in.setACK(false);//sysj/plant.sysj line: 118, column: 17
                  S39=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S34){
                    case 0 : 
                      if(!plantConveyorActive_in.isREQ()){//sysj/plant.sysj line: 118, column: 17
                        plantConveyorActive_in.setACK(true);//sysj/plant.sysj line: 118, column: 17
                        S34=1;
                        if(plantConveyorActive_in.isREQ()){//sysj/plant.sysj line: 118, column: 17
                          plantConveyorActive_in.setACK(false);//sysj/plant.sysj line: 118, column: 17
                          ends[2]=2;
                          ;//sysj/plant.sysj line: 118, column: 17
                          conveyorActive_1.setPresent();//sysj/plant.sysj line: 118, column: 46
                          currsigs.addElement(conveyorActive_1);
                          S55=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
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
                    
                    case 1 : 
                      if(plantConveyorActive_in.isREQ()){//sysj/plant.sysj line: 118, column: 17
                        plantConveyorActive_in.setACK(false);//sysj/plant.sysj line: 118, column: 17
                        ends[2]=2;
                        ;//sysj/plant.sysj line: 118, column: 17
                        conveyorActive_1.setPresent();//sysj/plant.sysj line: 118, column: 46
                        currsigs.addElement(conveyorActive_1);
                        S55=1;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S39=1;
                S39=0;
                if(!plantConveyorActive_in.isPartnerPresent() || plantConveyorActive_in.isPartnerPreempted()){//sysj/plant.sysj line: 118, column: 17
                  plantConveyorActive_in.setACK(false);//sysj/plant.sysj line: 118, column: 17
                  S39=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S34=0;
                  if(!plantConveyorActive_in.isREQ()){//sysj/plant.sysj line: 118, column: 17
                    plantConveyorActive_in.setACK(true);//sysj/plant.sysj line: 118, column: 17
                    S34=1;
                    if(plantConveyorActive_in.isREQ()){//sysj/plant.sysj line: 118, column: 17
                      plantConveyorActive_in.setACK(false);//sysj/plant.sysj line: 118, column: 17
                      ends[2]=2;
                      ;//sysj/plant.sysj line: 118, column: 17
                      conveyorActive_1.setPresent();//sysj/plant.sysj line: 118, column: 46
                      currsigs.addElement(conveyorActive_1);
                      S55=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
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
                }
                break;
              
            }
            break;
          
          case 1 : 
            S55=1;
            S55=0;
            S39=0;
            if(!plantConveyorActive_in.isPartnerPresent() || plantConveyorActive_in.isPartnerPreempted()){//sysj/plant.sysj line: 118, column: 17
              plantConveyorActive_in.setACK(false);//sysj/plant.sysj line: 118, column: 17
              S39=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S34=0;
              if(!plantConveyorActive_in.isREQ()){//sysj/plant.sysj line: 118, column: 17
                plantConveyorActive_in.setACK(true);//sysj/plant.sysj line: 118, column: 17
                S34=1;
                if(plantConveyorActive_in.isREQ()){//sysj/plant.sysj line: 118, column: 17
                  plantConveyorActive_in.setACK(false);//sysj/plant.sysj line: 118, column: 17
                  ends[2]=2;
                  ;//sysj/plant.sysj line: 118, column: 17
                  conveyorActive_1.setPresent();//sysj/plant.sysj line: 118, column: 46
                  currsigs.addElement(conveyorActive_1);
                  S55=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
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
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2254(int [] tdone, int [] ends){
        S1752=1;
    if(cap1_1.getprestatus()){//sysj/plant.sysj line: 345, column: 24
      capOnBottleAtPos1.setPresent();//sysj/plant.sysj line: 345, column: 30
      currsigs.addElement(capOnBottleAtPos1);
      active[102]=1;
      ends[102]=1;
      tdone[102]=1;
    }
    else {
      active[102]=1;
      ends[102]=1;
      tdone[102]=1;
    }
  }

  public void thread2251(int [] tdone, int [] ends){
        S1740=1;
    S1718=0;
    active[101]=1;
    ends[101]=1;
    tdone[101]=1;
  }

  public void thread2250(int [] tdone, int [] ends){
        S1708=1;
    S1674=0;
    active[100]=1;
    ends[100]=1;
    tdone[100]=1;
  }

  public void thread2249(int [] tdone, int [] ends){
        S1670=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
      beginSustain_97.setPresent();//sysj/plant.sysj line: 53, column: 5
      currsigs.addElement(beginSustain_97);
      active[99]=1;
      ends[99]=1;
      tdone[99]=1;
    }
    else {
      active[99]=1;
      ends[99]=1;
      tdone[99]=1;
    }
  }

  public void thread2248(int [] tdone, int [] ends){
        S1662=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
      endSustain_97.setPresent();//sysj/plant.sysj line: 43, column: 5
      currsigs.addElement(endSustain_97);
      active[98]=1;
      ends[98]=1;
      tdone[98]=1;
    }
    else {
      active[98]=1;
      ends[98]=1;
      tdone[98]=1;
    }
  }

  public void thread2247(int [] tdone, int [] ends){
        S1742=1;
    beginSustain_97.setClear();//sysj/plant.sysj line: 37, column: 2
    endSustain_97.setClear();//sysj/plant.sysj line: 38, column: 2
    thread2248(tdone,ends);
    thread2249(tdone,ends);
    thread2250(tdone,ends);
    thread2251(tdone,ends);
    int biggest2252 = 0;
    if(ends[98]>=biggest2252){
      biggest2252=ends[98];
    }
    if(ends[99]>=biggest2252){
      biggest2252=ends[99];
    }
    if(ends[100]>=biggest2252){
      biggest2252=ends[100];
    }
    if(ends[101]>=biggest2252){
      biggest2252=ends[101];
    }
    if(biggest2252 == 1){
      active[97]=1;
      ends[97]=1;
      tdone[97]=1;
    }
  }

  public void thread2246(int [] tdone, int [] ends){
        active[96]=0;
    ends[96]=0;
    tdone[96]=1;
  }

  public void thread2245(int [] tdone, int [] ends){
        S1744=1;
    thread2246(tdone,ends);
    thread2247(tdone,ends);
    int biggest2253 = 0;
    if(ends[96]>=biggest2253){
      biggest2253=ends[96];
    }
    if(ends[97]>=biggest2253){
      biggest2253=ends[97];
    }
    if(biggest2253 == 1){
      active[95]=1;
      ends[95]=1;
      tdone[95]=1;
    }
  }

  public void thread2242(int [] tdone, int [] ends){
        S1646=1;
    S1624=0;
    active[94]=1;
    ends[94]=1;
    tdone[94]=1;
  }

  public void thread2241(int [] tdone, int [] ends){
        S1614=1;
    S1580=0;
    active[93]=1;
    ends[93]=1;
    tdone[93]=1;
  }

  public void thread2240(int [] tdone, int [] ends){
        S1576=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
      beginSustain_90.setPresent();//sysj/plant.sysj line: 53, column: 5
      currsigs.addElement(beginSustain_90);
      active[92]=1;
      ends[92]=1;
      tdone[92]=1;
    }
    else {
      active[92]=1;
      ends[92]=1;
      tdone[92]=1;
    }
  }

  public void thread2239(int [] tdone, int [] ends){
        S1568=1;
    if(pos5ToConveyor_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
      endSustain_90.setPresent();//sysj/plant.sysj line: 43, column: 5
      currsigs.addElement(endSustain_90);
      active[91]=1;
      ends[91]=1;
      tdone[91]=1;
    }
    else {
      active[91]=1;
      ends[91]=1;
      tdone[91]=1;
    }
  }

  public void thread2238(int [] tdone, int [] ends){
        S1648=1;
    beginSustain_90.setClear();//sysj/plant.sysj line: 37, column: 2
    endSustain_90.setClear();//sysj/plant.sysj line: 38, column: 2
    thread2239(tdone,ends);
    thread2240(tdone,ends);
    thread2241(tdone,ends);
    thread2242(tdone,ends);
    int biggest2243 = 0;
    if(ends[91]>=biggest2243){
      biggest2243=ends[91];
    }
    if(ends[92]>=biggest2243){
      biggest2243=ends[92];
    }
    if(ends[93]>=biggest2243){
      biggest2243=ends[93];
    }
    if(ends[94]>=biggest2243){
      biggest2243=ends[94];
    }
    if(biggest2243 == 1){
      active[90]=1;
      ends[90]=1;
      tdone[90]=1;
    }
  }

  public void thread2237(int [] tdone, int [] ends){
        active[89]=0;
    ends[89]=0;
    tdone[89]=1;
  }

  public void thread2236(int [] tdone, int [] ends){
        S1650=1;
    thread2237(tdone,ends);
    thread2238(tdone,ends);
    int biggest2244 = 0;
    if(ends[89]>=biggest2244){
      biggest2244=ends[89];
    }
    if(ends[90]>=biggest2244){
      biggest2244=ends[90];
    }
    if(biggest2244 == 1){
      active[88]=1;
      ends[88]=1;
      tdone[88]=1;
    }
  }

  public void thread2233(int [] tdone, int [] ends){
        S1552=1;
    S1530=0;
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread2232(int [] tdone, int [] ends){
        S1520=1;
    S1486=0;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread2231(int [] tdone, int [] ends){
        S1482=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
      beginSustain_83.setPresent();//sysj/plant.sysj line: 53, column: 5
      currsigs.addElement(beginSustain_83);
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
    else {
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
  }

  public void thread2230(int [] tdone, int [] ends){
        S1474=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
      endSustain_83.setPresent();//sysj/plant.sysj line: 43, column: 5
      currsigs.addElement(endSustain_83);
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
    else {
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread2229(int [] tdone, int [] ends){
        S1554=1;
    beginSustain_83.setClear();//sysj/plant.sysj line: 37, column: 2
    endSustain_83.setClear();//sysj/plant.sysj line: 38, column: 2
    thread2230(tdone,ends);
    thread2231(tdone,ends);
    thread2232(tdone,ends);
    thread2233(tdone,ends);
    int biggest2234 = 0;
    if(ends[84]>=biggest2234){
      biggest2234=ends[84];
    }
    if(ends[85]>=biggest2234){
      biggest2234=ends[85];
    }
    if(ends[86]>=biggest2234){
      biggest2234=ends[86];
    }
    if(ends[87]>=biggest2234){
      biggest2234=ends[87];
    }
    if(biggest2234 == 1){
      active[83]=1;
      ends[83]=1;
      tdone[83]=1;
    }
  }

  public void thread2228(int [] tdone, int [] ends){
        active[82]=0;
    ends[82]=0;
    tdone[82]=1;
  }

  public void thread2227(int [] tdone, int [] ends){
        S1556=1;
    thread2228(tdone,ends);
    thread2229(tdone,ends);
    int biggest2235 = 0;
    if(ends[82]>=biggest2235){
      biggest2235=ends[82];
    }
    if(ends[83]>=biggest2235){
      biggest2235=ends[83];
    }
    if(biggest2235 == 1){
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread2224(int [] tdone, int [] ends){
        S1458=1;
    S1436=0;
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread2223(int [] tdone, int [] ends){
        S1426=1;
    S1392=0;
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread2222(int [] tdone, int [] ends){
        S1388=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
      beginSustain_76.setPresent();//sysj/plant.sysj line: 53, column: 5
      currsigs.addElement(beginSustain_76);
      active[78]=1;
      ends[78]=1;
      tdone[78]=1;
    }
    else {
      active[78]=1;
      ends[78]=1;
      tdone[78]=1;
    }
  }

  public void thread2221(int [] tdone, int [] ends){
        S1380=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
      endSustain_76.setPresent();//sysj/plant.sysj line: 43, column: 5
      currsigs.addElement(endSustain_76);
      active[77]=1;
      ends[77]=1;
      tdone[77]=1;
    }
    else {
      active[77]=1;
      ends[77]=1;
      tdone[77]=1;
    }
  }

  public void thread2220(int [] tdone, int [] ends){
        S1460=1;
    beginSustain_76.setClear();//sysj/plant.sysj line: 37, column: 2
    endSustain_76.setClear();//sysj/plant.sysj line: 38, column: 2
    thread2221(tdone,ends);
    thread2222(tdone,ends);
    thread2223(tdone,ends);
    thread2224(tdone,ends);
    int biggest2225 = 0;
    if(ends[77]>=biggest2225){
      biggest2225=ends[77];
    }
    if(ends[78]>=biggest2225){
      biggest2225=ends[78];
    }
    if(ends[79]>=biggest2225){
      biggest2225=ends[79];
    }
    if(ends[80]>=biggest2225){
      biggest2225=ends[80];
    }
    if(biggest2225 == 1){
      active[76]=1;
      ends[76]=1;
      tdone[76]=1;
    }
  }

  public void thread2219(int [] tdone, int [] ends){
        active[75]=0;
    ends[75]=0;
    tdone[75]=1;
  }

  public void thread2218(int [] tdone, int [] ends){
        S1462=1;
    thread2219(tdone,ends);
    thread2220(tdone,ends);
    int biggest2226 = 0;
    if(ends[75]>=biggest2226){
      biggest2226=ends[75];
    }
    if(ends[76]>=biggest2226){
      biggest2226=ends[76];
    }
    if(biggest2226 == 1){
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
  }

  public void thread2215(int [] tdone, int [] ends){
        S1364=1;
    S1342=0;
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread2214(int [] tdone, int [] ends){
        S1332=1;
    S1298=0;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread2213(int [] tdone, int [] ends){
        S1294=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
      beginSustain_69.setPresent();//sysj/plant.sysj line: 53, column: 5
      currsigs.addElement(beginSustain_69);
      active[71]=1;
      ends[71]=1;
      tdone[71]=1;
    }
    else {
      active[71]=1;
      ends[71]=1;
      tdone[71]=1;
    }
  }

  public void thread2212(int [] tdone, int [] ends){
        S1286=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
      endSustain_69.setPresent();//sysj/plant.sysj line: 43, column: 5
      currsigs.addElement(endSustain_69);
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
    else {
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread2211(int [] tdone, int [] ends){
        S1366=1;
    beginSustain_69.setClear();//sysj/plant.sysj line: 37, column: 2
    endSustain_69.setClear();//sysj/plant.sysj line: 38, column: 2
    thread2212(tdone,ends);
    thread2213(tdone,ends);
    thread2214(tdone,ends);
    thread2215(tdone,ends);
    int biggest2216 = 0;
    if(ends[70]>=biggest2216){
      biggest2216=ends[70];
    }
    if(ends[71]>=biggest2216){
      biggest2216=ends[71];
    }
    if(ends[72]>=biggest2216){
      biggest2216=ends[72];
    }
    if(ends[73]>=biggest2216){
      biggest2216=ends[73];
    }
    if(biggest2216 == 1){
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread2210(int [] tdone, int [] ends){
        active[68]=0;
    ends[68]=0;
    tdone[68]=1;
  }

  public void thread2209(int [] tdone, int [] ends){
        S1368=1;
    thread2210(tdone,ends);
    thread2211(tdone,ends);
    int biggest2217 = 0;
    if(ends[68]>=biggest2217){
      biggest2217=ends[68];
    }
    if(ends[69]>=biggest2217){
      biggest2217=ends[69];
    }
    if(biggest2217 == 1){
      active[67]=1;
      ends[67]=1;
      tdone[67]=1;
    }
  }

  public void thread2206(int [] tdone, int [] ends){
        S1270=1;
    S1248=0;
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread2205(int [] tdone, int [] ends){
        S1238=1;
    S1204=0;
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread2204(int [] tdone, int [] ends){
        S1200=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
      beginSustain_62.setPresent();//sysj/plant.sysj line: 53, column: 5
      currsigs.addElement(beginSustain_62);
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
    else {
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
  }

  public void thread2203(int [] tdone, int [] ends){
        S1192=1;
    if(removePos1_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
      endSustain_62.setPresent();//sysj/plant.sysj line: 43, column: 5
      currsigs.addElement(endSustain_62);
      active[63]=1;
      ends[63]=1;
      tdone[63]=1;
    }
    else {
      active[63]=1;
      ends[63]=1;
      tdone[63]=1;
    }
  }

  public void thread2202(int [] tdone, int [] ends){
        S1272=1;
    beginSustain_62.setClear();//sysj/plant.sysj line: 37, column: 2
    endSustain_62.setClear();//sysj/plant.sysj line: 38, column: 2
    thread2203(tdone,ends);
    thread2204(tdone,ends);
    thread2205(tdone,ends);
    thread2206(tdone,ends);
    int biggest2207 = 0;
    if(ends[63]>=biggest2207){
      biggest2207=ends[63];
    }
    if(ends[64]>=biggest2207){
      biggest2207=ends[64];
    }
    if(ends[65]>=biggest2207){
      biggest2207=ends[65];
    }
    if(ends[66]>=biggest2207){
      biggest2207=ends[66];
    }
    if(biggest2207 == 1){
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread2201(int [] tdone, int [] ends){
        active[61]=0;
    ends[61]=0;
    tdone[61]=1;
  }

  public void thread2200(int [] tdone, int [] ends){
        S1274=1;
    thread2201(tdone,ends);
    thread2202(tdone,ends);
    int biggest2208 = 0;
    if(ends[61]>=biggest2208){
      biggest2208=ends[61];
    }
    if(ends[62]>=biggest2208){
      biggest2208=ends[62];
    }
    if(biggest2208 == 1){
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
  }

  public void thread2199(int [] tdone, int [] ends){
        S1180=1;
    if(pos6_1.getprestatus()){//sysj/plant.sysj line: 270, column: 23
      bottleAtPos6.setPresent();//sysj/plant.sysj line: 270, column: 29
      currsigs.addElement(bottleAtPos6);
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
    else {
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
  }

  public void thread2198(int [] tdone, int [] ends){
        S1172=1;
    if(pos5_1.getprestatus()){//sysj/plant.sysj line: 268, column: 23
      bottleAtPos5.setPresent();//sysj/plant.sysj line: 268, column: 29
      currsigs.addElement(bottleAtPos5);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread2197(int [] tdone, int [] ends){
        S1164=1;
    if(pos4_1.getprestatus()){//sysj/plant.sysj line: 266, column: 23
      bottleAtPos4.setPresent();//sysj/plant.sysj line: 266, column: 29
      currsigs.addElement(bottleAtPos4);
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread2196(int [] tdone, int [] ends){
        S1156=1;
    if(pos3_1.getprestatus()){//sysj/plant.sysj line: 264, column: 23
      bottleAtPos3.setPresent();//sysj/plant.sysj line: 264, column: 29
      currsigs.addElement(bottleAtPos3);
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
    else {
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread2195(int [] tdone, int [] ends){
        S1148=1;
    if(pos2_1.getprestatus()){//sysj/plant.sysj line: 262, column: 23
      bottleAtPos2.setPresent();//sysj/plant.sysj line: 262, column: 29
      currsigs.addElement(bottleAtPos2);
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
  }

  public void thread2194(int [] tdone, int [] ends){
        S1140=1;
    if(pos1_1.getprestatus()){//sysj/plant.sysj line: 260, column: 23
      bottleAtPos1.setPresent();//sysj/plant.sysj line: 260, column: 29
      currsigs.addElement(bottleAtPos1);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread2191(int [] tdone, int [] ends){
        S1128=1;
    S1106=0;
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread2190(int [] tdone, int [] ends){
        S1096=1;
    S1062=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread2189(int [] tdone, int [] ends){
        S1058=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
      beginSustain_49.setPresent();//sysj/plant.sysj line: 53, column: 5
      currsigs.addElement(beginSustain_49);
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread2188(int [] tdone, int [] ends){
        S1050=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
      endSustain_49.setPresent();//sysj/plant.sysj line: 43, column: 5
      currsigs.addElement(endSustain_49);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread2187(int [] tdone, int [] ends){
        S1130=1;
    beginSustain_49.setClear();//sysj/plant.sysj line: 37, column: 2
    endSustain_49.setClear();//sysj/plant.sysj line: 38, column: 2
    thread2188(tdone,ends);
    thread2189(tdone,ends);
    thread2190(tdone,ends);
    thread2191(tdone,ends);
    int biggest2192 = 0;
    if(ends[50]>=biggest2192){
      biggest2192=ends[50];
    }
    if(ends[51]>=biggest2192){
      biggest2192=ends[51];
    }
    if(ends[52]>=biggest2192){
      biggest2192=ends[52];
    }
    if(ends[53]>=biggest2192){
      biggest2192=ends[53];
    }
    if(biggest2192 == 1){
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread2186(int [] tdone, int [] ends){
        active[48]=0;
    ends[48]=0;
    tdone[48]=1;
  }

  public void thread2185(int [] tdone, int [] ends){
        S1132=1;
    thread2186(tdone,ends);
    thread2187(tdone,ends);
    int biggest2193 = 0;
    if(ends[48]>=biggest2193){
      biggest2193=ends[48];
    }
    if(ends[49]>=biggest2193){
      biggest2193=ends[49];
    }
    if(biggest2193 == 1){
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread2182(int [] tdone, int [] ends){
        S1034=1;
    S1012=0;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread2181(int [] tdone, int [] ends){
        S1002=1;
    S968=0;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread2180(int [] tdone, int [] ends){
        S964=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
      beginSustain_42.setPresent();//sysj/plant.sysj line: 53, column: 5
      currsigs.addElement(beginSustain_42);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread2179(int [] tdone, int [] ends){
        S956=1;
    if(pos5ToConveyor_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
      endSustain_42.setPresent();//sysj/plant.sysj line: 43, column: 5
      currsigs.addElement(endSustain_42);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread2178(int [] tdone, int [] ends){
        S1036=1;
    beginSustain_42.setClear();//sysj/plant.sysj line: 37, column: 2
    endSustain_42.setClear();//sysj/plant.sysj line: 38, column: 2
    thread2179(tdone,ends);
    thread2180(tdone,ends);
    thread2181(tdone,ends);
    thread2182(tdone,ends);
    int biggest2183 = 0;
    if(ends[43]>=biggest2183){
      biggest2183=ends[43];
    }
    if(ends[44]>=biggest2183){
      biggest2183=ends[44];
    }
    if(ends[45]>=biggest2183){
      biggest2183=ends[45];
    }
    if(ends[46]>=biggest2183){
      biggest2183=ends[46];
    }
    if(biggest2183 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread2177(int [] tdone, int [] ends){
        active[41]=0;
    ends[41]=0;
    tdone[41]=1;
  }

  public void thread2176(int [] tdone, int [] ends){
        S1038=1;
    thread2177(tdone,ends);
    thread2178(tdone,ends);
    int biggest2184 = 0;
    if(ends[41]>=biggest2184){
      biggest2184=ends[41];
    }
    if(ends[42]>=biggest2184){
      biggest2184=ends[42];
    }
    if(biggest2184 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread2173(int [] tdone, int [] ends){
        S940=1;
    S918=0;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread2172(int [] tdone, int [] ends){
        S908=1;
    S874=0;
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread2171(int [] tdone, int [] ends){
        S870=1;
    if(capperPos4_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
      beginSustain_35.setPresent();//sysj/plant.sysj line: 53, column: 5
      currsigs.addElement(beginSustain_35);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread2170(int [] tdone, int [] ends){
        S862=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
      endSustain_35.setPresent();//sysj/plant.sysj line: 43, column: 5
      currsigs.addElement(endSustain_35);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread2169(int [] tdone, int [] ends){
        S942=1;
    beginSustain_35.setClear();//sysj/plant.sysj line: 37, column: 2
    endSustain_35.setClear();//sysj/plant.sysj line: 38, column: 2
    thread2170(tdone,ends);
    thread2171(tdone,ends);
    thread2172(tdone,ends);
    thread2173(tdone,ends);
    int biggest2174 = 0;
    if(ends[36]>=biggest2174){
      biggest2174=ends[36];
    }
    if(ends[37]>=biggest2174){
      biggest2174=ends[37];
    }
    if(ends[38]>=biggest2174){
      biggest2174=ends[38];
    }
    if(ends[39]>=biggest2174){
      biggest2174=ends[39];
    }
    if(biggest2174 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread2168(int [] tdone, int [] ends){
        active[34]=0;
    ends[34]=0;
    tdone[34]=1;
  }

  public void thread2167(int [] tdone, int [] ends){
        S944=1;
    thread2168(tdone,ends);
    thread2169(tdone,ends);
    int biggest2175 = 0;
    if(ends[34]>=biggest2175){
      biggest2175=ends[34];
    }
    if(ends[35]>=biggest2175){
      biggest2175=ends[35];
    }
    if(biggest2175 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread2164(int [] tdone, int [] ends){
        S846=1;
    S824=0;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread2163(int [] tdone, int [] ends){
        S814=1;
    S780=0;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread2162(int [] tdone, int [] ends){
        S776=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
      beginSustain_28.setPresent();//sysj/plant.sysj line: 53, column: 5
      currsigs.addElement(beginSustain_28);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread2161(int [] tdone, int [] ends){
        S768=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
      endSustain_28.setPresent();//sysj/plant.sysj line: 43, column: 5
      currsigs.addElement(endSustain_28);
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread2160(int [] tdone, int [] ends){
        S848=1;
    beginSustain_28.setClear();//sysj/plant.sysj line: 37, column: 2
    endSustain_28.setClear();//sysj/plant.sysj line: 38, column: 2
    thread2161(tdone,ends);
    thread2162(tdone,ends);
    thread2163(tdone,ends);
    thread2164(tdone,ends);
    int biggest2165 = 0;
    if(ends[29]>=biggest2165){
      biggest2165=ends[29];
    }
    if(ends[30]>=biggest2165){
      biggest2165=ends[30];
    }
    if(ends[31]>=biggest2165){
      biggest2165=ends[31];
    }
    if(ends[32]>=biggest2165){
      biggest2165=ends[32];
    }
    if(biggest2165 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread2159(int [] tdone, int [] ends){
        active[27]=0;
    ends[27]=0;
    tdone[27]=1;
  }

  public void thread2158(int [] tdone, int [] ends){
        S850=1;
    thread2159(tdone,ends);
    thread2160(tdone,ends);
    int biggest2166 = 0;
    if(ends[27]>=biggest2166){
      biggest2166=ends[27];
    }
    if(ends[28]>=biggest2166){
      biggest2166=ends[28];
    }
    if(biggest2166 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread2155(int [] tdone, int [] ends){
        S752=1;
    S730=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread2154(int [] tdone, int [] ends){
        S720=1;
    S686=0;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread2153(int [] tdone, int [] ends){
        S682=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
      beginSustain_21.setPresent();//sysj/plant.sysj line: 53, column: 5
      currsigs.addElement(beginSustain_21);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread2152(int [] tdone, int [] ends){
        S674=1;
    if(deadSignal_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
      endSustain_21.setPresent();//sysj/plant.sysj line: 43, column: 5
      currsigs.addElement(endSustain_21);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread2151(int [] tdone, int [] ends){
        S754=1;
    beginSustain_21.setClear();//sysj/plant.sysj line: 37, column: 2
    endSustain_21.setClear();//sysj/plant.sysj line: 38, column: 2
    thread2152(tdone,ends);
    thread2153(tdone,ends);
    thread2154(tdone,ends);
    thread2155(tdone,ends);
    int biggest2156 = 0;
    if(ends[22]>=biggest2156){
      biggest2156=ends[22];
    }
    if(ends[23]>=biggest2156){
      biggest2156=ends[23];
    }
    if(ends[24]>=biggest2156){
      biggest2156=ends[24];
    }
    if(ends[25]>=biggest2156){
      biggest2156=ends[25];
    }
    if(biggest2156 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread2150(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread2149(int [] tdone, int [] ends){
        S756=1;
    thread2150(tdone,ends);
    thread2151(tdone,ends);
    int biggest2157 = 0;
    if(ends[20]>=biggest2157){
      biggest2157=ends[20];
    }
    if(ends[21]>=biggest2157){
      biggest2157=ends[21];
    }
    if(biggest2157 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread2146(int [] tdone, int [] ends){
        S658=1;
    S636=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread2145(int [] tdone, int [] ends){
        S626=1;
    S592=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread2144(int [] tdone, int [] ends){
        S588=1;
    if(conveyorToPos1_1.getprestatus()){//sysj/plant.sysj line: 52, column: 12
      beginSustain_14.setPresent();//sysj/plant.sysj line: 53, column: 5
      currsigs.addElement(beginSustain_14);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread2143(int [] tdone, int [] ends){
        S580=1;
    if(removePos1_1.getprestatus()){//sysj/plant.sysj line: 42, column: 12
      endSustain_14.setPresent();//sysj/plant.sysj line: 43, column: 5
      currsigs.addElement(endSustain_14);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread2142(int [] tdone, int [] ends){
        S660=1;
    beginSustain_14.setClear();//sysj/plant.sysj line: 37, column: 2
    endSustain_14.setClear();//sysj/plant.sysj line: 38, column: 2
    thread2143(tdone,ends);
    thread2144(tdone,ends);
    thread2145(tdone,ends);
    thread2146(tdone,ends);
    int biggest2147 = 0;
    if(ends[15]>=biggest2147){
      biggest2147=ends[15];
    }
    if(ends[16]>=biggest2147){
      biggest2147=ends[16];
    }
    if(ends[17]>=biggest2147){
      biggest2147=ends[17];
    }
    if(ends[18]>=biggest2147){
      biggest2147=ends[18];
    }
    if(biggest2147 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread2141(int [] tdone, int [] ends){
        active[13]=0;
    ends[13]=0;
    tdone[13]=1;
  }

  public void thread2140(int [] tdone, int [] ends){
        S662=1;
    thread2141(tdone,ends);
    thread2142(tdone,ends);
    int biggest2148 = 0;
    if(ends[13]>=biggest2148){
      biggest2148=ends[13];
    }
    if(ends[14]>=biggest2148){
      biggest2148=ends[14];
    }
    if(biggest2148 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread2139(int [] tdone, int [] ends){
        S568=1;
    S472=0;
    if(pos5_1.getprestatus() && conveyorActive_1.getprestatus()){//sysj/plant.sysj line: 178, column: 12
      pos5ToConveyor_1.setPresent();//sysj/plant.sysj line: 179, column: 5
      currsigs.addElement(pos5ToConveyor_1);
      S432=0;
      if(!sentPos5_o.isPartnerPresent() || sentPos5_o.isPartnerPreempted()){//sysj/plant.sysj line: 180, column: 5
        sentPos5_o.setREQ(false);//sysj/plant.sysj line: 180, column: 5
        S432=1;
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
      else {
        S427=0;
        if(sentPos5_o.isACK()){//sysj/plant.sysj line: 180, column: 5
          sentPos5_o.setVal(true);//sysj/plant.sysj line: 180, column: 5
          S427=1;
          if(!sentPos5_o.isACK()){//sysj/plant.sysj line: 180, column: 5
            sentPos5_o.setREQ(false);//sysj/plant.sysj line: 180, column: 5
            ends[11]=2;
            ;//sysj/plant.sysj line: 180, column: 5
            S472=1;
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
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
      }
    }
    else {
      S472=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread2138(int [] tdone, int [] ends){
        S425=1;
    S329=0;
    if(!pos1_1.getprestatus() && conveyorActive_1.getprestatus() && conveyorBottleBeforePos1_1.getprestatus() && !rotationInProgress_1.getprestatus()){//sysj/plant.sysj line: 165, column: 12
      conveyorToPos1_1.setPresent();//sysj/plant.sysj line: 166, column: 5
      currsigs.addElement(conveyorToPos1_1);
      S289=0;
      if(!receivedPos1_o.isPartnerPresent() || receivedPos1_o.isPartnerPreempted()){//sysj/plant.sysj line: 167, column: 5
        receivedPos1_o.setREQ(false);//sysj/plant.sysj line: 167, column: 5
        S289=1;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S284=0;
        if(receivedPos1_o.isACK()){//sysj/plant.sysj line: 167, column: 5
          receivedPos1_o.setVal(true);//sysj/plant.sysj line: 167, column: 5
          S284=1;
          if(!receivedPos1_o.isACK()){//sysj/plant.sysj line: 167, column: 5
            receivedPos1_o.setREQ(false);//sysj/plant.sysj line: 167, column: 5
            ends[10]=2;
            ;//sysj/plant.sysj line: 167, column: 5
            S329=1;
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
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
      }
    }
    else {
      S329=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread2137(int [] tdone, int [] ends){
        S282=1;
    if(manualRemovePos1.getprestatus()){//sysj/plant.sysj line: 154, column: 12
      removePos1_1.setPresent();//sysj/plant.sysj line: 155, column: 5
      currsigs.addElement(removePos1_1);
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

  public void thread2136(int [] tdone, int [] ends){
        S274=1;
    S268=0;
    if(!rotationInProgress_1.getprestatus()){//sysj/plant.sysj line: 144, column: 12
      tableAlignedWithSensor.setPresent();//sysj/plant.sysj line: 145, column: 5
      currsigs.addElement(tableAlignedWithSensor);
      S268=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S268=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread2135(int [] tdone, int [] ends){
        S266=1;
    S265=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2134(int [] tdone, int [] ends){
        S245=1;
    S197=0;
    S181=0;
    if(!plantCapperPos4_in.isPartnerPresent() || plantCapperPos4_in.isPartnerPreempted()){//sysj/plant.sysj line: 122, column: 17
      plantCapperPos4_in.setACK(false);//sysj/plant.sysj line: 122, column: 17
      S181=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S176=0;
      if(!plantCapperPos4_in.isREQ()){//sysj/plant.sysj line: 122, column: 17
        plantCapperPos4_in.setACK(true);//sysj/plant.sysj line: 122, column: 17
        S176=1;
        if(plantCapperPos4_in.isREQ()){//sysj/plant.sysj line: 122, column: 17
          plantCapperPos4_in.setACK(false);//sysj/plant.sysj line: 122, column: 17
          ends[4]=2;
          ;//sysj/plant.sysj line: 122, column: 17
          capperPos4_1.setPresent();//sysj/plant.sysj line: 122, column: 42
          currsigs.addElement(capperPos4_1);
          S197=1;
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
      else {
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread2133(int [] tdone, int [] ends){
        S174=1;
    S126=0;
    S110=0;
    if(!plantConveyorBottleBeforePos1_in.isPartnerPresent() || plantConveyorBottleBeforePos1_in.isPartnerPreempted()){//sysj/plant.sysj line: 120, column: 17
      plantConveyorBottleBeforePos1_in.setACK(false);//sysj/plant.sysj line: 120, column: 17
      S110=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S105=0;
      if(!plantConveyorBottleBeforePos1_in.isREQ()){//sysj/plant.sysj line: 120, column: 17
        plantConveyorBottleBeforePos1_in.setACK(true);//sysj/plant.sysj line: 120, column: 17
        S105=1;
        if(plantConveyorBottleBeforePos1_in.isREQ()){//sysj/plant.sysj line: 120, column: 17
          plantConveyorBottleBeforePos1_in.setACK(false);//sysj/plant.sysj line: 120, column: 17
          ends[3]=2;
          ;//sysj/plant.sysj line: 120, column: 17
          conveyorBottleBeforePos1_1.setPresent();//sysj/plant.sysj line: 120, column: 56
          currsigs.addElement(conveyorBottleBeforePos1_1);
          S126=1;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
      }
      else {
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
    }
  }

  public void thread2132(int [] tdone, int [] ends){
        S103=1;
    S55=0;
    S39=0;
    if(!plantConveyorActive_in.isPartnerPresent() || plantConveyorActive_in.isPartnerPreempted()){//sysj/plant.sysj line: 118, column: 17
      plantConveyorActive_in.setACK(false);//sysj/plant.sysj line: 118, column: 17
      S39=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S34=0;
      if(!plantConveyorActive_in.isREQ()){//sysj/plant.sysj line: 118, column: 17
        plantConveyorActive_in.setACK(true);//sysj/plant.sysj line: 118, column: 17
        S34=1;
        if(plantConveyorActive_in.isREQ()){//sysj/plant.sysj line: 118, column: 17
          plantConveyorActive_in.setACK(false);//sysj/plant.sysj line: 118, column: 17
          ends[2]=2;
          ;//sysj/plant.sysj line: 118, column: 17
          conveyorActive_1.setPresent();//sysj/plant.sysj line: 118, column: 46
          currsigs.addElement(conveyorActive_1);
          S55=1;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        else {
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
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1754){
        case 0 : 
          S1754=0;
          break RUN;
        
        case 1 : 
          S1754=2;
          S1754=2;
          rotationInProgress_1.setClear();//sysj/plant.sysj line: 105, column: 2
          finishedRotating_1.setClear();//sysj/plant.sysj line: 105, column: 2
          deadSignal_1.setClear();//sysj/plant.sysj line: 106, column: 2
          conveyorToPos1_1.setClear();//sysj/plant.sysj line: 107, column: 2
          pos5ToConveyor_1.setClear();//sysj/plant.sysj line: 108, column: 2
          removePos1_1.setClear();//sysj/plant.sysj line: 109, column: 2
          pos12_1.setClear();//sysj/plant.sysj line: 110, column: 2
          pos23_1.setClear();//sysj/plant.sysj line: 110, column: 2
          pos34_1.setClear();//sysj/plant.sysj line: 110, column: 2
          pos45_1.setClear();//sysj/plant.sysj line: 110, column: 2
          pos56_1.setClear();//sysj/plant.sysj line: 110, column: 2
          pos61_1.setClear();//sysj/plant.sysj line: 110, column: 2
          pos1_1.setClear();//sysj/plant.sysj line: 111, column: 2
          pos2_1.setClear();//sysj/plant.sysj line: 111, column: 2
          pos3_1.setClear();//sysj/plant.sysj line: 111, column: 2
          pos4_1.setClear();//sysj/plant.sysj line: 111, column: 2
          pos5_1.setClear();//sysj/plant.sysj line: 111, column: 2
          pos6_1.setClear();//sysj/plant.sysj line: 111, column: 2
          cap1_1.setClear();//sysj/plant.sysj line: 112, column: 2
          cap2_1.setClear();//sysj/plant.sysj line: 112, column: 2
          cap3_1.setClear();//sysj/plant.sysj line: 112, column: 2
          cap4_1.setClear();//sysj/plant.sysj line: 112, column: 2
          cap5_1.setClear();//sysj/plant.sysj line: 112, column: 2
          cap6_1.setClear();//sysj/plant.sysj line: 112, column: 2
          cap12_1.setClear();//sysj/plant.sysj line: 113, column: 2
          cap23_1.setClear();//sysj/plant.sysj line: 113, column: 2
          cap34_1.setClear();//sysj/plant.sysj line: 113, column: 2
          cap45_1.setClear();//sysj/plant.sysj line: 113, column: 2
          cap56_1.setClear();//sysj/plant.sysj line: 113, column: 2
          cap61_1.setClear();//sysj/plant.sysj line: 113, column: 2
          conveyorActive_1.setClear();//sysj/plant.sysj line: 114, column: 2
          conveyorBottleBeforePos1_1.setClear();//sysj/plant.sysj line: 114, column: 2
          capperPos4_1.setClear();//sysj/plant.sysj line: 115, column: 2
          thread2132(tdone,ends);
          thread2133(tdone,ends);
          thread2134(tdone,ends);
          thread2135(tdone,ends);
          thread2136(tdone,ends);
          thread2137(tdone,ends);
          thread2138(tdone,ends);
          thread2139(tdone,ends);
          thread2140(tdone,ends);
          thread2149(tdone,ends);
          thread2158(tdone,ends);
          thread2167(tdone,ends);
          thread2176(tdone,ends);
          thread2185(tdone,ends);
          thread2194(tdone,ends);
          thread2195(tdone,ends);
          thread2196(tdone,ends);
          thread2197(tdone,ends);
          thread2198(tdone,ends);
          thread2199(tdone,ends);
          thread2200(tdone,ends);
          thread2209(tdone,ends);
          thread2218(tdone,ends);
          thread2227(tdone,ends);
          thread2236(tdone,ends);
          thread2245(tdone,ends);
          thread2254(tdone,ends);
          int biggest2255 = 0;
          if(ends[2]>=biggest2255){
            biggest2255=ends[2];
          }
          if(ends[3]>=biggest2255){
            biggest2255=ends[3];
          }
          if(ends[4]>=biggest2255){
            biggest2255=ends[4];
          }
          if(ends[5]>=biggest2255){
            biggest2255=ends[5];
          }
          if(ends[8]>=biggest2255){
            biggest2255=ends[8];
          }
          if(ends[9]>=biggest2255){
            biggest2255=ends[9];
          }
          if(ends[10]>=biggest2255){
            biggest2255=ends[10];
          }
          if(ends[11]>=biggest2255){
            biggest2255=ends[11];
          }
          if(ends[12]>=biggest2255){
            biggest2255=ends[12];
          }
          if(ends[19]>=biggest2255){
            biggest2255=ends[19];
          }
          if(ends[26]>=biggest2255){
            biggest2255=ends[26];
          }
          if(ends[33]>=biggest2255){
            biggest2255=ends[33];
          }
          if(ends[40]>=biggest2255){
            biggest2255=ends[40];
          }
          if(ends[47]>=biggest2255){
            biggest2255=ends[47];
          }
          if(ends[54]>=biggest2255){
            biggest2255=ends[54];
          }
          if(ends[55]>=biggest2255){
            biggest2255=ends[55];
          }
          if(ends[56]>=biggest2255){
            biggest2255=ends[56];
          }
          if(ends[57]>=biggest2255){
            biggest2255=ends[57];
          }
          if(ends[58]>=biggest2255){
            biggest2255=ends[58];
          }
          if(ends[59]>=biggest2255){
            biggest2255=ends[59];
          }
          if(ends[60]>=biggest2255){
            biggest2255=ends[60];
          }
          if(ends[67]>=biggest2255){
            biggest2255=ends[67];
          }
          if(ends[74]>=biggest2255){
            biggest2255=ends[74];
          }
          if(ends[81]>=biggest2255){
            biggest2255=ends[81];
          }
          if(ends[88]>=biggest2255){
            biggest2255=ends[88];
          }
          if(ends[95]>=biggest2255){
            biggest2255=ends[95];
          }
          if(ends[102]>=biggest2255){
            biggest2255=ends[102];
          }
          if(biggest2255 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotationInProgress_1.setClear();//sysj/plant.sysj line: 105, column: 2
          finishedRotating_1.setClear();//sysj/plant.sysj line: 105, column: 2
          deadSignal_1.setClear();//sysj/plant.sysj line: 106, column: 2
          conveyorToPos1_1.setClear();//sysj/plant.sysj line: 107, column: 2
          pos5ToConveyor_1.setClear();//sysj/plant.sysj line: 108, column: 2
          removePos1_1.setClear();//sysj/plant.sysj line: 109, column: 2
          pos12_1.setClear();//sysj/plant.sysj line: 110, column: 2
          pos23_1.setClear();//sysj/plant.sysj line: 110, column: 2
          pos34_1.setClear();//sysj/plant.sysj line: 110, column: 2
          pos45_1.setClear();//sysj/plant.sysj line: 110, column: 2
          pos56_1.setClear();//sysj/plant.sysj line: 110, column: 2
          pos61_1.setClear();//sysj/plant.sysj line: 110, column: 2
          pos1_1.setClear();//sysj/plant.sysj line: 111, column: 2
          pos2_1.setClear();//sysj/plant.sysj line: 111, column: 2
          pos3_1.setClear();//sysj/plant.sysj line: 111, column: 2
          pos4_1.setClear();//sysj/plant.sysj line: 111, column: 2
          pos5_1.setClear();//sysj/plant.sysj line: 111, column: 2
          pos6_1.setClear();//sysj/plant.sysj line: 111, column: 2
          cap1_1.setClear();//sysj/plant.sysj line: 112, column: 2
          cap2_1.setClear();//sysj/plant.sysj line: 112, column: 2
          cap3_1.setClear();//sysj/plant.sysj line: 112, column: 2
          cap4_1.setClear();//sysj/plant.sysj line: 112, column: 2
          cap5_1.setClear();//sysj/plant.sysj line: 112, column: 2
          cap6_1.setClear();//sysj/plant.sysj line: 112, column: 2
          cap12_1.setClear();//sysj/plant.sysj line: 113, column: 2
          cap23_1.setClear();//sysj/plant.sysj line: 113, column: 2
          cap34_1.setClear();//sysj/plant.sysj line: 113, column: 2
          cap45_1.setClear();//sysj/plant.sysj line: 113, column: 2
          cap56_1.setClear();//sysj/plant.sysj line: 113, column: 2
          cap61_1.setClear();//sysj/plant.sysj line: 113, column: 2
          conveyorActive_1.setClear();//sysj/plant.sysj line: 114, column: 2
          conveyorBottleBeforePos1_1.setClear();//sysj/plant.sysj line: 114, column: 2
          capperPos4_1.setClear();//sysj/plant.sysj line: 115, column: 2
          thread2256(tdone,ends);
          thread2257(tdone,ends);
          thread2258(tdone,ends);
          thread2259(tdone,ends);
          thread2266(tdone,ends);
          thread2267(tdone,ends);
          thread2268(tdone,ends);
          thread2269(tdone,ends);
          thread2270(tdone,ends);
          thread2279(tdone,ends);
          thread2288(tdone,ends);
          thread2297(tdone,ends);
          thread2306(tdone,ends);
          thread2315(tdone,ends);
          thread2324(tdone,ends);
          thread2325(tdone,ends);
          thread2326(tdone,ends);
          thread2327(tdone,ends);
          thread2328(tdone,ends);
          thread2329(tdone,ends);
          thread2330(tdone,ends);
          thread2339(tdone,ends);
          thread2348(tdone,ends);
          thread2357(tdone,ends);
          thread2366(tdone,ends);
          thread2375(tdone,ends);
          thread2384(tdone,ends);
          int biggest2385 = 0;
          if(ends[2]>=biggest2385){
            biggest2385=ends[2];
          }
          if(ends[3]>=biggest2385){
            biggest2385=ends[3];
          }
          if(ends[4]>=biggest2385){
            biggest2385=ends[4];
          }
          if(ends[5]>=biggest2385){
            biggest2385=ends[5];
          }
          if(ends[8]>=biggest2385){
            biggest2385=ends[8];
          }
          if(ends[9]>=biggest2385){
            biggest2385=ends[9];
          }
          if(ends[10]>=biggest2385){
            biggest2385=ends[10];
          }
          if(ends[11]>=biggest2385){
            biggest2385=ends[11];
          }
          if(ends[12]>=biggest2385){
            biggest2385=ends[12];
          }
          if(ends[19]>=biggest2385){
            biggest2385=ends[19];
          }
          if(ends[26]>=biggest2385){
            biggest2385=ends[26];
          }
          if(ends[33]>=biggest2385){
            biggest2385=ends[33];
          }
          if(ends[40]>=biggest2385){
            biggest2385=ends[40];
          }
          if(ends[47]>=biggest2385){
            biggest2385=ends[47];
          }
          if(ends[54]>=biggest2385){
            biggest2385=ends[54];
          }
          if(ends[55]>=biggest2385){
            biggest2385=ends[55];
          }
          if(ends[56]>=biggest2385){
            biggest2385=ends[56];
          }
          if(ends[57]>=biggest2385){
            biggest2385=ends[57];
          }
          if(ends[58]>=biggest2385){
            biggest2385=ends[58];
          }
          if(ends[59]>=biggest2385){
            biggest2385=ends[59];
          }
          if(ends[60]>=biggest2385){
            biggest2385=ends[60];
          }
          if(ends[67]>=biggest2385){
            biggest2385=ends[67];
          }
          if(ends[74]>=biggest2385){
            biggest2385=ends[74];
          }
          if(ends[81]>=biggest2385){
            biggest2385=ends[81];
          }
          if(ends[88]>=biggest2385){
            biggest2385=ends[88];
          }
          if(ends[95]>=biggest2385){
            biggest2385=ends[95];
          }
          if(ends[102]>=biggest2385){
            biggest2385=ends[102];
          }
          if(biggest2385 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2385 == 0){
            S1754=0;
            active[1]=0;
            ends[1]=0;
            S1754=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    rotationInProgress_1 = new Signal();
    finishedRotating_1 = new Signal();
    deadSignal_1 = new Signal();
    conveyorToPos1_1 = new Signal();
    pos5ToConveyor_1 = new Signal();
    removePos1_1 = new Signal();
    pos12_1 = new Signal();
    pos23_1 = new Signal();
    pos34_1 = new Signal();
    pos45_1 = new Signal();
    pos56_1 = new Signal();
    pos61_1 = new Signal();
    pos1_1 = new Signal();
    pos2_1 = new Signal();
    pos3_1 = new Signal();
    pos4_1 = new Signal();
    pos5_1 = new Signal();
    pos6_1 = new Signal();
    cap1_1 = new Signal();
    cap2_1 = new Signal();
    cap3_1 = new Signal();
    cap4_1 = new Signal();
    cap5_1 = new Signal();
    cap6_1 = new Signal();
    cap12_1 = new Signal();
    cap23_1 = new Signal();
    cap34_1 = new Signal();
    cap45_1 = new Signal();
    cap56_1 = new Signal();
    cap61_1 = new Signal();
    conveyorActive_1 = new Signal();
    conveyorBottleBeforePos1_1 = new Signal();
    capperPos4_1 = new Signal();
    beginSustain_14 = new Signal();
    endSustain_14 = new Signal();
    beginSustain_21 = new Signal();
    endSustain_21 = new Signal();
    beginSustain_28 = new Signal();
    endSustain_28 = new Signal();
    beginSustain_35 = new Signal();
    endSustain_35 = new Signal();
    beginSustain_42 = new Signal();
    endSustain_42 = new Signal();
    beginSustain_49 = new Signal();
    endSustain_49 = new Signal();
    beginSustain_62 = new Signal();
    endSustain_62 = new Signal();
    beginSustain_69 = new Signal();
    endSustain_69 = new Signal();
    beginSustain_76 = new Signal();
    endSustain_76 = new Signal();
    beginSustain_83 = new Signal();
    endSustain_83 = new Signal();
    beginSustain_90 = new Signal();
    endSustain_90 = new Signal();
    beginSustain_97 = new Signal();
    endSustain_97 = new Signal();
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
          plantConveyorActive_in.gethook();
          plantConveyorBottleBeforePos1_in.gethook();
          plantCapperPos4_in.gethook();
          receivedPos1_o.gethook();
          sentPos5_o.gethook();
          rotaryTableTrigger.gethook();
          manualRemovePos1.gethook();
          df = true;
        }
        runClockDomain();
      }
      rotaryTableTrigger.setpreclear();
      manualRemovePos1.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos2.setpreclear();
      bottleAtPos3.setpreclear();
      bottleAtPos4.setpreclear();
      bottleAtPos5.setpreclear();
      bottleAtPos6.setpreclear();
      tableAlignedWithSensor.setpreclear();
      capOnBottleAtPos1.setpreclear();
      rotationInProgress_1.setpreclear();
      finishedRotating_1.setpreclear();
      deadSignal_1.setpreclear();
      conveyorToPos1_1.setpreclear();
      pos5ToConveyor_1.setpreclear();
      removePos1_1.setpreclear();
      pos12_1.setpreclear();
      pos23_1.setpreclear();
      pos34_1.setpreclear();
      pos45_1.setpreclear();
      pos56_1.setpreclear();
      pos61_1.setpreclear();
      pos1_1.setpreclear();
      pos2_1.setpreclear();
      pos3_1.setpreclear();
      pos4_1.setpreclear();
      pos5_1.setpreclear();
      pos6_1.setpreclear();
      cap1_1.setpreclear();
      cap2_1.setpreclear();
      cap3_1.setpreclear();
      cap4_1.setpreclear();
      cap5_1.setpreclear();
      cap6_1.setpreclear();
      cap12_1.setpreclear();
      cap23_1.setpreclear();
      cap34_1.setpreclear();
      cap45_1.setpreclear();
      cap56_1.setpreclear();
      cap61_1.setpreclear();
      conveyorActive_1.setpreclear();
      conveyorBottleBeforePos1_1.setpreclear();
      capperPos4_1.setpreclear();
      beginSustain_14.setpreclear();
      endSustain_14.setpreclear();
      beginSustain_21.setpreclear();
      endSustain_21.setpreclear();
      beginSustain_28.setpreclear();
      endSustain_28.setpreclear();
      beginSustain_35.setpreclear();
      endSustain_35.setpreclear();
      beginSustain_42.setpreclear();
      endSustain_42.setpreclear();
      beginSustain_49.setpreclear();
      endSustain_49.setpreclear();
      beginSustain_62.setpreclear();
      endSustain_62.setpreclear();
      beginSustain_69.setpreclear();
      endSustain_69.setpreclear();
      beginSustain_76.setpreclear();
      endSustain_76.setpreclear();
      beginSustain_83.setpreclear();
      endSustain_83.setpreclear();
      beginSustain_90.setpreclear();
      endSustain_90.setpreclear();
      beginSustain_97.setpreclear();
      endSustain_97.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = rotaryTableTrigger.getStatus() ? rotaryTableTrigger.setprepresent() : rotaryTableTrigger.setpreclear();
      rotaryTableTrigger.setpreval(rotaryTableTrigger.getValue());
      rotaryTableTrigger.setClear();
      dummyint = manualRemovePos1.getStatus() ? manualRemovePos1.setprepresent() : manualRemovePos1.setpreclear();
      manualRemovePos1.setpreval(manualRemovePos1.getValue());
      manualRemovePos1.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      bottleAtPos3.sethook();
      bottleAtPos3.setClear();
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      bottleAtPos6.sethook();
      bottleAtPos6.setClear();
      tableAlignedWithSensor.sethook();
      tableAlignedWithSensor.setClear();
      capOnBottleAtPos1.sethook();
      capOnBottleAtPos1.setClear();
      rotationInProgress_1.setClear();
      finishedRotating_1.setClear();
      deadSignal_1.setClear();
      conveyorToPos1_1.setClear();
      pos5ToConveyor_1.setClear();
      removePos1_1.setClear();
      pos12_1.setClear();
      pos23_1.setClear();
      pos34_1.setClear();
      pos45_1.setClear();
      pos56_1.setClear();
      pos61_1.setClear();
      pos1_1.setClear();
      pos2_1.setClear();
      pos3_1.setClear();
      pos4_1.setClear();
      pos5_1.setClear();
      pos6_1.setClear();
      cap1_1.setClear();
      cap2_1.setClear();
      cap3_1.setClear();
      cap4_1.setClear();
      cap5_1.setClear();
      cap6_1.setClear();
      cap12_1.setClear();
      cap23_1.setClear();
      cap34_1.setClear();
      cap45_1.setClear();
      cap56_1.setClear();
      cap61_1.setClear();
      conveyorActive_1.setClear();
      conveyorBottleBeforePos1_1.setClear();
      capperPos4_1.setClear();
      beginSustain_14.setClear();
      endSustain_14.setClear();
      beginSustain_21.setClear();
      endSustain_21.setClear();
      beginSustain_28.setClear();
      endSustain_28.setClear();
      beginSustain_35.setClear();
      endSustain_35.setClear();
      beginSustain_42.setClear();
      endSustain_42.setClear();
      beginSustain_49.setClear();
      endSustain_49.setClear();
      beginSustain_62.setClear();
      endSustain_62.setClear();
      beginSustain_69.setClear();
      endSustain_69.setClear();
      beginSustain_76.setClear();
      endSustain_76.setClear();
      beginSustain_83.setClear();
      endSustain_83.setClear();
      beginSustain_90.setClear();
      endSustain_90.setClear();
      beginSustain_97.setClear();
      endSustain_97.setClear();
      plantConveyorActive_in.sethook();
      plantConveyorBottleBeforePos1_in.sethook();
      plantCapperPos4_in.sethook();
      receivedPos1_o.sethook();
      sentPos5_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        plantConveyorActive_in.gethook();
        plantConveyorBottleBeforePos1_in.gethook();
        plantCapperPos4_in.gethook();
        receivedPos1_o.gethook();
        sentPos5_o.gethook();
        rotaryTableTrigger.gethook();
        manualRemovePos1.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

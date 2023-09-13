import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class LightCD extends ClockDomain{
  public LightCD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal occu1 = new Signal("occu1", Signal.INPUT);
  public Signal occu2 = new Signal("occu2", Signal.INPUT);
  public Signal occu3 = new Signal("occu3", Signal.INPUT);
  public Signal occu4 = new Signal("occu4", Signal.INPUT);
  public Signal occu5 = new Signal("occu5", Signal.INPUT);
  public Signal occu6 = new Signal("occu6", Signal.INPUT);
  public Signal occu7 = new Signal("occu7", Signal.INPUT);
  public Signal clock = new Signal("clock", Signal.INPUT);
  public Signal light1 = new Signal("light1", Signal.OUTPUT);
  public Signal light2 = new Signal("light2", Signal.OUTPUT);
  public Signal light3 = new Signal("light3", Signal.OUTPUT);
  public Signal light4 = new Signal("light4", Signal.OUTPUT);
  public Signal light5 = new Signal("light5", Signal.OUTPUT);
  public Signal light6 = new Signal("light6", Signal.OUTPUT);
  public Signal light7 = new Signal("light7", Signal.OUTPUT);
  public input_Channel fireHappeningLight_in = new input_Channel();
  private Signal workingHours_16;
  private Signal fire_16;
  private Signal timer_22;
  private Signal startTimer_22;
  private Signal timer_31;
  private Signal startTimer_31;
  private Signal timer_40;
  private Signal startTimer_40;
  private Signal timer_49;
  private Signal startTimer_49;
  private int previous_thread_23;//sysj\ecs.sysj line: 39, column: 3
  private int lightLevel_thread_23;//sysj\ecs.sysj line: 40, column: 3
  private int previous_thread_32;//sysj\ecs.sysj line: 39, column: 3
  private int lightLevel_thread_32;//sysj\ecs.sysj line: 40, column: 3
  private int previous_thread_41;//sysj\ecs.sysj line: 39, column: 3
  private int lightLevel_thread_41;//sysj\ecs.sysj line: 40, column: 3
  private int previous_thread_50;//sysj\ecs.sysj line: 39, column: 3
  private int lightLevel_thread_50;//sysj\ecs.sysj line: 40, column: 3
  private long __start_thread_26;//sysj\ecs.sysj line: 86, column: 5
  private long __start_thread_35;//sysj\ecs.sysj line: 86, column: 5
  private long __start_thread_44;//sysj\ecs.sysj line: 86, column: 5
  private long __start_thread_53;//sysj\ecs.sysj line: 86, column: 5
  private int S1545 = 1;
  private int S688 = 1;
  private int S724 = 1;
  private int S723 = 1;
  private int S695 = 1;
  private int S690 = 1;
  private int S735 = 1;
  private int S937 = 1;
  private int S935 = 1;
  private int S783 = 1;
  private int S933 = 1;
  private int S923 = 1;
  private int S829 = 1;
  private int S800 = 1;
  private int S806 = 1;
  private int S931 = 1;
  private int S1139 = 1;
  private int S1137 = 1;
  private int S985 = 1;
  private int S1135 = 1;
  private int S1125 = 1;
  private int S1031 = 1;
  private int S1002 = 1;
  private int S1008 = 1;
  private int S1133 = 1;
  private int S1341 = 1;
  private int S1339 = 1;
  private int S1187 = 1;
  private int S1337 = 1;
  private int S1327 = 1;
  private int S1233 = 1;
  private int S1204 = 1;
  private int S1210 = 1;
  private int S1335 = 1;
  private int S1543 = 1;
  private int S1541 = 1;
  private int S1389 = 1;
  private int S1539 = 1;
  private int S1529 = 1;
  private int S1435 = 1;
  private int S1406 = 1;
  private int S1412 = 1;
  private int S1537 = 1;
  
  private int[] ends = new int[56];
  private int[] tdone = new int[56];
  
  public void thread1684(int [] tdone, int [] ends){
        switch(S1537){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        if((occu7.getpreval() == null ? 0 : ((Integer)occu7.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
          timer_49.setPresent();//sysj\ecs.sysj line: 105, column: 6
          currsigs.addElement(timer_49);
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

  public void thread1682(int [] tdone, int [] ends){
        switch(S1412){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        if(timer_49.getprestatus()){//sysj\ecs.sysj line: 93, column: 12
          S1412=0;
          active[54]=0;
          ends[54]=0;
          tdone[54]=1;
        }
        else {
          startTimer_49.setPresent();//sysj\ecs.sysj line: 94, column: 7
          currsigs.addElement(startTimer_49);
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
        break;
      
    }
  }

  public void thread1681(int [] tdone, int [] ends){
        switch(S1406){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_53 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
          ends[53]=2;
          ;//sysj\ecs.sysj line: 86, column: 5
          timer_49.setPresent();//sysj\ecs.sysj line: 88, column: 6
          currsigs.addElement(timer_49);
          S1406=0;
          active[53]=0;
          ends[53]=0;
          tdone[53]=1;
        }
        else {
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        break;
      
    }
  }

  public void thread1679(int [] tdone, int [] ends){
        S1412=1;
    startTimer_49.setPresent();//sysj\ecs.sysj line: 94, column: 7
    currsigs.addElement(startTimer_49);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread1678(int [] tdone, int [] ends){
        S1406=1;
    __start_thread_53 = com.systemj.Timer.getMs();//sysj\ecs.sysj line: 86, column: 5
    if(com.systemj.Timer.getMs() - __start_thread_53 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
      ends[53]=2;
      ;//sysj\ecs.sysj line: 86, column: 5
      timer_49.setPresent();//sysj\ecs.sysj line: 88, column: 6
      currsigs.addElement(timer_49);
      S1406=0;
      active[53]=0;
      ends[53]=0;
      tdone[53]=1;
    }
    else {
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
  }

  public void thread1677(int [] tdone, int [] ends){
        switch(S1529){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        switch(S1435){
          case 0 : 
            if(startTimer_49.getprestatus()){//sysj\ecs.sysj line: 84, column: 11
              S1435=1;
              thread1678(tdone,ends);
              thread1679(tdone,ends);
              int biggest1680 = 0;
              if(ends[53]>=biggest1680){
                biggest1680=ends[53];
              }
              if(ends[54]>=biggest1680){
                biggest1680=ends[54];
              }
              if(biggest1680 == 1){
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 1 : 
            thread1681(tdone,ends);
            thread1682(tdone,ends);
            int biggest1683 = 0;
            if(ends[53]>=biggest1683){
              biggest1683=ends[53];
            }
            if(ends[54]>=biggest1683){
              biggest1683=ends[54];
            }
            if(biggest1683 == 1){
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            //FINXME code
            if(biggest1683 == 0){
              S1435=2;
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 2 : 
            S1435=2;
            S1435=0;
            active[52]=1;
            ends[52]=1;
            tdone[52]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1676(int [] tdone, int [] ends){
        switch(S1539){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        thread1677(tdone,ends);
        thread1684(tdone,ends);
        int biggest1685 = 0;
        if(ends[52]>=biggest1685){
          biggest1685=ends[52];
        }
        if(ends[55]>=biggest1685){
          biggest1685=ends[55];
        }
        if(biggest1685 == 1){
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
        //FINXME code
        if(biggest1685 == 0){
          S1539=0;
          active[51]=0;
          ends[51]=0;
          tdone[51]=1;
        }
        break;
      
    }
  }

  public void thread1675(int [] tdone, int [] ends){
        switch(S1389){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
          if(fire_16.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
            lightLevel_thread_50 = 2;//sysj\ecs.sysj line: 46, column: 6
            light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light7);
            light7.setValue(lightLevel_thread_50);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_50 = lightLevel_thread_50;//sysj\ecs.sysj line: 74, column: 4
            active[50]=1;
            ends[50]=1;
            tdone[50]=1;
          }
          else {
            if((occu7.getpreval() == null ? 0 : ((Integer)occu7.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
              lightLevel_thread_50 = 2;//sysj\ecs.sysj line: 50, column: 7
              light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light7);
              light7.setValue(lightLevel_thread_50);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_50 = lightLevel_thread_50;//sysj\ecs.sysj line: 74, column: 4
              active[50]=1;
              ends[50]=1;
              tdone[50]=1;
            }
            else {
              if(previous_thread_50 == 2){//sysj\ecs.sysj line: 53, column: 17
                startTimer_49.setPresent();//sysj\ecs.sysj line: 54, column: 7
                currsigs.addElement(startTimer_49);
                lightLevel_thread_50 = 1;//sysj\ecs.sysj line: 55, column: 7
                light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
                currsigs.addElement(light7);
                light7.setValue(lightLevel_thread_50);//sysj\ecs.sysj line: 73, column: 4
                previous_thread_50 = lightLevel_thread_50;//sysj\ecs.sysj line: 74, column: 4
                active[50]=1;
                ends[50]=1;
                tdone[50]=1;
              }
              else {
                if(startTimer_49.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
                  lightLevel_thread_50 = 1;//sysj\ecs.sysj line: 61, column: 8
                  light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light7);
                  light7.setValue(lightLevel_thread_50);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_50 = lightLevel_thread_50;//sysj\ecs.sysj line: 74, column: 4
                  active[50]=1;
                  ends[50]=1;
                  tdone[50]=1;
                }
                else {
                  lightLevel_thread_50 = 0;//sysj\ecs.sysj line: 64, column: 8
                  light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light7);
                  light7.setValue(lightLevel_thread_50);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_50 = lightLevel_thread_50;//sysj\ecs.sysj line: 74, column: 4
                  active[50]=1;
                  ends[50]=1;
                  tdone[50]=1;
                }
              }
            }
          }
        }
        else {
          lightLevel_thread_50 = 0;//sysj\ecs.sysj line: 70, column: 5
          light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light7);
          light7.setValue(lightLevel_thread_50);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_50 = lightLevel_thread_50;//sysj\ecs.sysj line: 74, column: 4
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        break;
      
    }
  }

  public void thread1674(int [] tdone, int [] ends){
        switch(S1541){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        timer_49.setClear();//sysj\ecs.sysj line: 35, column: 2
        startTimer_49.setClear();//sysj\ecs.sysj line: 36, column: 2
        thread1675(tdone,ends);
        thread1676(tdone,ends);
        int biggest1686 = 0;
        if(ends[50]>=biggest1686){
          biggest1686=ends[50];
        }
        if(ends[51]>=biggest1686){
          biggest1686=ends[51];
        }
        if(biggest1686 == 1){
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        //FINXME code
        if(biggest1686 == 0){
          S1541=0;
          active[49]=0;
          ends[49]=0;
          tdone[49]=1;
        }
        break;
      
    }
  }

  public void thread1673(int [] tdone, int [] ends){
        active[48]=0;
    ends[48]=0;
    tdone[48]=1;
  }

  public void thread1672(int [] tdone, int [] ends){
        switch(S1543){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        thread1673(tdone,ends);
        thread1674(tdone,ends);
        int biggest1687 = 0;
        if(ends[48]>=biggest1687){
          biggest1687=ends[48];
        }
        if(ends[49]>=biggest1687){
          biggest1687=ends[49];
        }
        if(biggest1687 == 1){
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        //FINXME code
        if(biggest1687 == 0){
          S1543=0;
          active[47]=0;
          ends[47]=0;
          tdone[47]=1;
        }
        break;
      
    }
  }

  public void thread1668(int [] tdone, int [] ends){
        switch(S1335){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if((occu3.getpreval() == null ? 0 : ((Integer)occu3.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
          timer_40.setPresent();//sysj\ecs.sysj line: 105, column: 6
          currsigs.addElement(timer_40);
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
      
    }
  }

  public void thread1666(int [] tdone, int [] ends){
        switch(S1210){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        if(timer_40.getprestatus()){//sysj\ecs.sysj line: 93, column: 12
          S1210=0;
          active[45]=0;
          ends[45]=0;
          tdone[45]=1;
        }
        else {
          startTimer_40.setPresent();//sysj\ecs.sysj line: 94, column: 7
          currsigs.addElement(startTimer_40);
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        break;
      
    }
  }

  public void thread1665(int [] tdone, int [] ends){
        switch(S1204){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_44 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
          ends[44]=2;
          ;//sysj\ecs.sysj line: 86, column: 5
          timer_40.setPresent();//sysj\ecs.sysj line: 88, column: 6
          currsigs.addElement(timer_40);
          S1204=0;
          active[44]=0;
          ends[44]=0;
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

  public void thread1663(int [] tdone, int [] ends){
        S1210=1;
    startTimer_40.setPresent();//sysj\ecs.sysj line: 94, column: 7
    currsigs.addElement(startTimer_40);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread1662(int [] tdone, int [] ends){
        S1204=1;
    __start_thread_44 = com.systemj.Timer.getMs();//sysj\ecs.sysj line: 86, column: 5
    if(com.systemj.Timer.getMs() - __start_thread_44 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
      ends[44]=2;
      ;//sysj\ecs.sysj line: 86, column: 5
      timer_40.setPresent();//sysj\ecs.sysj line: 88, column: 6
      currsigs.addElement(timer_40);
      S1204=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
    else {
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread1661(int [] tdone, int [] ends){
        switch(S1327){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        switch(S1233){
          case 0 : 
            if(startTimer_40.getprestatus()){//sysj\ecs.sysj line: 84, column: 11
              S1233=1;
              thread1662(tdone,ends);
              thread1663(tdone,ends);
              int biggest1664 = 0;
              if(ends[44]>=biggest1664){
                biggest1664=ends[44];
              }
              if(ends[45]>=biggest1664){
                biggest1664=ends[45];
              }
              if(biggest1664 == 1){
                active[43]=1;
                ends[43]=1;
                tdone[43]=1;
              }
            }
            else {
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            break;
          
          case 1 : 
            thread1665(tdone,ends);
            thread1666(tdone,ends);
            int biggest1667 = 0;
            if(ends[44]>=biggest1667){
              biggest1667=ends[44];
            }
            if(ends[45]>=biggest1667){
              biggest1667=ends[45];
            }
            if(biggest1667 == 1){
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            //FINXME code
            if(biggest1667 == 0){
              S1233=2;
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            break;
          
          case 2 : 
            S1233=2;
            S1233=0;
            active[43]=1;
            ends[43]=1;
            tdone[43]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1660(int [] tdone, int [] ends){
        switch(S1337){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        thread1661(tdone,ends);
        thread1668(tdone,ends);
        int biggest1669 = 0;
        if(ends[43]>=biggest1669){
          biggest1669=ends[43];
        }
        if(ends[46]>=biggest1669){
          biggest1669=ends[46];
        }
        if(biggest1669 == 1){
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        //FINXME code
        if(biggest1669 == 0){
          S1337=0;
          active[42]=0;
          ends[42]=0;
          tdone[42]=1;
        }
        break;
      
    }
  }

  public void thread1659(int [] tdone, int [] ends){
        switch(S1187){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
          if(fire_16.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
            lightLevel_thread_41 = 2;//sysj\ecs.sysj line: 46, column: 6
            light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light3);
            light3.setValue(lightLevel_thread_41);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_41 = lightLevel_thread_41;//sysj\ecs.sysj line: 74, column: 4
            active[41]=1;
            ends[41]=1;
            tdone[41]=1;
          }
          else {
            if((occu3.getpreval() == null ? 0 : ((Integer)occu3.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
              lightLevel_thread_41 = 2;//sysj\ecs.sysj line: 50, column: 7
              light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light3);
              light3.setValue(lightLevel_thread_41);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_41 = lightLevel_thread_41;//sysj\ecs.sysj line: 74, column: 4
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            else {
              if(previous_thread_41 == 2){//sysj\ecs.sysj line: 53, column: 17
                startTimer_40.setPresent();//sysj\ecs.sysj line: 54, column: 7
                currsigs.addElement(startTimer_40);
                lightLevel_thread_41 = 1;//sysj\ecs.sysj line: 55, column: 7
                light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
                currsigs.addElement(light3);
                light3.setValue(lightLevel_thread_41);//sysj\ecs.sysj line: 73, column: 4
                previous_thread_41 = lightLevel_thread_41;//sysj\ecs.sysj line: 74, column: 4
                active[41]=1;
                ends[41]=1;
                tdone[41]=1;
              }
              else {
                if(startTimer_40.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
                  lightLevel_thread_41 = 1;//sysj\ecs.sysj line: 61, column: 8
                  light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light3);
                  light3.setValue(lightLevel_thread_41);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_41 = lightLevel_thread_41;//sysj\ecs.sysj line: 74, column: 4
                  active[41]=1;
                  ends[41]=1;
                  tdone[41]=1;
                }
                else {
                  lightLevel_thread_41 = 0;//sysj\ecs.sysj line: 64, column: 8
                  light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light3);
                  light3.setValue(lightLevel_thread_41);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_41 = lightLevel_thread_41;//sysj\ecs.sysj line: 74, column: 4
                  active[41]=1;
                  ends[41]=1;
                  tdone[41]=1;
                }
              }
            }
          }
        }
        else {
          lightLevel_thread_41 = 0;//sysj\ecs.sysj line: 70, column: 5
          light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light3);
          light3.setValue(lightLevel_thread_41);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_41 = lightLevel_thread_41;//sysj\ecs.sysj line: 74, column: 4
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        break;
      
    }
  }

  public void thread1658(int [] tdone, int [] ends){
        switch(S1339){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        timer_40.setClear();//sysj\ecs.sysj line: 35, column: 2
        startTimer_40.setClear();//sysj\ecs.sysj line: 36, column: 2
        thread1659(tdone,ends);
        thread1660(tdone,ends);
        int biggest1670 = 0;
        if(ends[41]>=biggest1670){
          biggest1670=ends[41];
        }
        if(ends[42]>=biggest1670){
          biggest1670=ends[42];
        }
        if(biggest1670 == 1){
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        //FINXME code
        if(biggest1670 == 0){
          S1339=0;
          active[40]=0;
          ends[40]=0;
          tdone[40]=1;
        }
        break;
      
    }
  }

  public void thread1657(int [] tdone, int [] ends){
        active[39]=0;
    ends[39]=0;
    tdone[39]=1;
  }

  public void thread1656(int [] tdone, int [] ends){
        switch(S1341){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        thread1657(tdone,ends);
        thread1658(tdone,ends);
        int biggest1671 = 0;
        if(ends[39]>=biggest1671){
          biggest1671=ends[39];
        }
        if(ends[40]>=biggest1671){
          biggest1671=ends[40];
        }
        if(biggest1671 == 1){
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        //FINXME code
        if(biggest1671 == 0){
          S1341=0;
          active[38]=0;
          ends[38]=0;
          tdone[38]=1;
        }
        break;
      
    }
  }

  public void thread1652(int [] tdone, int [] ends){
        switch(S1133){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if((occu2.getpreval() == null ? 0 : ((Integer)occu2.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
          timer_31.setPresent();//sysj\ecs.sysj line: 105, column: 6
          currsigs.addElement(timer_31);
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

  public void thread1650(int [] tdone, int [] ends){
        switch(S1008){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(timer_31.getprestatus()){//sysj\ecs.sysj line: 93, column: 12
          S1008=0;
          active[36]=0;
          ends[36]=0;
          tdone[36]=1;
        }
        else {
          startTimer_31.setPresent();//sysj\ecs.sysj line: 94, column: 7
          currsigs.addElement(startTimer_31);
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        break;
      
    }
  }

  public void thread1649(int [] tdone, int [] ends){
        switch(S1002){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_35 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
          ends[35]=2;
          ;//sysj\ecs.sysj line: 86, column: 5
          timer_31.setPresent();//sysj\ecs.sysj line: 88, column: 6
          currsigs.addElement(timer_31);
          S1002=0;
          active[35]=0;
          ends[35]=0;
          tdone[35]=1;
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread1647(int [] tdone, int [] ends){
        S1008=1;
    startTimer_31.setPresent();//sysj\ecs.sysj line: 94, column: 7
    currsigs.addElement(startTimer_31);
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread1646(int [] tdone, int [] ends){
        S1002=1;
    __start_thread_35 = com.systemj.Timer.getMs();//sysj\ecs.sysj line: 86, column: 5
    if(com.systemj.Timer.getMs() - __start_thread_35 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
      ends[35]=2;
      ;//sysj\ecs.sysj line: 86, column: 5
      timer_31.setPresent();//sysj\ecs.sysj line: 88, column: 6
      currsigs.addElement(timer_31);
      S1002=0;
      active[35]=0;
      ends[35]=0;
      tdone[35]=1;
    }
    else {
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread1645(int [] tdone, int [] ends){
        switch(S1125){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        switch(S1031){
          case 0 : 
            if(startTimer_31.getprestatus()){//sysj\ecs.sysj line: 84, column: 11
              S1031=1;
              thread1646(tdone,ends);
              thread1647(tdone,ends);
              int biggest1648 = 0;
              if(ends[35]>=biggest1648){
                biggest1648=ends[35];
              }
              if(ends[36]>=biggest1648){
                biggest1648=ends[36];
              }
              if(biggest1648 == 1){
                active[34]=1;
                ends[34]=1;
                tdone[34]=1;
              }
            }
            else {
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            break;
          
          case 1 : 
            thread1649(tdone,ends);
            thread1650(tdone,ends);
            int biggest1651 = 0;
            if(ends[35]>=biggest1651){
              biggest1651=ends[35];
            }
            if(ends[36]>=biggest1651){
              biggest1651=ends[36];
            }
            if(biggest1651 == 1){
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            //FINXME code
            if(biggest1651 == 0){
              S1031=2;
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            break;
          
          case 2 : 
            S1031=2;
            S1031=0;
            active[34]=1;
            ends[34]=1;
            tdone[34]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1644(int [] tdone, int [] ends){
        switch(S1135){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        thread1645(tdone,ends);
        thread1652(tdone,ends);
        int biggest1653 = 0;
        if(ends[34]>=biggest1653){
          biggest1653=ends[34];
        }
        if(ends[37]>=biggest1653){
          biggest1653=ends[37];
        }
        if(biggest1653 == 1){
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        //FINXME code
        if(biggest1653 == 0){
          S1135=0;
          active[33]=0;
          ends[33]=0;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread1643(int [] tdone, int [] ends){
        switch(S985){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
          if(fire_16.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
            lightLevel_thread_32 = 2;//sysj\ecs.sysj line: 46, column: 6
            light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light2);
            light2.setValue(lightLevel_thread_32);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_32 = lightLevel_thread_32;//sysj\ecs.sysj line: 74, column: 4
            active[32]=1;
            ends[32]=1;
            tdone[32]=1;
          }
          else {
            if((occu2.getpreval() == null ? 0 : ((Integer)occu2.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
              lightLevel_thread_32 = 2;//sysj\ecs.sysj line: 50, column: 7
              light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light2);
              light2.setValue(lightLevel_thread_32);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_32 = lightLevel_thread_32;//sysj\ecs.sysj line: 74, column: 4
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            else {
              if(previous_thread_32 == 2){//sysj\ecs.sysj line: 53, column: 17
                startTimer_31.setPresent();//sysj\ecs.sysj line: 54, column: 7
                currsigs.addElement(startTimer_31);
                lightLevel_thread_32 = 1;//sysj\ecs.sysj line: 55, column: 7
                light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
                currsigs.addElement(light2);
                light2.setValue(lightLevel_thread_32);//sysj\ecs.sysj line: 73, column: 4
                previous_thread_32 = lightLevel_thread_32;//sysj\ecs.sysj line: 74, column: 4
                active[32]=1;
                ends[32]=1;
                tdone[32]=1;
              }
              else {
                if(startTimer_31.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
                  lightLevel_thread_32 = 1;//sysj\ecs.sysj line: 61, column: 8
                  light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light2);
                  light2.setValue(lightLevel_thread_32);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_32 = lightLevel_thread_32;//sysj\ecs.sysj line: 74, column: 4
                  active[32]=1;
                  ends[32]=1;
                  tdone[32]=1;
                }
                else {
                  lightLevel_thread_32 = 0;//sysj\ecs.sysj line: 64, column: 8
                  light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light2);
                  light2.setValue(lightLevel_thread_32);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_32 = lightLevel_thread_32;//sysj\ecs.sysj line: 74, column: 4
                  active[32]=1;
                  ends[32]=1;
                  tdone[32]=1;
                }
              }
            }
          }
        }
        else {
          lightLevel_thread_32 = 0;//sysj\ecs.sysj line: 70, column: 5
          light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light2);
          light2.setValue(lightLevel_thread_32);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_32 = lightLevel_thread_32;//sysj\ecs.sysj line: 74, column: 4
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        break;
      
    }
  }

  public void thread1642(int [] tdone, int [] ends){
        switch(S1137){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        timer_31.setClear();//sysj\ecs.sysj line: 35, column: 2
        startTimer_31.setClear();//sysj\ecs.sysj line: 36, column: 2
        thread1643(tdone,ends);
        thread1644(tdone,ends);
        int biggest1654 = 0;
        if(ends[32]>=biggest1654){
          biggest1654=ends[32];
        }
        if(ends[33]>=biggest1654){
          biggest1654=ends[33];
        }
        if(biggest1654 == 1){
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        //FINXME code
        if(biggest1654 == 0){
          S1137=0;
          active[31]=0;
          ends[31]=0;
          tdone[31]=1;
        }
        break;
      
    }
  }

  public void thread1641(int [] tdone, int [] ends){
        active[30]=0;
    ends[30]=0;
    tdone[30]=1;
  }

  public void thread1640(int [] tdone, int [] ends){
        switch(S1139){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        thread1641(tdone,ends);
        thread1642(tdone,ends);
        int biggest1655 = 0;
        if(ends[30]>=biggest1655){
          biggest1655=ends[30];
        }
        if(ends[31]>=biggest1655){
          biggest1655=ends[31];
        }
        if(biggest1655 == 1){
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        //FINXME code
        if(biggest1655 == 0){
          S1139=0;
          active[29]=0;
          ends[29]=0;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread1636(int [] tdone, int [] ends){
        switch(S931){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if((occu1.getpreval() == null ? 0 : ((Integer)occu1.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
          timer_22.setPresent();//sysj\ecs.sysj line: 105, column: 6
          currsigs.addElement(timer_22);
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        else {
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread1634(int [] tdone, int [] ends){
        switch(S806){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(timer_22.getprestatus()){//sysj\ecs.sysj line: 93, column: 12
          S806=0;
          active[27]=0;
          ends[27]=0;
          tdone[27]=1;
        }
        else {
          startTimer_22.setPresent();//sysj\ecs.sysj line: 94, column: 7
          currsigs.addElement(startTimer_22);
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        break;
      
    }
  }

  public void thread1633(int [] tdone, int [] ends){
        switch(S800){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_26 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
          ends[26]=2;
          ;//sysj\ecs.sysj line: 86, column: 5
          timer_22.setPresent();//sysj\ecs.sysj line: 88, column: 6
          currsigs.addElement(timer_22);
          S800=0;
          active[26]=0;
          ends[26]=0;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread1631(int [] tdone, int [] ends){
        S806=1;
    startTimer_22.setPresent();//sysj\ecs.sysj line: 94, column: 7
    currsigs.addElement(startTimer_22);
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread1630(int [] tdone, int [] ends){
        S800=1;
    __start_thread_26 = com.systemj.Timer.getMs();//sysj\ecs.sysj line: 86, column: 5
    if(com.systemj.Timer.getMs() - __start_thread_26 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
      ends[26]=2;
      ;//sysj\ecs.sysj line: 86, column: 5
      timer_22.setPresent();//sysj\ecs.sysj line: 88, column: 6
      currsigs.addElement(timer_22);
      S800=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
    else {
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread1629(int [] tdone, int [] ends){
        switch(S923){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S829){
          case 0 : 
            if(startTimer_22.getprestatus()){//sysj\ecs.sysj line: 84, column: 11
              S829=1;
              thread1630(tdone,ends);
              thread1631(tdone,ends);
              int biggest1632 = 0;
              if(ends[26]>=biggest1632){
                biggest1632=ends[26];
              }
              if(ends[27]>=biggest1632){
                biggest1632=ends[27];
              }
              if(biggest1632 == 1){
                active[25]=1;
                ends[25]=1;
                tdone[25]=1;
              }
            }
            else {
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
          case 1 : 
            thread1633(tdone,ends);
            thread1634(tdone,ends);
            int biggest1635 = 0;
            if(ends[26]>=biggest1635){
              biggest1635=ends[26];
            }
            if(ends[27]>=biggest1635){
              biggest1635=ends[27];
            }
            if(biggest1635 == 1){
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            //FINXME code
            if(biggest1635 == 0){
              S829=2;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
          case 2 : 
            S829=2;
            S829=0;
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1628(int [] tdone, int [] ends){
        switch(S933){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        thread1629(tdone,ends);
        thread1636(tdone,ends);
        int biggest1637 = 0;
        if(ends[25]>=biggest1637){
          biggest1637=ends[25];
        }
        if(ends[28]>=biggest1637){
          biggest1637=ends[28];
        }
        if(biggest1637 == 1){
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        //FINXME code
        if(biggest1637 == 0){
          S933=0;
          active[24]=0;
          ends[24]=0;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread1627(int [] tdone, int [] ends){
        switch(S783){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
          if(fire_16.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
            lightLevel_thread_23 = 2;//sysj\ecs.sysj line: 46, column: 6
            light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light1);
            light1.setValue(lightLevel_thread_23);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_23 = lightLevel_thread_23;//sysj\ecs.sysj line: 74, column: 4
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            if((occu1.getpreval() == null ? 0 : ((Integer)occu1.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
              lightLevel_thread_23 = 2;//sysj\ecs.sysj line: 50, column: 7
              light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light1);
              light1.setValue(lightLevel_thread_23);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_23 = lightLevel_thread_23;//sysj\ecs.sysj line: 74, column: 4
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              if(previous_thread_23 == 2){//sysj\ecs.sysj line: 53, column: 17
                startTimer_22.setPresent();//sysj\ecs.sysj line: 54, column: 7
                currsigs.addElement(startTimer_22);
                lightLevel_thread_23 = 1;//sysj\ecs.sysj line: 55, column: 7
                light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
                currsigs.addElement(light1);
                light1.setValue(lightLevel_thread_23);//sysj\ecs.sysj line: 73, column: 4
                previous_thread_23 = lightLevel_thread_23;//sysj\ecs.sysj line: 74, column: 4
                active[23]=1;
                ends[23]=1;
                tdone[23]=1;
              }
              else {
                if(startTimer_22.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
                  lightLevel_thread_23 = 1;//sysj\ecs.sysj line: 61, column: 8
                  light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light1);
                  light1.setValue(lightLevel_thread_23);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_23 = lightLevel_thread_23;//sysj\ecs.sysj line: 74, column: 4
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  lightLevel_thread_23 = 0;//sysj\ecs.sysj line: 64, column: 8
                  light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light1);
                  light1.setValue(lightLevel_thread_23);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_23 = lightLevel_thread_23;//sysj\ecs.sysj line: 74, column: 4
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
              }
            }
          }
        }
        else {
          lightLevel_thread_23 = 0;//sysj\ecs.sysj line: 70, column: 5
          light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light1);
          light1.setValue(lightLevel_thread_23);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_23 = lightLevel_thread_23;//sysj\ecs.sysj line: 74, column: 4
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread1626(int [] tdone, int [] ends){
        switch(S935){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        timer_22.setClear();//sysj\ecs.sysj line: 35, column: 2
        startTimer_22.setClear();//sysj\ecs.sysj line: 36, column: 2
        thread1627(tdone,ends);
        thread1628(tdone,ends);
        int biggest1638 = 0;
        if(ends[23]>=biggest1638){
          biggest1638=ends[23];
        }
        if(ends[24]>=biggest1638){
          biggest1638=ends[24];
        }
        if(biggest1638 == 1){
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        //FINXME code
        if(biggest1638 == 0){
          S935=0;
          active[22]=0;
          ends[22]=0;
          tdone[22]=1;
        }
        break;
      
    }
  }

  public void thread1625(int [] tdone, int [] ends){
        active[21]=0;
    ends[21]=0;
    tdone[21]=1;
  }

  public void thread1624(int [] tdone, int [] ends){
        switch(S937){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        thread1625(tdone,ends);
        thread1626(tdone,ends);
        int biggest1639 = 0;
        if(ends[21]>=biggest1639){
          biggest1639=ends[21];
        }
        if(ends[22]>=biggest1639){
          biggest1639=ends[22];
        }
        if(biggest1639 == 1){
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        //FINXME code
        if(biggest1639 == 0){
          S937=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread1623(int [] tdone, int [] ends){
        switch(S735){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\ecs.sysj line: 369, column: 13
          light4.setPresent();//sysj\ecs.sysj line: 370, column: 5
          currsigs.addElement(light4);
          light4.setValue(2);//sysj\ecs.sysj line: 370, column: 5
          light5.setPresent();//sysj\ecs.sysj line: 371, column: 5
          currsigs.addElement(light5);
          light5.setValue(2);//sysj\ecs.sysj line: 371, column: 5
          light6.setPresent();//sysj\ecs.sysj line: 372, column: 5
          currsigs.addElement(light6);
          light6.setValue(2);//sysj\ecs.sysj line: 372, column: 5
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread1622(int [] tdone, int [] ends){
        switch(S724){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S723){
          case 0 : 
            switch(S695){
              case 0 : 
                if(!fireHappeningLight_in.isPartnerPresent() || fireHappeningLight_in.isPartnerPreempted()){//sysj\ecs.sysj line: 361, column: 3
                  fireHappeningLight_in.setACK(false);//sysj\ecs.sysj line: 361, column: 3
                  S695=1;
                  active[18]=1;
                  ends[18]=1;
                  tdone[18]=1;
                }
                else {
                  switch(S690){
                    case 0 : 
                      if(!fireHappeningLight_in.isREQ()){//sysj\ecs.sysj line: 361, column: 3
                        fireHappeningLight_in.setACK(true);//sysj\ecs.sysj line: 361, column: 3
                        S690=1;
                        if(fireHappeningLight_in.isREQ()){//sysj\ecs.sysj line: 361, column: 3
                          fireHappeningLight_in.setACK(false);//sysj\ecs.sysj line: 361, column: 3
                          ends[18]=2;
                          ;//sysj\ecs.sysj line: 361, column: 3
                          S723=1;
                          fire_16.setPresent();//sysj\ecs.sysj line: 362, column: 3
                          currsigs.addElement(fire_16);
                          active[18]=1;
                          ends[18]=1;
                          tdone[18]=1;
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          tdone[18]=1;
                        }
                      }
                      else {
                        active[18]=1;
                        ends[18]=1;
                        tdone[18]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fireHappeningLight_in.isREQ()){//sysj\ecs.sysj line: 361, column: 3
                        fireHappeningLight_in.setACK(false);//sysj\ecs.sysj line: 361, column: 3
                        ends[18]=2;
                        ;//sysj\ecs.sysj line: 361, column: 3
                        S723=1;
                        fire_16.setPresent();//sysj\ecs.sysj line: 362, column: 3
                        currsigs.addElement(fire_16);
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
                    
                  }
                }
                break;
              
              case 1 : 
                S695=1;
                S695=0;
                if(!fireHappeningLight_in.isPartnerPresent() || fireHappeningLight_in.isPartnerPreempted()){//sysj\ecs.sysj line: 361, column: 3
                  fireHappeningLight_in.setACK(false);//sysj\ecs.sysj line: 361, column: 3
                  S695=1;
                  active[18]=1;
                  ends[18]=1;
                  tdone[18]=1;
                }
                else {
                  S690=0;
                  if(!fireHappeningLight_in.isREQ()){//sysj\ecs.sysj line: 361, column: 3
                    fireHappeningLight_in.setACK(true);//sysj\ecs.sysj line: 361, column: 3
                    S690=1;
                    if(fireHappeningLight_in.isREQ()){//sysj\ecs.sysj line: 361, column: 3
                      fireHappeningLight_in.setACK(false);//sysj\ecs.sysj line: 361, column: 3
                      ends[18]=2;
                      ;//sysj\ecs.sysj line: 361, column: 3
                      S723=1;
                      fire_16.setPresent();//sysj\ecs.sysj line: 362, column: 3
                      currsigs.addElement(fire_16);
                      active[18]=1;
                      ends[18]=1;
                      tdone[18]=1;
                    }
                    else {
                      active[18]=1;
                      ends[18]=1;
                      tdone[18]=1;
                    }
                  }
                  else {
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            fire_16.setPresent();//sysj\ecs.sysj line: 362, column: 3
            currsigs.addElement(fire_16);
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
          case 2 : 
            S723=2;
            S724=0;
            active[18]=0;
            ends[18]=0;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1621(int [] tdone, int [] ends){
        switch(S688){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if((clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) >= 470 && (clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) <= 1090){//sysj\ecs.sysj line: 351, column: 8
          workingHours_16.setPresent();//sysj\ecs.sysj line: 352, column: 5
          currsigs.addElement(workingHours_16);
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
  }

  public void thread1616(int [] tdone, int [] ends){
        S1537=1;
    if((occu7.getpreval() == null ? 0 : ((Integer)occu7.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
      timer_49.setPresent();//sysj\ecs.sysj line: 105, column: 6
      currsigs.addElement(timer_49);
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

  public void thread1615(int [] tdone, int [] ends){
        S1529=1;
    S1435=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread1614(int [] tdone, int [] ends){
        S1539=1;
    thread1615(tdone,ends);
    thread1616(tdone,ends);
    int biggest1617 = 0;
    if(ends[52]>=biggest1617){
      biggest1617=ends[52];
    }
    if(ends[55]>=biggest1617){
      biggest1617=ends[55];
    }
    if(biggest1617 == 1){
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread1613(int [] tdone, int [] ends){
        S1389=1;
    previous_thread_50 = 0;//sysj\ecs.sysj line: 39, column: 3
    lightLevel_thread_50 = 0;//sysj\ecs.sysj line: 40, column: 3
    if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
      if(fire_16.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
        lightLevel_thread_50 = 2;//sysj\ecs.sysj line: 46, column: 6
        light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
        currsigs.addElement(light7);
        light7.setValue(lightLevel_thread_50);//sysj\ecs.sysj line: 73, column: 4
        previous_thread_50 = lightLevel_thread_50;//sysj\ecs.sysj line: 74, column: 4
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
      else {
        if((occu7.getpreval() == null ? 0 : ((Integer)occu7.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
          lightLevel_thread_50 = 2;//sysj\ecs.sysj line: 50, column: 7
          light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light7);
          light7.setValue(lightLevel_thread_50);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_50 = lightLevel_thread_50;//sysj\ecs.sysj line: 74, column: 4
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        else {
          if(previous_thread_50 == 2){//sysj\ecs.sysj line: 53, column: 17
            startTimer_49.setPresent();//sysj\ecs.sysj line: 54, column: 7
            currsigs.addElement(startTimer_49);
            lightLevel_thread_50 = 1;//sysj\ecs.sysj line: 55, column: 7
            light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light7);
            light7.setValue(lightLevel_thread_50);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_50 = lightLevel_thread_50;//sysj\ecs.sysj line: 74, column: 4
            active[50]=1;
            ends[50]=1;
            tdone[50]=1;
          }
          else {
            if(startTimer_49.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
              lightLevel_thread_50 = 1;//sysj\ecs.sysj line: 61, column: 8
              light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light7);
              light7.setValue(lightLevel_thread_50);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_50 = lightLevel_thread_50;//sysj\ecs.sysj line: 74, column: 4
              active[50]=1;
              ends[50]=1;
              tdone[50]=1;
            }
            else {
              lightLevel_thread_50 = 0;//sysj\ecs.sysj line: 64, column: 8
              light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light7);
              light7.setValue(lightLevel_thread_50);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_50 = lightLevel_thread_50;//sysj\ecs.sysj line: 74, column: 4
              active[50]=1;
              ends[50]=1;
              tdone[50]=1;
            }
          }
        }
      }
    }
    else {
      lightLevel_thread_50 = 0;//sysj\ecs.sysj line: 70, column: 5
      light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
      currsigs.addElement(light7);
      light7.setValue(lightLevel_thread_50);//sysj\ecs.sysj line: 73, column: 4
      previous_thread_50 = lightLevel_thread_50;//sysj\ecs.sysj line: 74, column: 4
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread1612(int [] tdone, int [] ends){
        S1541=1;
    timer_49.setClear();//sysj\ecs.sysj line: 35, column: 2
    startTimer_49.setClear();//sysj\ecs.sysj line: 36, column: 2
    thread1613(tdone,ends);
    thread1614(tdone,ends);
    int biggest1618 = 0;
    if(ends[50]>=biggest1618){
      biggest1618=ends[50];
    }
    if(ends[51]>=biggest1618){
      biggest1618=ends[51];
    }
    if(biggest1618 == 1){
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread1611(int [] tdone, int [] ends){
        active[48]=0;
    ends[48]=0;
    tdone[48]=1;
  }

  public void thread1610(int [] tdone, int [] ends){
        S1543=1;
    thread1611(tdone,ends);
    thread1612(tdone,ends);
    int biggest1619 = 0;
    if(ends[48]>=biggest1619){
      biggest1619=ends[48];
    }
    if(ends[49]>=biggest1619){
      biggest1619=ends[49];
    }
    if(biggest1619 == 1){
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread1606(int [] tdone, int [] ends){
        S1335=1;
    if((occu3.getpreval() == null ? 0 : ((Integer)occu3.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
      timer_40.setPresent();//sysj\ecs.sysj line: 105, column: 6
      currsigs.addElement(timer_40);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread1605(int [] tdone, int [] ends){
        S1327=1;
    S1233=0;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread1604(int [] tdone, int [] ends){
        S1337=1;
    thread1605(tdone,ends);
    thread1606(tdone,ends);
    int biggest1607 = 0;
    if(ends[43]>=biggest1607){
      biggest1607=ends[43];
    }
    if(ends[46]>=biggest1607){
      biggest1607=ends[46];
    }
    if(biggest1607 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread1603(int [] tdone, int [] ends){
        S1187=1;
    previous_thread_41 = 0;//sysj\ecs.sysj line: 39, column: 3
    lightLevel_thread_41 = 0;//sysj\ecs.sysj line: 40, column: 3
    if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
      if(fire_16.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
        lightLevel_thread_41 = 2;//sysj\ecs.sysj line: 46, column: 6
        light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
        currsigs.addElement(light3);
        light3.setValue(lightLevel_thread_41);//sysj\ecs.sysj line: 73, column: 4
        previous_thread_41 = lightLevel_thread_41;//sysj\ecs.sysj line: 74, column: 4
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
      }
      else {
        if((occu3.getpreval() == null ? 0 : ((Integer)occu3.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
          lightLevel_thread_41 = 2;//sysj\ecs.sysj line: 50, column: 7
          light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light3);
          light3.setValue(lightLevel_thread_41);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_41 = lightLevel_thread_41;//sysj\ecs.sysj line: 74, column: 4
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          if(previous_thread_41 == 2){//sysj\ecs.sysj line: 53, column: 17
            startTimer_40.setPresent();//sysj\ecs.sysj line: 54, column: 7
            currsigs.addElement(startTimer_40);
            lightLevel_thread_41 = 1;//sysj\ecs.sysj line: 55, column: 7
            light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light3);
            light3.setValue(lightLevel_thread_41);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_41 = lightLevel_thread_41;//sysj\ecs.sysj line: 74, column: 4
            active[41]=1;
            ends[41]=1;
            tdone[41]=1;
          }
          else {
            if(startTimer_40.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
              lightLevel_thread_41 = 1;//sysj\ecs.sysj line: 61, column: 8
              light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light3);
              light3.setValue(lightLevel_thread_41);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_41 = lightLevel_thread_41;//sysj\ecs.sysj line: 74, column: 4
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            else {
              lightLevel_thread_41 = 0;//sysj\ecs.sysj line: 64, column: 8
              light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light3);
              light3.setValue(lightLevel_thread_41);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_41 = lightLevel_thread_41;//sysj\ecs.sysj line: 74, column: 4
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
          }
        }
      }
    }
    else {
      lightLevel_thread_41 = 0;//sysj\ecs.sysj line: 70, column: 5
      light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
      currsigs.addElement(light3);
      light3.setValue(lightLevel_thread_41);//sysj\ecs.sysj line: 73, column: 4
      previous_thread_41 = lightLevel_thread_41;//sysj\ecs.sysj line: 74, column: 4
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread1602(int [] tdone, int [] ends){
        S1339=1;
    timer_40.setClear();//sysj\ecs.sysj line: 35, column: 2
    startTimer_40.setClear();//sysj\ecs.sysj line: 36, column: 2
    thread1603(tdone,ends);
    thread1604(tdone,ends);
    int biggest1608 = 0;
    if(ends[41]>=biggest1608){
      biggest1608=ends[41];
    }
    if(ends[42]>=biggest1608){
      biggest1608=ends[42];
    }
    if(biggest1608 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread1601(int [] tdone, int [] ends){
        active[39]=0;
    ends[39]=0;
    tdone[39]=1;
  }

  public void thread1600(int [] tdone, int [] ends){
        S1341=1;
    thread1601(tdone,ends);
    thread1602(tdone,ends);
    int biggest1609 = 0;
    if(ends[39]>=biggest1609){
      biggest1609=ends[39];
    }
    if(ends[40]>=biggest1609){
      biggest1609=ends[40];
    }
    if(biggest1609 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread1596(int [] tdone, int [] ends){
        S1133=1;
    if((occu2.getpreval() == null ? 0 : ((Integer)occu2.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
      timer_31.setPresent();//sysj\ecs.sysj line: 105, column: 6
      currsigs.addElement(timer_31);
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

  public void thread1595(int [] tdone, int [] ends){
        S1125=1;
    S1031=0;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread1594(int [] tdone, int [] ends){
        S1135=1;
    thread1595(tdone,ends);
    thread1596(tdone,ends);
    int biggest1597 = 0;
    if(ends[34]>=biggest1597){
      biggest1597=ends[34];
    }
    if(ends[37]>=biggest1597){
      biggest1597=ends[37];
    }
    if(biggest1597 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread1593(int [] tdone, int [] ends){
        S985=1;
    previous_thread_32 = 0;//sysj\ecs.sysj line: 39, column: 3
    lightLevel_thread_32 = 0;//sysj\ecs.sysj line: 40, column: 3
    if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
      if(fire_16.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
        lightLevel_thread_32 = 2;//sysj\ecs.sysj line: 46, column: 6
        light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
        currsigs.addElement(light2);
        light2.setValue(lightLevel_thread_32);//sysj\ecs.sysj line: 73, column: 4
        previous_thread_32 = lightLevel_thread_32;//sysj\ecs.sysj line: 74, column: 4
        active[32]=1;
        ends[32]=1;
        tdone[32]=1;
      }
      else {
        if((occu2.getpreval() == null ? 0 : ((Integer)occu2.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
          lightLevel_thread_32 = 2;//sysj\ecs.sysj line: 50, column: 7
          light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light2);
          light2.setValue(lightLevel_thread_32);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_32 = lightLevel_thread_32;//sysj\ecs.sysj line: 74, column: 4
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        else {
          if(previous_thread_32 == 2){//sysj\ecs.sysj line: 53, column: 17
            startTimer_31.setPresent();//sysj\ecs.sysj line: 54, column: 7
            currsigs.addElement(startTimer_31);
            lightLevel_thread_32 = 1;//sysj\ecs.sysj line: 55, column: 7
            light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light2);
            light2.setValue(lightLevel_thread_32);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_32 = lightLevel_thread_32;//sysj\ecs.sysj line: 74, column: 4
            active[32]=1;
            ends[32]=1;
            tdone[32]=1;
          }
          else {
            if(startTimer_31.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
              lightLevel_thread_32 = 1;//sysj\ecs.sysj line: 61, column: 8
              light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light2);
              light2.setValue(lightLevel_thread_32);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_32 = lightLevel_thread_32;//sysj\ecs.sysj line: 74, column: 4
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            else {
              lightLevel_thread_32 = 0;//sysj\ecs.sysj line: 64, column: 8
              light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light2);
              light2.setValue(lightLevel_thread_32);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_32 = lightLevel_thread_32;//sysj\ecs.sysj line: 74, column: 4
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
          }
        }
      }
    }
    else {
      lightLevel_thread_32 = 0;//sysj\ecs.sysj line: 70, column: 5
      light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
      currsigs.addElement(light2);
      light2.setValue(lightLevel_thread_32);//sysj\ecs.sysj line: 73, column: 4
      previous_thread_32 = lightLevel_thread_32;//sysj\ecs.sysj line: 74, column: 4
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread1592(int [] tdone, int [] ends){
        S1137=1;
    timer_31.setClear();//sysj\ecs.sysj line: 35, column: 2
    startTimer_31.setClear();//sysj\ecs.sysj line: 36, column: 2
    thread1593(tdone,ends);
    thread1594(tdone,ends);
    int biggest1598 = 0;
    if(ends[32]>=biggest1598){
      biggest1598=ends[32];
    }
    if(ends[33]>=biggest1598){
      biggest1598=ends[33];
    }
    if(biggest1598 == 1){
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
  }

  public void thread1591(int [] tdone, int [] ends){
        active[30]=0;
    ends[30]=0;
    tdone[30]=1;
  }

  public void thread1590(int [] tdone, int [] ends){
        S1139=1;
    thread1591(tdone,ends);
    thread1592(tdone,ends);
    int biggest1599 = 0;
    if(ends[30]>=biggest1599){
      biggest1599=ends[30];
    }
    if(ends[31]>=biggest1599){
      biggest1599=ends[31];
    }
    if(biggest1599 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread1586(int [] tdone, int [] ends){
        S931=1;
    if((occu1.getpreval() == null ? 0 : ((Integer)occu1.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
      timer_22.setPresent();//sysj\ecs.sysj line: 105, column: 6
      currsigs.addElement(timer_22);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread1585(int [] tdone, int [] ends){
        S923=1;
    S829=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread1584(int [] tdone, int [] ends){
        S933=1;
    thread1585(tdone,ends);
    thread1586(tdone,ends);
    int biggest1587 = 0;
    if(ends[25]>=biggest1587){
      biggest1587=ends[25];
    }
    if(ends[28]>=biggest1587){
      biggest1587=ends[28];
    }
    if(biggest1587 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread1583(int [] tdone, int [] ends){
        S783=1;
    previous_thread_23 = 0;//sysj\ecs.sysj line: 39, column: 3
    lightLevel_thread_23 = 0;//sysj\ecs.sysj line: 40, column: 3
    if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
      if(fire_16.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
        lightLevel_thread_23 = 2;//sysj\ecs.sysj line: 46, column: 6
        light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
        currsigs.addElement(light1);
        light1.setValue(lightLevel_thread_23);//sysj\ecs.sysj line: 73, column: 4
        previous_thread_23 = lightLevel_thread_23;//sysj\ecs.sysj line: 74, column: 4
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
      else {
        if((occu1.getpreval() == null ? 0 : ((Integer)occu1.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
          lightLevel_thread_23 = 2;//sysj\ecs.sysj line: 50, column: 7
          light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light1);
          light1.setValue(lightLevel_thread_23);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_23 = lightLevel_thread_23;//sysj\ecs.sysj line: 74, column: 4
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          if(previous_thread_23 == 2){//sysj\ecs.sysj line: 53, column: 17
            startTimer_22.setPresent();//sysj\ecs.sysj line: 54, column: 7
            currsigs.addElement(startTimer_22);
            lightLevel_thread_23 = 1;//sysj\ecs.sysj line: 55, column: 7
            light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light1);
            light1.setValue(lightLevel_thread_23);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_23 = lightLevel_thread_23;//sysj\ecs.sysj line: 74, column: 4
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            if(startTimer_22.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
              lightLevel_thread_23 = 1;//sysj\ecs.sysj line: 61, column: 8
              light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light1);
              light1.setValue(lightLevel_thread_23);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_23 = lightLevel_thread_23;//sysj\ecs.sysj line: 74, column: 4
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              lightLevel_thread_23 = 0;//sysj\ecs.sysj line: 64, column: 8
              light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light1);
              light1.setValue(lightLevel_thread_23);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_23 = lightLevel_thread_23;//sysj\ecs.sysj line: 74, column: 4
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
          }
        }
      }
    }
    else {
      lightLevel_thread_23 = 0;//sysj\ecs.sysj line: 70, column: 5
      light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
      currsigs.addElement(light1);
      light1.setValue(lightLevel_thread_23);//sysj\ecs.sysj line: 73, column: 4
      previous_thread_23 = lightLevel_thread_23;//sysj\ecs.sysj line: 74, column: 4
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread1582(int [] tdone, int [] ends){
        S935=1;
    timer_22.setClear();//sysj\ecs.sysj line: 35, column: 2
    startTimer_22.setClear();//sysj\ecs.sysj line: 36, column: 2
    thread1583(tdone,ends);
    thread1584(tdone,ends);
    int biggest1588 = 0;
    if(ends[23]>=biggest1588){
      biggest1588=ends[23];
    }
    if(ends[24]>=biggest1588){
      biggest1588=ends[24];
    }
    if(biggest1588 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread1581(int [] tdone, int [] ends){
        active[21]=0;
    ends[21]=0;
    tdone[21]=1;
  }

  public void thread1580(int [] tdone, int [] ends){
        S937=1;
    thread1581(tdone,ends);
    thread1582(tdone,ends);
    int biggest1589 = 0;
    if(ends[21]>=biggest1589){
      biggest1589=ends[21];
    }
    if(ends[22]>=biggest1589){
      biggest1589=ends[22];
    }
    if(biggest1589 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread1579(int [] tdone, int [] ends){
        S735=1;
    if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\ecs.sysj line: 369, column: 13
      light4.setPresent();//sysj\ecs.sysj line: 370, column: 5
      currsigs.addElement(light4);
      light4.setValue(2);//sysj\ecs.sysj line: 370, column: 5
      light5.setPresent();//sysj\ecs.sysj line: 371, column: 5
      currsigs.addElement(light5);
      light5.setValue(2);//sysj\ecs.sysj line: 371, column: 5
      light6.setPresent();//sysj\ecs.sysj line: 372, column: 5
      currsigs.addElement(light6);
      light6.setValue(2);//sysj\ecs.sysj line: 372, column: 5
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread1578(int [] tdone, int [] ends){
        S724=1;
    S723=0;
    S695=0;
    if(!fireHappeningLight_in.isPartnerPresent() || fireHappeningLight_in.isPartnerPreempted()){//sysj\ecs.sysj line: 361, column: 3
      fireHappeningLight_in.setACK(false);//sysj\ecs.sysj line: 361, column: 3
      S695=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S690=0;
      if(!fireHappeningLight_in.isREQ()){//sysj\ecs.sysj line: 361, column: 3
        fireHappeningLight_in.setACK(true);//sysj\ecs.sysj line: 361, column: 3
        S690=1;
        if(fireHappeningLight_in.isREQ()){//sysj\ecs.sysj line: 361, column: 3
          fireHappeningLight_in.setACK(false);//sysj\ecs.sysj line: 361, column: 3
          ends[18]=2;
          ;//sysj\ecs.sysj line: 361, column: 3
          S723=1;
          fire_16.setPresent();//sysj\ecs.sysj line: 362, column: 3
          currsigs.addElement(fire_16);
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
      }
      else {
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread1577(int [] tdone, int [] ends){
        S688=1;
    if((clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) >= 470 && (clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) <= 1090){//sysj\ecs.sysj line: 351, column: 8
      workingHours_16.setPresent();//sysj\ecs.sysj line: 352, column: 5
      currsigs.addElement(workingHours_16);
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1545){
        case 0 : 
          S1545=0;
          break RUN;
        
        case 1 : 
          S1545=2;
          S1545=2;
          workingHours_16.setClear();//sysj\ecs.sysj line: 342, column: 2
          fire_16.setClear();//sysj\ecs.sysj line: 343, column: 2
          thread1577(tdone,ends);
          thread1578(tdone,ends);
          thread1579(tdone,ends);
          thread1580(tdone,ends);
          thread1590(tdone,ends);
          thread1600(tdone,ends);
          thread1610(tdone,ends);
          int biggest1620 = 0;
          if(ends[17]>=biggest1620){
            biggest1620=ends[17];
          }
          if(ends[18]>=biggest1620){
            biggest1620=ends[18];
          }
          if(ends[19]>=biggest1620){
            biggest1620=ends[19];
          }
          if(ends[20]>=biggest1620){
            biggest1620=ends[20];
          }
          if(ends[29]>=biggest1620){
            biggest1620=ends[29];
          }
          if(ends[38]>=biggest1620){
            biggest1620=ends[38];
          }
          if(ends[47]>=biggest1620){
            biggest1620=ends[47];
          }
          if(biggest1620 == 1){
            active[16]=1;
            ends[16]=1;
            break RUN;
          }
        
        case 2 : 
          workingHours_16.setClear();//sysj\ecs.sysj line: 342, column: 2
          fire_16.setClear();//sysj\ecs.sysj line: 343, column: 2
          thread1621(tdone,ends);
          thread1622(tdone,ends);
          thread1623(tdone,ends);
          thread1624(tdone,ends);
          thread1640(tdone,ends);
          thread1656(tdone,ends);
          thread1672(tdone,ends);
          int biggest1688 = 0;
          if(ends[17]>=biggest1688){
            biggest1688=ends[17];
          }
          if(ends[18]>=biggest1688){
            biggest1688=ends[18];
          }
          if(ends[19]>=biggest1688){
            biggest1688=ends[19];
          }
          if(ends[20]>=biggest1688){
            biggest1688=ends[20];
          }
          if(ends[29]>=biggest1688){
            biggest1688=ends[29];
          }
          if(ends[38]>=biggest1688){
            biggest1688=ends[38];
          }
          if(ends[47]>=biggest1688){
            biggest1688=ends[47];
          }
          if(biggest1688 == 1){
            active[16]=1;
            ends[16]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1688 == 0){
            S1545=0;
            active[16]=0;
            ends[16]=0;
            S1545=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    workingHours_16 = new Signal();
    fire_16 = new Signal();
    timer_22 = new Signal();
    startTimer_22 = new Signal();
    timer_31 = new Signal();
    startTimer_31 = new Signal();
    timer_40 = new Signal();
    startTimer_40 = new Signal();
    timer_49 = new Signal();
    startTimer_49 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[16] != 0){
      int index = 16;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[16]!=0 || suspended[16]!=0 || active[16]!=1);
      else{
        if(!df){
          fireHappeningLight_in.gethook();
          occu1.gethook();
          occu2.gethook();
          occu3.gethook();
          occu4.gethook();
          occu5.gethook();
          occu6.gethook();
          occu7.gethook();
          clock.gethook();
          df = true;
        }
        runClockDomain();
      }
      occu1.setpreclear();
      occu2.setpreclear();
      occu3.setpreclear();
      occu4.setpreclear();
      occu5.setpreclear();
      occu6.setpreclear();
      occu7.setpreclear();
      clock.setpreclear();
      light1.setpreclear();
      light2.setpreclear();
      light3.setpreclear();
      light4.setpreclear();
      light5.setpreclear();
      light6.setpreclear();
      light7.setpreclear();
      workingHours_16.setpreclear();
      fire_16.setpreclear();
      timer_22.setpreclear();
      startTimer_22.setpreclear();
      timer_31.setpreclear();
      startTimer_31.setpreclear();
      timer_40.setpreclear();
      startTimer_40.setpreclear();
      timer_49.setpreclear();
      startTimer_49.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = occu1.getStatus() ? occu1.setprepresent() : occu1.setpreclear();
      occu1.setpreval(occu1.getValue());
      occu1.setClear();
      dummyint = occu2.getStatus() ? occu2.setprepresent() : occu2.setpreclear();
      occu2.setpreval(occu2.getValue());
      occu2.setClear();
      dummyint = occu3.getStatus() ? occu3.setprepresent() : occu3.setpreclear();
      occu3.setpreval(occu3.getValue());
      occu3.setClear();
      dummyint = occu4.getStatus() ? occu4.setprepresent() : occu4.setpreclear();
      occu4.setpreval(occu4.getValue());
      occu4.setClear();
      dummyint = occu5.getStatus() ? occu5.setprepresent() : occu5.setpreclear();
      occu5.setpreval(occu5.getValue());
      occu5.setClear();
      dummyint = occu6.getStatus() ? occu6.setprepresent() : occu6.setpreclear();
      occu6.setpreval(occu6.getValue());
      occu6.setClear();
      dummyint = occu7.getStatus() ? occu7.setprepresent() : occu7.setpreclear();
      occu7.setpreval(occu7.getValue());
      occu7.setClear();
      dummyint = clock.getStatus() ? clock.setprepresent() : clock.setpreclear();
      clock.setpreval(clock.getValue());
      clock.setClear();
      light1.sethook();
      light1.setClear();
      light2.sethook();
      light2.setClear();
      light3.sethook();
      light3.setClear();
      light4.sethook();
      light4.setClear();
      light5.sethook();
      light5.setClear();
      light6.sethook();
      light6.setClear();
      light7.sethook();
      light7.setClear();
      workingHours_16.setClear();
      fire_16.setClear();
      timer_22.setClear();
      startTimer_22.setClear();
      timer_31.setClear();
      startTimer_31.setClear();
      timer_40.setClear();
      startTimer_40.setClear();
      timer_49.setClear();
      startTimer_49.setClear();
      fireHappeningLight_in.sethook();
      if(paused[16]!=0 || suspended[16]!=0 || active[16]!=1);
      else{
        fireHappeningLight_in.gethook();
        occu1.gethook();
        occu2.gethook();
        occu3.gethook();
        occu4.gethook();
        occu5.gethook();
        occu6.gethook();
        occu7.gethook();
        clock.gethook();
      }
      runFinisher();
      if(active[16] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

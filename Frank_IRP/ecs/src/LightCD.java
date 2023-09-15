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
  private Signal workingHours_18;
  private Signal fire_18;
  private Signal timer_24;
  private Signal startTimer_24;
  private Signal timer_33;
  private Signal startTimer_33;
  private Signal timer_42;
  private Signal startTimer_42;
  private Signal timer_51;
  private Signal startTimer_51;
  private int previous_thread_25;//sysj\ecs.sysj line: 39, column: 3
  private int lightLevel_thread_25;//sysj\ecs.sysj line: 40, column: 3
  private int previous_thread_34;//sysj\ecs.sysj line: 39, column: 3
  private int lightLevel_thread_34;//sysj\ecs.sysj line: 40, column: 3
  private int previous_thread_43;//sysj\ecs.sysj line: 39, column: 3
  private int lightLevel_thread_43;//sysj\ecs.sysj line: 40, column: 3
  private int previous_thread_52;//sysj\ecs.sysj line: 39, column: 3
  private int lightLevel_thread_52;//sysj\ecs.sysj line: 40, column: 3
  private long __start_thread_28;//sysj\ecs.sysj line: 86, column: 5
  private long __start_thread_37;//sysj\ecs.sysj line: 86, column: 5
  private long __start_thread_46;//sysj\ecs.sysj line: 86, column: 5
  private long __start_thread_55;//sysj\ecs.sysj line: 86, column: 5
  private int S1671 = 1;
  private int S814 = 1;
  private int S850 = 1;
  private int S849 = 1;
  private int S821 = 1;
  private int S816 = 1;
  private int S861 = 1;
  private int S1063 = 1;
  private int S1061 = 1;
  private int S909 = 1;
  private int S1059 = 1;
  private int S1049 = 1;
  private int S955 = 1;
  private int S926 = 1;
  private int S932 = 1;
  private int S1057 = 1;
  private int S1265 = 1;
  private int S1263 = 1;
  private int S1111 = 1;
  private int S1261 = 1;
  private int S1251 = 1;
  private int S1157 = 1;
  private int S1128 = 1;
  private int S1134 = 1;
  private int S1259 = 1;
  private int S1467 = 1;
  private int S1465 = 1;
  private int S1313 = 1;
  private int S1463 = 1;
  private int S1453 = 1;
  private int S1359 = 1;
  private int S1330 = 1;
  private int S1336 = 1;
  private int S1461 = 1;
  private int S1669 = 1;
  private int S1667 = 1;
  private int S1515 = 1;
  private int S1665 = 1;
  private int S1655 = 1;
  private int S1561 = 1;
  private int S1532 = 1;
  private int S1538 = 1;
  private int S1663 = 1;
  
  private int[] ends = new int[58];
  private int[] tdone = new int[58];
  
  public void thread1837(int [] tdone, int [] ends){
        switch(S1663){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        if((occu7.getpreval() == null ? 0 : ((Integer)occu7.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
          timer_51.setPresent();//sysj\ecs.sysj line: 105, column: 6
          currsigs.addElement(timer_51);
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

  public void thread1835(int [] tdone, int [] ends){
        switch(S1538){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        if(timer_51.getprestatus()){//sysj\ecs.sysj line: 93, column: 12
          S1538=0;
          active[56]=0;
          ends[56]=0;
          tdone[56]=1;
        }
        else {
          startTimer_51.setPresent();//sysj\ecs.sysj line: 94, column: 7
          currsigs.addElement(startTimer_51);
          active[56]=1;
          ends[56]=1;
          tdone[56]=1;
        }
        break;
      
    }
  }

  public void thread1834(int [] tdone, int [] ends){
        switch(S1532){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_55 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
          ends[55]=2;
          ;//sysj\ecs.sysj line: 86, column: 5
          timer_51.setPresent();//sysj\ecs.sysj line: 88, column: 6
          currsigs.addElement(timer_51);
          S1532=0;
          active[55]=0;
          ends[55]=0;
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

  public void thread1832(int [] tdone, int [] ends){
        S1538=1;
    startTimer_51.setPresent();//sysj\ecs.sysj line: 94, column: 7
    currsigs.addElement(startTimer_51);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread1831(int [] tdone, int [] ends){
        S1532=1;
    __start_thread_55 = com.systemj.Timer.getMs();//sysj\ecs.sysj line: 86, column: 5
    if(com.systemj.Timer.getMs() - __start_thread_55 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
      ends[55]=2;
      ;//sysj\ecs.sysj line: 86, column: 5
      timer_51.setPresent();//sysj\ecs.sysj line: 88, column: 6
      currsigs.addElement(timer_51);
      S1532=0;
      active[55]=0;
      ends[55]=0;
      tdone[55]=1;
    }
    else {
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
  }

  public void thread1830(int [] tdone, int [] ends){
        switch(S1655){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S1561){
          case 0 : 
            if(startTimer_51.getprestatus()){//sysj\ecs.sysj line: 84, column: 11
              S1561=1;
              thread1831(tdone,ends);
              thread1832(tdone,ends);
              int biggest1833 = 0;
              if(ends[55]>=biggest1833){
                biggest1833=ends[55];
              }
              if(ends[56]>=biggest1833){
                biggest1833=ends[56];
              }
              if(biggest1833 == 1){
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
            }
            else {
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 1 : 
            thread1834(tdone,ends);
            thread1835(tdone,ends);
            int biggest1836 = 0;
            if(ends[55]>=biggest1836){
              biggest1836=ends[55];
            }
            if(ends[56]>=biggest1836){
              biggest1836=ends[56];
            }
            if(biggest1836 == 1){
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            //FINXME code
            if(biggest1836 == 0){
              S1561=2;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 2 : 
            S1561=2;
            S1561=0;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1829(int [] tdone, int [] ends){
        switch(S1665){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        thread1830(tdone,ends);
        thread1837(tdone,ends);
        int biggest1838 = 0;
        if(ends[54]>=biggest1838){
          biggest1838=ends[54];
        }
        if(ends[57]>=biggest1838){
          biggest1838=ends[57];
        }
        if(biggest1838 == 1){
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        //FINXME code
        if(biggest1838 == 0){
          S1665=0;
          active[53]=0;
          ends[53]=0;
          tdone[53]=1;
        }
        break;
      
    }
  }

  public void thread1828(int [] tdone, int [] ends){
        switch(S1515){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        if(workingHours_18.getprestatus() || fire_18.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
          if(fire_18.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
            lightLevel_thread_52 = 2;//sysj\ecs.sysj line: 46, column: 6
            light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light7);
            light7.setValue(lightLevel_thread_52);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_52 = lightLevel_thread_52;//sysj\ecs.sysj line: 74, column: 4
            active[52]=1;
            ends[52]=1;
            tdone[52]=1;
          }
          else {
            if((occu7.getpreval() == null ? 0 : ((Integer)occu7.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
              lightLevel_thread_52 = 2;//sysj\ecs.sysj line: 50, column: 7
              light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light7);
              light7.setValue(lightLevel_thread_52);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_52 = lightLevel_thread_52;//sysj\ecs.sysj line: 74, column: 4
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            else {
              if(previous_thread_52 == 2){//sysj\ecs.sysj line: 53, column: 17
                startTimer_51.setPresent();//sysj\ecs.sysj line: 54, column: 7
                currsigs.addElement(startTimer_51);
                lightLevel_thread_52 = 1;//sysj\ecs.sysj line: 55, column: 7
                light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
                currsigs.addElement(light7);
                light7.setValue(lightLevel_thread_52);//sysj\ecs.sysj line: 73, column: 4
                previous_thread_52 = lightLevel_thread_52;//sysj\ecs.sysj line: 74, column: 4
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
              else {
                if(startTimer_51.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
                  lightLevel_thread_52 = 1;//sysj\ecs.sysj line: 61, column: 8
                  light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light7);
                  light7.setValue(lightLevel_thread_52);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_52 = lightLevel_thread_52;//sysj\ecs.sysj line: 74, column: 4
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  lightLevel_thread_52 = 0;//sysj\ecs.sysj line: 64, column: 8
                  light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light7);
                  light7.setValue(lightLevel_thread_52);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_52 = lightLevel_thread_52;//sysj\ecs.sysj line: 74, column: 4
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
            }
          }
        }
        else {
          lightLevel_thread_52 = 0;//sysj\ecs.sysj line: 70, column: 5
          light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light7);
          light7.setValue(lightLevel_thread_52);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_52 = lightLevel_thread_52;//sysj\ecs.sysj line: 74, column: 4
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        break;
      
    }
  }

  public void thread1827(int [] tdone, int [] ends){
        switch(S1667){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        timer_51.setClear();//sysj\ecs.sysj line: 35, column: 2
        startTimer_51.setClear();//sysj\ecs.sysj line: 36, column: 2
        thread1828(tdone,ends);
        thread1829(tdone,ends);
        int biggest1839 = 0;
        if(ends[52]>=biggest1839){
          biggest1839=ends[52];
        }
        if(ends[53]>=biggest1839){
          biggest1839=ends[53];
        }
        if(biggest1839 == 1){
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
        //FINXME code
        if(biggest1839 == 0){
          S1667=0;
          active[51]=0;
          ends[51]=0;
          tdone[51]=1;
        }
        break;
      
    }
  }

  public void thread1826(int [] tdone, int [] ends){
        active[50]=0;
    ends[50]=0;
    tdone[50]=1;
  }

  public void thread1825(int [] tdone, int [] ends){
        switch(S1669){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        thread1826(tdone,ends);
        thread1827(tdone,ends);
        int biggest1840 = 0;
        if(ends[50]>=biggest1840){
          biggest1840=ends[50];
        }
        if(ends[51]>=biggest1840){
          biggest1840=ends[51];
        }
        if(biggest1840 == 1){
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        //FINXME code
        if(biggest1840 == 0){
          S1669=0;
          active[49]=0;
          ends[49]=0;
          tdone[49]=1;
        }
        break;
      
    }
  }

  public void thread1821(int [] tdone, int [] ends){
        switch(S1461){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        if((occu3.getpreval() == null ? 0 : ((Integer)occu3.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
          timer_42.setPresent();//sysj\ecs.sysj line: 105, column: 6
          currsigs.addElement(timer_42);
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        break;
      
    }
  }

  public void thread1819(int [] tdone, int [] ends){
        switch(S1336){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(timer_42.getprestatus()){//sysj\ecs.sysj line: 93, column: 12
          S1336=0;
          active[47]=0;
          ends[47]=0;
          tdone[47]=1;
        }
        else {
          startTimer_42.setPresent();//sysj\ecs.sysj line: 94, column: 7
          currsigs.addElement(startTimer_42);
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        break;
      
    }
  }

  public void thread1818(int [] tdone, int [] ends){
        switch(S1330){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_46 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
          ends[46]=2;
          ;//sysj\ecs.sysj line: 86, column: 5
          timer_42.setPresent();//sysj\ecs.sysj line: 88, column: 6
          currsigs.addElement(timer_42);
          S1330=0;
          active[46]=0;
          ends[46]=0;
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

  public void thread1816(int [] tdone, int [] ends){
        S1336=1;
    startTimer_42.setPresent();//sysj\ecs.sysj line: 94, column: 7
    currsigs.addElement(startTimer_42);
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread1815(int [] tdone, int [] ends){
        S1330=1;
    __start_thread_46 = com.systemj.Timer.getMs();//sysj\ecs.sysj line: 86, column: 5
    if(com.systemj.Timer.getMs() - __start_thread_46 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
      ends[46]=2;
      ;//sysj\ecs.sysj line: 86, column: 5
      timer_42.setPresent();//sysj\ecs.sysj line: 88, column: 6
      currsigs.addElement(timer_42);
      S1330=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
    else {
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread1814(int [] tdone, int [] ends){
        switch(S1453){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        switch(S1359){
          case 0 : 
            if(startTimer_42.getprestatus()){//sysj\ecs.sysj line: 84, column: 11
              S1359=1;
              thread1815(tdone,ends);
              thread1816(tdone,ends);
              int biggest1817 = 0;
              if(ends[46]>=biggest1817){
                biggest1817=ends[46];
              }
              if(ends[47]>=biggest1817){
                biggest1817=ends[47];
              }
              if(biggest1817 == 1){
                active[45]=1;
                ends[45]=1;
                tdone[45]=1;
              }
            }
            else {
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
          case 1 : 
            thread1818(tdone,ends);
            thread1819(tdone,ends);
            int biggest1820 = 0;
            if(ends[46]>=biggest1820){
              biggest1820=ends[46];
            }
            if(ends[47]>=biggest1820){
              biggest1820=ends[47];
            }
            if(biggest1820 == 1){
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            //FINXME code
            if(biggest1820 == 0){
              S1359=2;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
          case 2 : 
            S1359=2;
            S1359=0;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1813(int [] tdone, int [] ends){
        switch(S1463){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        thread1814(tdone,ends);
        thread1821(tdone,ends);
        int biggest1822 = 0;
        if(ends[45]>=biggest1822){
          biggest1822=ends[45];
        }
        if(ends[48]>=biggest1822){
          biggest1822=ends[48];
        }
        if(biggest1822 == 1){
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        //FINXME code
        if(biggest1822 == 0){
          S1463=0;
          active[44]=0;
          ends[44]=0;
          tdone[44]=1;
        }
        break;
      
    }
  }

  public void thread1812(int [] tdone, int [] ends){
        switch(S1313){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        if(workingHours_18.getprestatus() || fire_18.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
          if(fire_18.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
            lightLevel_thread_43 = 2;//sysj\ecs.sysj line: 46, column: 6
            light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light3);
            light3.setValue(lightLevel_thread_43);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_43 = lightLevel_thread_43;//sysj\ecs.sysj line: 74, column: 4
            active[43]=1;
            ends[43]=1;
            tdone[43]=1;
          }
          else {
            if((occu3.getpreval() == null ? 0 : ((Integer)occu3.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
              lightLevel_thread_43 = 2;//sysj\ecs.sysj line: 50, column: 7
              light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light3);
              light3.setValue(lightLevel_thread_43);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_43 = lightLevel_thread_43;//sysj\ecs.sysj line: 74, column: 4
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            else {
              if(previous_thread_43 == 2){//sysj\ecs.sysj line: 53, column: 17
                startTimer_42.setPresent();//sysj\ecs.sysj line: 54, column: 7
                currsigs.addElement(startTimer_42);
                lightLevel_thread_43 = 1;//sysj\ecs.sysj line: 55, column: 7
                light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
                currsigs.addElement(light3);
                light3.setValue(lightLevel_thread_43);//sysj\ecs.sysj line: 73, column: 4
                previous_thread_43 = lightLevel_thread_43;//sysj\ecs.sysj line: 74, column: 4
                active[43]=1;
                ends[43]=1;
                tdone[43]=1;
              }
              else {
                if(startTimer_42.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
                  lightLevel_thread_43 = 1;//sysj\ecs.sysj line: 61, column: 8
                  light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light3);
                  light3.setValue(lightLevel_thread_43);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_43 = lightLevel_thread_43;//sysj\ecs.sysj line: 74, column: 4
                  active[43]=1;
                  ends[43]=1;
                  tdone[43]=1;
                }
                else {
                  lightLevel_thread_43 = 0;//sysj\ecs.sysj line: 64, column: 8
                  light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light3);
                  light3.setValue(lightLevel_thread_43);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_43 = lightLevel_thread_43;//sysj\ecs.sysj line: 74, column: 4
                  active[43]=1;
                  ends[43]=1;
                  tdone[43]=1;
                }
              }
            }
          }
        }
        else {
          lightLevel_thread_43 = 0;//sysj\ecs.sysj line: 70, column: 5
          light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light3);
          light3.setValue(lightLevel_thread_43);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_43 = lightLevel_thread_43;//sysj\ecs.sysj line: 74, column: 4
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        break;
      
    }
  }

  public void thread1811(int [] tdone, int [] ends){
        switch(S1465){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        timer_42.setClear();//sysj\ecs.sysj line: 35, column: 2
        startTimer_42.setClear();//sysj\ecs.sysj line: 36, column: 2
        thread1812(tdone,ends);
        thread1813(tdone,ends);
        int biggest1823 = 0;
        if(ends[43]>=biggest1823){
          biggest1823=ends[43];
        }
        if(ends[44]>=biggest1823){
          biggest1823=ends[44];
        }
        if(biggest1823 == 1){
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        //FINXME code
        if(biggest1823 == 0){
          S1465=0;
          active[42]=0;
          ends[42]=0;
          tdone[42]=1;
        }
        break;
      
    }
  }

  public void thread1810(int [] tdone, int [] ends){
        active[41]=0;
    ends[41]=0;
    tdone[41]=1;
  }

  public void thread1809(int [] tdone, int [] ends){
        switch(S1467){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        thread1810(tdone,ends);
        thread1811(tdone,ends);
        int biggest1824 = 0;
        if(ends[41]>=biggest1824){
          biggest1824=ends[41];
        }
        if(ends[42]>=biggest1824){
          biggest1824=ends[42];
        }
        if(biggest1824 == 1){
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        //FINXME code
        if(biggest1824 == 0){
          S1467=0;
          active[40]=0;
          ends[40]=0;
          tdone[40]=1;
        }
        break;
      
    }
  }

  public void thread1805(int [] tdone, int [] ends){
        switch(S1259){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        if((occu2.getpreval() == null ? 0 : ((Integer)occu2.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
          timer_33.setPresent();//sysj\ecs.sysj line: 105, column: 6
          currsigs.addElement(timer_33);
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
      
    }
  }

  public void thread1803(int [] tdone, int [] ends){
        switch(S1134){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(timer_33.getprestatus()){//sysj\ecs.sysj line: 93, column: 12
          S1134=0;
          active[38]=0;
          ends[38]=0;
          tdone[38]=1;
        }
        else {
          startTimer_33.setPresent();//sysj\ecs.sysj line: 94, column: 7
          currsigs.addElement(startTimer_33);
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        break;
      
    }
  }

  public void thread1802(int [] tdone, int [] ends){
        switch(S1128){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_37 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
          ends[37]=2;
          ;//sysj\ecs.sysj line: 86, column: 5
          timer_33.setPresent();//sysj\ecs.sysj line: 88, column: 6
          currsigs.addElement(timer_33);
          S1128=0;
          active[37]=0;
          ends[37]=0;
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

  public void thread1800(int [] tdone, int [] ends){
        S1134=1;
    startTimer_33.setPresent();//sysj\ecs.sysj line: 94, column: 7
    currsigs.addElement(startTimer_33);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread1799(int [] tdone, int [] ends){
        S1128=1;
    __start_thread_37 = com.systemj.Timer.getMs();//sysj\ecs.sysj line: 86, column: 5
    if(com.systemj.Timer.getMs() - __start_thread_37 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
      ends[37]=2;
      ;//sysj\ecs.sysj line: 86, column: 5
      timer_33.setPresent();//sysj\ecs.sysj line: 88, column: 6
      currsigs.addElement(timer_33);
      S1128=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
    else {
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread1798(int [] tdone, int [] ends){
        switch(S1251){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        switch(S1157){
          case 0 : 
            if(startTimer_33.getprestatus()){//sysj\ecs.sysj line: 84, column: 11
              S1157=1;
              thread1799(tdone,ends);
              thread1800(tdone,ends);
              int biggest1801 = 0;
              if(ends[37]>=biggest1801){
                biggest1801=ends[37];
              }
              if(ends[38]>=biggest1801){
                biggest1801=ends[38];
              }
              if(biggest1801 == 1){
                active[36]=1;
                ends[36]=1;
                tdone[36]=1;
              }
            }
            else {
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            break;
          
          case 1 : 
            thread1802(tdone,ends);
            thread1803(tdone,ends);
            int biggest1804 = 0;
            if(ends[37]>=biggest1804){
              biggest1804=ends[37];
            }
            if(ends[38]>=biggest1804){
              biggest1804=ends[38];
            }
            if(biggest1804 == 1){
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            //FINXME code
            if(biggest1804 == 0){
              S1157=2;
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            break;
          
          case 2 : 
            S1157=2;
            S1157=0;
            active[36]=1;
            ends[36]=1;
            tdone[36]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1797(int [] tdone, int [] ends){
        switch(S1261){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        thread1798(tdone,ends);
        thread1805(tdone,ends);
        int biggest1806 = 0;
        if(ends[36]>=biggest1806){
          biggest1806=ends[36];
        }
        if(ends[39]>=biggest1806){
          biggest1806=ends[39];
        }
        if(biggest1806 == 1){
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        //FINXME code
        if(biggest1806 == 0){
          S1261=0;
          active[35]=0;
          ends[35]=0;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread1796(int [] tdone, int [] ends){
        switch(S1111){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(workingHours_18.getprestatus() || fire_18.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
          if(fire_18.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
            lightLevel_thread_34 = 2;//sysj\ecs.sysj line: 46, column: 6
            light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light2);
            light2.setValue(lightLevel_thread_34);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_34 = lightLevel_thread_34;//sysj\ecs.sysj line: 74, column: 4
            active[34]=1;
            ends[34]=1;
            tdone[34]=1;
          }
          else {
            if((occu2.getpreval() == null ? 0 : ((Integer)occu2.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
              lightLevel_thread_34 = 2;//sysj\ecs.sysj line: 50, column: 7
              light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light2);
              light2.setValue(lightLevel_thread_34);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_34 = lightLevel_thread_34;//sysj\ecs.sysj line: 74, column: 4
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            else {
              if(previous_thread_34 == 2){//sysj\ecs.sysj line: 53, column: 17
                startTimer_33.setPresent();//sysj\ecs.sysj line: 54, column: 7
                currsigs.addElement(startTimer_33);
                lightLevel_thread_34 = 1;//sysj\ecs.sysj line: 55, column: 7
                light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
                currsigs.addElement(light2);
                light2.setValue(lightLevel_thread_34);//sysj\ecs.sysj line: 73, column: 4
                previous_thread_34 = lightLevel_thread_34;//sysj\ecs.sysj line: 74, column: 4
                active[34]=1;
                ends[34]=1;
                tdone[34]=1;
              }
              else {
                if(startTimer_33.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
                  lightLevel_thread_34 = 1;//sysj\ecs.sysj line: 61, column: 8
                  light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light2);
                  light2.setValue(lightLevel_thread_34);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_34 = lightLevel_thread_34;//sysj\ecs.sysj line: 74, column: 4
                  active[34]=1;
                  ends[34]=1;
                  tdone[34]=1;
                }
                else {
                  lightLevel_thread_34 = 0;//sysj\ecs.sysj line: 64, column: 8
                  light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light2);
                  light2.setValue(lightLevel_thread_34);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_34 = lightLevel_thread_34;//sysj\ecs.sysj line: 74, column: 4
                  active[34]=1;
                  ends[34]=1;
                  tdone[34]=1;
                }
              }
            }
          }
        }
        else {
          lightLevel_thread_34 = 0;//sysj\ecs.sysj line: 70, column: 5
          light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light2);
          light2.setValue(lightLevel_thread_34);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_34 = lightLevel_thread_34;//sysj\ecs.sysj line: 74, column: 4
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread1795(int [] tdone, int [] ends){
        switch(S1263){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        timer_33.setClear();//sysj\ecs.sysj line: 35, column: 2
        startTimer_33.setClear();//sysj\ecs.sysj line: 36, column: 2
        thread1796(tdone,ends);
        thread1797(tdone,ends);
        int biggest1807 = 0;
        if(ends[34]>=biggest1807){
          biggest1807=ends[34];
        }
        if(ends[35]>=biggest1807){
          biggest1807=ends[35];
        }
        if(biggest1807 == 1){
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        //FINXME code
        if(biggest1807 == 0){
          S1263=0;
          active[33]=0;
          ends[33]=0;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread1794(int [] tdone, int [] ends){
        active[32]=0;
    ends[32]=0;
    tdone[32]=1;
  }

  public void thread1793(int [] tdone, int [] ends){
        switch(S1265){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        thread1794(tdone,ends);
        thread1795(tdone,ends);
        int biggest1808 = 0;
        if(ends[32]>=biggest1808){
          biggest1808=ends[32];
        }
        if(ends[33]>=biggest1808){
          biggest1808=ends[33];
        }
        if(biggest1808 == 1){
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        //FINXME code
        if(biggest1808 == 0){
          S1265=0;
          active[31]=0;
          ends[31]=0;
          tdone[31]=1;
        }
        break;
      
    }
  }

  public void thread1789(int [] tdone, int [] ends){
        switch(S1057){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if((occu1.getpreval() == null ? 0 : ((Integer)occu1.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
          timer_24.setPresent();//sysj\ecs.sysj line: 105, column: 6
          currsigs.addElement(timer_24);
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

  public void thread1787(int [] tdone, int [] ends){
        switch(S932){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(timer_24.getprestatus()){//sysj\ecs.sysj line: 93, column: 12
          S932=0;
          active[29]=0;
          ends[29]=0;
          tdone[29]=1;
        }
        else {
          startTimer_24.setPresent();//sysj\ecs.sysj line: 94, column: 7
          currsigs.addElement(startTimer_24);
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread1786(int [] tdone, int [] ends){
        switch(S926){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_28 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
          ends[28]=2;
          ;//sysj\ecs.sysj line: 86, column: 5
          timer_24.setPresent();//sysj\ecs.sysj line: 88, column: 6
          currsigs.addElement(timer_24);
          S926=0;
          active[28]=0;
          ends[28]=0;
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

  public void thread1784(int [] tdone, int [] ends){
        S932=1;
    startTimer_24.setPresent();//sysj\ecs.sysj line: 94, column: 7
    currsigs.addElement(startTimer_24);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread1783(int [] tdone, int [] ends){
        S926=1;
    __start_thread_28 = com.systemj.Timer.getMs();//sysj\ecs.sysj line: 86, column: 5
    if(com.systemj.Timer.getMs() - __start_thread_28 >= (5) * 1000){//sysj\ecs.sysj line: 86, column: 5
      ends[28]=2;
      ;//sysj\ecs.sysj line: 86, column: 5
      timer_24.setPresent();//sysj\ecs.sysj line: 88, column: 6
      currsigs.addElement(timer_24);
      S926=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
    else {
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread1782(int [] tdone, int [] ends){
        switch(S1049){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S955){
          case 0 : 
            if(startTimer_24.getprestatus()){//sysj\ecs.sysj line: 84, column: 11
              S955=1;
              thread1783(tdone,ends);
              thread1784(tdone,ends);
              int biggest1785 = 0;
              if(ends[28]>=biggest1785){
                biggest1785=ends[28];
              }
              if(ends[29]>=biggest1785){
                biggest1785=ends[29];
              }
              if(biggest1785 == 1){
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 1 : 
            thread1786(tdone,ends);
            thread1787(tdone,ends);
            int biggest1788 = 0;
            if(ends[28]>=biggest1788){
              biggest1788=ends[28];
            }
            if(ends[29]>=biggest1788){
              biggest1788=ends[29];
            }
            if(biggest1788 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest1788 == 0){
              S955=2;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 2 : 
            S955=2;
            S955=0;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1781(int [] tdone, int [] ends){
        switch(S1059){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        thread1782(tdone,ends);
        thread1789(tdone,ends);
        int biggest1790 = 0;
        if(ends[27]>=biggest1790){
          biggest1790=ends[27];
        }
        if(ends[30]>=biggest1790){
          biggest1790=ends[30];
        }
        if(biggest1790 == 1){
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        //FINXME code
        if(biggest1790 == 0){
          S1059=0;
          active[26]=0;
          ends[26]=0;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread1780(int [] tdone, int [] ends){
        switch(S909){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(workingHours_18.getprestatus() || fire_18.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
          if(fire_18.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
            lightLevel_thread_25 = 2;//sysj\ecs.sysj line: 46, column: 6
            light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light1);
            light1.setValue(lightLevel_thread_25);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_25 = lightLevel_thread_25;//sysj\ecs.sysj line: 74, column: 4
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
          }
          else {
            if((occu1.getpreval() == null ? 0 : ((Integer)occu1.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
              lightLevel_thread_25 = 2;//sysj\ecs.sysj line: 50, column: 7
              light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light1);
              light1.setValue(lightLevel_thread_25);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_25 = lightLevel_thread_25;//sysj\ecs.sysj line: 74, column: 4
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              if(previous_thread_25 == 2){//sysj\ecs.sysj line: 53, column: 17
                startTimer_24.setPresent();//sysj\ecs.sysj line: 54, column: 7
                currsigs.addElement(startTimer_24);
                lightLevel_thread_25 = 1;//sysj\ecs.sysj line: 55, column: 7
                light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
                currsigs.addElement(light1);
                light1.setValue(lightLevel_thread_25);//sysj\ecs.sysj line: 73, column: 4
                previous_thread_25 = lightLevel_thread_25;//sysj\ecs.sysj line: 74, column: 4
                active[25]=1;
                ends[25]=1;
                tdone[25]=1;
              }
              else {
                if(startTimer_24.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
                  lightLevel_thread_25 = 1;//sysj\ecs.sysj line: 61, column: 8
                  light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light1);
                  light1.setValue(lightLevel_thread_25);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_25 = lightLevel_thread_25;//sysj\ecs.sysj line: 74, column: 4
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  lightLevel_thread_25 = 0;//sysj\ecs.sysj line: 64, column: 8
                  light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
                  currsigs.addElement(light1);
                  light1.setValue(lightLevel_thread_25);//sysj\ecs.sysj line: 73, column: 4
                  previous_thread_25 = lightLevel_thread_25;//sysj\ecs.sysj line: 74, column: 4
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
            }
          }
        }
        else {
          lightLevel_thread_25 = 0;//sysj\ecs.sysj line: 70, column: 5
          light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light1);
          light1.setValue(lightLevel_thread_25);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_25 = lightLevel_thread_25;//sysj\ecs.sysj line: 74, column: 4
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread1779(int [] tdone, int [] ends){
        switch(S1061){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        timer_24.setClear();//sysj\ecs.sysj line: 35, column: 2
        startTimer_24.setClear();//sysj\ecs.sysj line: 36, column: 2
        thread1780(tdone,ends);
        thread1781(tdone,ends);
        int biggest1791 = 0;
        if(ends[25]>=biggest1791){
          biggest1791=ends[25];
        }
        if(ends[26]>=biggest1791){
          biggest1791=ends[26];
        }
        if(biggest1791 == 1){
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        //FINXME code
        if(biggest1791 == 0){
          S1061=0;
          active[24]=0;
          ends[24]=0;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread1778(int [] tdone, int [] ends){
        active[23]=0;
    ends[23]=0;
    tdone[23]=1;
  }

  public void thread1777(int [] tdone, int [] ends){
        switch(S1063){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        thread1778(tdone,ends);
        thread1779(tdone,ends);
        int biggest1792 = 0;
        if(ends[23]>=biggest1792){
          biggest1792=ends[23];
        }
        if(ends[24]>=biggest1792){
          biggest1792=ends[24];
        }
        if(biggest1792 == 1){
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        //FINXME code
        if(biggest1792 == 0){
          S1063=0;
          active[22]=0;
          ends[22]=0;
          tdone[22]=1;
        }
        break;
      
    }
  }

  public void thread1776(int [] tdone, int [] ends){
        switch(S861){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(workingHours_18.getprestatus() || fire_18.getprestatus()){//sysj\ecs.sysj line: 372, column: 13
          light4.setPresent();//sysj\ecs.sysj line: 373, column: 5
          currsigs.addElement(light4);
          light4.setValue(2);//sysj\ecs.sysj line: 373, column: 5
          light5.setPresent();//sysj\ecs.sysj line: 374, column: 5
          currsigs.addElement(light5);
          light5.setValue(2);//sysj\ecs.sysj line: 374, column: 5
          light6.setPresent();//sysj\ecs.sysj line: 375, column: 5
          currsigs.addElement(light6);
          light6.setValue(2);//sysj\ecs.sysj line: 375, column: 5
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread1775(int [] tdone, int [] ends){
        switch(S850){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S849){
          case 0 : 
            switch(S821){
              case 0 : 
                if(!fireHappeningLight_in.isPartnerPresent() || fireHappeningLight_in.isPartnerPreempted()){//sysj\ecs.sysj line: 364, column: 3
                  fireHappeningLight_in.setACK(false);//sysj\ecs.sysj line: 364, column: 3
                  S821=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  switch(S816){
                    case 0 : 
                      if(!fireHappeningLight_in.isREQ()){//sysj\ecs.sysj line: 364, column: 3
                        fireHappeningLight_in.setACK(true);//sysj\ecs.sysj line: 364, column: 3
                        S816=1;
                        if(fireHappeningLight_in.isREQ()){//sysj\ecs.sysj line: 364, column: 3
                          fireHappeningLight_in.setACK(false);//sysj\ecs.sysj line: 364, column: 3
                          ends[20]=2;
                          ;//sysj\ecs.sysj line: 364, column: 3
                          S849=1;
                          fire_18.setPresent();//sysj\ecs.sysj line: 365, column: 3
                          currsigs.addElement(fire_18);
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                        else {
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fireHappeningLight_in.isREQ()){//sysj\ecs.sysj line: 364, column: 3
                        fireHappeningLight_in.setACK(false);//sysj\ecs.sysj line: 364, column: 3
                        ends[20]=2;
                        ;//sysj\ecs.sysj line: 364, column: 3
                        S849=1;
                        fire_18.setPresent();//sysj\ecs.sysj line: 365, column: 3
                        currsigs.addElement(fire_18);
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S821=1;
                S821=0;
                if(!fireHappeningLight_in.isPartnerPresent() || fireHappeningLight_in.isPartnerPreempted()){//sysj\ecs.sysj line: 364, column: 3
                  fireHappeningLight_in.setACK(false);//sysj\ecs.sysj line: 364, column: 3
                  S821=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  S816=0;
                  if(!fireHappeningLight_in.isREQ()){//sysj\ecs.sysj line: 364, column: 3
                    fireHappeningLight_in.setACK(true);//sysj\ecs.sysj line: 364, column: 3
                    S816=1;
                    if(fireHappeningLight_in.isREQ()){//sysj\ecs.sysj line: 364, column: 3
                      fireHappeningLight_in.setACK(false);//sysj\ecs.sysj line: 364, column: 3
                      ends[20]=2;
                      ;//sysj\ecs.sysj line: 364, column: 3
                      S849=1;
                      fire_18.setPresent();//sysj\ecs.sysj line: 365, column: 3
                      currsigs.addElement(fire_18);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    active[20]=1;
                    ends[20]=1;
                    tdone[20]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            fire_18.setPresent();//sysj\ecs.sysj line: 365, column: 3
            currsigs.addElement(fire_18);
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
            break;
          
          case 2 : 
            S849=2;
            S850=0;
            active[20]=0;
            ends[20]=0;
            tdone[20]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1774(int [] tdone, int [] ends){
        switch(S814){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if((clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) >= 470 && (clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) <= 1090){//sysj\ecs.sysj line: 354, column: 8
          workingHours_18.setPresent();//sysj\ecs.sysj line: 355, column: 5
          currsigs.addElement(workingHours_18);
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

  public void thread1769(int [] tdone, int [] ends){
        S1663=1;
    if((occu7.getpreval() == null ? 0 : ((Integer)occu7.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
      timer_51.setPresent();//sysj\ecs.sysj line: 105, column: 6
      currsigs.addElement(timer_51);
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

  public void thread1768(int [] tdone, int [] ends){
        S1655=1;
    S1561=0;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread1767(int [] tdone, int [] ends){
        S1665=1;
    thread1768(tdone,ends);
    thread1769(tdone,ends);
    int biggest1770 = 0;
    if(ends[54]>=biggest1770){
      biggest1770=ends[54];
    }
    if(ends[57]>=biggest1770){
      biggest1770=ends[57];
    }
    if(biggest1770 == 1){
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
  }

  public void thread1766(int [] tdone, int [] ends){
        S1515=1;
    previous_thread_52 = 0;//sysj\ecs.sysj line: 39, column: 3
    lightLevel_thread_52 = 0;//sysj\ecs.sysj line: 40, column: 3
    if(workingHours_18.getprestatus() || fire_18.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
      if(fire_18.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
        lightLevel_thread_52 = 2;//sysj\ecs.sysj line: 46, column: 6
        light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
        currsigs.addElement(light7);
        light7.setValue(lightLevel_thread_52);//sysj\ecs.sysj line: 73, column: 4
        previous_thread_52 = lightLevel_thread_52;//sysj\ecs.sysj line: 74, column: 4
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
      else {
        if((occu7.getpreval() == null ? 0 : ((Integer)occu7.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
          lightLevel_thread_52 = 2;//sysj\ecs.sysj line: 50, column: 7
          light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light7);
          light7.setValue(lightLevel_thread_52);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_52 = lightLevel_thread_52;//sysj\ecs.sysj line: 74, column: 4
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        else {
          if(previous_thread_52 == 2){//sysj\ecs.sysj line: 53, column: 17
            startTimer_51.setPresent();//sysj\ecs.sysj line: 54, column: 7
            currsigs.addElement(startTimer_51);
            lightLevel_thread_52 = 1;//sysj\ecs.sysj line: 55, column: 7
            light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light7);
            light7.setValue(lightLevel_thread_52);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_52 = lightLevel_thread_52;//sysj\ecs.sysj line: 74, column: 4
            active[52]=1;
            ends[52]=1;
            tdone[52]=1;
          }
          else {
            if(startTimer_51.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
              lightLevel_thread_52 = 1;//sysj\ecs.sysj line: 61, column: 8
              light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light7);
              light7.setValue(lightLevel_thread_52);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_52 = lightLevel_thread_52;//sysj\ecs.sysj line: 74, column: 4
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            else {
              lightLevel_thread_52 = 0;//sysj\ecs.sysj line: 64, column: 8
              light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light7);
              light7.setValue(lightLevel_thread_52);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_52 = lightLevel_thread_52;//sysj\ecs.sysj line: 74, column: 4
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
          }
        }
      }
    }
    else {
      lightLevel_thread_52 = 0;//sysj\ecs.sysj line: 70, column: 5
      light7.setPresent();//sysj\ecs.sysj line: 73, column: 4
      currsigs.addElement(light7);
      light7.setValue(lightLevel_thread_52);//sysj\ecs.sysj line: 73, column: 4
      previous_thread_52 = lightLevel_thread_52;//sysj\ecs.sysj line: 74, column: 4
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread1765(int [] tdone, int [] ends){
        S1667=1;
    timer_51.setClear();//sysj\ecs.sysj line: 35, column: 2
    startTimer_51.setClear();//sysj\ecs.sysj line: 36, column: 2
    thread1766(tdone,ends);
    thread1767(tdone,ends);
    int biggest1771 = 0;
    if(ends[52]>=biggest1771){
      biggest1771=ends[52];
    }
    if(ends[53]>=biggest1771){
      biggest1771=ends[53];
    }
    if(biggest1771 == 1){
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread1764(int [] tdone, int [] ends){
        active[50]=0;
    ends[50]=0;
    tdone[50]=1;
  }

  public void thread1763(int [] tdone, int [] ends){
        S1669=1;
    thread1764(tdone,ends);
    thread1765(tdone,ends);
    int biggest1772 = 0;
    if(ends[50]>=biggest1772){
      biggest1772=ends[50];
    }
    if(ends[51]>=biggest1772){
      biggest1772=ends[51];
    }
    if(biggest1772 == 1){
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread1759(int [] tdone, int [] ends){
        S1461=1;
    if((occu3.getpreval() == null ? 0 : ((Integer)occu3.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
      timer_42.setPresent();//sysj\ecs.sysj line: 105, column: 6
      currsigs.addElement(timer_42);
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread1758(int [] tdone, int [] ends){
        S1453=1;
    S1359=0;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread1757(int [] tdone, int [] ends){
        S1463=1;
    thread1758(tdone,ends);
    thread1759(tdone,ends);
    int biggest1760 = 0;
    if(ends[45]>=biggest1760){
      biggest1760=ends[45];
    }
    if(ends[48]>=biggest1760){
      biggest1760=ends[48];
    }
    if(biggest1760 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread1756(int [] tdone, int [] ends){
        S1313=1;
    previous_thread_43 = 0;//sysj\ecs.sysj line: 39, column: 3
    lightLevel_thread_43 = 0;//sysj\ecs.sysj line: 40, column: 3
    if(workingHours_18.getprestatus() || fire_18.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
      if(fire_18.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
        lightLevel_thread_43 = 2;//sysj\ecs.sysj line: 46, column: 6
        light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
        currsigs.addElement(light3);
        light3.setValue(lightLevel_thread_43);//sysj\ecs.sysj line: 73, column: 4
        previous_thread_43 = lightLevel_thread_43;//sysj\ecs.sysj line: 74, column: 4
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
      else {
        if((occu3.getpreval() == null ? 0 : ((Integer)occu3.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
          lightLevel_thread_43 = 2;//sysj\ecs.sysj line: 50, column: 7
          light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light3);
          light3.setValue(lightLevel_thread_43);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_43 = lightLevel_thread_43;//sysj\ecs.sysj line: 74, column: 4
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          if(previous_thread_43 == 2){//sysj\ecs.sysj line: 53, column: 17
            startTimer_42.setPresent();//sysj\ecs.sysj line: 54, column: 7
            currsigs.addElement(startTimer_42);
            lightLevel_thread_43 = 1;//sysj\ecs.sysj line: 55, column: 7
            light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light3);
            light3.setValue(lightLevel_thread_43);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_43 = lightLevel_thread_43;//sysj\ecs.sysj line: 74, column: 4
            active[43]=1;
            ends[43]=1;
            tdone[43]=1;
          }
          else {
            if(startTimer_42.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
              lightLevel_thread_43 = 1;//sysj\ecs.sysj line: 61, column: 8
              light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light3);
              light3.setValue(lightLevel_thread_43);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_43 = lightLevel_thread_43;//sysj\ecs.sysj line: 74, column: 4
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            else {
              lightLevel_thread_43 = 0;//sysj\ecs.sysj line: 64, column: 8
              light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light3);
              light3.setValue(lightLevel_thread_43);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_43 = lightLevel_thread_43;//sysj\ecs.sysj line: 74, column: 4
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
          }
        }
      }
    }
    else {
      lightLevel_thread_43 = 0;//sysj\ecs.sysj line: 70, column: 5
      light3.setPresent();//sysj\ecs.sysj line: 73, column: 4
      currsigs.addElement(light3);
      light3.setValue(lightLevel_thread_43);//sysj\ecs.sysj line: 73, column: 4
      previous_thread_43 = lightLevel_thread_43;//sysj\ecs.sysj line: 74, column: 4
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread1755(int [] tdone, int [] ends){
        S1465=1;
    timer_42.setClear();//sysj\ecs.sysj line: 35, column: 2
    startTimer_42.setClear();//sysj\ecs.sysj line: 36, column: 2
    thread1756(tdone,ends);
    thread1757(tdone,ends);
    int biggest1761 = 0;
    if(ends[43]>=biggest1761){
      biggest1761=ends[43];
    }
    if(ends[44]>=biggest1761){
      biggest1761=ends[44];
    }
    if(biggest1761 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread1754(int [] tdone, int [] ends){
        active[41]=0;
    ends[41]=0;
    tdone[41]=1;
  }

  public void thread1753(int [] tdone, int [] ends){
        S1467=1;
    thread1754(tdone,ends);
    thread1755(tdone,ends);
    int biggest1762 = 0;
    if(ends[41]>=biggest1762){
      biggest1762=ends[41];
    }
    if(ends[42]>=biggest1762){
      biggest1762=ends[42];
    }
    if(biggest1762 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread1749(int [] tdone, int [] ends){
        S1259=1;
    if((occu2.getpreval() == null ? 0 : ((Integer)occu2.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
      timer_33.setPresent();//sysj\ecs.sysj line: 105, column: 6
      currsigs.addElement(timer_33);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread1748(int [] tdone, int [] ends){
        S1251=1;
    S1157=0;
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread1747(int [] tdone, int [] ends){
        S1261=1;
    thread1748(tdone,ends);
    thread1749(tdone,ends);
    int biggest1750 = 0;
    if(ends[36]>=biggest1750){
      biggest1750=ends[36];
    }
    if(ends[39]>=biggest1750){
      biggest1750=ends[39];
    }
    if(biggest1750 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread1746(int [] tdone, int [] ends){
        S1111=1;
    previous_thread_34 = 0;//sysj\ecs.sysj line: 39, column: 3
    lightLevel_thread_34 = 0;//sysj\ecs.sysj line: 40, column: 3
    if(workingHours_18.getprestatus() || fire_18.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
      if(fire_18.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
        lightLevel_thread_34 = 2;//sysj\ecs.sysj line: 46, column: 6
        light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
        currsigs.addElement(light2);
        light2.setValue(lightLevel_thread_34);//sysj\ecs.sysj line: 73, column: 4
        previous_thread_34 = lightLevel_thread_34;//sysj\ecs.sysj line: 74, column: 4
        active[34]=1;
        ends[34]=1;
        tdone[34]=1;
      }
      else {
        if((occu2.getpreval() == null ? 0 : ((Integer)occu2.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
          lightLevel_thread_34 = 2;//sysj\ecs.sysj line: 50, column: 7
          light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light2);
          light2.setValue(lightLevel_thread_34);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_34 = lightLevel_thread_34;//sysj\ecs.sysj line: 74, column: 4
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        else {
          if(previous_thread_34 == 2){//sysj\ecs.sysj line: 53, column: 17
            startTimer_33.setPresent();//sysj\ecs.sysj line: 54, column: 7
            currsigs.addElement(startTimer_33);
            lightLevel_thread_34 = 1;//sysj\ecs.sysj line: 55, column: 7
            light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light2);
            light2.setValue(lightLevel_thread_34);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_34 = lightLevel_thread_34;//sysj\ecs.sysj line: 74, column: 4
            active[34]=1;
            ends[34]=1;
            tdone[34]=1;
          }
          else {
            if(startTimer_33.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
              lightLevel_thread_34 = 1;//sysj\ecs.sysj line: 61, column: 8
              light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light2);
              light2.setValue(lightLevel_thread_34);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_34 = lightLevel_thread_34;//sysj\ecs.sysj line: 74, column: 4
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            else {
              lightLevel_thread_34 = 0;//sysj\ecs.sysj line: 64, column: 8
              light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light2);
              light2.setValue(lightLevel_thread_34);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_34 = lightLevel_thread_34;//sysj\ecs.sysj line: 74, column: 4
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
          }
        }
      }
    }
    else {
      lightLevel_thread_34 = 0;//sysj\ecs.sysj line: 70, column: 5
      light2.setPresent();//sysj\ecs.sysj line: 73, column: 4
      currsigs.addElement(light2);
      light2.setValue(lightLevel_thread_34);//sysj\ecs.sysj line: 73, column: 4
      previous_thread_34 = lightLevel_thread_34;//sysj\ecs.sysj line: 74, column: 4
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread1745(int [] tdone, int [] ends){
        S1263=1;
    timer_33.setClear();//sysj\ecs.sysj line: 35, column: 2
    startTimer_33.setClear();//sysj\ecs.sysj line: 36, column: 2
    thread1746(tdone,ends);
    thread1747(tdone,ends);
    int biggest1751 = 0;
    if(ends[34]>=biggest1751){
      biggest1751=ends[34];
    }
    if(ends[35]>=biggest1751){
      biggest1751=ends[35];
    }
    if(biggest1751 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread1744(int [] tdone, int [] ends){
        active[32]=0;
    ends[32]=0;
    tdone[32]=1;
  }

  public void thread1743(int [] tdone, int [] ends){
        S1265=1;
    thread1744(tdone,ends);
    thread1745(tdone,ends);
    int biggest1752 = 0;
    if(ends[32]>=biggest1752){
      biggest1752=ends[32];
    }
    if(ends[33]>=biggest1752){
      biggest1752=ends[33];
    }
    if(biggest1752 == 1){
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
  }

  public void thread1739(int [] tdone, int [] ends){
        S1057=1;
    if((occu1.getpreval() == null ? 0 : ((Integer)occu1.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 104, column: 9
      timer_24.setPresent();//sysj\ecs.sysj line: 105, column: 6
      currsigs.addElement(timer_24);
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

  public void thread1738(int [] tdone, int [] ends){
        S1049=1;
    S955=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread1737(int [] tdone, int [] ends){
        S1059=1;
    thread1738(tdone,ends);
    thread1739(tdone,ends);
    int biggest1740 = 0;
    if(ends[27]>=biggest1740){
      biggest1740=ends[27];
    }
    if(ends[30]>=biggest1740){
      biggest1740=ends[30];
    }
    if(biggest1740 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread1736(int [] tdone, int [] ends){
        S909=1;
    previous_thread_25 = 0;//sysj\ecs.sysj line: 39, column: 3
    lightLevel_thread_25 = 0;//sysj\ecs.sysj line: 40, column: 3
    if(workingHours_18.getprestatus() || fire_18.getprestatus()){//sysj\ecs.sysj line: 43, column: 12
      if(fire_18.getprestatus()){//sysj\ecs.sysj line: 45, column: 13
        lightLevel_thread_25 = 2;//sysj\ecs.sysj line: 46, column: 6
        light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
        currsigs.addElement(light1);
        light1.setValue(lightLevel_thread_25);//sysj\ecs.sysj line: 73, column: 4
        previous_thread_25 = lightLevel_thread_25;//sysj\ecs.sysj line: 74, column: 4
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
      else {
        if((occu1.getpreval() == null ? 0 : ((Integer)occu1.getpreval()).intValue()) > 0){//sysj\ecs.sysj line: 49, column: 10
          lightLevel_thread_25 = 2;//sysj\ecs.sysj line: 50, column: 7
          light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
          currsigs.addElement(light1);
          light1.setValue(lightLevel_thread_25);//sysj\ecs.sysj line: 73, column: 4
          previous_thread_25 = lightLevel_thread_25;//sysj\ecs.sysj line: 74, column: 4
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          if(previous_thread_25 == 2){//sysj\ecs.sysj line: 53, column: 17
            startTimer_24.setPresent();//sysj\ecs.sysj line: 54, column: 7
            currsigs.addElement(startTimer_24);
            lightLevel_thread_25 = 1;//sysj\ecs.sysj line: 55, column: 7
            light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
            currsigs.addElement(light1);
            light1.setValue(lightLevel_thread_25);//sysj\ecs.sysj line: 73, column: 4
            previous_thread_25 = lightLevel_thread_25;//sysj\ecs.sysj line: 74, column: 4
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
          }
          else {
            if(startTimer_24.getprestatus()){//sysj\ecs.sysj line: 59, column: 15
              lightLevel_thread_25 = 1;//sysj\ecs.sysj line: 61, column: 8
              light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light1);
              light1.setValue(lightLevel_thread_25);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_25 = lightLevel_thread_25;//sysj\ecs.sysj line: 74, column: 4
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              lightLevel_thread_25 = 0;//sysj\ecs.sysj line: 64, column: 8
              light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
              currsigs.addElement(light1);
              light1.setValue(lightLevel_thread_25);//sysj\ecs.sysj line: 73, column: 4
              previous_thread_25 = lightLevel_thread_25;//sysj\ecs.sysj line: 74, column: 4
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
          }
        }
      }
    }
    else {
      lightLevel_thread_25 = 0;//sysj\ecs.sysj line: 70, column: 5
      light1.setPresent();//sysj\ecs.sysj line: 73, column: 4
      currsigs.addElement(light1);
      light1.setValue(lightLevel_thread_25);//sysj\ecs.sysj line: 73, column: 4
      previous_thread_25 = lightLevel_thread_25;//sysj\ecs.sysj line: 74, column: 4
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread1735(int [] tdone, int [] ends){
        S1061=1;
    timer_24.setClear();//sysj\ecs.sysj line: 35, column: 2
    startTimer_24.setClear();//sysj\ecs.sysj line: 36, column: 2
    thread1736(tdone,ends);
    thread1737(tdone,ends);
    int biggest1741 = 0;
    if(ends[25]>=biggest1741){
      biggest1741=ends[25];
    }
    if(ends[26]>=biggest1741){
      biggest1741=ends[26];
    }
    if(biggest1741 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread1734(int [] tdone, int [] ends){
        active[23]=0;
    ends[23]=0;
    tdone[23]=1;
  }

  public void thread1733(int [] tdone, int [] ends){
        S1063=1;
    thread1734(tdone,ends);
    thread1735(tdone,ends);
    int biggest1742 = 0;
    if(ends[23]>=biggest1742){
      biggest1742=ends[23];
    }
    if(ends[24]>=biggest1742){
      biggest1742=ends[24];
    }
    if(biggest1742 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread1732(int [] tdone, int [] ends){
        S861=1;
    if(workingHours_18.getprestatus() || fire_18.getprestatus()){//sysj\ecs.sysj line: 372, column: 13
      light4.setPresent();//sysj\ecs.sysj line: 373, column: 5
      currsigs.addElement(light4);
      light4.setValue(2);//sysj\ecs.sysj line: 373, column: 5
      light5.setPresent();//sysj\ecs.sysj line: 374, column: 5
      currsigs.addElement(light5);
      light5.setValue(2);//sysj\ecs.sysj line: 374, column: 5
      light6.setPresent();//sysj\ecs.sysj line: 375, column: 5
      currsigs.addElement(light6);
      light6.setValue(2);//sysj\ecs.sysj line: 375, column: 5
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread1731(int [] tdone, int [] ends){
        S850=1;
    S849=0;
    S821=0;
    if(!fireHappeningLight_in.isPartnerPresent() || fireHappeningLight_in.isPartnerPreempted()){//sysj\ecs.sysj line: 364, column: 3
      fireHappeningLight_in.setACK(false);//sysj\ecs.sysj line: 364, column: 3
      S821=1;
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S816=0;
      if(!fireHappeningLight_in.isREQ()){//sysj\ecs.sysj line: 364, column: 3
        fireHappeningLight_in.setACK(true);//sysj\ecs.sysj line: 364, column: 3
        S816=1;
        if(fireHappeningLight_in.isREQ()){//sysj\ecs.sysj line: 364, column: 3
          fireHappeningLight_in.setACK(false);//sysj\ecs.sysj line: 364, column: 3
          ends[20]=2;
          ;//sysj\ecs.sysj line: 364, column: 3
          S849=1;
          fire_18.setPresent();//sysj\ecs.sysj line: 365, column: 3
          currsigs.addElement(fire_18);
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
      }
      else {
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
    }
  }

  public void thread1730(int [] tdone, int [] ends){
        S814=1;
    if((clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) >= 470 && (clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) <= 1090){//sysj\ecs.sysj line: 354, column: 8
      workingHours_18.setPresent();//sysj\ecs.sysj line: 355, column: 5
      currsigs.addElement(workingHours_18);
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

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1671){
        case 0 : 
          S1671=0;
          break RUN;
        
        case 1 : 
          S1671=2;
          S1671=2;
          workingHours_18.setClear();//sysj\ecs.sysj line: 345, column: 2
          fire_18.setClear();//sysj\ecs.sysj line: 346, column: 2
          thread1730(tdone,ends);
          thread1731(tdone,ends);
          thread1732(tdone,ends);
          thread1733(tdone,ends);
          thread1743(tdone,ends);
          thread1753(tdone,ends);
          thread1763(tdone,ends);
          int biggest1773 = 0;
          if(ends[19]>=biggest1773){
            biggest1773=ends[19];
          }
          if(ends[20]>=biggest1773){
            biggest1773=ends[20];
          }
          if(ends[21]>=biggest1773){
            biggest1773=ends[21];
          }
          if(ends[22]>=biggest1773){
            biggest1773=ends[22];
          }
          if(ends[31]>=biggest1773){
            biggest1773=ends[31];
          }
          if(ends[40]>=biggest1773){
            biggest1773=ends[40];
          }
          if(ends[49]>=biggest1773){
            biggest1773=ends[49];
          }
          if(biggest1773 == 1){
            active[18]=1;
            ends[18]=1;
            break RUN;
          }
        
        case 2 : 
          workingHours_18.setClear();//sysj\ecs.sysj line: 345, column: 2
          fire_18.setClear();//sysj\ecs.sysj line: 346, column: 2
          thread1774(tdone,ends);
          thread1775(tdone,ends);
          thread1776(tdone,ends);
          thread1777(tdone,ends);
          thread1793(tdone,ends);
          thread1809(tdone,ends);
          thread1825(tdone,ends);
          int biggest1841 = 0;
          if(ends[19]>=biggest1841){
            biggest1841=ends[19];
          }
          if(ends[20]>=biggest1841){
            biggest1841=ends[20];
          }
          if(ends[21]>=biggest1841){
            biggest1841=ends[21];
          }
          if(ends[22]>=biggest1841){
            biggest1841=ends[22];
          }
          if(ends[31]>=biggest1841){
            biggest1841=ends[31];
          }
          if(ends[40]>=biggest1841){
            biggest1841=ends[40];
          }
          if(ends[49]>=biggest1841){
            biggest1841=ends[49];
          }
          if(biggest1841 == 1){
            active[18]=1;
            ends[18]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1841 == 0){
            S1671=0;
            active[18]=0;
            ends[18]=0;
            S1671=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    workingHours_18 = new Signal();
    fire_18 = new Signal();
    timer_24 = new Signal();
    startTimer_24 = new Signal();
    timer_33 = new Signal();
    startTimer_33 = new Signal();
    timer_42 = new Signal();
    startTimer_42 = new Signal();
    timer_51 = new Signal();
    startTimer_51 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[18] != 0){
      int index = 18;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[18]!=0 || suspended[18]!=0 || active[18]!=1);
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
      workingHours_18.setpreclear();
      fire_18.setpreclear();
      timer_24.setpreclear();
      startTimer_24.setpreclear();
      timer_33.setpreclear();
      startTimer_33.setpreclear();
      timer_42.setpreclear();
      startTimer_42.setpreclear();
      timer_51.setpreclear();
      startTimer_51.setpreclear();
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
      workingHours_18.setClear();
      fire_18.setClear();
      timer_24.setClear();
      startTimer_24.setClear();
      timer_33.setClear();
      startTimer_33.setClear();
      timer_42.setClear();
      startTimer_42.setClear();
      timer_51.setClear();
      startTimer_51.setClear();
      fireHappeningLight_in.sethook();
      if(paused[18]!=0 || suspended[18]!=0 || active[18]!=1);
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
      if(active[18] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

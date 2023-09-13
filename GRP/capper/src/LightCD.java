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
  public input_Channel fireHappening_in = new input_Channel();
  private Signal workingHours_16;
  private Signal fire_16;
  private Signal timer1_16;
  private Signal timer2_16;
  private Signal timer3_16;
  private Signal timer7_16;
  private Signal startTimer1_16;
  private Signal startTimer2_16;
  private Signal startTimer3_16;
  private Signal startTimer7_16;
  private int previous_thread_20;//sysj\controller.sysj line: 258, column: 3
  private int lightLevel_thread_20;//sysj\controller.sysj line: 259, column: 3
  private int previous_thread_25;//sysj\controller.sysj line: 329, column: 3
  private int lightLevel_thread_25;//sysj\controller.sysj line: 330, column: 3
  private long __start_thread_22;//sysj\controller.sysj line: 303, column: 3
  private int previous_thread_30;//sysj\controller.sysj line: 398, column: 3
  private int lightLevel_thread_30;//sysj\controller.sysj line: 399, column: 3
  private long __start_thread_27;//sysj\controller.sysj line: 374, column: 3
  private int previous_thread_35;//sysj\controller.sysj line: 467, column: 3
  private int lightLevel_thread_35;//sysj\controller.sysj line: 468, column: 3
  private long __start_thread_32;//sysj\controller.sysj line: 443, column: 3
  private long __start_thread_37;//sysj\controller.sysj line: 512, column: 3
  private int S1231 = 1;
  private int S588 = 1;
  private int S326 = 1;
  private int S362 = 1;
  private int S361 = 1;
  private int S333 = 1;
  private int S328 = 1;
  private int S373 = 1;
  private int S417 = 1;
  private int S480 = 1;
  private int S479 = 1;
  private int S434 = 1;
  private int S440 = 1;
  private int S448 = 1;
  private int S447 = 1;
  private int S632 = 1;
  private int S695 = 1;
  private int S694 = 1;
  private int S649 = 1;
  private int S655 = 1;
  private int S663 = 1;
  private int S846 = 1;
  private int S909 = 1;
  private int S908 = 1;
  private int S863 = 1;
  private int S869 = 1;
  private int S877 = 1;
  private int S1060 = 1;
  private int S1123 = 1;
  private int S1122 = 1;
  private int S1077 = 1;
  private int S1083 = 1;
  private int S1091 = 1;
  
  private int[] ends = new int[40];
  private int[] tdone = new int[40];
  
  public void thread1324(int [] tdone, int [] ends){
        switch(S1091){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        if((occu7.getpreval() == null ? 0 : ((Integer)occu7.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 526, column: 9
          timer7_16.setPresent();//sysj\controller.sysj line: 527, column: 6
          currsigs.addElement(timer7_16);
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

  public void thread1323(int [] tdone, int [] ends){
        switch(S1083){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(timer7_16.getprestatus()){//sysj\controller.sysj line: 519, column: 10
          S1083=0;
          active[38]=0;
          ends[38]=0;
          tdone[38]=1;
        }
        else {
          startTimer7_16.setPresent();//sysj\controller.sysj line: 520, column: 5
          currsigs.addElement(startTimer7_16);
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        break;
      
    }
  }

  public void thread1322(int [] tdone, int [] ends){
        switch(S1077){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_37 >= (300) * 1000){//sysj\controller.sysj line: 512, column: 3
          ends[37]=2;
          ;//sysj\controller.sysj line: 512, column: 3
          timer7_16.setPresent();//sysj\controller.sysj line: 514, column: 4
          currsigs.addElement(timer7_16);
          S1077=0;
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

  public void thread1320(int [] tdone, int [] ends){
        S1091=1;
    if((occu7.getpreval() == null ? 0 : ((Integer)occu7.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 526, column: 9
      timer7_16.setPresent();//sysj\controller.sysj line: 527, column: 6
      currsigs.addElement(timer7_16);
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

  public void thread1319(int [] tdone, int [] ends){
        S1083=1;
    startTimer7_16.setPresent();//sysj\controller.sysj line: 520, column: 5
    currsigs.addElement(startTimer7_16);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread1318(int [] tdone, int [] ends){
        S1077=1;
    __start_thread_37 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 512, column: 3
    if(com.systemj.Timer.getMs() - __start_thread_37 >= (300) * 1000){//sysj\controller.sysj line: 512, column: 3
      ends[37]=2;
      ;//sysj\controller.sysj line: 512, column: 3
      timer7_16.setPresent();//sysj\controller.sysj line: 514, column: 4
      currsigs.addElement(timer7_16);
      S1077=0;
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

  public void thread1317(int [] tdone, int [] ends){
        switch(S1123){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        switch(S1122){
          case 0 : 
            if(startTimer7_16.getprestatus()){//sysj\controller.sysj line: 510, column: 9
              S1122=1;
              thread1318(tdone,ends);
              thread1319(tdone,ends);
              thread1320(tdone,ends);
              int biggest1321 = 0;
              if(ends[37]>=biggest1321){
                biggest1321=ends[37];
              }
              if(ends[38]>=biggest1321){
                biggest1321=ends[38];
              }
              if(ends[39]>=biggest1321){
                biggest1321=ends[39];
              }
              if(biggest1321 == 1){
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
            thread1322(tdone,ends);
            thread1323(tdone,ends);
            thread1324(tdone,ends);
            int biggest1325 = 0;
            if(ends[37]>=biggest1325){
              biggest1325=ends[37];
            }
            if(ends[38]>=biggest1325){
              biggest1325=ends[38];
            }
            if(ends[39]>=biggest1325){
              biggest1325=ends[39];
            }
            if(biggest1325 == 1){
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            //FINXME code
            if(biggest1325 == 0){
              S1123=0;
              active[36]=0;
              ends[36]=0;
              tdone[36]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1316(int [] tdone, int [] ends){
        switch(S1060){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\controller.sysj line: 471, column: 12
          if(fire_16.getprestatus()){//sysj\controller.sysj line: 473, column: 13
            lightLevel_thread_35 = 2;//sysj\controller.sysj line: 474, column: 6
            light7.setPresent();//sysj\controller.sysj line: 501, column: 4
            currsigs.addElement(light7);
            light7.setValue(lightLevel_thread_35);//sysj\controller.sysj line: 501, column: 4
            previous_thread_35 = lightLevel_thread_35;//sysj\controller.sysj line: 502, column: 4
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            if((occu7.getpreval() == null ? 0 : ((Integer)occu7.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 477, column: 10
              lightLevel_thread_35 = 2;//sysj\controller.sysj line: 478, column: 7
              light7.setPresent();//sysj\controller.sysj line: 501, column: 4
              currsigs.addElement(light7);
              light7.setValue(lightLevel_thread_35);//sysj\controller.sysj line: 501, column: 4
              previous_thread_35 = lightLevel_thread_35;//sysj\controller.sysj line: 502, column: 4
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            else {
              if(previous_thread_35 == 2){//sysj\controller.sysj line: 481, column: 17
                startTimer7_16.setPresent();//sysj\controller.sysj line: 482, column: 7
                currsigs.addElement(startTimer7_16);
                lightLevel_thread_35 = 1;//sysj\controller.sysj line: 483, column: 7
                light7.setPresent();//sysj\controller.sysj line: 501, column: 4
                currsigs.addElement(light7);
                light7.setValue(lightLevel_thread_35);//sysj\controller.sysj line: 501, column: 4
                previous_thread_35 = lightLevel_thread_35;//sysj\controller.sysj line: 502, column: 4
                active[35]=1;
                ends[35]=1;
                tdone[35]=1;
              }
              else {
                if(startTimer7_16.getprestatus()){//sysj\controller.sysj line: 487, column: 15
                  lightLevel_thread_35 = 1;//sysj\controller.sysj line: 489, column: 8
                  light7.setPresent();//sysj\controller.sysj line: 501, column: 4
                  currsigs.addElement(light7);
                  light7.setValue(lightLevel_thread_35);//sysj\controller.sysj line: 501, column: 4
                  previous_thread_35 = lightLevel_thread_35;//sysj\controller.sysj line: 502, column: 4
                  active[35]=1;
                  ends[35]=1;
                  tdone[35]=1;
                }
                else {
                  lightLevel_thread_35 = 0;//sysj\controller.sysj line: 492, column: 8
                  light7.setPresent();//sysj\controller.sysj line: 501, column: 4
                  currsigs.addElement(light7);
                  light7.setValue(lightLevel_thread_35);//sysj\controller.sysj line: 501, column: 4
                  previous_thread_35 = lightLevel_thread_35;//sysj\controller.sysj line: 502, column: 4
                  active[35]=1;
                  ends[35]=1;
                  tdone[35]=1;
                }
              }
            }
          }
        }
        else {
          lightLevel_thread_35 = 0;//sysj\controller.sysj line: 498, column: 5
          light7.setPresent();//sysj\controller.sysj line: 501, column: 4
          currsigs.addElement(light7);
          light7.setValue(lightLevel_thread_35);//sysj\controller.sysj line: 501, column: 4
          previous_thread_35 = lightLevel_thread_35;//sysj\controller.sysj line: 502, column: 4
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread1314(int [] tdone, int [] ends){
        S1123=1;
    S1122=0;
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread1313(int [] tdone, int [] ends){
        S1060=1;
    previous_thread_35 = 0;//sysj\controller.sysj line: 467, column: 3
    lightLevel_thread_35 = 0;//sysj\controller.sysj line: 468, column: 3
    if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\controller.sysj line: 471, column: 12
      if(fire_16.getprestatus()){//sysj\controller.sysj line: 473, column: 13
        lightLevel_thread_35 = 2;//sysj\controller.sysj line: 474, column: 6
        light7.setPresent();//sysj\controller.sysj line: 501, column: 4
        currsigs.addElement(light7);
        light7.setValue(lightLevel_thread_35);//sysj\controller.sysj line: 501, column: 4
        previous_thread_35 = lightLevel_thread_35;//sysj\controller.sysj line: 502, column: 4
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
      else {
        if((occu7.getpreval() == null ? 0 : ((Integer)occu7.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 477, column: 10
          lightLevel_thread_35 = 2;//sysj\controller.sysj line: 478, column: 7
          light7.setPresent();//sysj\controller.sysj line: 501, column: 4
          currsigs.addElement(light7);
          light7.setValue(lightLevel_thread_35);//sysj\controller.sysj line: 501, column: 4
          previous_thread_35 = lightLevel_thread_35;//sysj\controller.sysj line: 502, column: 4
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        else {
          if(previous_thread_35 == 2){//sysj\controller.sysj line: 481, column: 17
            startTimer7_16.setPresent();//sysj\controller.sysj line: 482, column: 7
            currsigs.addElement(startTimer7_16);
            lightLevel_thread_35 = 1;//sysj\controller.sysj line: 483, column: 7
            light7.setPresent();//sysj\controller.sysj line: 501, column: 4
            currsigs.addElement(light7);
            light7.setValue(lightLevel_thread_35);//sysj\controller.sysj line: 501, column: 4
            previous_thread_35 = lightLevel_thread_35;//sysj\controller.sysj line: 502, column: 4
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            if(startTimer7_16.getprestatus()){//sysj\controller.sysj line: 487, column: 15
              lightLevel_thread_35 = 1;//sysj\controller.sysj line: 489, column: 8
              light7.setPresent();//sysj\controller.sysj line: 501, column: 4
              currsigs.addElement(light7);
              light7.setValue(lightLevel_thread_35);//sysj\controller.sysj line: 501, column: 4
              previous_thread_35 = lightLevel_thread_35;//sysj\controller.sysj line: 502, column: 4
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            else {
              lightLevel_thread_35 = 0;//sysj\controller.sysj line: 492, column: 8
              light7.setPresent();//sysj\controller.sysj line: 501, column: 4
              currsigs.addElement(light7);
              light7.setValue(lightLevel_thread_35);//sysj\controller.sysj line: 501, column: 4
              previous_thread_35 = lightLevel_thread_35;//sysj\controller.sysj line: 502, column: 4
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
          }
        }
      }
    }
    else {
      lightLevel_thread_35 = 0;//sysj\controller.sysj line: 498, column: 5
      light7.setPresent();//sysj\controller.sysj line: 501, column: 4
      currsigs.addElement(light7);
      light7.setValue(lightLevel_thread_35);//sysj\controller.sysj line: 501, column: 4
      previous_thread_35 = lightLevel_thread_35;//sysj\controller.sysj line: 502, column: 4
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread1310(int [] tdone, int [] ends){
        switch(S877){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if((occu3.getpreval() == null ? 0 : ((Integer)occu3.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 457, column: 9
          timer3_16.setPresent();//sysj\controller.sysj line: 458, column: 6
          currsigs.addElement(timer3_16);
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread1309(int [] tdone, int [] ends){
        switch(S869){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(timer1_16.getprestatus()){//sysj\controller.sysj line: 450, column: 10
          S869=0;
          active[33]=0;
          ends[33]=0;
          tdone[33]=1;
        }
        else {
          startTimer3_16.setPresent();//sysj\controller.sysj line: 451, column: 5
          currsigs.addElement(startTimer3_16);
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread1308(int [] tdone, int [] ends){
        switch(S863){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_32 >= (300) * 1000){//sysj\controller.sysj line: 443, column: 3
          ends[32]=2;
          ;//sysj\controller.sysj line: 443, column: 3
          timer3_16.setPresent();//sysj\controller.sysj line: 445, column: 4
          currsigs.addElement(timer3_16);
          S863=0;
          active[32]=0;
          ends[32]=0;
          tdone[32]=1;
        }
        else {
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        break;
      
    }
  }

  public void thread1306(int [] tdone, int [] ends){
        S877=1;
    if((occu3.getpreval() == null ? 0 : ((Integer)occu3.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 457, column: 9
      timer3_16.setPresent();//sysj\controller.sysj line: 458, column: 6
      currsigs.addElement(timer3_16);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread1305(int [] tdone, int [] ends){
        S869=1;
    startTimer3_16.setPresent();//sysj\controller.sysj line: 451, column: 5
    currsigs.addElement(startTimer3_16);
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread1304(int [] tdone, int [] ends){
        S863=1;
    __start_thread_32 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 443, column: 3
    if(com.systemj.Timer.getMs() - __start_thread_32 >= (300) * 1000){//sysj\controller.sysj line: 443, column: 3
      ends[32]=2;
      ;//sysj\controller.sysj line: 443, column: 3
      timer3_16.setPresent();//sysj\controller.sysj line: 445, column: 4
      currsigs.addElement(timer3_16);
      S863=0;
      active[32]=0;
      ends[32]=0;
      tdone[32]=1;
    }
    else {
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread1303(int [] tdone, int [] ends){
        switch(S909){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        switch(S908){
          case 0 : 
            if(startTimer3_16.getprestatus()){//sysj\controller.sysj line: 441, column: 9
              S908=1;
              thread1304(tdone,ends);
              thread1305(tdone,ends);
              thread1306(tdone,ends);
              int biggest1307 = 0;
              if(ends[32]>=biggest1307){
                biggest1307=ends[32];
              }
              if(ends[33]>=biggest1307){
                biggest1307=ends[33];
              }
              if(ends[34]>=biggest1307){
                biggest1307=ends[34];
              }
              if(biggest1307 == 1){
                active[31]=1;
                ends[31]=1;
                tdone[31]=1;
              }
            }
            else {
              active[31]=1;
              ends[31]=1;
              tdone[31]=1;
            }
            break;
          
          case 1 : 
            thread1308(tdone,ends);
            thread1309(tdone,ends);
            thread1310(tdone,ends);
            int biggest1311 = 0;
            if(ends[32]>=biggest1311){
              biggest1311=ends[32];
            }
            if(ends[33]>=biggest1311){
              biggest1311=ends[33];
            }
            if(ends[34]>=biggest1311){
              biggest1311=ends[34];
            }
            if(biggest1311 == 1){
              active[31]=1;
              ends[31]=1;
              tdone[31]=1;
            }
            //FINXME code
            if(biggest1311 == 0){
              S909=0;
              active[31]=0;
              ends[31]=0;
              tdone[31]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1302(int [] tdone, int [] ends){
        switch(S846){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\controller.sysj line: 402, column: 12
          if(fire_16.getprestatus()){//sysj\controller.sysj line: 404, column: 13
            lightLevel_thread_30 = 2;//sysj\controller.sysj line: 405, column: 6
            light3.setPresent();//sysj\controller.sysj line: 432, column: 4
            currsigs.addElement(light3);
            light3.setValue(lightLevel_thread_30);//sysj\controller.sysj line: 432, column: 4
            previous_thread_30 = lightLevel_thread_30;//sysj\controller.sysj line: 433, column: 4
            active[30]=1;
            ends[30]=1;
            tdone[30]=1;
          }
          else {
            if((occu3.getpreval() == null ? 0 : ((Integer)occu3.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 408, column: 10
              lightLevel_thread_30 = 2;//sysj\controller.sysj line: 409, column: 7
              light3.setPresent();//sysj\controller.sysj line: 432, column: 4
              currsigs.addElement(light3);
              light3.setValue(lightLevel_thread_30);//sysj\controller.sysj line: 432, column: 4
              previous_thread_30 = lightLevel_thread_30;//sysj\controller.sysj line: 433, column: 4
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            else {
              if(previous_thread_30 == 2){//sysj\controller.sysj line: 412, column: 17
                startTimer3_16.setPresent();//sysj\controller.sysj line: 413, column: 7
                currsigs.addElement(startTimer3_16);
                lightLevel_thread_30 = 1;//sysj\controller.sysj line: 414, column: 7
                light3.setPresent();//sysj\controller.sysj line: 432, column: 4
                currsigs.addElement(light3);
                light3.setValue(lightLevel_thread_30);//sysj\controller.sysj line: 432, column: 4
                previous_thread_30 = lightLevel_thread_30;//sysj\controller.sysj line: 433, column: 4
                active[30]=1;
                ends[30]=1;
                tdone[30]=1;
              }
              else {
                if(startTimer3_16.getprestatus()){//sysj\controller.sysj line: 418, column: 15
                  lightLevel_thread_30 = 1;//sysj\controller.sysj line: 420, column: 8
                  light3.setPresent();//sysj\controller.sysj line: 432, column: 4
                  currsigs.addElement(light3);
                  light3.setValue(lightLevel_thread_30);//sysj\controller.sysj line: 432, column: 4
                  previous_thread_30 = lightLevel_thread_30;//sysj\controller.sysj line: 433, column: 4
                  active[30]=1;
                  ends[30]=1;
                  tdone[30]=1;
                }
                else {
                  lightLevel_thread_30 = 0;//sysj\controller.sysj line: 423, column: 8
                  light3.setPresent();//sysj\controller.sysj line: 432, column: 4
                  currsigs.addElement(light3);
                  light3.setValue(lightLevel_thread_30);//sysj\controller.sysj line: 432, column: 4
                  previous_thread_30 = lightLevel_thread_30;//sysj\controller.sysj line: 433, column: 4
                  active[30]=1;
                  ends[30]=1;
                  tdone[30]=1;
                }
              }
            }
          }
        }
        else {
          lightLevel_thread_30 = 0;//sysj\controller.sysj line: 429, column: 5
          light3.setPresent();//sysj\controller.sysj line: 432, column: 4
          currsigs.addElement(light3);
          light3.setValue(lightLevel_thread_30);//sysj\controller.sysj line: 432, column: 4
          previous_thread_30 = lightLevel_thread_30;//sysj\controller.sysj line: 433, column: 4
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        break;
      
    }
  }

  public void thread1300(int [] tdone, int [] ends){
        S909=1;
    S908=0;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread1299(int [] tdone, int [] ends){
        S846=1;
    previous_thread_30 = 0;//sysj\controller.sysj line: 398, column: 3
    lightLevel_thread_30 = 0;//sysj\controller.sysj line: 399, column: 3
    if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\controller.sysj line: 402, column: 12
      if(fire_16.getprestatus()){//sysj\controller.sysj line: 404, column: 13
        lightLevel_thread_30 = 2;//sysj\controller.sysj line: 405, column: 6
        light3.setPresent();//sysj\controller.sysj line: 432, column: 4
        currsigs.addElement(light3);
        light3.setValue(lightLevel_thread_30);//sysj\controller.sysj line: 432, column: 4
        previous_thread_30 = lightLevel_thread_30;//sysj\controller.sysj line: 433, column: 4
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
      else {
        if((occu3.getpreval() == null ? 0 : ((Integer)occu3.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 408, column: 10
          lightLevel_thread_30 = 2;//sysj\controller.sysj line: 409, column: 7
          light3.setPresent();//sysj\controller.sysj line: 432, column: 4
          currsigs.addElement(light3);
          light3.setValue(lightLevel_thread_30);//sysj\controller.sysj line: 432, column: 4
          previous_thread_30 = lightLevel_thread_30;//sysj\controller.sysj line: 433, column: 4
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          if(previous_thread_30 == 2){//sysj\controller.sysj line: 412, column: 17
            startTimer3_16.setPresent();//sysj\controller.sysj line: 413, column: 7
            currsigs.addElement(startTimer3_16);
            lightLevel_thread_30 = 1;//sysj\controller.sysj line: 414, column: 7
            light3.setPresent();//sysj\controller.sysj line: 432, column: 4
            currsigs.addElement(light3);
            light3.setValue(lightLevel_thread_30);//sysj\controller.sysj line: 432, column: 4
            previous_thread_30 = lightLevel_thread_30;//sysj\controller.sysj line: 433, column: 4
            active[30]=1;
            ends[30]=1;
            tdone[30]=1;
          }
          else {
            if(startTimer3_16.getprestatus()){//sysj\controller.sysj line: 418, column: 15
              lightLevel_thread_30 = 1;//sysj\controller.sysj line: 420, column: 8
              light3.setPresent();//sysj\controller.sysj line: 432, column: 4
              currsigs.addElement(light3);
              light3.setValue(lightLevel_thread_30);//sysj\controller.sysj line: 432, column: 4
              previous_thread_30 = lightLevel_thread_30;//sysj\controller.sysj line: 433, column: 4
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            else {
              lightLevel_thread_30 = 0;//sysj\controller.sysj line: 423, column: 8
              light3.setPresent();//sysj\controller.sysj line: 432, column: 4
              currsigs.addElement(light3);
              light3.setValue(lightLevel_thread_30);//sysj\controller.sysj line: 432, column: 4
              previous_thread_30 = lightLevel_thread_30;//sysj\controller.sysj line: 433, column: 4
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
          }
        }
      }
    }
    else {
      lightLevel_thread_30 = 0;//sysj\controller.sysj line: 429, column: 5
      light3.setPresent();//sysj\controller.sysj line: 432, column: 4
      currsigs.addElement(light3);
      light3.setValue(lightLevel_thread_30);//sysj\controller.sysj line: 432, column: 4
      previous_thread_30 = lightLevel_thread_30;//sysj\controller.sysj line: 433, column: 4
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread1296(int [] tdone, int [] ends){
        switch(S663){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if((occu2.getpreval() == null ? 0 : ((Integer)occu2.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 388, column: 9
          timer7_16.setPresent();//sysj\controller.sysj line: 389, column: 6
          currsigs.addElement(timer7_16);
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

  public void thread1295(int [] tdone, int [] ends){
        switch(S655){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(timer2_16.getprestatus()){//sysj\controller.sysj line: 381, column: 10
          S655=0;
          active[28]=0;
          ends[28]=0;
          tdone[28]=1;
        }
        else {
          startTimer2_16.setPresent();//sysj\controller.sysj line: 382, column: 5
          currsigs.addElement(startTimer2_16);
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread1294(int [] tdone, int [] ends){
        switch(S649){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_27 >= (300) * 1000){//sysj\controller.sysj line: 374, column: 3
          ends[27]=2;
          ;//sysj\controller.sysj line: 374, column: 3
          timer2_16.setPresent();//sysj\controller.sysj line: 376, column: 4
          currsigs.addElement(timer2_16);
          S649=0;
          active[27]=0;
          ends[27]=0;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        break;
      
    }
  }

  public void thread1292(int [] tdone, int [] ends){
        S663=1;
    if((occu2.getpreval() == null ? 0 : ((Integer)occu2.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 388, column: 9
      timer7_16.setPresent();//sysj\controller.sysj line: 389, column: 6
      currsigs.addElement(timer7_16);
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

  public void thread1291(int [] tdone, int [] ends){
        S655=1;
    startTimer2_16.setPresent();//sysj\controller.sysj line: 382, column: 5
    currsigs.addElement(startTimer2_16);
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread1290(int [] tdone, int [] ends){
        S649=1;
    __start_thread_27 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 374, column: 3
    if(com.systemj.Timer.getMs() - __start_thread_27 >= (300) * 1000){//sysj\controller.sysj line: 374, column: 3
      ends[27]=2;
      ;//sysj\controller.sysj line: 374, column: 3
      timer2_16.setPresent();//sysj\controller.sysj line: 376, column: 4
      currsigs.addElement(timer2_16);
      S649=0;
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
    else {
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread1289(int [] tdone, int [] ends){
        switch(S695){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S694){
          case 0 : 
            if(startTimer2_16.getprestatus()){//sysj\controller.sysj line: 372, column: 9
              S694=1;
              thread1290(tdone,ends);
              thread1291(tdone,ends);
              thread1292(tdone,ends);
              int biggest1293 = 0;
              if(ends[27]>=biggest1293){
                biggest1293=ends[27];
              }
              if(ends[28]>=biggest1293){
                biggest1293=ends[28];
              }
              if(ends[29]>=biggest1293){
                biggest1293=ends[29];
              }
              if(biggest1293 == 1){
                active[26]=1;
                ends[26]=1;
                tdone[26]=1;
              }
            }
            else {
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
          case 1 : 
            thread1294(tdone,ends);
            thread1295(tdone,ends);
            thread1296(tdone,ends);
            int biggest1297 = 0;
            if(ends[27]>=biggest1297){
              biggest1297=ends[27];
            }
            if(ends[28]>=biggest1297){
              biggest1297=ends[28];
            }
            if(ends[29]>=biggest1297){
              biggest1297=ends[29];
            }
            if(biggest1297 == 1){
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            //FINXME code
            if(biggest1297 == 0){
              S695=0;
              active[26]=0;
              ends[26]=0;
              tdone[26]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1288(int [] tdone, int [] ends){
        switch(S632){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\controller.sysj line: 333, column: 12
          if(fire_16.getprestatus()){//sysj\controller.sysj line: 335, column: 13
            lightLevel_thread_25 = 2;//sysj\controller.sysj line: 336, column: 6
            light2.setPresent();//sysj\controller.sysj line: 363, column: 4
            currsigs.addElement(light2);
            light2.setValue(lightLevel_thread_25);//sysj\controller.sysj line: 363, column: 4
            previous_thread_25 = lightLevel_thread_25;//sysj\controller.sysj line: 364, column: 4
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
          }
          else {
            if((occu2.getpreval() == null ? 0 : ((Integer)occu2.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 339, column: 10
              lightLevel_thread_25 = 2;//sysj\controller.sysj line: 340, column: 7
              light2.setPresent();//sysj\controller.sysj line: 363, column: 4
              currsigs.addElement(light2);
              light2.setValue(lightLevel_thread_25);//sysj\controller.sysj line: 363, column: 4
              previous_thread_25 = lightLevel_thread_25;//sysj\controller.sysj line: 364, column: 4
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              if(previous_thread_25 == 2){//sysj\controller.sysj line: 343, column: 17
                startTimer2_16.setPresent();//sysj\controller.sysj line: 344, column: 7
                currsigs.addElement(startTimer2_16);
                lightLevel_thread_25 = 1;//sysj\controller.sysj line: 345, column: 7
                light2.setPresent();//sysj\controller.sysj line: 363, column: 4
                currsigs.addElement(light2);
                light2.setValue(lightLevel_thread_25);//sysj\controller.sysj line: 363, column: 4
                previous_thread_25 = lightLevel_thread_25;//sysj\controller.sysj line: 364, column: 4
                active[25]=1;
                ends[25]=1;
                tdone[25]=1;
              }
              else {
                if(startTimer2_16.getprestatus()){//sysj\controller.sysj line: 349, column: 15
                  lightLevel_thread_25 = 1;//sysj\controller.sysj line: 351, column: 8
                  light2.setPresent();//sysj\controller.sysj line: 363, column: 4
                  currsigs.addElement(light2);
                  light2.setValue(lightLevel_thread_25);//sysj\controller.sysj line: 363, column: 4
                  previous_thread_25 = lightLevel_thread_25;//sysj\controller.sysj line: 364, column: 4
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  lightLevel_thread_25 = 0;//sysj\controller.sysj line: 354, column: 8
                  light2.setPresent();//sysj\controller.sysj line: 363, column: 4
                  currsigs.addElement(light2);
                  light2.setValue(lightLevel_thread_25);//sysj\controller.sysj line: 363, column: 4
                  previous_thread_25 = lightLevel_thread_25;//sysj\controller.sysj line: 364, column: 4
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
            }
          }
        }
        else {
          lightLevel_thread_25 = 0;//sysj\controller.sysj line: 360, column: 5
          light2.setPresent();//sysj\controller.sysj line: 363, column: 4
          currsigs.addElement(light2);
          light2.setValue(lightLevel_thread_25);//sysj\controller.sysj line: 363, column: 4
          previous_thread_25 = lightLevel_thread_25;//sysj\controller.sysj line: 364, column: 4
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread1286(int [] tdone, int [] ends){
        S695=1;
    S694=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread1285(int [] tdone, int [] ends){
        S632=1;
    previous_thread_25 = 0;//sysj\controller.sysj line: 329, column: 3
    lightLevel_thread_25 = 0;//sysj\controller.sysj line: 330, column: 3
    if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\controller.sysj line: 333, column: 12
      if(fire_16.getprestatus()){//sysj\controller.sysj line: 335, column: 13
        lightLevel_thread_25 = 2;//sysj\controller.sysj line: 336, column: 6
        light2.setPresent();//sysj\controller.sysj line: 363, column: 4
        currsigs.addElement(light2);
        light2.setValue(lightLevel_thread_25);//sysj\controller.sysj line: 363, column: 4
        previous_thread_25 = lightLevel_thread_25;//sysj\controller.sysj line: 364, column: 4
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
      else {
        if((occu2.getpreval() == null ? 0 : ((Integer)occu2.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 339, column: 10
          lightLevel_thread_25 = 2;//sysj\controller.sysj line: 340, column: 7
          light2.setPresent();//sysj\controller.sysj line: 363, column: 4
          currsigs.addElement(light2);
          light2.setValue(lightLevel_thread_25);//sysj\controller.sysj line: 363, column: 4
          previous_thread_25 = lightLevel_thread_25;//sysj\controller.sysj line: 364, column: 4
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          if(previous_thread_25 == 2){//sysj\controller.sysj line: 343, column: 17
            startTimer2_16.setPresent();//sysj\controller.sysj line: 344, column: 7
            currsigs.addElement(startTimer2_16);
            lightLevel_thread_25 = 1;//sysj\controller.sysj line: 345, column: 7
            light2.setPresent();//sysj\controller.sysj line: 363, column: 4
            currsigs.addElement(light2);
            light2.setValue(lightLevel_thread_25);//sysj\controller.sysj line: 363, column: 4
            previous_thread_25 = lightLevel_thread_25;//sysj\controller.sysj line: 364, column: 4
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
          }
          else {
            if(startTimer2_16.getprestatus()){//sysj\controller.sysj line: 349, column: 15
              lightLevel_thread_25 = 1;//sysj\controller.sysj line: 351, column: 8
              light2.setPresent();//sysj\controller.sysj line: 363, column: 4
              currsigs.addElement(light2);
              light2.setValue(lightLevel_thread_25);//sysj\controller.sysj line: 363, column: 4
              previous_thread_25 = lightLevel_thread_25;//sysj\controller.sysj line: 364, column: 4
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              lightLevel_thread_25 = 0;//sysj\controller.sysj line: 354, column: 8
              light2.setPresent();//sysj\controller.sysj line: 363, column: 4
              currsigs.addElement(light2);
              light2.setValue(lightLevel_thread_25);//sysj\controller.sysj line: 363, column: 4
              previous_thread_25 = lightLevel_thread_25;//sysj\controller.sysj line: 364, column: 4
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
          }
        }
      }
    }
    else {
      lightLevel_thread_25 = 0;//sysj\controller.sysj line: 360, column: 5
      light2.setPresent();//sysj\controller.sysj line: 363, column: 4
      currsigs.addElement(light2);
      light2.setValue(lightLevel_thread_25);//sysj\controller.sysj line: 363, column: 4
      previous_thread_25 = lightLevel_thread_25;//sysj\controller.sysj line: 364, column: 4
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread1282(int [] tdone, int [] ends){
        switch(S448){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S447){
          case 0 : 
            if((occu1.getpreval() == null ? 0 : ((Integer)occu1.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 317, column: 9
              timer1_16.setPresent();//sysj\controller.sysj line: 318, column: 6
              currsigs.addElement(timer1_16);
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
          
          case 1 : 
            S447=1;
            S448=0;
            active[24]=0;
            ends[24]=0;
            tdone[24]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1281(int [] tdone, int [] ends){
        switch(S440){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(timer1_16.getprestatus()){//sysj\controller.sysj line: 310, column: 10
          S440=0;
          active[23]=0;
          ends[23]=0;
          tdone[23]=1;
        }
        else {
          startTimer1_16.setPresent();//sysj\controller.sysj line: 311, column: 5
          currsigs.addElement(startTimer1_16);
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread1280(int [] tdone, int [] ends){
        switch(S434){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_22 >= (300) * 1000){//sysj\controller.sysj line: 303, column: 3
          ends[22]=2;
          ;//sysj\controller.sysj line: 303, column: 3
          timer1_16.setPresent();//sysj\controller.sysj line: 305, column: 4
          currsigs.addElement(timer1_16);
          S434=0;
          active[22]=0;
          ends[22]=0;
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

  public void thread1278(int [] tdone, int [] ends){
        S448=1;
    S447=0;
    if((occu1.getpreval() == null ? 0 : ((Integer)occu1.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 317, column: 9
      timer1_16.setPresent();//sysj\controller.sysj line: 318, column: 6
      currsigs.addElement(timer1_16);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread1277(int [] tdone, int [] ends){
        S440=1;
    startTimer1_16.setPresent();//sysj\controller.sysj line: 311, column: 5
    currsigs.addElement(startTimer1_16);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread1276(int [] tdone, int [] ends){
        S434=1;
    __start_thread_22 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 303, column: 3
    if(com.systemj.Timer.getMs() - __start_thread_22 >= (300) * 1000){//sysj\controller.sysj line: 303, column: 3
      ends[22]=2;
      ;//sysj\controller.sysj line: 303, column: 3
      timer1_16.setPresent();//sysj\controller.sysj line: 305, column: 4
      currsigs.addElement(timer1_16);
      S434=0;
      active[22]=0;
      ends[22]=0;
      tdone[22]=1;
    }
    else {
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread1275(int [] tdone, int [] ends){
        switch(S480){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S479){
          case 0 : 
            if(startTimer1_16.getprestatus()){//sysj\controller.sysj line: 301, column: 9
              S479=1;
              thread1276(tdone,ends);
              thread1277(tdone,ends);
              thread1278(tdone,ends);
              int biggest1279 = 0;
              if(ends[22]>=biggest1279){
                biggest1279=ends[22];
              }
              if(ends[23]>=biggest1279){
                biggest1279=ends[23];
              }
              if(ends[24]>=biggest1279){
                biggest1279=ends[24];
              }
              if(biggest1279 == 1){
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
            }
            else {
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            thread1280(tdone,ends);
            thread1281(tdone,ends);
            thread1282(tdone,ends);
            int biggest1283 = 0;
            if(ends[22]>=biggest1283){
              biggest1283=ends[22];
            }
            if(ends[23]>=biggest1283){
              biggest1283=ends[23];
            }
            if(ends[24]>=biggest1283){
              biggest1283=ends[24];
            }
            if(biggest1283 == 1){
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            //FINXME code
            if(biggest1283 == 0){
              S480=0;
              active[21]=0;
              ends[21]=0;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1274(int [] tdone, int [] ends){
        switch(S417){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\controller.sysj line: 262, column: 12
          if(fire_16.getprestatus()){//sysj\controller.sysj line: 264, column: 13
            lightLevel_thread_20 = 2;//sysj\controller.sysj line: 265, column: 6
            light1.setPresent();//sysj\controller.sysj line: 292, column: 4
            currsigs.addElement(light1);
            light1.setValue(lightLevel_thread_20);//sysj\controller.sysj line: 292, column: 4
            previous_thread_20 = lightLevel_thread_20;//sysj\controller.sysj line: 293, column: 4
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
          else {
            if((occu1.getpreval() == null ? 0 : ((Integer)occu1.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 268, column: 10
              lightLevel_thread_20 = 2;//sysj\controller.sysj line: 269, column: 7
              light1.setPresent();//sysj\controller.sysj line: 292, column: 4
              currsigs.addElement(light1);
              light1.setValue(lightLevel_thread_20);//sysj\controller.sysj line: 292, column: 4
              previous_thread_20 = lightLevel_thread_20;//sysj\controller.sysj line: 293, column: 4
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              if(previous_thread_20 == 2){//sysj\controller.sysj line: 272, column: 17
                startTimer1_16.setPresent();//sysj\controller.sysj line: 273, column: 7
                currsigs.addElement(startTimer1_16);
                lightLevel_thread_20 = 1;//sysj\controller.sysj line: 274, column: 7
                light1.setPresent();//sysj\controller.sysj line: 292, column: 4
                currsigs.addElement(light1);
                light1.setValue(lightLevel_thread_20);//sysj\controller.sysj line: 292, column: 4
                previous_thread_20 = lightLevel_thread_20;//sysj\controller.sysj line: 293, column: 4
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              else {
                if(startTimer1_16.getprestatus()){//sysj\controller.sysj line: 278, column: 15
                  lightLevel_thread_20 = 1;//sysj\controller.sysj line: 280, column: 8
                  light1.setPresent();//sysj\controller.sysj line: 292, column: 4
                  currsigs.addElement(light1);
                  light1.setValue(lightLevel_thread_20);//sysj\controller.sysj line: 292, column: 4
                  previous_thread_20 = lightLevel_thread_20;//sysj\controller.sysj line: 293, column: 4
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  lightLevel_thread_20 = 0;//sysj\controller.sysj line: 283, column: 8
                  light1.setPresent();//sysj\controller.sysj line: 292, column: 4
                  currsigs.addElement(light1);
                  light1.setValue(lightLevel_thread_20);//sysj\controller.sysj line: 292, column: 4
                  previous_thread_20 = lightLevel_thread_20;//sysj\controller.sysj line: 293, column: 4
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
              }
            }
          }
        }
        else {
          lightLevel_thread_20 = 0;//sysj\controller.sysj line: 289, column: 5
          light1.setPresent();//sysj\controller.sysj line: 292, column: 4
          currsigs.addElement(light1);
          light1.setValue(lightLevel_thread_20);//sysj\controller.sysj line: 292, column: 4
          previous_thread_20 = lightLevel_thread_20;//sysj\controller.sysj line: 293, column: 4
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread1272(int [] tdone, int [] ends){
        S480=1;
    S479=0;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread1271(int [] tdone, int [] ends){
        S417=1;
    previous_thread_20 = 0;//sysj\controller.sysj line: 258, column: 3
    lightLevel_thread_20 = 0;//sysj\controller.sysj line: 259, column: 3
    if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\controller.sysj line: 262, column: 12
      if(fire_16.getprestatus()){//sysj\controller.sysj line: 264, column: 13
        lightLevel_thread_20 = 2;//sysj\controller.sysj line: 265, column: 6
        light1.setPresent();//sysj\controller.sysj line: 292, column: 4
        currsigs.addElement(light1);
        light1.setValue(lightLevel_thread_20);//sysj\controller.sysj line: 292, column: 4
        previous_thread_20 = lightLevel_thread_20;//sysj\controller.sysj line: 293, column: 4
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
      else {
        if((occu1.getpreval() == null ? 0 : ((Integer)occu1.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 268, column: 10
          lightLevel_thread_20 = 2;//sysj\controller.sysj line: 269, column: 7
          light1.setPresent();//sysj\controller.sysj line: 292, column: 4
          currsigs.addElement(light1);
          light1.setValue(lightLevel_thread_20);//sysj\controller.sysj line: 292, column: 4
          previous_thread_20 = lightLevel_thread_20;//sysj\controller.sysj line: 293, column: 4
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        else {
          if(previous_thread_20 == 2){//sysj\controller.sysj line: 272, column: 17
            startTimer1_16.setPresent();//sysj\controller.sysj line: 273, column: 7
            currsigs.addElement(startTimer1_16);
            lightLevel_thread_20 = 1;//sysj\controller.sysj line: 274, column: 7
            light1.setPresent();//sysj\controller.sysj line: 292, column: 4
            currsigs.addElement(light1);
            light1.setValue(lightLevel_thread_20);//sysj\controller.sysj line: 292, column: 4
            previous_thread_20 = lightLevel_thread_20;//sysj\controller.sysj line: 293, column: 4
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
          else {
            if(startTimer1_16.getprestatus()){//sysj\controller.sysj line: 278, column: 15
              lightLevel_thread_20 = 1;//sysj\controller.sysj line: 280, column: 8
              light1.setPresent();//sysj\controller.sysj line: 292, column: 4
              currsigs.addElement(light1);
              light1.setValue(lightLevel_thread_20);//sysj\controller.sysj line: 292, column: 4
              previous_thread_20 = lightLevel_thread_20;//sysj\controller.sysj line: 293, column: 4
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              lightLevel_thread_20 = 0;//sysj\controller.sysj line: 283, column: 8
              light1.setPresent();//sysj\controller.sysj line: 292, column: 4
              currsigs.addElement(light1);
              light1.setValue(lightLevel_thread_20);//sysj\controller.sysj line: 292, column: 4
              previous_thread_20 = lightLevel_thread_20;//sysj\controller.sysj line: 293, column: 4
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
        }
      }
    }
    else {
      lightLevel_thread_20 = 0;//sysj\controller.sysj line: 289, column: 5
      light1.setPresent();//sysj\controller.sysj line: 292, column: 4
      currsigs.addElement(light1);
      light1.setValue(lightLevel_thread_20);//sysj\controller.sysj line: 292, column: 4
      previous_thread_20 = lightLevel_thread_20;//sysj\controller.sysj line: 293, column: 4
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread1269(int [] tdone, int [] ends){
        switch(S373){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\controller.sysj line: 247, column: 13
          light4.setPresent();//sysj\controller.sysj line: 248, column: 5
          currsigs.addElement(light4);
          light4.setValue(2);//sysj\controller.sysj line: 248, column: 5
          light5.setPresent();//sysj\controller.sysj line: 249, column: 5
          currsigs.addElement(light5);
          light5.setValue(2);//sysj\controller.sysj line: 249, column: 5
          light6.setPresent();//sysj\controller.sysj line: 250, column: 5
          currsigs.addElement(light6);
          light6.setValue(2);//sysj\controller.sysj line: 250, column: 5
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

  public void thread1268(int [] tdone, int [] ends){
        switch(S362){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S361){
          case 0 : 
            switch(S333){
              case 0 : 
                if(!fireHappening_in.isPartnerPresent() || fireHappening_in.isPartnerPreempted()){//sysj\controller.sysj line: 239, column: 3
                  fireHappening_in.setACK(false);//sysj\controller.sysj line: 239, column: 3
                  S333=1;
                  active[18]=1;
                  ends[18]=1;
                  tdone[18]=1;
                }
                else {
                  switch(S328){
                    case 0 : 
                      if(!fireHappening_in.isREQ()){//sysj\controller.sysj line: 239, column: 3
                        fireHappening_in.setACK(true);//sysj\controller.sysj line: 239, column: 3
                        S328=1;
                        if(fireHappening_in.isREQ()){//sysj\controller.sysj line: 239, column: 3
                          fireHappening_in.setACK(false);//sysj\controller.sysj line: 239, column: 3
                          ends[18]=2;
                          ;//sysj\controller.sysj line: 239, column: 3
                          S361=1;
                          fire_16.setPresent();//sysj\controller.sysj line: 240, column: 3
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
                      if(fireHappening_in.isREQ()){//sysj\controller.sysj line: 239, column: 3
                        fireHappening_in.setACK(false);//sysj\controller.sysj line: 239, column: 3
                        ends[18]=2;
                        ;//sysj\controller.sysj line: 239, column: 3
                        S361=1;
                        fire_16.setPresent();//sysj\controller.sysj line: 240, column: 3
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
                S333=1;
                S333=0;
                if(!fireHappening_in.isPartnerPresent() || fireHappening_in.isPartnerPreempted()){//sysj\controller.sysj line: 239, column: 3
                  fireHappening_in.setACK(false);//sysj\controller.sysj line: 239, column: 3
                  S333=1;
                  active[18]=1;
                  ends[18]=1;
                  tdone[18]=1;
                }
                else {
                  S328=0;
                  if(!fireHappening_in.isREQ()){//sysj\controller.sysj line: 239, column: 3
                    fireHappening_in.setACK(true);//sysj\controller.sysj line: 239, column: 3
                    S328=1;
                    if(fireHappening_in.isREQ()){//sysj\controller.sysj line: 239, column: 3
                      fireHappening_in.setACK(false);//sysj\controller.sysj line: 239, column: 3
                      ends[18]=2;
                      ;//sysj\controller.sysj line: 239, column: 3
                      S361=1;
                      fire_16.setPresent();//sysj\controller.sysj line: 240, column: 3
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
            fire_16.setPresent();//sysj\controller.sysj line: 240, column: 3
            currsigs.addElement(fire_16);
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
          case 2 : 
            S361=2;
            S362=0;
            active[18]=0;
            ends[18]=0;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1267(int [] tdone, int [] ends){
        switch(S326){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if((clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) >= 470 && (clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) <= 1090){//sysj\controller.sysj line: 229, column: 8
          workingHours_16.setPresent();//sysj\controller.sysj line: 230, column: 5
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

  public void thread1265(int [] tdone, int [] ends){
        S373=1;
    if(workingHours_16.getprestatus() || fire_16.getprestatus()){//sysj\controller.sysj line: 247, column: 13
      light4.setPresent();//sysj\controller.sysj line: 248, column: 5
      currsigs.addElement(light4);
      light4.setValue(2);//sysj\controller.sysj line: 248, column: 5
      light5.setPresent();//sysj\controller.sysj line: 249, column: 5
      currsigs.addElement(light5);
      light5.setValue(2);//sysj\controller.sysj line: 249, column: 5
      light6.setPresent();//sysj\controller.sysj line: 250, column: 5
      currsigs.addElement(light6);
      light6.setValue(2);//sysj\controller.sysj line: 250, column: 5
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

  public void thread1264(int [] tdone, int [] ends){
        S362=1;
    S361=0;
    S333=0;
    if(!fireHappening_in.isPartnerPresent() || fireHappening_in.isPartnerPreempted()){//sysj\controller.sysj line: 239, column: 3
      fireHappening_in.setACK(false);//sysj\controller.sysj line: 239, column: 3
      S333=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S328=0;
      if(!fireHappening_in.isREQ()){//sysj\controller.sysj line: 239, column: 3
        fireHappening_in.setACK(true);//sysj\controller.sysj line: 239, column: 3
        S328=1;
        if(fireHappening_in.isREQ()){//sysj\controller.sysj line: 239, column: 3
          fireHappening_in.setACK(false);//sysj\controller.sysj line: 239, column: 3
          ends[18]=2;
          ;//sysj\controller.sysj line: 239, column: 3
          S361=1;
          fire_16.setPresent();//sysj\controller.sysj line: 240, column: 3
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

  public void thread1263(int [] tdone, int [] ends){
        S326=1;
    if((clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) >= 470 && (clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) <= 1090){//sysj\controller.sysj line: 229, column: 8
      workingHours_16.setPresent();//sysj\controller.sysj line: 230, column: 5
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
      switch(S1231){
        case 0 : 
          S1231=0;
          break RUN;
        
        case 1 : 
          S1231=2;
          S1231=2;
          workingHours_16.setClear();//sysj\controller.sysj line: 218, column: 2
          fire_16.setClear();//sysj\controller.sysj line: 219, column: 2
          timer1_16.setClear();//sysj\controller.sysj line: 220, column: 2
          timer2_16.setClear();//sysj\controller.sysj line: 220, column: 2
          timer3_16.setClear();//sysj\controller.sysj line: 220, column: 2
          timer7_16.setClear();//sysj\controller.sysj line: 220, column: 2
          startTimer1_16.setClear();//sysj\controller.sysj line: 221, column: 2
          startTimer2_16.setClear();//sysj\controller.sysj line: 221, column: 2
          startTimer3_16.setClear();//sysj\controller.sysj line: 221, column: 2
          startTimer7_16.setClear();//sysj\controller.sysj line: 221, column: 2
          S588=0;
          thread1263(tdone,ends);
          thread1264(tdone,ends);
          thread1265(tdone,ends);
          int biggest1266 = 0;
          if(ends[17]>=biggest1266){
            biggest1266=ends[17];
          }
          if(ends[18]>=biggest1266){
            biggest1266=ends[18];
          }
          if(ends[19]>=biggest1266){
            biggest1266=ends[19];
          }
          if(biggest1266 == 1){
            active[16]=1;
            ends[16]=1;
            break RUN;
          }
        
        case 2 : 
          workingHours_16.setClear();//sysj\controller.sysj line: 218, column: 2
          fire_16.setClear();//sysj\controller.sysj line: 219, column: 2
          timer1_16.setClear();//sysj\controller.sysj line: 220, column: 2
          timer2_16.setClear();//sysj\controller.sysj line: 220, column: 2
          timer3_16.setClear();//sysj\controller.sysj line: 220, column: 2
          timer7_16.setClear();//sysj\controller.sysj line: 220, column: 2
          startTimer1_16.setClear();//sysj\controller.sysj line: 221, column: 2
          startTimer2_16.setClear();//sysj\controller.sysj line: 221, column: 2
          startTimer3_16.setClear();//sysj\controller.sysj line: 221, column: 2
          startTimer7_16.setClear();//sysj\controller.sysj line: 221, column: 2
          switch(S588){
            case 0 : 
              thread1267(tdone,ends);
              thread1268(tdone,ends);
              thread1269(tdone,ends);
              int biggest1270 = 0;
              if(ends[17]>=biggest1270){
                biggest1270=ends[17];
              }
              if(ends[18]>=biggest1270){
                biggest1270=ends[18];
              }
              if(ends[19]>=biggest1270){
                biggest1270=ends[19];
              }
              if(biggest1270 == 1){
                active[16]=1;
                ends[16]=1;
                break RUN;
              }
              //FINXME code
              if(biggest1270 == 0){
                S588=1;
                thread1271(tdone,ends);
                thread1272(tdone,ends);
                int biggest1273 = 0;
                if(ends[20]>=biggest1273){
                  biggest1273=ends[20];
                }
                if(ends[21]>=biggest1273){
                  biggest1273=ends[21];
                }
                if(biggest1273 == 1){
                  active[16]=1;
                  ends[16]=1;
                  break RUN;
                }
              }
            
            case 1 : 
              thread1274(tdone,ends);
              thread1275(tdone,ends);
              int biggest1284 = 0;
              if(ends[20]>=biggest1284){
                biggest1284=ends[20];
              }
              if(ends[21]>=biggest1284){
                biggest1284=ends[21];
              }
              if(biggest1284 == 1){
                active[16]=1;
                ends[16]=1;
                break RUN;
              }
              //FINXME code
              if(biggest1284 == 0){
                S588=2;
                thread1285(tdone,ends);
                thread1286(tdone,ends);
                int biggest1287 = 0;
                if(ends[25]>=biggest1287){
                  biggest1287=ends[25];
                }
                if(ends[26]>=biggest1287){
                  biggest1287=ends[26];
                }
                if(biggest1287 == 1){
                  active[16]=1;
                  ends[16]=1;
                  break RUN;
                }
              }
            
            case 2 : 
              thread1288(tdone,ends);
              thread1289(tdone,ends);
              int biggest1298 = 0;
              if(ends[25]>=biggest1298){
                biggest1298=ends[25];
              }
              if(ends[26]>=biggest1298){
                biggest1298=ends[26];
              }
              if(biggest1298 == 1){
                active[16]=1;
                ends[16]=1;
                break RUN;
              }
              //FINXME code
              if(biggest1298 == 0){
                S588=3;
                thread1299(tdone,ends);
                thread1300(tdone,ends);
                int biggest1301 = 0;
                if(ends[30]>=biggest1301){
                  biggest1301=ends[30];
                }
                if(ends[31]>=biggest1301){
                  biggest1301=ends[31];
                }
                if(biggest1301 == 1){
                  active[16]=1;
                  ends[16]=1;
                  break RUN;
                }
              }
            
            case 3 : 
              thread1302(tdone,ends);
              thread1303(tdone,ends);
              int biggest1312 = 0;
              if(ends[30]>=biggest1312){
                biggest1312=ends[30];
              }
              if(ends[31]>=biggest1312){
                biggest1312=ends[31];
              }
              if(biggest1312 == 1){
                active[16]=1;
                ends[16]=1;
                break RUN;
              }
              //FINXME code
              if(biggest1312 == 0){
                S588=4;
                thread1313(tdone,ends);
                thread1314(tdone,ends);
                int biggest1315 = 0;
                if(ends[35]>=biggest1315){
                  biggest1315=ends[35];
                }
                if(ends[36]>=biggest1315){
                  biggest1315=ends[36];
                }
                if(biggest1315 == 1){
                  active[16]=1;
                  ends[16]=1;
                  break RUN;
                }
              }
            
            case 4 : 
              thread1316(tdone,ends);
              thread1317(tdone,ends);
              int biggest1326 = 0;
              if(ends[35]>=biggest1326){
                biggest1326=ends[35];
              }
              if(ends[36]>=biggest1326){
                biggest1326=ends[36];
              }
              if(biggest1326 == 1){
                active[16]=1;
                ends[16]=1;
                break RUN;
              }
              //FINXME code
              if(biggest1326 == 0){
                S1231=0;
                active[16]=0;
                ends[16]=0;
                S1231=0;
                break RUN;
              }
            
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
    workingHours_16 = new Signal();
    fire_16 = new Signal();
    timer1_16 = new Signal();
    timer2_16 = new Signal();
    timer3_16 = new Signal();
    timer7_16 = new Signal();
    startTimer1_16 = new Signal();
    startTimer2_16 = new Signal();
    startTimer3_16 = new Signal();
    startTimer7_16 = new Signal();
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
          fireHappening_in.gethook();
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
      timer1_16.setpreclear();
      timer2_16.setpreclear();
      timer3_16.setpreclear();
      timer7_16.setpreclear();
      startTimer1_16.setpreclear();
      startTimer2_16.setpreclear();
      startTimer3_16.setpreclear();
      startTimer7_16.setpreclear();
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
      timer1_16.setClear();
      timer2_16.setClear();
      timer3_16.setClear();
      timer7_16.setClear();
      startTimer1_16.setClear();
      startTimer2_16.setClear();
      startTimer3_16.setClear();
      startTimer7_16.setClear();
      fireHappening_in.sethook();
      if(paused[16]!=0 || suspended[16]!=0 || active[16]!=1);
      else{
        fireHappening_in.gethook();
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

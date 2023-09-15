import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj/ecsplant.sysj line: 1, column: 1

public class ECSPlant extends ClockDomain{
  public ECSPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal heat17 = new Signal("heat17", Signal.INPUT);
  public Signal heat23 = new Signal("heat23", Signal.INPUT);
  public Signal heat456 = new Signal("heat456", Signal.INPUT);
  public Signal ac17 = new Signal("ac17", Signal.INPUT);
  public Signal ac23 = new Signal("ac23", Signal.INPUT);
  public Signal ac456 = new Signal("ac456", Signal.INPUT);
  public Signal fan17 = new Signal("fan17", Signal.INPUT);
  public Signal fan23 = new Signal("fan23", Signal.INPUT);
  public Signal fan456 = new Signal("fan456", Signal.INPUT);
  public Signal emergency = new Signal("emergency", Signal.INPUT);
  public Signal light1 = new Signal("light1", Signal.INPUT);
  public Signal light2 = new Signal("light2", Signal.INPUT);
  public Signal light3 = new Signal("light3", Signal.INPUT);
  public Signal light4 = new Signal("light4", Signal.INPUT);
  public Signal light5 = new Signal("light5", Signal.INPUT);
  public Signal light6 = new Signal("light6", Signal.INPUT);
  public Signal light7 = new Signal("light7", Signal.INPUT);
  public Signal temp = new Signal("temp", Signal.INPUT);
  public Signal humd = new Signal("humd", Signal.INPUT);
  public Signal occu = new Signal("occu", Signal.INPUT);
  public Signal smoke = new Signal("smoke", Signal.INPUT);
  public Signal working = new Signal("working", Signal.INPUT);
  public Signal temp17 = new Signal("temp17", Signal.OUTPUT);
  public Signal temp23 = new Signal("temp23", Signal.OUTPUT);
  public Signal temp456 = new Signal("temp456", Signal.OUTPUT);
  public Signal tempFire1 = new Signal("tempFire1", Signal.OUTPUT);
  public Signal humd17 = new Signal("humd17", Signal.OUTPUT);
  public Signal humd23 = new Signal("humd23", Signal.OUTPUT);
  public Signal humd456 = new Signal("humd456", Signal.OUTPUT);
  public Signal occu1 = new Signal("occu1", Signal.OUTPUT);
  public Signal occuLight1 = new Signal("occuLight1", Signal.OUTPUT);
  public Signal clock = new Signal("clock", Signal.OUTPUT);
  public Signal clockLight = new Signal("clockLight", Signal.OUTPUT);
  public Signal smoke1 = new Signal("smoke1", Signal.OUTPUT);
  public Signal smoke2 = new Signal("smoke2", Signal.OUTPUT);
  public Signal smoke3 = new Signal("smoke3", Signal.OUTPUT);
  public Signal smoke4 = new Signal("smoke4", Signal.OUTPUT);
  public Signal smoke5 = new Signal("smoke5", Signal.OUTPUT);
  public Signal smoke6 = new Signal("smoke6", Signal.OUTPUT);
  public Signal smoke7 = new Signal("smoke7", Signal.OUTPUT);
  public Signal lightHigh = new Signal("lightHigh", Signal.OUTPUT);
  public Signal lightLow = new Signal("lightLow", Signal.OUTPUT);
  public Signal lightNone = new Signal("lightNone", Signal.OUTPUT);
  public Signal fire = new Signal("fire", Signal.OUTPUT);
  public Signal fan = new Signal("fan", Signal.OUTPUT);
  public Signal ac = new Signal("ac", Signal.OUTPUT);
  public Signal heat = new Signal("heat", Signal.OUTPUT);
  private int S2099 = 1;
  private int S1855 = 1;
  private int S1863 = 1;
  private int S1871 = 1;
  private int S1879 = 1;
  private int S1887 = 1;
  private int S1919 = 1;
  private int S1933 = 1;
  private int S1947 = 1;
  private int S1955 = 1;
  private int S1969 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread2121(int [] tdone, int [] ends){
        switch(S1969){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(working.getprestatus()){//sysj/ecsplant.sysj line: 173, column: 13
          clock.setPresent();//sysj/ecsplant.sysj line: 174, column: 5
          currsigs.addElement(clock);
          clock.setValue(500);//sysj/ecsplant.sysj line: 174, column: 5
          clockLight.setPresent();//sysj/ecsplant.sysj line: 175, column: 5
          currsigs.addElement(clockLight);
          clockLight.setValue(500);//sysj/ecsplant.sysj line: 175, column: 5
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          clock.setPresent();//sysj/ecsplant.sysj line: 177, column: 5
          currsigs.addElement(clock);
          clock.setValue(0);//sysj/ecsplant.sysj line: 177, column: 5
          clockLight.setPresent();//sysj/ecsplant.sysj line: 178, column: 5
          currsigs.addElement(clockLight);
          clockLight.setValue(0);//sysj/ecsplant.sysj line: 178, column: 5
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread2120(int [] tdone, int [] ends){
        switch(S1955){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(smoke.getprestatus()){//sysj/ecsplant.sysj line: 163, column: 13
          smoke1.setPresent();//sysj/ecsplant.sysj line: 164, column: 5
          currsigs.addElement(smoke1);
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

  public void thread2119(int [] tdone, int [] ends){
        switch(S1947){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(occu.getprestatus()){//sysj/ecsplant.sysj line: 149, column: 13
          occu1.setPresent();//sysj/ecsplant.sysj line: 150, column: 5
          currsigs.addElement(occu1);
          occu1.setValue(2);//sysj/ecsplant.sysj line: 150, column: 5
          occuLight1.setPresent();//sysj/ecsplant.sysj line: 151, column: 5
          currsigs.addElement(occuLight1);
          occuLight1.setValue(2);//sysj/ecsplant.sysj line: 151, column: 5
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          occu1.setPresent();//sysj/ecsplant.sysj line: 153, column: 5
          currsigs.addElement(occu1);
          occu1.setValue(0);//sysj/ecsplant.sysj line: 153, column: 5
          occuLight1.setPresent();//sysj/ecsplant.sysj line: 154, column: 5
          currsigs.addElement(occuLight1);
          occuLight1.setValue(0);//sysj/ecsplant.sysj line: 154, column: 5
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread2118(int [] tdone, int [] ends){
        switch(S1933){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(humd.getprestatus()){//sysj/ecsplant.sysj line: 130, column: 13
          humd17.setPresent();//sysj/ecsplant.sysj line: 131, column: 5
          currsigs.addElement(humd17);
          humd17.setValue(0.0);//sysj/ecsplant.sysj line: 131, column: 5
          humd23.setPresent();//sysj/ecsplant.sysj line: 132, column: 5
          currsigs.addElement(humd23);
          humd23.setValue(0.0);//sysj/ecsplant.sysj line: 132, column: 5
          humd456.setPresent();//sysj/ecsplant.sysj line: 133, column: 5
          currsigs.addElement(humd456);
          humd456.setValue(0.0);//sysj/ecsplant.sysj line: 133, column: 5
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          humd17.setPresent();//sysj/ecsplant.sysj line: 138, column: 5
          currsigs.addElement(humd17);
          humd17.setValue(50.0);//sysj/ecsplant.sysj line: 138, column: 5
          humd23.setPresent();//sysj/ecsplant.sysj line: 139, column: 5
          currsigs.addElement(humd23);
          humd23.setValue(50.0);//sysj/ecsplant.sysj line: 139, column: 5
          humd456.setPresent();//sysj/ecsplant.sysj line: 140, column: 5
          currsigs.addElement(humd456);
          humd456.setValue(50.0);//sysj/ecsplant.sysj line: 140, column: 5
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread2117(int [] tdone, int [] ends){
        switch(S1919){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(temp.getprestatus()){//sysj/ecsplant.sysj line: 94, column: 12
          if((temp.getpreval() == null ? null : ((Integer)temp.getpreval())) == 0){//sysj/ecsplant.sysj line: 97, column: 5
            temp17.setPresent();//sysj/ecsplant.sysj line: 98, column: 6
            currsigs.addElement(temp17);
            temp17.setValue(0.0);//sysj/ecsplant.sysj line: 98, column: 6
            temp23.setPresent();//sysj/ecsplant.sysj line: 99, column: 6
            currsigs.addElement(temp23);
            temp23.setValue(0.0);//sysj/ecsplant.sysj line: 99, column: 6
            temp456.setPresent();//sysj/ecsplant.sysj line: 100, column: 6
            currsigs.addElement(temp456);
            temp456.setValue(0.0);//sysj/ecsplant.sysj line: 100, column: 6
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
          }
          else {
            if((temp.getpreval() == null ? null : ((Integer)temp.getpreval())) == 1){//sysj/ecsplant.sysj line: 102, column: 5
              temp17.setPresent();//sysj/ecsplant.sysj line: 103, column: 6
              currsigs.addElement(temp17);
              temp17.setValue(25.0);//sysj/ecsplant.sysj line: 103, column: 6
              temp23.setPresent();//sysj/ecsplant.sysj line: 104, column: 6
              currsigs.addElement(temp23);
              temp23.setValue(25.0);//sysj/ecsplant.sysj line: 104, column: 6
              temp456.setPresent();//sysj/ecsplant.sysj line: 105, column: 6
              currsigs.addElement(temp456);
              temp456.setValue(15.0);//sysj/ecsplant.sysj line: 105, column: 6
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              if((temp.getpreval() == null ? null : ((Integer)temp.getpreval())) == 2){//sysj/ecsplant.sysj line: 107, column: 5
                temp17.setPresent();//sysj/ecsplant.sysj line: 108, column: 6
                currsigs.addElement(temp17);
                temp17.setValue(30.0);//sysj/ecsplant.sysj line: 108, column: 6
                temp23.setPresent();//sysj/ecsplant.sysj line: 109, column: 6
                currsigs.addElement(temp23);
                temp23.setValue(30.0);//sysj/ecsplant.sysj line: 109, column: 6
                temp456.setPresent();//sysj/ecsplant.sysj line: 110, column: 6
                currsigs.addElement(temp456);
                temp456.setValue(30.0);//sysj/ecsplant.sysj line: 110, column: 6
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                if((temp.getpreval() == null ? null : ((Integer)temp.getpreval())) == 3){//sysj/ecsplant.sysj line: 112, column: 5
                  temp17.setPresent();//sysj/ecsplant.sysj line: 113, column: 6
                  currsigs.addElement(temp17);
                  temp17.setValue(100.0);//sysj/ecsplant.sysj line: 113, column: 6
                  temp23.setPresent();//sysj/ecsplant.sysj line: 114, column: 6
                  currsigs.addElement(temp23);
                  temp23.setValue(300.0);//sysj/ecsplant.sysj line: 114, column: 6
                  temp456.setPresent();//sysj/ecsplant.sysj line: 115, column: 6
                  currsigs.addElement(temp456);
                  temp456.setValue(300.0);//sysj/ecsplant.sysj line: 115, column: 6
                  tempFire1.setPresent();//sysj/ecsplant.sysj line: 116, column: 6
                  currsigs.addElement(tempFire1);
                  tempFire1.setValue(100.0);//sysj/ecsplant.sysj line: 116, column: 6
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
            }
          }
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread2116(int [] tdone, int [] ends){
        switch(S1887){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(heat17.getprestatus()){//sysj/ecsplant.sysj line: 84, column: 12
          heat.setPresent();//sysj/ecsplant.sysj line: 85, column: 5
          currsigs.addElement(heat);
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

  public void thread2115(int [] tdone, int [] ends){
        switch(S1879){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(ac17.getprestatus()){//sysj/ecsplant.sysj line: 75, column: 12
          ac.setPresent();//sysj/ecsplant.sysj line: 76, column: 5
          currsigs.addElement(ac);
          active[5]=1;
          ends[5]=1;
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

  public void thread2114(int [] tdone, int [] ends){
        switch(S1871){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(emergency.getprestatus()){//sysj/ecsplant.sysj line: 65, column: 12
          fire.setPresent();//sysj/ecsplant.sysj line: 66, column: 5
          currsigs.addElement(fire);
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

  public void thread2113(int [] tdone, int [] ends){
        switch(S1863){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(fan17.getprestatus()){//sysj/ecsplant.sysj line: 55, column: 12
          fan.setPresent();//sysj/ecsplant.sysj line: 56, column: 5
          currsigs.addElement(fan);
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

  public void thread2112(int [] tdone, int [] ends){
        switch(S1855){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(light1.getprestatus()){//sysj/ecsplant.sysj line: 39, column: 12
          if((light1.getpreval() == null ? 0 : ((Integer)light1.getpreval()).intValue()) == 0){//sysj/ecsplant.sysj line: 40, column: 9
            lightNone.setPresent();//sysj/ecsplant.sysj line: 41, column: 6
            currsigs.addElement(lightNone);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
          else {
            if((light1.getpreval() == null ? 0 : ((Integer)light1.getpreval()).intValue()) == 1){//sysj/ecsplant.sysj line: 42, column: 16
              lightLow.setPresent();//sysj/ecsplant.sysj line: 43, column: 6
              currsigs.addElement(lightLow);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              lightHigh.setPresent();//sysj/ecsplant.sysj line: 45, column: 6
              currsigs.addElement(lightHigh);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
          }
        }
        else {
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        break;
      
    }
  }

  public void thread2110(int [] tdone, int [] ends){
        S1969=1;
    if(working.getprestatus()){//sysj/ecsplant.sysj line: 173, column: 13
      clock.setPresent();//sysj/ecsplant.sysj line: 174, column: 5
      currsigs.addElement(clock);
      clock.setValue(500);//sysj/ecsplant.sysj line: 174, column: 5
      clockLight.setPresent();//sysj/ecsplant.sysj line: 175, column: 5
      currsigs.addElement(clockLight);
      clockLight.setValue(500);//sysj/ecsplant.sysj line: 175, column: 5
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      clock.setPresent();//sysj/ecsplant.sysj line: 177, column: 5
      currsigs.addElement(clock);
      clock.setValue(0);//sysj/ecsplant.sysj line: 177, column: 5
      clockLight.setPresent();//sysj/ecsplant.sysj line: 178, column: 5
      currsigs.addElement(clockLight);
      clockLight.setValue(0);//sysj/ecsplant.sysj line: 178, column: 5
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread2109(int [] tdone, int [] ends){
        S1955=1;
    if(smoke.getprestatus()){//sysj/ecsplant.sysj line: 163, column: 13
      smoke1.setPresent();//sysj/ecsplant.sysj line: 164, column: 5
      currsigs.addElement(smoke1);
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

  public void thread2108(int [] tdone, int [] ends){
        S1947=1;
    if(occu.getprestatus()){//sysj/ecsplant.sysj line: 149, column: 13
      occu1.setPresent();//sysj/ecsplant.sysj line: 150, column: 5
      currsigs.addElement(occu1);
      occu1.setValue(2);//sysj/ecsplant.sysj line: 150, column: 5
      occuLight1.setPresent();//sysj/ecsplant.sysj line: 151, column: 5
      currsigs.addElement(occuLight1);
      occuLight1.setValue(2);//sysj/ecsplant.sysj line: 151, column: 5
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      occu1.setPresent();//sysj/ecsplant.sysj line: 153, column: 5
      currsigs.addElement(occu1);
      occu1.setValue(0);//sysj/ecsplant.sysj line: 153, column: 5
      occuLight1.setPresent();//sysj/ecsplant.sysj line: 154, column: 5
      currsigs.addElement(occuLight1);
      occuLight1.setValue(0);//sysj/ecsplant.sysj line: 154, column: 5
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread2107(int [] tdone, int [] ends){
        S1933=1;
    if(humd.getprestatus()){//sysj/ecsplant.sysj line: 130, column: 13
      humd17.setPresent();//sysj/ecsplant.sysj line: 131, column: 5
      currsigs.addElement(humd17);
      humd17.setValue(0.0);//sysj/ecsplant.sysj line: 131, column: 5
      humd23.setPresent();//sysj/ecsplant.sysj line: 132, column: 5
      currsigs.addElement(humd23);
      humd23.setValue(0.0);//sysj/ecsplant.sysj line: 132, column: 5
      humd456.setPresent();//sysj/ecsplant.sysj line: 133, column: 5
      currsigs.addElement(humd456);
      humd456.setValue(0.0);//sysj/ecsplant.sysj line: 133, column: 5
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      humd17.setPresent();//sysj/ecsplant.sysj line: 138, column: 5
      currsigs.addElement(humd17);
      humd17.setValue(50.0);//sysj/ecsplant.sysj line: 138, column: 5
      humd23.setPresent();//sysj/ecsplant.sysj line: 139, column: 5
      currsigs.addElement(humd23);
      humd23.setValue(50.0);//sysj/ecsplant.sysj line: 139, column: 5
      humd456.setPresent();//sysj/ecsplant.sysj line: 140, column: 5
      currsigs.addElement(humd456);
      humd456.setValue(50.0);//sysj/ecsplant.sysj line: 140, column: 5
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread2106(int [] tdone, int [] ends){
        S1919=1;
    if(temp.getprestatus()){//sysj/ecsplant.sysj line: 94, column: 12
      if((temp.getpreval() == null ? null : ((Integer)temp.getpreval())) == 0){//sysj/ecsplant.sysj line: 97, column: 5
        temp17.setPresent();//sysj/ecsplant.sysj line: 98, column: 6
        currsigs.addElement(temp17);
        temp17.setValue(0.0);//sysj/ecsplant.sysj line: 98, column: 6
        temp23.setPresent();//sysj/ecsplant.sysj line: 99, column: 6
        currsigs.addElement(temp23);
        temp23.setValue(0.0);//sysj/ecsplant.sysj line: 99, column: 6
        temp456.setPresent();//sysj/ecsplant.sysj line: 100, column: 6
        currsigs.addElement(temp456);
        temp456.setValue(0.0);//sysj/ecsplant.sysj line: 100, column: 6
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
      else {
        if((temp.getpreval() == null ? null : ((Integer)temp.getpreval())) == 1){//sysj/ecsplant.sysj line: 102, column: 5
          temp17.setPresent();//sysj/ecsplant.sysj line: 103, column: 6
          currsigs.addElement(temp17);
          temp17.setValue(25.0);//sysj/ecsplant.sysj line: 103, column: 6
          temp23.setPresent();//sysj/ecsplant.sysj line: 104, column: 6
          currsigs.addElement(temp23);
          temp23.setValue(25.0);//sysj/ecsplant.sysj line: 104, column: 6
          temp456.setPresent();//sysj/ecsplant.sysj line: 105, column: 6
          currsigs.addElement(temp456);
          temp456.setValue(15.0);//sysj/ecsplant.sysj line: 105, column: 6
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          if((temp.getpreval() == null ? null : ((Integer)temp.getpreval())) == 2){//sysj/ecsplant.sysj line: 107, column: 5
            temp17.setPresent();//sysj/ecsplant.sysj line: 108, column: 6
            currsigs.addElement(temp17);
            temp17.setValue(30.0);//sysj/ecsplant.sysj line: 108, column: 6
            temp23.setPresent();//sysj/ecsplant.sysj line: 109, column: 6
            currsigs.addElement(temp23);
            temp23.setValue(30.0);//sysj/ecsplant.sysj line: 109, column: 6
            temp456.setPresent();//sysj/ecsplant.sysj line: 110, column: 6
            currsigs.addElement(temp456);
            temp456.setValue(30.0);//sysj/ecsplant.sysj line: 110, column: 6
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
          }
          else {
            if((temp.getpreval() == null ? null : ((Integer)temp.getpreval())) == 3){//sysj/ecsplant.sysj line: 112, column: 5
              temp17.setPresent();//sysj/ecsplant.sysj line: 113, column: 6
              currsigs.addElement(temp17);
              temp17.setValue(100.0);//sysj/ecsplant.sysj line: 113, column: 6
              temp23.setPresent();//sysj/ecsplant.sysj line: 114, column: 6
              currsigs.addElement(temp23);
              temp23.setValue(300.0);//sysj/ecsplant.sysj line: 114, column: 6
              temp456.setPresent();//sysj/ecsplant.sysj line: 115, column: 6
              currsigs.addElement(temp456);
              temp456.setValue(300.0);//sysj/ecsplant.sysj line: 115, column: 6
              tempFire1.setPresent();//sysj/ecsplant.sysj line: 116, column: 6
              currsigs.addElement(tempFire1);
              tempFire1.setValue(100.0);//sysj/ecsplant.sysj line: 116, column: 6
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
        }
      }
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread2105(int [] tdone, int [] ends){
        S1887=1;
    if(heat17.getprestatus()){//sysj/ecsplant.sysj line: 84, column: 12
      heat.setPresent();//sysj/ecsplant.sysj line: 85, column: 5
      currsigs.addElement(heat);
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

  public void thread2104(int [] tdone, int [] ends){
        S1879=1;
    if(ac17.getprestatus()){//sysj/ecsplant.sysj line: 75, column: 12
      ac.setPresent();//sysj/ecsplant.sysj line: 76, column: 5
      currsigs.addElement(ac);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread2103(int [] tdone, int [] ends){
        S1871=1;
    if(emergency.getprestatus()){//sysj/ecsplant.sysj line: 65, column: 12
      fire.setPresent();//sysj/ecsplant.sysj line: 66, column: 5
      currsigs.addElement(fire);
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

  public void thread2102(int [] tdone, int [] ends){
        S1863=1;
    if(fan17.getprestatus()){//sysj/ecsplant.sysj line: 55, column: 12
      fan.setPresent();//sysj/ecsplant.sysj line: 56, column: 5
      currsigs.addElement(fan);
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

  public void thread2101(int [] tdone, int [] ends){
        S1855=1;
    if(light1.getprestatus()){//sysj/ecsplant.sysj line: 39, column: 12
      if((light1.getpreval() == null ? 0 : ((Integer)light1.getpreval()).intValue()) == 0){//sysj/ecsplant.sysj line: 40, column: 9
        lightNone.setPresent();//sysj/ecsplant.sysj line: 41, column: 6
        currsigs.addElement(lightNone);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        if((light1.getpreval() == null ? 0 : ((Integer)light1.getpreval()).intValue()) == 1){//sysj/ecsplant.sysj line: 42, column: 16
          lightLow.setPresent();//sysj/ecsplant.sysj line: 43, column: 6
          currsigs.addElement(lightLow);
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        else {
          lightHigh.setPresent();//sysj/ecsplant.sysj line: 45, column: 6
          currsigs.addElement(lightHigh);
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
    }
    else {
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
      switch(S2099){
        case 0 : 
          S2099=0;
          break RUN;
        
        case 1 : 
          S2099=2;
          S2099=2;
          new Thread(new GUI()).start();//sysj/ecsplant.sysj line: 35, column: 2
          thread2101(tdone,ends);
          thread2102(tdone,ends);
          thread2103(tdone,ends);
          thread2104(tdone,ends);
          thread2105(tdone,ends);
          thread2106(tdone,ends);
          thread2107(tdone,ends);
          thread2108(tdone,ends);
          thread2109(tdone,ends);
          thread2110(tdone,ends);
          int biggest2111 = 0;
          if(ends[2]>=biggest2111){
            biggest2111=ends[2];
          }
          if(ends[3]>=biggest2111){
            biggest2111=ends[3];
          }
          if(ends[4]>=biggest2111){
            biggest2111=ends[4];
          }
          if(ends[5]>=biggest2111){
            biggest2111=ends[5];
          }
          if(ends[6]>=biggest2111){
            biggest2111=ends[6];
          }
          if(ends[7]>=biggest2111){
            biggest2111=ends[7];
          }
          if(ends[8]>=biggest2111){
            biggest2111=ends[8];
          }
          if(ends[9]>=biggest2111){
            biggest2111=ends[9];
          }
          if(ends[10]>=biggest2111){
            biggest2111=ends[10];
          }
          if(ends[11]>=biggest2111){
            biggest2111=ends[11];
          }
          if(biggest2111 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2112(tdone,ends);
          thread2113(tdone,ends);
          thread2114(tdone,ends);
          thread2115(tdone,ends);
          thread2116(tdone,ends);
          thread2117(tdone,ends);
          thread2118(tdone,ends);
          thread2119(tdone,ends);
          thread2120(tdone,ends);
          thread2121(tdone,ends);
          int biggest2122 = 0;
          if(ends[2]>=biggest2122){
            biggest2122=ends[2];
          }
          if(ends[3]>=biggest2122){
            biggest2122=ends[3];
          }
          if(ends[4]>=biggest2122){
            biggest2122=ends[4];
          }
          if(ends[5]>=biggest2122){
            biggest2122=ends[5];
          }
          if(ends[6]>=biggest2122){
            biggest2122=ends[6];
          }
          if(ends[7]>=biggest2122){
            biggest2122=ends[7];
          }
          if(ends[8]>=biggest2122){
            biggest2122=ends[8];
          }
          if(ends[9]>=biggest2122){
            biggest2122=ends[9];
          }
          if(ends[10]>=biggest2122){
            biggest2122=ends[10];
          }
          if(ends[11]>=biggest2122){
            biggest2122=ends[11];
          }
          if(biggest2122 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2122 == 0){
            S2099=0;
            active[1]=0;
            ends[1]=0;
            S2099=0;
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
          heat17.gethook();
          heat23.gethook();
          heat456.gethook();
          ac17.gethook();
          ac23.gethook();
          ac456.gethook();
          fan17.gethook();
          fan23.gethook();
          fan456.gethook();
          emergency.gethook();
          light1.gethook();
          light2.gethook();
          light3.gethook();
          light4.gethook();
          light5.gethook();
          light6.gethook();
          light7.gethook();
          temp.gethook();
          humd.gethook();
          occu.gethook();
          smoke.gethook();
          working.gethook();
          df = true;
        }
        runClockDomain();
      }
      heat17.setpreclear();
      heat23.setpreclear();
      heat456.setpreclear();
      ac17.setpreclear();
      ac23.setpreclear();
      ac456.setpreclear();
      fan17.setpreclear();
      fan23.setpreclear();
      fan456.setpreclear();
      emergency.setpreclear();
      light1.setpreclear();
      light2.setpreclear();
      light3.setpreclear();
      light4.setpreclear();
      light5.setpreclear();
      light6.setpreclear();
      light7.setpreclear();
      temp.setpreclear();
      humd.setpreclear();
      occu.setpreclear();
      smoke.setpreclear();
      working.setpreclear();
      temp17.setpreclear();
      temp23.setpreclear();
      temp456.setpreclear();
      tempFire1.setpreclear();
      humd17.setpreclear();
      humd23.setpreclear();
      humd456.setpreclear();
      occu1.setpreclear();
      occuLight1.setpreclear();
      clock.setpreclear();
      clockLight.setpreclear();
      smoke1.setpreclear();
      smoke2.setpreclear();
      smoke3.setpreclear();
      smoke4.setpreclear();
      smoke5.setpreclear();
      smoke6.setpreclear();
      smoke7.setpreclear();
      lightHigh.setpreclear();
      lightLow.setpreclear();
      lightNone.setpreclear();
      fire.setpreclear();
      fan.setpreclear();
      ac.setpreclear();
      heat.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = heat17.getStatus() ? heat17.setprepresent() : heat17.setpreclear();
      heat17.setpreval(heat17.getValue());
      heat17.setClear();
      dummyint = heat23.getStatus() ? heat23.setprepresent() : heat23.setpreclear();
      heat23.setpreval(heat23.getValue());
      heat23.setClear();
      dummyint = heat456.getStatus() ? heat456.setprepresent() : heat456.setpreclear();
      heat456.setpreval(heat456.getValue());
      heat456.setClear();
      dummyint = ac17.getStatus() ? ac17.setprepresent() : ac17.setpreclear();
      ac17.setpreval(ac17.getValue());
      ac17.setClear();
      dummyint = ac23.getStatus() ? ac23.setprepresent() : ac23.setpreclear();
      ac23.setpreval(ac23.getValue());
      ac23.setClear();
      dummyint = ac456.getStatus() ? ac456.setprepresent() : ac456.setpreclear();
      ac456.setpreval(ac456.getValue());
      ac456.setClear();
      dummyint = fan17.getStatus() ? fan17.setprepresent() : fan17.setpreclear();
      fan17.setpreval(fan17.getValue());
      fan17.setClear();
      dummyint = fan23.getStatus() ? fan23.setprepresent() : fan23.setpreclear();
      fan23.setpreval(fan23.getValue());
      fan23.setClear();
      dummyint = fan456.getStatus() ? fan456.setprepresent() : fan456.setpreclear();
      fan456.setpreval(fan456.getValue());
      fan456.setClear();
      dummyint = emergency.getStatus() ? emergency.setprepresent() : emergency.setpreclear();
      emergency.setpreval(emergency.getValue());
      emergency.setClear();
      dummyint = light1.getStatus() ? light1.setprepresent() : light1.setpreclear();
      light1.setpreval(light1.getValue());
      light1.setClear();
      dummyint = light2.getStatus() ? light2.setprepresent() : light2.setpreclear();
      light2.setpreval(light2.getValue());
      light2.setClear();
      dummyint = light3.getStatus() ? light3.setprepresent() : light3.setpreclear();
      light3.setpreval(light3.getValue());
      light3.setClear();
      dummyint = light4.getStatus() ? light4.setprepresent() : light4.setpreclear();
      light4.setpreval(light4.getValue());
      light4.setClear();
      dummyint = light5.getStatus() ? light5.setprepresent() : light5.setpreclear();
      light5.setpreval(light5.getValue());
      light5.setClear();
      dummyint = light6.getStatus() ? light6.setprepresent() : light6.setpreclear();
      light6.setpreval(light6.getValue());
      light6.setClear();
      dummyint = light7.getStatus() ? light7.setprepresent() : light7.setpreclear();
      light7.setpreval(light7.getValue());
      light7.setClear();
      dummyint = temp.getStatus() ? temp.setprepresent() : temp.setpreclear();
      temp.setpreval(temp.getValue());
      temp.setClear();
      dummyint = humd.getStatus() ? humd.setprepresent() : humd.setpreclear();
      humd.setpreval(humd.getValue());
      humd.setClear();
      dummyint = occu.getStatus() ? occu.setprepresent() : occu.setpreclear();
      occu.setpreval(occu.getValue());
      occu.setClear();
      dummyint = smoke.getStatus() ? smoke.setprepresent() : smoke.setpreclear();
      smoke.setpreval(smoke.getValue());
      smoke.setClear();
      dummyint = working.getStatus() ? working.setprepresent() : working.setpreclear();
      working.setpreval(working.getValue());
      working.setClear();
      temp17.sethook();
      temp17.setClear();
      temp23.sethook();
      temp23.setClear();
      temp456.sethook();
      temp456.setClear();
      tempFire1.sethook();
      tempFire1.setClear();
      humd17.sethook();
      humd17.setClear();
      humd23.sethook();
      humd23.setClear();
      humd456.sethook();
      humd456.setClear();
      occu1.sethook();
      occu1.setClear();
      occuLight1.sethook();
      occuLight1.setClear();
      clock.sethook();
      clock.setClear();
      clockLight.sethook();
      clockLight.setClear();
      smoke1.sethook();
      smoke1.setClear();
      smoke2.sethook();
      smoke2.setClear();
      smoke3.sethook();
      smoke3.setClear();
      smoke4.sethook();
      smoke4.setClear();
      smoke5.sethook();
      smoke5.setClear();
      smoke6.sethook();
      smoke6.setClear();
      smoke7.sethook();
      smoke7.setClear();
      lightHigh.sethook();
      lightHigh.setClear();
      lightLow.sethook();
      lightLow.setClear();
      lightNone.sethook();
      lightNone.setClear();
      fire.sethook();
      fire.setClear();
      fan.sethook();
      fan.setClear();
      ac.sethook();
      ac.setClear();
      heat.sethook();
      heat.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        heat17.gethook();
        heat23.gethook();
        heat456.gethook();
        ac17.gethook();
        ac23.gethook();
        ac456.gethook();
        fan17.gethook();
        fan23.gethook();
        fan456.gethook();
        emergency.gethook();
        light1.gethook();
        light2.gethook();
        light3.gethook();
        light4.gethook();
        light5.gethook();
        light6.gethook();
        light7.gethook();
        temp.gethook();
        humd.gethook();
        occu.gethook();
        smoke.gethook();
        working.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

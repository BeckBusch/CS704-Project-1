import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class TempCD extends ClockDomain{
  public TempCD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal temp17 = new Signal("temp17", Signal.INPUT);
  public Signal temp23 = new Signal("temp23", Signal.INPUT);
  public Signal temp456 = new Signal("temp456", Signal.INPUT);
  public Signal humd17 = new Signal("humd17", Signal.INPUT);
  public Signal humd23 = new Signal("humd23", Signal.INPUT);
  public Signal humd456 = new Signal("humd456", Signal.INPUT);
  public Signal occu1 = new Signal("occu1", Signal.INPUT);
  public Signal occu2 = new Signal("occu2", Signal.INPUT);
  public Signal occu3 = new Signal("occu3", Signal.INPUT);
  public Signal occu4 = new Signal("occu4", Signal.INPUT);
  public Signal occu5 = new Signal("occu5", Signal.INPUT);
  public Signal occu6 = new Signal("occu6", Signal.INPUT);
  public Signal occu7 = new Signal("occu7", Signal.INPUT);
  public Signal clock = new Signal("clock", Signal.INPUT);
  public Signal heat17 = new Signal("heat17", Signal.OUTPUT);
  public Signal heat23 = new Signal("heat23", Signal.OUTPUT);
  public Signal heat456 = new Signal("heat456", Signal.OUTPUT);
  public Signal ac17 = new Signal("ac17", Signal.OUTPUT);
  public Signal ac23 = new Signal("ac23", Signal.OUTPUT);
  public Signal ac456 = new Signal("ac456", Signal.OUTPUT);
  public Signal fan17 = new Signal("fan17", Signal.OUTPUT);
  public Signal fan23 = new Signal("fan23", Signal.OUTPUT);
  public Signal fan456 = new Signal("fan456", Signal.OUTPUT);
  public input_Channel fireHappening_in = new input_Channel();
  private Signal workingHours_1;
  private Signal occu17_1;
  private Signal occu23_1;
  private Signal occu456_1;
  private Signal fire_1;
  private double officeTemp_thread_4;//sysj\controller.sysj line: 42, column: 3
  private double temperatureTolerance_thread_4;//sysj\controller.sysj line: 43, column: 3
  private double officeHumidity_thread_5;//sysj\controller.sysj line: 62, column: 3
  private double humidityTolerance_thread_5;//sysj\controller.sysj line: 63, column: 3
  private double officeTemp_thread_7;//sysj\controller.sysj line: 89, column: 3
  private double temperatureTolerance_thread_7;//sysj\controller.sysj line: 90, column: 3
  private double officeHumidity_thread_8;//sysj\controller.sysj line: 109, column: 3
  private double humidityTolerance_thread_8;//sysj\controller.sysj line: 110, column: 3
  private double manufacturingTemp_thread_9;//sysj\controller.sysj line: 125, column: 3
  private double temperatureTolerance_thread_9;//sysj\controller.sysj line: 126, column: 3
  private double factoryHumidity_thread_10;//sysj\controller.sysj line: 145, column: 3
  private double humidityTolerance_thread_10;//sysj\controller.sysj line: 146, column: 3
  private int S258 = 1;
  private int S12 = 1;
  private int S6 = 1;
  private int S20 = 1;
  private int S64 = 1;
  private int S84 = 1;
  private int S92 = 1;
  private int S136 = 1;
  private int S156 = 1;
  private int S200 = 1;
  private int S220 = 1;
  private int S256 = 1;
  private int S255 = 1;
  private int S227 = 1;
  private int S222 = 1;
  
  private int[] ends = new int[40];
  private int[] tdone = new int[40];
  
  public void thread1253(int [] tdone, int [] ends){
        switch(S256){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S255){
          case 0 : 
            switch(S227){
              case 0 : 
                if(!fireHappening_in.isPartnerPresent() || fireHappening_in.isPartnerPreempted()){//sysj\controller.sysj line: 161, column: 3
                  fireHappening_in.setACK(false);//sysj\controller.sysj line: 161, column: 3
                  S227=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S222){
                    case 0 : 
                      if(!fireHappening_in.isREQ()){//sysj\controller.sysj line: 161, column: 3
                        fireHappening_in.setACK(true);//sysj\controller.sysj line: 161, column: 3
                        S222=1;
                        if(fireHappening_in.isREQ()){//sysj\controller.sysj line: 161, column: 3
                          fireHappening_in.setACK(false);//sysj\controller.sysj line: 161, column: 3
                          ends[11]=2;
                          ;//sysj\controller.sysj line: 161, column: 3
                          S255=1;
                          fire_1.setPresent();//sysj\controller.sysj line: 162, column: 3
                          currsigs.addElement(fire_1);
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
                      if(fireHappening_in.isREQ()){//sysj\controller.sysj line: 161, column: 3
                        fireHappening_in.setACK(false);//sysj\controller.sysj line: 161, column: 3
                        ends[11]=2;
                        ;//sysj\controller.sysj line: 161, column: 3
                        S255=1;
                        fire_1.setPresent();//sysj\controller.sysj line: 162, column: 3
                        currsigs.addElement(fire_1);
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
                S227=1;
                S227=0;
                if(!fireHappening_in.isPartnerPresent() || fireHappening_in.isPartnerPreempted()){//sysj\controller.sysj line: 161, column: 3
                  fireHappening_in.setACK(false);//sysj\controller.sysj line: 161, column: 3
                  S227=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S222=0;
                  if(!fireHappening_in.isREQ()){//sysj\controller.sysj line: 161, column: 3
                    fireHappening_in.setACK(true);//sysj\controller.sysj line: 161, column: 3
                    S222=1;
                    if(fireHappening_in.isREQ()){//sysj\controller.sysj line: 161, column: 3
                      fireHappening_in.setACK(false);//sysj\controller.sysj line: 161, column: 3
                      ends[11]=2;
                      ;//sysj\controller.sysj line: 161, column: 3
                      S255=1;
                      fire_1.setPresent();//sysj\controller.sysj line: 162, column: 3
                      currsigs.addElement(fire_1);
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
            fire_1.setPresent();//sysj\controller.sysj line: 162, column: 3
            currsigs.addElement(fire_1);
            active[11]=1;
            ends[11]=1;
            tdone[11]=1;
            break;
          
          case 2 : 
            S255=2;
            S256=0;
            active[11]=0;
            ends[11]=0;
            tdone[11]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1252(int [] tdone, int [] ends){
        switch(S220){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(humd456.getprestatus() && workingHours_1.getprestatus() && !fire_1.getprestatus()){//sysj\controller.sysj line: 148, column: 12
          if((humd456.getpreval() == null ? 0.0d : ((Double)humd456.getpreval()).doubleValue()) > factoryHumidity_thread_10 + humidityTolerance_thread_10 || (humd456.getpreval() == null ? 0.0d : ((Double)humd456.getpreval()).doubleValue()) < factoryHumidity_thread_10 - humidityTolerance_thread_10){//sysj\controller.sysj line: 150, column: 9
            ac456.setPresent();//sysj\controller.sysj line: 151, column: 6
            currsigs.addElement(ac456);
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
      
    }
  }

  public void thread1251(int [] tdone, int [] ends){
        switch(S200){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(temp456.getprestatus() && workingHours_1.getprestatus() && !fire_1.getprestatus()){//sysj\controller.sysj line: 128, column: 12
          if((temp456.getpreval() == null ? 0.0d : ((Double)temp456.getpreval()).doubleValue()) > manufacturingTemp_thread_9 + temperatureTolerance_thread_9){//sysj\controller.sysj line: 130, column: 9
            heat456.setPresent();//sysj\controller.sysj line: 131, column: 6
            currsigs.addElement(heat456);
            if((temp456.getpreval() == null ? 0.0d : ((Double)temp456.getpreval()).doubleValue()) < manufacturingTemp_thread_9 - temperatureTolerance_thread_9){//sysj\controller.sysj line: 134, column: 9
              fan456.setPresent();//sysj\controller.sysj line: 135, column: 6
              currsigs.addElement(fan456);
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
          else {
            if((temp456.getpreval() == null ? 0.0d : ((Double)temp456.getpreval()).doubleValue()) < manufacturingTemp_thread_9 - temperatureTolerance_thread_9){//sysj\controller.sysj line: 134, column: 9
              fan456.setPresent();//sysj\controller.sysj line: 135, column: 6
              currsigs.addElement(fan456);
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
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread1250(int [] tdone, int [] ends){
        switch(S156){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(humd23.getprestatus() && workingHours_1.getprestatus() && occu23_1.getprestatus() && !fire_1.getprestatus()){//sysj\controller.sysj line: 112, column: 12
          if((humd23.getpreval() == null ? 0.0d : ((Double)humd23.getpreval()).doubleValue()) > officeHumidity_thread_8 + humidityTolerance_thread_8 || (humd23.getpreval() == null ? 0.0d : ((Double)humd23.getpreval()).doubleValue()) < officeHumidity_thread_8 - humidityTolerance_thread_8){//sysj\controller.sysj line: 114, column: 9
            ac23.setPresent();//sysj\controller.sysj line: 115, column: 6
            currsigs.addElement(ac23);
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
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread1249(int [] tdone, int [] ends){
        switch(S136){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(temp23.getprestatus() && workingHours_1.getprestatus() && occu23_1.getprestatus() && !fire_1.getprestatus()){//sysj\controller.sysj line: 92, column: 12
          if((temp23.getpreval() == null ? 0.0d : ((Double)temp23.getpreval()).doubleValue()) > officeTemp_thread_7 + temperatureTolerance_thread_7){//sysj\controller.sysj line: 94, column: 9
            heat23.setPresent();//sysj\controller.sysj line: 95, column: 6
            currsigs.addElement(heat23);
            if((temp23.getpreval() == null ? 0.0d : ((Double)temp23.getpreval()).doubleValue()) < officeTemp_thread_7 - temperatureTolerance_thread_7){//sysj\controller.sysj line: 98, column: 9
              fan23.setPresent();//sysj\controller.sysj line: 99, column: 6
              currsigs.addElement(fan23);
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
          else {
            if((temp23.getpreval() == null ? 0.0d : ((Double)temp23.getpreval()).doubleValue()) < officeTemp_thread_7 - temperatureTolerance_thread_7){//sysj\controller.sysj line: 98, column: 9
              fan23.setPresent();//sysj\controller.sysj line: 99, column: 6
              currsigs.addElement(fan23);
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
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread1248(int [] tdone, int [] ends){
        switch(S92){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if((occu2.getpreval() == null ? 0 : ((Integer)occu2.getpreval()).intValue()) + (occu3.getpreval() == null ? 0 : ((Integer)occu3.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 79, column: 8
          occu23_1.setPresent();//sysj\controller.sysj line: 80, column: 5
          currsigs.addElement(occu23_1);
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

  public void thread1247(int [] tdone, int [] ends){
        switch(S84){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(humd17.getprestatus() && workingHours_1.getprestatus() && occu17_1.getprestatus() && !fire_1.getprestatus()){//sysj\controller.sysj line: 65, column: 12
          if((humd17.getpreval() == null ? 0.0d : ((Double)humd17.getpreval()).doubleValue()) > officeHumidity_thread_5 + humidityTolerance_thread_5 || (humd17.getpreval() == null ? 0.0d : ((Double)humd17.getpreval()).doubleValue()) < officeHumidity_thread_5 - humidityTolerance_thread_5){//sysj\controller.sysj line: 67, column: 9
            ac17.setPresent();//sysj\controller.sysj line: 68, column: 6
            currsigs.addElement(ac17);
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
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread1246(int [] tdone, int [] ends){
        switch(S64){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(temp17.getprestatus() && workingHours_1.getprestatus() && occu17_1.getprestatus() && !fire_1.getprestatus()){//sysj\controller.sysj line: 45, column: 12
          if((temp17.getpreval() == null ? 0.0d : ((Double)temp17.getpreval()).doubleValue()) > officeTemp_thread_4 + temperatureTolerance_thread_4){//sysj\controller.sysj line: 47, column: 9
            heat17.setPresent();//sysj\controller.sysj line: 48, column: 6
            currsigs.addElement(heat17);
            if((temp17.getpreval() == null ? 0.0d : ((Double)temp17.getpreval()).doubleValue()) < officeTemp_thread_4 - temperatureTolerance_thread_4){//sysj\controller.sysj line: 51, column: 9
              fan17.setPresent();//sysj\controller.sysj line: 52, column: 6
              currsigs.addElement(fan17);
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
            if((temp17.getpreval() == null ? 0.0d : ((Double)temp17.getpreval()).doubleValue()) < officeTemp_thread_4 - temperatureTolerance_thread_4){//sysj\controller.sysj line: 51, column: 9
              fan17.setPresent();//sysj\controller.sysj line: 52, column: 6
              currsigs.addElement(fan17);
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
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread1245(int [] tdone, int [] ends){
        switch(S20){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if((occu1.getpreval() == null ? 0 : ((Integer)occu1.getpreval()).intValue()) + (occu7.getpreval() == null ? 0 : ((Integer)occu7.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 32, column: 8
          occu17_1.setPresent();//sysj\controller.sysj line: 33, column: 5
          currsigs.addElement(occu17_1);
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

  public void thread1244(int [] tdone, int [] ends){
        switch(S12){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S6){
          case 0 : 
            S6=0;
            if((clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) >= 480 && (clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) <= 1080){//sysj\controller.sysj line: 21, column: 8
              workingHours_1.setPresent();//sysj\controller.sysj line: 22, column: 5
              currsigs.addElement(workingHours_1);
              S6=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S6=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S6=1;
            S6=0;
            if((clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) >= 480 && (clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) <= 1080){//sysj\controller.sysj line: 21, column: 8
              workingHours_1.setPresent();//sysj\controller.sysj line: 22, column: 5
              currsigs.addElement(workingHours_1);
              S6=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S6=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1242(int [] tdone, int [] ends){
        S256=1;
    S255=0;
    S227=0;
    if(!fireHappening_in.isPartnerPresent() || fireHappening_in.isPartnerPreempted()){//sysj\controller.sysj line: 161, column: 3
      fireHappening_in.setACK(false);//sysj\controller.sysj line: 161, column: 3
      S227=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S222=0;
      if(!fireHappening_in.isREQ()){//sysj\controller.sysj line: 161, column: 3
        fireHappening_in.setACK(true);//sysj\controller.sysj line: 161, column: 3
        S222=1;
        if(fireHappening_in.isREQ()){//sysj\controller.sysj line: 161, column: 3
          fireHappening_in.setACK(false);//sysj\controller.sysj line: 161, column: 3
          ends[11]=2;
          ;//sysj\controller.sysj line: 161, column: 3
          S255=1;
          fire_1.setPresent();//sysj\controller.sysj line: 162, column: 3
          currsigs.addElement(fire_1);
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

  public void thread1241(int [] tdone, int [] ends){
        S220=1;
    factoryHumidity_thread_10 = 55.0;//sysj\controller.sysj line: 145, column: 3
    humidityTolerance_thread_10 = 5.0;//sysj\controller.sysj line: 146, column: 3
    if(humd456.getprestatus() && workingHours_1.getprestatus() && !fire_1.getprestatus()){//sysj\controller.sysj line: 148, column: 12
      if((humd456.getpreval() == null ? 0.0d : ((Double)humd456.getpreval()).doubleValue()) > factoryHumidity_thread_10 + humidityTolerance_thread_10 || (humd456.getpreval() == null ? 0.0d : ((Double)humd456.getpreval()).doubleValue()) < factoryHumidity_thread_10 - humidityTolerance_thread_10){//sysj\controller.sysj line: 150, column: 9
        ac456.setPresent();//sysj\controller.sysj line: 151, column: 6
        currsigs.addElement(ac456);
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

  public void thread1240(int [] tdone, int [] ends){
        S200=1;
    manufacturingTemp_thread_9 = 15.0;//sysj\controller.sysj line: 125, column: 3
    temperatureTolerance_thread_9 = 0.1;//sysj\controller.sysj line: 126, column: 3
    if(temp456.getprestatus() && workingHours_1.getprestatus() && !fire_1.getprestatus()){//sysj\controller.sysj line: 128, column: 12
      if((temp456.getpreval() == null ? 0.0d : ((Double)temp456.getpreval()).doubleValue()) > manufacturingTemp_thread_9 + temperatureTolerance_thread_9){//sysj\controller.sysj line: 130, column: 9
        heat456.setPresent();//sysj\controller.sysj line: 131, column: 6
        currsigs.addElement(heat456);
        if((temp456.getpreval() == null ? 0.0d : ((Double)temp456.getpreval()).doubleValue()) < manufacturingTemp_thread_9 - temperatureTolerance_thread_9){//sysj\controller.sysj line: 134, column: 9
          fan456.setPresent();//sysj\controller.sysj line: 135, column: 6
          currsigs.addElement(fan456);
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
      else {
        if((temp456.getpreval() == null ? 0.0d : ((Double)temp456.getpreval()).doubleValue()) < manufacturingTemp_thread_9 - temperatureTolerance_thread_9){//sysj\controller.sysj line: 134, column: 9
          fan456.setPresent();//sysj\controller.sysj line: 135, column: 6
          currsigs.addElement(fan456);
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
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread1239(int [] tdone, int [] ends){
        S156=1;
    officeHumidity_thread_8 = 50.0;//sysj\controller.sysj line: 109, column: 3
    humidityTolerance_thread_8 = 10.0;//sysj\controller.sysj line: 110, column: 3
    if(humd23.getprestatus() && workingHours_1.getprestatus() && occu23_1.getprestatus() && !fire_1.getprestatus()){//sysj\controller.sysj line: 112, column: 12
      if((humd23.getpreval() == null ? 0.0d : ((Double)humd23.getpreval()).doubleValue()) > officeHumidity_thread_8 + humidityTolerance_thread_8 || (humd23.getpreval() == null ? 0.0d : ((Double)humd23.getpreval()).doubleValue()) < officeHumidity_thread_8 - humidityTolerance_thread_8){//sysj\controller.sysj line: 114, column: 9
        ac23.setPresent();//sysj\controller.sysj line: 115, column: 6
        currsigs.addElement(ac23);
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
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1238(int [] tdone, int [] ends){
        S136=1;
    officeTemp_thread_7 = 25.0;//sysj\controller.sysj line: 89, column: 3
    temperatureTolerance_thread_7 = 1.0;//sysj\controller.sysj line: 90, column: 3
    if(temp23.getprestatus() && workingHours_1.getprestatus() && occu23_1.getprestatus() && !fire_1.getprestatus()){//sysj\controller.sysj line: 92, column: 12
      if((temp23.getpreval() == null ? 0.0d : ((Double)temp23.getpreval()).doubleValue()) > officeTemp_thread_7 + temperatureTolerance_thread_7){//sysj\controller.sysj line: 94, column: 9
        heat23.setPresent();//sysj\controller.sysj line: 95, column: 6
        currsigs.addElement(heat23);
        if((temp23.getpreval() == null ? 0.0d : ((Double)temp23.getpreval()).doubleValue()) < officeTemp_thread_7 - temperatureTolerance_thread_7){//sysj\controller.sysj line: 98, column: 9
          fan23.setPresent();//sysj\controller.sysj line: 99, column: 6
          currsigs.addElement(fan23);
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
      else {
        if((temp23.getpreval() == null ? 0.0d : ((Double)temp23.getpreval()).doubleValue()) < officeTemp_thread_7 - temperatureTolerance_thread_7){//sysj\controller.sysj line: 98, column: 9
          fan23.setPresent();//sysj\controller.sysj line: 99, column: 6
          currsigs.addElement(fan23);
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
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1237(int [] tdone, int [] ends){
        S92=1;
    if((occu2.getpreval() == null ? 0 : ((Integer)occu2.getpreval()).intValue()) + (occu3.getpreval() == null ? 0 : ((Integer)occu3.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 79, column: 8
      occu23_1.setPresent();//sysj\controller.sysj line: 80, column: 5
      currsigs.addElement(occu23_1);
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

  public void thread1236(int [] tdone, int [] ends){
        S84=1;
    officeHumidity_thread_5 = 50.0;//sysj\controller.sysj line: 62, column: 3
    humidityTolerance_thread_5 = 10.0;//sysj\controller.sysj line: 63, column: 3
    if(humd17.getprestatus() && workingHours_1.getprestatus() && occu17_1.getprestatus() && !fire_1.getprestatus()){//sysj\controller.sysj line: 65, column: 12
      if((humd17.getpreval() == null ? 0.0d : ((Double)humd17.getpreval()).doubleValue()) > officeHumidity_thread_5 + humidityTolerance_thread_5 || (humd17.getpreval() == null ? 0.0d : ((Double)humd17.getpreval()).doubleValue()) < officeHumidity_thread_5 - humidityTolerance_thread_5){//sysj\controller.sysj line: 67, column: 9
        ac17.setPresent();//sysj\controller.sysj line: 68, column: 6
        currsigs.addElement(ac17);
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
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1235(int [] tdone, int [] ends){
        S64=1;
    officeTemp_thread_4 = 25.0;//sysj\controller.sysj line: 42, column: 3
    temperatureTolerance_thread_4 = 1.0;//sysj\controller.sysj line: 43, column: 3
    if(temp17.getprestatus() && workingHours_1.getprestatus() && occu17_1.getprestatus() && !fire_1.getprestatus()){//sysj\controller.sysj line: 45, column: 12
      if((temp17.getpreval() == null ? 0.0d : ((Double)temp17.getpreval()).doubleValue()) > officeTemp_thread_4 + temperatureTolerance_thread_4){//sysj\controller.sysj line: 47, column: 9
        heat17.setPresent();//sysj\controller.sysj line: 48, column: 6
        currsigs.addElement(heat17);
        if((temp17.getpreval() == null ? 0.0d : ((Double)temp17.getpreval()).doubleValue()) < officeTemp_thread_4 - temperatureTolerance_thread_4){//sysj\controller.sysj line: 51, column: 9
          fan17.setPresent();//sysj\controller.sysj line: 52, column: 6
          currsigs.addElement(fan17);
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
        if((temp17.getpreval() == null ? 0.0d : ((Double)temp17.getpreval()).doubleValue()) < officeTemp_thread_4 - temperatureTolerance_thread_4){//sysj\controller.sysj line: 51, column: 9
          fan17.setPresent();//sysj\controller.sysj line: 52, column: 6
          currsigs.addElement(fan17);
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
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1234(int [] tdone, int [] ends){
        S20=1;
    if((occu1.getpreval() == null ? 0 : ((Integer)occu1.getpreval()).intValue()) + (occu7.getpreval() == null ? 0 : ((Integer)occu7.getpreval()).intValue()) > 0){//sysj\controller.sysj line: 32, column: 8
      occu17_1.setPresent();//sysj\controller.sysj line: 33, column: 5
      currsigs.addElement(occu17_1);
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

  public void thread1233(int [] tdone, int [] ends){
        S12=1;
    S6=0;
    if((clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) >= 480 && (clock.getpreval() == null ? 0 : ((Integer)clock.getpreval()).intValue()) <= 1080){//sysj\controller.sysj line: 21, column: 8
      workingHours_1.setPresent();//sysj\controller.sysj line: 22, column: 5
      currsigs.addElement(workingHours_1);
      S6=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S6=1;
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
      switch(S258){
        case 0 : 
          S258=0;
          break RUN;
        
        case 1 : 
          S258=2;
          S258=2;
          workingHours_1.setClear();//sysj\controller.sysj line: 13, column: 2
          occu17_1.setClear();//sysj\controller.sysj line: 14, column: 2
          occu23_1.setClear();//sysj\controller.sysj line: 14, column: 2
          occu456_1.setClear();//sysj\controller.sysj line: 14, column: 2
          fire_1.setClear();//sysj\controller.sysj line: 15, column: 2
          thread1233(tdone,ends);
          thread1234(tdone,ends);
          thread1235(tdone,ends);
          thread1236(tdone,ends);
          thread1237(tdone,ends);
          thread1238(tdone,ends);
          thread1239(tdone,ends);
          thread1240(tdone,ends);
          thread1241(tdone,ends);
          thread1242(tdone,ends);
          int biggest1243 = 0;
          if(ends[2]>=biggest1243){
            biggest1243=ends[2];
          }
          if(ends[3]>=biggest1243){
            biggest1243=ends[3];
          }
          if(ends[4]>=biggest1243){
            biggest1243=ends[4];
          }
          if(ends[5]>=biggest1243){
            biggest1243=ends[5];
          }
          if(ends[6]>=biggest1243){
            biggest1243=ends[6];
          }
          if(ends[7]>=biggest1243){
            biggest1243=ends[7];
          }
          if(ends[8]>=biggest1243){
            biggest1243=ends[8];
          }
          if(ends[9]>=biggest1243){
            biggest1243=ends[9];
          }
          if(ends[10]>=biggest1243){
            biggest1243=ends[10];
          }
          if(ends[11]>=biggest1243){
            biggest1243=ends[11];
          }
          if(biggest1243 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          workingHours_1.setClear();//sysj\controller.sysj line: 13, column: 2
          occu17_1.setClear();//sysj\controller.sysj line: 14, column: 2
          occu23_1.setClear();//sysj\controller.sysj line: 14, column: 2
          occu456_1.setClear();//sysj\controller.sysj line: 14, column: 2
          fire_1.setClear();//sysj\controller.sysj line: 15, column: 2
          thread1244(tdone,ends);
          thread1245(tdone,ends);
          thread1246(tdone,ends);
          thread1247(tdone,ends);
          thread1248(tdone,ends);
          thread1249(tdone,ends);
          thread1250(tdone,ends);
          thread1251(tdone,ends);
          thread1252(tdone,ends);
          thread1253(tdone,ends);
          int biggest1254 = 0;
          if(ends[2]>=biggest1254){
            biggest1254=ends[2];
          }
          if(ends[3]>=biggest1254){
            biggest1254=ends[3];
          }
          if(ends[4]>=biggest1254){
            biggest1254=ends[4];
          }
          if(ends[5]>=biggest1254){
            biggest1254=ends[5];
          }
          if(ends[6]>=biggest1254){
            biggest1254=ends[6];
          }
          if(ends[7]>=biggest1254){
            biggest1254=ends[7];
          }
          if(ends[8]>=biggest1254){
            biggest1254=ends[8];
          }
          if(ends[9]>=biggest1254){
            biggest1254=ends[9];
          }
          if(ends[10]>=biggest1254){
            biggest1254=ends[10];
          }
          if(ends[11]>=biggest1254){
            biggest1254=ends[11];
          }
          if(biggest1254 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1254 == 0){
            S258=0;
            active[1]=0;
            ends[1]=0;
            S258=0;
            break RUN;
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
    workingHours_1 = new Signal();
    occu17_1 = new Signal();
    occu23_1 = new Signal();
    occu456_1 = new Signal();
    fire_1 = new Signal();
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
          fireHappening_in.gethook();
          temp17.gethook();
          temp23.gethook();
          temp456.gethook();
          humd17.gethook();
          humd23.gethook();
          humd456.gethook();
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
      temp17.setpreclear();
      temp23.setpreclear();
      temp456.setpreclear();
      humd17.setpreclear();
      humd23.setpreclear();
      humd456.setpreclear();
      occu1.setpreclear();
      occu2.setpreclear();
      occu3.setpreclear();
      occu4.setpreclear();
      occu5.setpreclear();
      occu6.setpreclear();
      occu7.setpreclear();
      clock.setpreclear();
      heat17.setpreclear();
      heat23.setpreclear();
      heat456.setpreclear();
      ac17.setpreclear();
      ac23.setpreclear();
      ac456.setpreclear();
      fan17.setpreclear();
      fan23.setpreclear();
      fan456.setpreclear();
      workingHours_1.setpreclear();
      occu17_1.setpreclear();
      occu23_1.setpreclear();
      occu456_1.setpreclear();
      fire_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = temp17.getStatus() ? temp17.setprepresent() : temp17.setpreclear();
      temp17.setpreval(temp17.getValue());
      temp17.setClear();
      dummyint = temp23.getStatus() ? temp23.setprepresent() : temp23.setpreclear();
      temp23.setpreval(temp23.getValue());
      temp23.setClear();
      dummyint = temp456.getStatus() ? temp456.setprepresent() : temp456.setpreclear();
      temp456.setpreval(temp456.getValue());
      temp456.setClear();
      dummyint = humd17.getStatus() ? humd17.setprepresent() : humd17.setpreclear();
      humd17.setpreval(humd17.getValue());
      humd17.setClear();
      dummyint = humd23.getStatus() ? humd23.setprepresent() : humd23.setpreclear();
      humd23.setpreval(humd23.getValue());
      humd23.setClear();
      dummyint = humd456.getStatus() ? humd456.setprepresent() : humd456.setpreclear();
      humd456.setpreval(humd456.getValue());
      humd456.setClear();
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
      heat17.sethook();
      heat17.setClear();
      heat23.sethook();
      heat23.setClear();
      heat456.sethook();
      heat456.setClear();
      ac17.sethook();
      ac17.setClear();
      ac23.sethook();
      ac23.setClear();
      ac456.sethook();
      ac456.setClear();
      fan17.sethook();
      fan17.setClear();
      fan23.sethook();
      fan23.setClear();
      fan456.sethook();
      fan456.setClear();
      workingHours_1.setClear();
      occu17_1.setClear();
      occu23_1.setClear();
      occu456_1.setClear();
      fire_1.setClear();
      fireHappening_in.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        fireHappening_in.gethook();
        temp17.gethook();
        temp23.gethook();
        temp456.gethook();
        humd17.gethook();
        humd23.gethook();
        humd456.gethook();
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
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

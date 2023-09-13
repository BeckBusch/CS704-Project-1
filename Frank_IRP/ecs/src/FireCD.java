import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class FireCD extends ClockDomain{
  public FireCD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal temp17 = new Signal("temp17", Signal.INPUT);
  public Signal temp23 = new Signal("temp23", Signal.INPUT);
  public Signal temp456 = new Signal("temp456", Signal.INPUT);
  public Signal smoke1 = new Signal("smoke1", Signal.INPUT);
  public Signal smoke2 = new Signal("smoke2", Signal.INPUT);
  public Signal smoke3 = new Signal("smoke3", Signal.INPUT);
  public Signal smoke4 = new Signal("smoke4", Signal.INPUT);
  public Signal smoke5 = new Signal("smoke5", Signal.INPUT);
  public Signal smoke6 = new Signal("smoke6", Signal.INPUT);
  public Signal smoke7 = new Signal("smoke7", Signal.INPUT);
  public Signal emergency = new Signal("emergency", Signal.OUTPUT);
  public output_Channel fireHappening_o = new output_Channel();
  public output_Channel fireHappeningLight_o = new output_Channel();
  private Signal fire_12;
  private double temperatureThreshold_thread_13;//sysj\ecs.sysj line: 296, column: 3
  private int S678 = 1;
  private int S273 = 1;
  private int S281 = 1;
  private int S676 = 1;
  private int S412 = 1;
  private int S392 = 1;
  private int S288 = 1;
  private int S283 = 1;
  private int S310 = 1;
  private int S305 = 1;
  
  private int[] ends = new int[56];
  private int[] tdone = new int[56];
  
  public void thread1575(int [] tdone, int [] ends){
        switch(S676){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S412){
          case 0 : 
            switch(S392){
              case 0 : 
                switch(S288){
                  case 0 : 
                    if(!fireHappening_o.isPartnerPresent() || fireHappening_o.isPartnerPreempted()){//sysj\ecs.sysj line: 322, column: 5
                      fireHappening_o.setREQ(false);//sysj\ecs.sysj line: 322, column: 5
                      S288=1;
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                    else {
                      switch(S283){
                        case 0 : 
                          if(fireHappening_o.isACK()){//sysj\ecs.sysj line: 322, column: 5
                            fireHappening_o.setVal(true);//sysj\ecs.sysj line: 322, column: 5
                            S283=1;
                            if(!fireHappening_o.isACK()){//sysj\ecs.sysj line: 322, column: 5
                              fireHappening_o.setREQ(false);//sysj\ecs.sysj line: 322, column: 5
                              ends[15]=2;
                              ;//sysj\ecs.sysj line: 322, column: 5
                              S392=1;
                              S310=0;
                              if(!fireHappeningLight_o.isPartnerPresent() || fireHappeningLight_o.isPartnerPreempted()){//sysj\ecs.sysj line: 323, column: 5
                                fireHappeningLight_o.setREQ(false);//sysj\ecs.sysj line: 323, column: 5
                                S310=1;
                                active[15]=1;
                                ends[15]=1;
                                tdone[15]=1;
                              }
                              else {
                                S305=0;
                                if(fireHappeningLight_o.isACK()){//sysj\ecs.sysj line: 323, column: 5
                                  fireHappeningLight_o.setVal(true);//sysj\ecs.sysj line: 323, column: 5
                                  S305=1;
                                  if(!fireHappeningLight_o.isACK()){//sysj\ecs.sysj line: 323, column: 5
                                    fireHappeningLight_o.setREQ(false);//sysj\ecs.sysj line: 323, column: 5
                                    ends[15]=2;
                                    ;//sysj\ecs.sysj line: 323, column: 5
                                    S392=2;
                                    emergency.setPresent();//sysj\ecs.sysj line: 324, column: 5
                                    currsigs.addElement(emergency);
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
                                else {
                                  active[15]=1;
                                  ends[15]=1;
                                  tdone[15]=1;
                                }
                              }
                            }
                            else {
                              active[15]=1;
                              ends[15]=1;
                              tdone[15]=1;
                            }
                          }
                          else {
                            active[15]=1;
                            ends[15]=1;
                            tdone[15]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!fireHappening_o.isACK()){//sysj\ecs.sysj line: 322, column: 5
                            fireHappening_o.setREQ(false);//sysj\ecs.sysj line: 322, column: 5
                            ends[15]=2;
                            ;//sysj\ecs.sysj line: 322, column: 5
                            S392=1;
                            S310=0;
                            if(!fireHappeningLight_o.isPartnerPresent() || fireHappeningLight_o.isPartnerPreempted()){//sysj\ecs.sysj line: 323, column: 5
                              fireHappeningLight_o.setREQ(false);//sysj\ecs.sysj line: 323, column: 5
                              S310=1;
                              active[15]=1;
                              ends[15]=1;
                              tdone[15]=1;
                            }
                            else {
                              S305=0;
                              if(fireHappeningLight_o.isACK()){//sysj\ecs.sysj line: 323, column: 5
                                fireHappeningLight_o.setVal(true);//sysj\ecs.sysj line: 323, column: 5
                                S305=1;
                                if(!fireHappeningLight_o.isACK()){//sysj\ecs.sysj line: 323, column: 5
                                  fireHappeningLight_o.setREQ(false);//sysj\ecs.sysj line: 323, column: 5
                                  ends[15]=2;
                                  ;//sysj\ecs.sysj line: 323, column: 5
                                  S392=2;
                                  emergency.setPresent();//sysj\ecs.sysj line: 324, column: 5
                                  currsigs.addElement(emergency);
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
                              else {
                                active[15]=1;
                                ends[15]=1;
                                tdone[15]=1;
                              }
                            }
                          }
                          else {
                            active[15]=1;
                            ends[15]=1;
                            tdone[15]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S288=1;
                    S288=0;
                    if(!fireHappening_o.isPartnerPresent() || fireHappening_o.isPartnerPreempted()){//sysj\ecs.sysj line: 322, column: 5
                      fireHappening_o.setREQ(false);//sysj\ecs.sysj line: 322, column: 5
                      S288=1;
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                    else {
                      S283=0;
                      if(fireHappening_o.isACK()){//sysj\ecs.sysj line: 322, column: 5
                        fireHappening_o.setVal(true);//sysj\ecs.sysj line: 322, column: 5
                        S283=1;
                        if(!fireHappening_o.isACK()){//sysj\ecs.sysj line: 322, column: 5
                          fireHappening_o.setREQ(false);//sysj\ecs.sysj line: 322, column: 5
                          ends[15]=2;
                          ;//sysj\ecs.sysj line: 322, column: 5
                          S392=1;
                          S310=0;
                          if(!fireHappeningLight_o.isPartnerPresent() || fireHappeningLight_o.isPartnerPreempted()){//sysj\ecs.sysj line: 323, column: 5
                            fireHappeningLight_o.setREQ(false);//sysj\ecs.sysj line: 323, column: 5
                            S310=1;
                            active[15]=1;
                            ends[15]=1;
                            tdone[15]=1;
                          }
                          else {
                            S305=0;
                            if(fireHappeningLight_o.isACK()){//sysj\ecs.sysj line: 323, column: 5
                              fireHappeningLight_o.setVal(true);//sysj\ecs.sysj line: 323, column: 5
                              S305=1;
                              if(!fireHappeningLight_o.isACK()){//sysj\ecs.sysj line: 323, column: 5
                                fireHappeningLight_o.setREQ(false);//sysj\ecs.sysj line: 323, column: 5
                                ends[15]=2;
                                ;//sysj\ecs.sysj line: 323, column: 5
                                S392=2;
                                emergency.setPresent();//sysj\ecs.sysj line: 324, column: 5
                                currsigs.addElement(emergency);
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
                            else {
                              active[15]=1;
                              ends[15]=1;
                              tdone[15]=1;
                            }
                          }
                        }
                        else {
                          active[15]=1;
                          ends[15]=1;
                          tdone[15]=1;
                        }
                      }
                      else {
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S310){
                  case 0 : 
                    if(!fireHappeningLight_o.isPartnerPresent() || fireHappeningLight_o.isPartnerPreempted()){//sysj\ecs.sysj line: 323, column: 5
                      fireHappeningLight_o.setREQ(false);//sysj\ecs.sysj line: 323, column: 5
                      S310=1;
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                    else {
                      switch(S305){
                        case 0 : 
                          if(fireHappeningLight_o.isACK()){//sysj\ecs.sysj line: 323, column: 5
                            fireHappeningLight_o.setVal(true);//sysj\ecs.sysj line: 323, column: 5
                            S305=1;
                            if(!fireHappeningLight_o.isACK()){//sysj\ecs.sysj line: 323, column: 5
                              fireHappeningLight_o.setREQ(false);//sysj\ecs.sysj line: 323, column: 5
                              ends[15]=2;
                              ;//sysj\ecs.sysj line: 323, column: 5
                              S392=2;
                              emergency.setPresent();//sysj\ecs.sysj line: 324, column: 5
                              currsigs.addElement(emergency);
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
                          else {
                            active[15]=1;
                            ends[15]=1;
                            tdone[15]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!fireHappeningLight_o.isACK()){//sysj\ecs.sysj line: 323, column: 5
                            fireHappeningLight_o.setREQ(false);//sysj\ecs.sysj line: 323, column: 5
                            ends[15]=2;
                            ;//sysj\ecs.sysj line: 323, column: 5
                            S392=2;
                            emergency.setPresent();//sysj\ecs.sysj line: 324, column: 5
                            currsigs.addElement(emergency);
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
                    break;
                  
                  case 1 : 
                    S310=1;
                    S310=0;
                    if(!fireHappeningLight_o.isPartnerPresent() || fireHappeningLight_o.isPartnerPreempted()){//sysj\ecs.sysj line: 323, column: 5
                      fireHappeningLight_o.setREQ(false);//sysj\ecs.sysj line: 323, column: 5
                      S310=1;
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                    else {
                      S305=0;
                      if(fireHappeningLight_o.isACK()){//sysj\ecs.sysj line: 323, column: 5
                        fireHappeningLight_o.setVal(true);//sysj\ecs.sysj line: 323, column: 5
                        S305=1;
                        if(!fireHappeningLight_o.isACK()){//sysj\ecs.sysj line: 323, column: 5
                          fireHappeningLight_o.setREQ(false);//sysj\ecs.sysj line: 323, column: 5
                          ends[15]=2;
                          ;//sysj\ecs.sysj line: 323, column: 5
                          S392=2;
                          emergency.setPresent();//sysj\ecs.sysj line: 324, column: 5
                          currsigs.addElement(emergency);
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
                      else {
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 2 : 
                emergency.setPresent();//sysj\ecs.sysj line: 324, column: 5
                currsigs.addElement(emergency);
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S412=1;
            S412=0;
            if(fire_12.getprestatus()){//sysj\ecs.sysj line: 321, column: 12
              S392=0;
              S288=0;
              if(!fireHappening_o.isPartnerPresent() || fireHappening_o.isPartnerPreempted()){//sysj\ecs.sysj line: 322, column: 5
                fireHappening_o.setREQ(false);//sysj\ecs.sysj line: 322, column: 5
                S288=1;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                S283=0;
                if(fireHappening_o.isACK()){//sysj\ecs.sysj line: 322, column: 5
                  fireHappening_o.setVal(true);//sysj\ecs.sysj line: 322, column: 5
                  S283=1;
                  if(!fireHappening_o.isACK()){//sysj\ecs.sysj line: 322, column: 5
                    fireHappening_o.setREQ(false);//sysj\ecs.sysj line: 322, column: 5
                    ends[15]=2;
                    ;//sysj\ecs.sysj line: 322, column: 5
                    S392=1;
                    S310=0;
                    if(!fireHappeningLight_o.isPartnerPresent() || fireHappeningLight_o.isPartnerPreempted()){//sysj\ecs.sysj line: 323, column: 5
                      fireHappeningLight_o.setREQ(false);//sysj\ecs.sysj line: 323, column: 5
                      S310=1;
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                    else {
                      S305=0;
                      if(fireHappeningLight_o.isACK()){//sysj\ecs.sysj line: 323, column: 5
                        fireHappeningLight_o.setVal(true);//sysj\ecs.sysj line: 323, column: 5
                        S305=1;
                        if(!fireHappeningLight_o.isACK()){//sysj\ecs.sysj line: 323, column: 5
                          fireHappeningLight_o.setREQ(false);//sysj\ecs.sysj line: 323, column: 5
                          ends[15]=2;
                          ;//sysj\ecs.sysj line: 323, column: 5
                          S392=2;
                          emergency.setPresent();//sysj\ecs.sysj line: 324, column: 5
                          currsigs.addElement(emergency);
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
                      else {
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                    }
                  }
                  else {
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                }
                else {
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
              }
            }
            else {
              S412=1;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1574(int [] tdone, int [] ends){
        switch(S281){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(smoke1.getprestatus() || smoke2.getprestatus() || smoke3.getprestatus() || smoke4.getprestatus() || smoke5.getprestatus() || smoke6.getprestatus() || smoke7.getprestatus()){//sysj\ecs.sysj line: 310, column: 12
          fire_12.setPresent();//sysj\ecs.sysj line: 311, column: 5
          currsigs.addElement(fire_12);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread1573(int [] tdone, int [] ends){
        switch(S273){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if((temp17.getpreval() == null ? 0.0d : ((Double)temp17.getpreval()).doubleValue()) > temperatureThreshold_thread_13 || (temp23.getpreval() == null ? 0.0d : ((Double)temp23.getpreval()).doubleValue()) > temperatureThreshold_thread_13 || (temp456.getpreval() == null ? 0.0d : ((Double)temp456.getpreval()).doubleValue()) > temperatureThreshold_thread_13){//sysj\ecs.sysj line: 299, column: 8
          fire_12.setPresent();//sysj\ecs.sysj line: 300, column: 5
          currsigs.addElement(fire_12);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread1571(int [] tdone, int [] ends){
        S676=1;
    S412=0;
    if(fire_12.getprestatus()){//sysj\ecs.sysj line: 321, column: 12
      S392=0;
      S288=0;
      if(!fireHappening_o.isPartnerPresent() || fireHappening_o.isPartnerPreempted()){//sysj\ecs.sysj line: 322, column: 5
        fireHappening_o.setREQ(false);//sysj\ecs.sysj line: 322, column: 5
        S288=1;
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
      else {
        S283=0;
        if(fireHappening_o.isACK()){//sysj\ecs.sysj line: 322, column: 5
          fireHappening_o.setVal(true);//sysj\ecs.sysj line: 322, column: 5
          S283=1;
          if(!fireHappening_o.isACK()){//sysj\ecs.sysj line: 322, column: 5
            fireHappening_o.setREQ(false);//sysj\ecs.sysj line: 322, column: 5
            ends[15]=2;
            ;//sysj\ecs.sysj line: 322, column: 5
            S392=1;
            S310=0;
            if(!fireHappeningLight_o.isPartnerPresent() || fireHappeningLight_o.isPartnerPreempted()){//sysj\ecs.sysj line: 323, column: 5
              fireHappeningLight_o.setREQ(false);//sysj\ecs.sysj line: 323, column: 5
              S310=1;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              S305=0;
              if(fireHappeningLight_o.isACK()){//sysj\ecs.sysj line: 323, column: 5
                fireHappeningLight_o.setVal(true);//sysj\ecs.sysj line: 323, column: 5
                S305=1;
                if(!fireHappeningLight_o.isACK()){//sysj\ecs.sysj line: 323, column: 5
                  fireHappeningLight_o.setREQ(false);//sysj\ecs.sysj line: 323, column: 5
                  ends[15]=2;
                  ;//sysj\ecs.sysj line: 323, column: 5
                  S392=2;
                  emergency.setPresent();//sysj\ecs.sysj line: 324, column: 5
                  currsigs.addElement(emergency);
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
              else {
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
          }
          else {
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
          }
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
    }
    else {
      S412=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread1570(int [] tdone, int [] ends){
        S281=1;
    if(smoke1.getprestatus() || smoke2.getprestatus() || smoke3.getprestatus() || smoke4.getprestatus() || smoke5.getprestatus() || smoke6.getprestatus() || smoke7.getprestatus()){//sysj\ecs.sysj line: 310, column: 12
      fire_12.setPresent();//sysj\ecs.sysj line: 311, column: 5
      currsigs.addElement(fire_12);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread1569(int [] tdone, int [] ends){
        S273=1;
    temperatureThreshold_thread_13 = 50.0;//sysj\ecs.sysj line: 296, column: 3
    if((temp17.getpreval() == null ? 0.0d : ((Double)temp17.getpreval()).doubleValue()) > temperatureThreshold_thread_13 || (temp23.getpreval() == null ? 0.0d : ((Double)temp23.getpreval()).doubleValue()) > temperatureThreshold_thread_13 || (temp456.getpreval() == null ? 0.0d : ((Double)temp456.getpreval()).doubleValue()) > temperatureThreshold_thread_13){//sysj\ecs.sysj line: 299, column: 8
      fire_12.setPresent();//sysj\ecs.sysj line: 300, column: 5
      currsigs.addElement(fire_12);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S678){
        case 0 : 
          S678=0;
          break RUN;
        
        case 1 : 
          S678=2;
          S678=2;
          fire_12.setClear();//sysj\ecs.sysj line: 292, column: 2
          thread1569(tdone,ends);
          thread1570(tdone,ends);
          thread1571(tdone,ends);
          int biggest1572 = 0;
          if(ends[13]>=biggest1572){
            biggest1572=ends[13];
          }
          if(ends[14]>=biggest1572){
            biggest1572=ends[14];
          }
          if(ends[15]>=biggest1572){
            biggest1572=ends[15];
          }
          if(biggest1572 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
        
        case 2 : 
          fire_12.setClear();//sysj\ecs.sysj line: 292, column: 2
          thread1573(tdone,ends);
          thread1574(tdone,ends);
          thread1575(tdone,ends);
          int biggest1576 = 0;
          if(ends[13]>=biggest1576){
            biggest1576=ends[13];
          }
          if(ends[14]>=biggest1576){
            biggest1576=ends[14];
          }
          if(ends[15]>=biggest1576){
            biggest1576=ends[15];
          }
          if(biggest1576 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1576 == 0){
            S678=0;
            active[12]=0;
            ends[12]=0;
            S678=0;
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
    fire_12 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[12] != 0){
      int index = 12;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
        if(!df){
          fireHappening_o.gethook();
          fireHappeningLight_o.gethook();
          temp17.gethook();
          temp23.gethook();
          temp456.gethook();
          smoke1.gethook();
          smoke2.gethook();
          smoke3.gethook();
          smoke4.gethook();
          smoke5.gethook();
          smoke6.gethook();
          smoke7.gethook();
          df = true;
        }
        runClockDomain();
      }
      temp17.setpreclear();
      temp23.setpreclear();
      temp456.setpreclear();
      smoke1.setpreclear();
      smoke2.setpreclear();
      smoke3.setpreclear();
      smoke4.setpreclear();
      smoke5.setpreclear();
      smoke6.setpreclear();
      smoke7.setpreclear();
      emergency.setpreclear();
      fire_12.setpreclear();
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
      dummyint = smoke1.getStatus() ? smoke1.setprepresent() : smoke1.setpreclear();
      smoke1.setpreval(smoke1.getValue());
      smoke1.setClear();
      dummyint = smoke2.getStatus() ? smoke2.setprepresent() : smoke2.setpreclear();
      smoke2.setpreval(smoke2.getValue());
      smoke2.setClear();
      dummyint = smoke3.getStatus() ? smoke3.setprepresent() : smoke3.setpreclear();
      smoke3.setpreval(smoke3.getValue());
      smoke3.setClear();
      dummyint = smoke4.getStatus() ? smoke4.setprepresent() : smoke4.setpreclear();
      smoke4.setpreval(smoke4.getValue());
      smoke4.setClear();
      dummyint = smoke5.getStatus() ? smoke5.setprepresent() : smoke5.setpreclear();
      smoke5.setpreval(smoke5.getValue());
      smoke5.setClear();
      dummyint = smoke6.getStatus() ? smoke6.setprepresent() : smoke6.setpreclear();
      smoke6.setpreval(smoke6.getValue());
      smoke6.setClear();
      dummyint = smoke7.getStatus() ? smoke7.setprepresent() : smoke7.setpreclear();
      smoke7.setpreval(smoke7.getValue());
      smoke7.setClear();
      emergency.sethook();
      emergency.setClear();
      fire_12.setClear();
      fireHappening_o.sethook();
      fireHappeningLight_o.sethook();
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
        fireHappening_o.gethook();
        fireHappeningLight_o.gethook();
        temp17.gethook();
        temp23.gethook();
        temp456.gethook();
        smoke1.gethook();
        smoke2.gethook();
        smoke3.gethook();
        smoke4.gethook();
        smoke5.gethook();
        smoke6.gethook();
        smoke7.gethook();
      }
      runFinisher();
      if(active[12] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

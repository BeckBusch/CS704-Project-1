import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class PlantConveyorCD extends ClockDomain{
  public PlantConveyorCD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal spawnBottle = new Signal("spawnBottle", Signal.INPUT);
  public Signal removeBottle = new Signal("removeBottle", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public input_Channel receivedPos1_in = new input_Channel();
  public input_Channel sentPos5_in = new input_Channel();
  public output_Channel plantConveyorActive_o = new output_Channel();
  public output_Channel plantConveyorBottleBeforePos1_o = new output_Channel();
  private Signal bottleBeforePos1_103;
  private Signal removeBeforePos1_103;
  private Signal spawnBottleAfter5_103;
  private Signal bottleAfter5_103;
  private int S2130 = 1;
  private int S1832 = 1;
  private int S1782 = 1;
  private int S1765 = 1;
  private int S1760 = 1;
  private int S1906 = 1;
  private int S1856 = 1;
  private int S1839 = 1;
  private int S1834 = 1;
  private int S1938 = 1;
  private int S1916 = 1;
  private int S2013 = 1;
  private int S2011 = 1;
  private int S1963 = 1;
  private int S1947 = 1;
  private int S1942 = 1;
  private int S2088 = 1;
  private int S2086 = 1;
  private int S2038 = 1;
  private int S2022 = 1;
  private int S2017 = 1;
  private int S2120 = 1;
  private int S2098 = 1;
  private int S2128 = 1;
  
  private int[] ends = new int[115];
  private int[] tdone = new int[115];
  
  public void thread2412(int [] tdone, int [] ends){
        switch(S2128){
      case 0 : 
        active[114]=0;
        ends[114]=0;
        tdone[114]=1;
        break;
      
      case 1 : 
        if(bottleAfter5_103.getprestatus()){//sysj/plant.sysj line: 423, column: 13
          bottleLeftPos5.setPresent();//sysj/plant.sysj line: 424, column: 5
          currsigs.addElement(bottleLeftPos5);
          active[114]=1;
          ends[114]=1;
          tdone[114]=1;
        }
        else {
          active[114]=1;
          ends[114]=1;
          tdone[114]=1;
        }
        break;
      
    }
  }

  public void thread2411(int [] tdone, int [] ends){
        switch(S2120){
      case 0 : 
        active[113]=0;
        ends[113]=0;
        tdone[113]=1;
        break;
      
      case 1 : 
        switch(S2098){
          case 0 : 
            if(spawnBottleAfter5_103.getprestatus()){//sysj/plant.sysj line: 413, column: 11
              S2098=1;
              bottleAfter5_103.setPresent();//sysj/plant.sysj line: 416, column: 5
              currsigs.addElement(bottleAfter5_103);
              active[113]=1;
              ends[113]=1;
              tdone[113]=1;
            }
            else {
              active[113]=1;
              ends[113]=1;
              tdone[113]=1;
            }
            break;
          
          case 1 : 
            if(removeBottle.getprestatus()){//sysj/plant.sysj line: 415, column: 10
              S2098=0;
              active[113]=1;
              ends[113]=1;
              tdone[113]=1;
            }
            else {
              bottleAfter5_103.setPresent();//sysj/plant.sysj line: 416, column: 5
              currsigs.addElement(bottleAfter5_103);
              active[113]=1;
              ends[113]=1;
              tdone[113]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2409(int [] tdone, int [] ends){
        switch(S2086){
      case 0 : 
        active[112]=0;
        ends[112]=0;
        tdone[112]=1;
        break;
      
      case 1 : 
        switch(S2038){
          case 0 : 
            switch(S2022){
              case 0 : 
                if(!sentPos5_in.isPartnerPresent() || sentPos5_in.isPartnerPreempted()){//sysj/plant.sysj line: 8, column: 3
                  sentPos5_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
                  S2022=1;
                  active[112]=1;
                  ends[112]=1;
                  tdone[112]=1;
                }
                else {
                  switch(S2017){
                    case 0 : 
                      if(!sentPos5_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
                        sentPos5_in.setACK(true);//sysj/plant.sysj line: 8, column: 3
                        S2017=1;
                        if(sentPos5_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
                          sentPos5_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
                          ends[112]=2;
                          ;//sysj/plant.sysj line: 8, column: 3
                          spawnBottleAfter5_103.setPresent();//sysj/plant.sysj line: 9, column: 3
                          currsigs.addElement(spawnBottleAfter5_103);
                          S2038=1;
                          active[112]=1;
                          ends[112]=1;
                          tdone[112]=1;
                        }
                        else {
                          active[112]=1;
                          ends[112]=1;
                          tdone[112]=1;
                        }
                      }
                      else {
                        active[112]=1;
                        ends[112]=1;
                        tdone[112]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(sentPos5_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
                        sentPos5_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
                        ends[112]=2;
                        ;//sysj/plant.sysj line: 8, column: 3
                        spawnBottleAfter5_103.setPresent();//sysj/plant.sysj line: 9, column: 3
                        currsigs.addElement(spawnBottleAfter5_103);
                        S2038=1;
                        active[112]=1;
                        ends[112]=1;
                        tdone[112]=1;
                      }
                      else {
                        active[112]=1;
                        ends[112]=1;
                        tdone[112]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S2022=1;
                S2022=0;
                if(!sentPos5_in.isPartnerPresent() || sentPos5_in.isPartnerPreempted()){//sysj/plant.sysj line: 8, column: 3
                  sentPos5_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
                  S2022=1;
                  active[112]=1;
                  ends[112]=1;
                  tdone[112]=1;
                }
                else {
                  S2017=0;
                  if(!sentPos5_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
                    sentPos5_in.setACK(true);//sysj/plant.sysj line: 8, column: 3
                    S2017=1;
                    if(sentPos5_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
                      sentPos5_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
                      ends[112]=2;
                      ;//sysj/plant.sysj line: 8, column: 3
                      spawnBottleAfter5_103.setPresent();//sysj/plant.sysj line: 9, column: 3
                      currsigs.addElement(spawnBottleAfter5_103);
                      S2038=1;
                      active[112]=1;
                      ends[112]=1;
                      tdone[112]=1;
                    }
                    else {
                      active[112]=1;
                      ends[112]=1;
                      tdone[112]=1;
                    }
                  }
                  else {
                    active[112]=1;
                    ends[112]=1;
                    tdone[112]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S2038=1;
            S2038=0;
            S2022=0;
            if(!sentPos5_in.isPartnerPresent() || sentPos5_in.isPartnerPreempted()){//sysj/plant.sysj line: 8, column: 3
              sentPos5_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
              S2022=1;
              active[112]=1;
              ends[112]=1;
              tdone[112]=1;
            }
            else {
              S2017=0;
              if(!sentPos5_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
                sentPos5_in.setACK(true);//sysj/plant.sysj line: 8, column: 3
                S2017=1;
                if(sentPos5_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
                  sentPos5_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
                  ends[112]=2;
                  ;//sysj/plant.sysj line: 8, column: 3
                  spawnBottleAfter5_103.setPresent();//sysj/plant.sysj line: 9, column: 3
                  currsigs.addElement(spawnBottleAfter5_103);
                  S2038=1;
                  active[112]=1;
                  ends[112]=1;
                  tdone[112]=1;
                }
                else {
                  active[112]=1;
                  ends[112]=1;
                  tdone[112]=1;
                }
              }
              else {
                active[112]=1;
                ends[112]=1;
                tdone[112]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2408(int [] tdone, int [] ends){
        active[111]=0;
    ends[111]=0;
    tdone[111]=1;
  }

  public void thread2407(int [] tdone, int [] ends){
        switch(S2088){
      case 0 : 
        active[110]=0;
        ends[110]=0;
        tdone[110]=1;
        break;
      
      case 1 : 
        thread2408(tdone,ends);
        thread2409(tdone,ends);
        int biggest2410 = 0;
        if(ends[111]>=biggest2410){
          biggest2410=ends[111];
        }
        if(ends[112]>=biggest2410){
          biggest2410=ends[112];
        }
        if(biggest2410 == 1){
          active[110]=1;
          ends[110]=1;
          tdone[110]=1;
        }
        //FINXME code
        if(biggest2410 == 0){
          S2088=0;
          active[110]=0;
          ends[110]=0;
          tdone[110]=1;
        }
        break;
      
    }
  }

  public void thread2405(int [] tdone, int [] ends){
        switch(S2011){
      case 0 : 
        active[109]=0;
        ends[109]=0;
        tdone[109]=1;
        break;
      
      case 1 : 
        switch(S1963){
          case 0 : 
            switch(S1947){
              case 0 : 
                if(!receivedPos1_in.isPartnerPresent() || receivedPos1_in.isPartnerPreempted()){//sysj/plant.sysj line: 8, column: 3
                  receivedPos1_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
                  S1947=1;
                  active[109]=1;
                  ends[109]=1;
                  tdone[109]=1;
                }
                else {
                  switch(S1942){
                    case 0 : 
                      if(!receivedPos1_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
                        receivedPos1_in.setACK(true);//sysj/plant.sysj line: 8, column: 3
                        S1942=1;
                        if(receivedPos1_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
                          receivedPos1_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
                          ends[109]=2;
                          ;//sysj/plant.sysj line: 8, column: 3
                          removeBeforePos1_103.setPresent();//sysj/plant.sysj line: 9, column: 3
                          currsigs.addElement(removeBeforePos1_103);
                          S1963=1;
                          active[109]=1;
                          ends[109]=1;
                          tdone[109]=1;
                        }
                        else {
                          active[109]=1;
                          ends[109]=1;
                          tdone[109]=1;
                        }
                      }
                      else {
                        active[109]=1;
                        ends[109]=1;
                        tdone[109]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(receivedPos1_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
                        receivedPos1_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
                        ends[109]=2;
                        ;//sysj/plant.sysj line: 8, column: 3
                        removeBeforePos1_103.setPresent();//sysj/plant.sysj line: 9, column: 3
                        currsigs.addElement(removeBeforePos1_103);
                        S1963=1;
                        active[109]=1;
                        ends[109]=1;
                        tdone[109]=1;
                      }
                      else {
                        active[109]=1;
                        ends[109]=1;
                        tdone[109]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S1947=1;
                S1947=0;
                if(!receivedPos1_in.isPartnerPresent() || receivedPos1_in.isPartnerPreempted()){//sysj/plant.sysj line: 8, column: 3
                  receivedPos1_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
                  S1947=1;
                  active[109]=1;
                  ends[109]=1;
                  tdone[109]=1;
                }
                else {
                  S1942=0;
                  if(!receivedPos1_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
                    receivedPos1_in.setACK(true);//sysj/plant.sysj line: 8, column: 3
                    S1942=1;
                    if(receivedPos1_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
                      receivedPos1_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
                      ends[109]=2;
                      ;//sysj/plant.sysj line: 8, column: 3
                      removeBeforePos1_103.setPresent();//sysj/plant.sysj line: 9, column: 3
                      currsigs.addElement(removeBeforePos1_103);
                      S1963=1;
                      active[109]=1;
                      ends[109]=1;
                      tdone[109]=1;
                    }
                    else {
                      active[109]=1;
                      ends[109]=1;
                      tdone[109]=1;
                    }
                  }
                  else {
                    active[109]=1;
                    ends[109]=1;
                    tdone[109]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S1963=1;
            S1963=0;
            S1947=0;
            if(!receivedPos1_in.isPartnerPresent() || receivedPos1_in.isPartnerPreempted()){//sysj/plant.sysj line: 8, column: 3
              receivedPos1_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
              S1947=1;
              active[109]=1;
              ends[109]=1;
              tdone[109]=1;
            }
            else {
              S1942=0;
              if(!receivedPos1_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
                receivedPos1_in.setACK(true);//sysj/plant.sysj line: 8, column: 3
                S1942=1;
                if(receivedPos1_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
                  receivedPos1_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
                  ends[109]=2;
                  ;//sysj/plant.sysj line: 8, column: 3
                  removeBeforePos1_103.setPresent();//sysj/plant.sysj line: 9, column: 3
                  currsigs.addElement(removeBeforePos1_103);
                  S1963=1;
                  active[109]=1;
                  ends[109]=1;
                  tdone[109]=1;
                }
                else {
                  active[109]=1;
                  ends[109]=1;
                  tdone[109]=1;
                }
              }
              else {
                active[109]=1;
                ends[109]=1;
                tdone[109]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2404(int [] tdone, int [] ends){
        active[108]=0;
    ends[108]=0;
    tdone[108]=1;
  }

  public void thread2403(int [] tdone, int [] ends){
        switch(S2013){
      case 0 : 
        active[107]=0;
        ends[107]=0;
        tdone[107]=1;
        break;
      
      case 1 : 
        thread2404(tdone,ends);
        thread2405(tdone,ends);
        int biggest2406 = 0;
        if(ends[108]>=biggest2406){
          biggest2406=ends[108];
        }
        if(ends[109]>=biggest2406){
          biggest2406=ends[109];
        }
        if(biggest2406 == 1){
          active[107]=1;
          ends[107]=1;
          tdone[107]=1;
        }
        //FINXME code
        if(biggest2406 == 0){
          S2013=0;
          active[107]=0;
          ends[107]=0;
          tdone[107]=1;
        }
        break;
      
    }
  }

  public void thread2402(int [] tdone, int [] ends){
        switch(S1938){
      case 0 : 
        active[106]=0;
        ends[106]=0;
        tdone[106]=1;
        break;
      
      case 1 : 
        switch(S1916){
          case 0 : 
            if(spawnBottle.getprestatus()){//sysj/plant.sysj line: 394, column: 11
              S1916=1;
              bottleBeforePos1_103.setPresent();//sysj/plant.sysj line: 397, column: 5
              currsigs.addElement(bottleBeforePos1_103);
              active[106]=1;
              ends[106]=1;
              tdone[106]=1;
            }
            else {
              active[106]=1;
              ends[106]=1;
              tdone[106]=1;
            }
            break;
          
          case 1 : 
            if(removeBeforePos1_103.getprestatus()){//sysj/plant.sysj line: 396, column: 10
              S1916=0;
              active[106]=1;
              ends[106]=1;
              tdone[106]=1;
            }
            else {
              bottleBeforePos1_103.setPresent();//sysj/plant.sysj line: 397, column: 5
              currsigs.addElement(bottleBeforePos1_103);
              active[106]=1;
              ends[106]=1;
              tdone[106]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2401(int [] tdone, int [] ends){
        switch(S1906){
      case 0 : 
        active[105]=0;
        ends[105]=0;
        tdone[105]=1;
        break;
      
      case 1 : 
        switch(S1856){
          case 0 : 
            switch(S1839){
              case 0 : 
                if(!plantConveyorBottleBeforePos1_o.isPartnerPresent() || plantConveyorBottleBeforePos1_o.isPartnerPreempted()){//sysj/plant.sysj line: 384, column: 5
                  plantConveyorBottleBeforePos1_o.setREQ(false);//sysj/plant.sysj line: 384, column: 5
                  S1839=1;
                  active[105]=1;
                  ends[105]=1;
                  tdone[105]=1;
                }
                else {
                  switch(S1834){
                    case 0 : 
                      if(plantConveyorBottleBeforePos1_o.isACK()){//sysj/plant.sysj line: 384, column: 5
                        plantConveyorBottleBeforePos1_o.setVal(true);//sysj/plant.sysj line: 384, column: 5
                        S1834=1;
                        if(!plantConveyorBottleBeforePos1_o.isACK()){//sysj/plant.sysj line: 384, column: 5
                          plantConveyorBottleBeforePos1_o.setREQ(false);//sysj/plant.sysj line: 384, column: 5
                          ends[105]=2;
                          ;//sysj/plant.sysj line: 384, column: 5
                          S1856=1;
                          active[105]=1;
                          ends[105]=1;
                          tdone[105]=1;
                        }
                        else {
                          active[105]=1;
                          ends[105]=1;
                          tdone[105]=1;
                        }
                      }
                      else {
                        active[105]=1;
                        ends[105]=1;
                        tdone[105]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!plantConveyorBottleBeforePos1_o.isACK()){//sysj/plant.sysj line: 384, column: 5
                        plantConveyorBottleBeforePos1_o.setREQ(false);//sysj/plant.sysj line: 384, column: 5
                        ends[105]=2;
                        ;//sysj/plant.sysj line: 384, column: 5
                        S1856=1;
                        active[105]=1;
                        ends[105]=1;
                        tdone[105]=1;
                      }
                      else {
                        active[105]=1;
                        ends[105]=1;
                        tdone[105]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S1839=1;
                S1839=0;
                if(!plantConveyorBottleBeforePos1_o.isPartnerPresent() || plantConveyorBottleBeforePos1_o.isPartnerPreempted()){//sysj/plant.sysj line: 384, column: 5
                  plantConveyorBottleBeforePos1_o.setREQ(false);//sysj/plant.sysj line: 384, column: 5
                  S1839=1;
                  active[105]=1;
                  ends[105]=1;
                  tdone[105]=1;
                }
                else {
                  S1834=0;
                  if(plantConveyorBottleBeforePos1_o.isACK()){//sysj/plant.sysj line: 384, column: 5
                    plantConveyorBottleBeforePos1_o.setVal(true);//sysj/plant.sysj line: 384, column: 5
                    S1834=1;
                    if(!plantConveyorBottleBeforePos1_o.isACK()){//sysj/plant.sysj line: 384, column: 5
                      plantConveyorBottleBeforePos1_o.setREQ(false);//sysj/plant.sysj line: 384, column: 5
                      ends[105]=2;
                      ;//sysj/plant.sysj line: 384, column: 5
                      S1856=1;
                      active[105]=1;
                      ends[105]=1;
                      tdone[105]=1;
                    }
                    else {
                      active[105]=1;
                      ends[105]=1;
                      tdone[105]=1;
                    }
                  }
                  else {
                    active[105]=1;
                    ends[105]=1;
                    tdone[105]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S1856=1;
            S1856=0;
            if(bottleBeforePos1_103.getprestatus()){//sysj/plant.sysj line: 383, column: 13
              S1839=0;
              if(!plantConveyorBottleBeforePos1_o.isPartnerPresent() || plantConveyorBottleBeforePos1_o.isPartnerPreempted()){//sysj/plant.sysj line: 384, column: 5
                plantConveyorBottleBeforePos1_o.setREQ(false);//sysj/plant.sysj line: 384, column: 5
                S1839=1;
                active[105]=1;
                ends[105]=1;
                tdone[105]=1;
              }
              else {
                S1834=0;
                if(plantConveyorBottleBeforePos1_o.isACK()){//sysj/plant.sysj line: 384, column: 5
                  plantConveyorBottleBeforePos1_o.setVal(true);//sysj/plant.sysj line: 384, column: 5
                  S1834=1;
                  if(!plantConveyorBottleBeforePos1_o.isACK()){//sysj/plant.sysj line: 384, column: 5
                    plantConveyorBottleBeforePos1_o.setREQ(false);//sysj/plant.sysj line: 384, column: 5
                    ends[105]=2;
                    ;//sysj/plant.sysj line: 384, column: 5
                    S1856=1;
                    active[105]=1;
                    ends[105]=1;
                    tdone[105]=1;
                  }
                  else {
                    active[105]=1;
                    ends[105]=1;
                    tdone[105]=1;
                  }
                }
                else {
                  active[105]=1;
                  ends[105]=1;
                  tdone[105]=1;
                }
              }
            }
            else {
              S1856=1;
              active[105]=1;
              ends[105]=1;
              tdone[105]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2400(int [] tdone, int [] ends){
        switch(S1832){
      case 0 : 
        active[104]=0;
        ends[104]=0;
        tdone[104]=1;
        break;
      
      case 1 : 
        switch(S1782){
          case 0 : 
            switch(S1765){
              case 0 : 
                if(!plantConveyorActive_o.isPartnerPresent() || plantConveyorActive_o.isPartnerPreempted()){//sysj/plant.sysj line: 374, column: 5
                  plantConveyorActive_o.setREQ(false);//sysj/plant.sysj line: 374, column: 5
                  S1765=1;
                  active[104]=1;
                  ends[104]=1;
                  tdone[104]=1;
                }
                else {
                  switch(S1760){
                    case 0 : 
                      if(plantConveyorActive_o.isACK()){//sysj/plant.sysj line: 374, column: 5
                        plantConveyorActive_o.setVal(true);//sysj/plant.sysj line: 374, column: 5
                        S1760=1;
                        if(!plantConveyorActive_o.isACK()){//sysj/plant.sysj line: 374, column: 5
                          plantConveyorActive_o.setREQ(false);//sysj/plant.sysj line: 374, column: 5
                          ends[104]=2;
                          ;//sysj/plant.sysj line: 374, column: 5
                          S1782=1;
                          active[104]=1;
                          ends[104]=1;
                          tdone[104]=1;
                        }
                        else {
                          active[104]=1;
                          ends[104]=1;
                          tdone[104]=1;
                        }
                      }
                      else {
                        active[104]=1;
                        ends[104]=1;
                        tdone[104]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!plantConveyorActive_o.isACK()){//sysj/plant.sysj line: 374, column: 5
                        plantConveyorActive_o.setREQ(false);//sysj/plant.sysj line: 374, column: 5
                        ends[104]=2;
                        ;//sysj/plant.sysj line: 374, column: 5
                        S1782=1;
                        active[104]=1;
                        ends[104]=1;
                        tdone[104]=1;
                      }
                      else {
                        active[104]=1;
                        ends[104]=1;
                        tdone[104]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S1765=1;
                S1765=0;
                if(!plantConveyorActive_o.isPartnerPresent() || plantConveyorActive_o.isPartnerPreempted()){//sysj/plant.sysj line: 374, column: 5
                  plantConveyorActive_o.setREQ(false);//sysj/plant.sysj line: 374, column: 5
                  S1765=1;
                  active[104]=1;
                  ends[104]=1;
                  tdone[104]=1;
                }
                else {
                  S1760=0;
                  if(plantConveyorActive_o.isACK()){//sysj/plant.sysj line: 374, column: 5
                    plantConveyorActive_o.setVal(true);//sysj/plant.sysj line: 374, column: 5
                    S1760=1;
                    if(!plantConveyorActive_o.isACK()){//sysj/plant.sysj line: 374, column: 5
                      plantConveyorActive_o.setREQ(false);//sysj/plant.sysj line: 374, column: 5
                      ends[104]=2;
                      ;//sysj/plant.sysj line: 374, column: 5
                      S1782=1;
                      active[104]=1;
                      ends[104]=1;
                      tdone[104]=1;
                    }
                    else {
                      active[104]=1;
                      ends[104]=1;
                      tdone[104]=1;
                    }
                  }
                  else {
                    active[104]=1;
                    ends[104]=1;
                    tdone[104]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S1782=1;
            S1782=0;
            if(motConveyorOnOff.getprestatus()){//sysj/plant.sysj line: 373, column: 13
              S1765=0;
              if(!plantConveyorActive_o.isPartnerPresent() || plantConveyorActive_o.isPartnerPreempted()){//sysj/plant.sysj line: 374, column: 5
                plantConveyorActive_o.setREQ(false);//sysj/plant.sysj line: 374, column: 5
                S1765=1;
                active[104]=1;
                ends[104]=1;
                tdone[104]=1;
              }
              else {
                S1760=0;
                if(plantConveyorActive_o.isACK()){//sysj/plant.sysj line: 374, column: 5
                  plantConveyorActive_o.setVal(true);//sysj/plant.sysj line: 374, column: 5
                  S1760=1;
                  if(!plantConveyorActive_o.isACK()){//sysj/plant.sysj line: 374, column: 5
                    plantConveyorActive_o.setREQ(false);//sysj/plant.sysj line: 374, column: 5
                    ends[104]=2;
                    ;//sysj/plant.sysj line: 374, column: 5
                    S1782=1;
                    active[104]=1;
                    ends[104]=1;
                    tdone[104]=1;
                  }
                  else {
                    active[104]=1;
                    ends[104]=1;
                    tdone[104]=1;
                  }
                }
                else {
                  active[104]=1;
                  ends[104]=1;
                  tdone[104]=1;
                }
              }
            }
            else {
              S1782=1;
              active[104]=1;
              ends[104]=1;
              tdone[104]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2398(int [] tdone, int [] ends){
        S2128=1;
    if(bottleAfter5_103.getprestatus()){//sysj/plant.sysj line: 423, column: 13
      bottleLeftPos5.setPresent();//sysj/plant.sysj line: 424, column: 5
      currsigs.addElement(bottleLeftPos5);
      active[114]=1;
      ends[114]=1;
      tdone[114]=1;
    }
    else {
      active[114]=1;
      ends[114]=1;
      tdone[114]=1;
    }
  }

  public void thread2397(int [] tdone, int [] ends){
        S2120=1;
    S2098=0;
    active[113]=1;
    ends[113]=1;
    tdone[113]=1;
  }

  public void thread2395(int [] tdone, int [] ends){
        S2086=1;
    S2038=0;
    S2022=0;
    if(!sentPos5_in.isPartnerPresent() || sentPos5_in.isPartnerPreempted()){//sysj/plant.sysj line: 8, column: 3
      sentPos5_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
      S2022=1;
      active[112]=1;
      ends[112]=1;
      tdone[112]=1;
    }
    else {
      S2017=0;
      if(!sentPos5_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
        sentPos5_in.setACK(true);//sysj/plant.sysj line: 8, column: 3
        S2017=1;
        if(sentPos5_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
          sentPos5_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
          ends[112]=2;
          ;//sysj/plant.sysj line: 8, column: 3
          spawnBottleAfter5_103.setPresent();//sysj/plant.sysj line: 9, column: 3
          currsigs.addElement(spawnBottleAfter5_103);
          S2038=1;
          active[112]=1;
          ends[112]=1;
          tdone[112]=1;
        }
        else {
          active[112]=1;
          ends[112]=1;
          tdone[112]=1;
        }
      }
      else {
        active[112]=1;
        ends[112]=1;
        tdone[112]=1;
      }
    }
  }

  public void thread2394(int [] tdone, int [] ends){
        active[111]=0;
    ends[111]=0;
    tdone[111]=1;
  }

  public void thread2393(int [] tdone, int [] ends){
        S2088=1;
    thread2394(tdone,ends);
    thread2395(tdone,ends);
    int biggest2396 = 0;
    if(ends[111]>=biggest2396){
      biggest2396=ends[111];
    }
    if(ends[112]>=biggest2396){
      biggest2396=ends[112];
    }
    if(biggest2396 == 1){
      active[110]=1;
      ends[110]=1;
      tdone[110]=1;
    }
  }

  public void thread2391(int [] tdone, int [] ends){
        S2011=1;
    S1963=0;
    S1947=0;
    if(!receivedPos1_in.isPartnerPresent() || receivedPos1_in.isPartnerPreempted()){//sysj/plant.sysj line: 8, column: 3
      receivedPos1_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
      S1947=1;
      active[109]=1;
      ends[109]=1;
      tdone[109]=1;
    }
    else {
      S1942=0;
      if(!receivedPos1_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
        receivedPos1_in.setACK(true);//sysj/plant.sysj line: 8, column: 3
        S1942=1;
        if(receivedPos1_in.isREQ()){//sysj/plant.sysj line: 8, column: 3
          receivedPos1_in.setACK(false);//sysj/plant.sysj line: 8, column: 3
          ends[109]=2;
          ;//sysj/plant.sysj line: 8, column: 3
          removeBeforePos1_103.setPresent();//sysj/plant.sysj line: 9, column: 3
          currsigs.addElement(removeBeforePos1_103);
          S1963=1;
          active[109]=1;
          ends[109]=1;
          tdone[109]=1;
        }
        else {
          active[109]=1;
          ends[109]=1;
          tdone[109]=1;
        }
      }
      else {
        active[109]=1;
        ends[109]=1;
        tdone[109]=1;
      }
    }
  }

  public void thread2390(int [] tdone, int [] ends){
        active[108]=0;
    ends[108]=0;
    tdone[108]=1;
  }

  public void thread2389(int [] tdone, int [] ends){
        S2013=1;
    thread2390(tdone,ends);
    thread2391(tdone,ends);
    int biggest2392 = 0;
    if(ends[108]>=biggest2392){
      biggest2392=ends[108];
    }
    if(ends[109]>=biggest2392){
      biggest2392=ends[109];
    }
    if(biggest2392 == 1){
      active[107]=1;
      ends[107]=1;
      tdone[107]=1;
    }
  }

  public void thread2388(int [] tdone, int [] ends){
        S1938=1;
    S1916=0;
    active[106]=1;
    ends[106]=1;
    tdone[106]=1;
  }

  public void thread2387(int [] tdone, int [] ends){
        S1906=1;
    S1856=0;
    if(bottleBeforePos1_103.getprestatus()){//sysj/plant.sysj line: 383, column: 13
      S1839=0;
      if(!plantConveyorBottleBeforePos1_o.isPartnerPresent() || plantConveyorBottleBeforePos1_o.isPartnerPreempted()){//sysj/plant.sysj line: 384, column: 5
        plantConveyorBottleBeforePos1_o.setREQ(false);//sysj/plant.sysj line: 384, column: 5
        S1839=1;
        active[105]=1;
        ends[105]=1;
        tdone[105]=1;
      }
      else {
        S1834=0;
        if(plantConveyorBottleBeforePos1_o.isACK()){//sysj/plant.sysj line: 384, column: 5
          plantConveyorBottleBeforePos1_o.setVal(true);//sysj/plant.sysj line: 384, column: 5
          S1834=1;
          if(!plantConveyorBottleBeforePos1_o.isACK()){//sysj/plant.sysj line: 384, column: 5
            plantConveyorBottleBeforePos1_o.setREQ(false);//sysj/plant.sysj line: 384, column: 5
            ends[105]=2;
            ;//sysj/plant.sysj line: 384, column: 5
            S1856=1;
            active[105]=1;
            ends[105]=1;
            tdone[105]=1;
          }
          else {
            active[105]=1;
            ends[105]=1;
            tdone[105]=1;
          }
        }
        else {
          active[105]=1;
          ends[105]=1;
          tdone[105]=1;
        }
      }
    }
    else {
      S1856=1;
      active[105]=1;
      ends[105]=1;
      tdone[105]=1;
    }
  }

  public void thread2386(int [] tdone, int [] ends){
        S1832=1;
    S1782=0;
    if(motConveyorOnOff.getprestatus()){//sysj/plant.sysj line: 373, column: 13
      S1765=0;
      if(!plantConveyorActive_o.isPartnerPresent() || plantConveyorActive_o.isPartnerPreempted()){//sysj/plant.sysj line: 374, column: 5
        plantConveyorActive_o.setREQ(false);//sysj/plant.sysj line: 374, column: 5
        S1765=1;
        active[104]=1;
        ends[104]=1;
        tdone[104]=1;
      }
      else {
        S1760=0;
        if(plantConveyorActive_o.isACK()){//sysj/plant.sysj line: 374, column: 5
          plantConveyorActive_o.setVal(true);//sysj/plant.sysj line: 374, column: 5
          S1760=1;
          if(!plantConveyorActive_o.isACK()){//sysj/plant.sysj line: 374, column: 5
            plantConveyorActive_o.setREQ(false);//sysj/plant.sysj line: 374, column: 5
            ends[104]=2;
            ;//sysj/plant.sysj line: 374, column: 5
            S1782=1;
            active[104]=1;
            ends[104]=1;
            tdone[104]=1;
          }
          else {
            active[104]=1;
            ends[104]=1;
            tdone[104]=1;
          }
        }
        else {
          active[104]=1;
          ends[104]=1;
          tdone[104]=1;
        }
      }
    }
    else {
      S1782=1;
      active[104]=1;
      ends[104]=1;
      tdone[104]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2130){
        case 0 : 
          S2130=0;
          break RUN;
        
        case 1 : 
          S2130=2;
          S2130=2;
          bottleBeforePos1_103.setClear();//sysj/plant.sysj line: 364, column: 2
          removeBeforePos1_103.setClear();//sysj/plant.sysj line: 365, column: 2
          spawnBottleAfter5_103.setClear();//sysj/plant.sysj line: 367, column: 2
          bottleAfter5_103.setClear();//sysj/plant.sysj line: 368, column: 2
          thread2386(tdone,ends);
          thread2387(tdone,ends);
          thread2388(tdone,ends);
          thread2389(tdone,ends);
          thread2393(tdone,ends);
          thread2397(tdone,ends);
          thread2398(tdone,ends);
          int biggest2399 = 0;
          if(ends[104]>=biggest2399){
            biggest2399=ends[104];
          }
          if(ends[105]>=biggest2399){
            biggest2399=ends[105];
          }
          if(ends[106]>=biggest2399){
            biggest2399=ends[106];
          }
          if(ends[107]>=biggest2399){
            biggest2399=ends[107];
          }
          if(ends[110]>=biggest2399){
            biggest2399=ends[110];
          }
          if(ends[113]>=biggest2399){
            biggest2399=ends[113];
          }
          if(ends[114]>=biggest2399){
            biggest2399=ends[114];
          }
          if(biggest2399 == 1){
            active[103]=1;
            ends[103]=1;
            break RUN;
          }
        
        case 2 : 
          bottleBeforePos1_103.setClear();//sysj/plant.sysj line: 364, column: 2
          removeBeforePos1_103.setClear();//sysj/plant.sysj line: 365, column: 2
          spawnBottleAfter5_103.setClear();//sysj/plant.sysj line: 367, column: 2
          bottleAfter5_103.setClear();//sysj/plant.sysj line: 368, column: 2
          thread2400(tdone,ends);
          thread2401(tdone,ends);
          thread2402(tdone,ends);
          thread2403(tdone,ends);
          thread2407(tdone,ends);
          thread2411(tdone,ends);
          thread2412(tdone,ends);
          int biggest2413 = 0;
          if(ends[104]>=biggest2413){
            biggest2413=ends[104];
          }
          if(ends[105]>=biggest2413){
            biggest2413=ends[105];
          }
          if(ends[106]>=biggest2413){
            biggest2413=ends[106];
          }
          if(ends[107]>=biggest2413){
            biggest2413=ends[107];
          }
          if(ends[110]>=biggest2413){
            biggest2413=ends[110];
          }
          if(ends[113]>=biggest2413){
            biggest2413=ends[113];
          }
          if(ends[114]>=biggest2413){
            biggest2413=ends[114];
          }
          if(biggest2413 == 1){
            active[103]=1;
            ends[103]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2413 == 0){
            S2130=0;
            active[103]=0;
            ends[103]=0;
            S2130=0;
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
    bottleBeforePos1_103 = new Signal();
    removeBeforePos1_103 = new Signal();
    spawnBottleAfter5_103 = new Signal();
    bottleAfter5_103 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[103] != 0){
      int index = 103;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[103]!=0 || suspended[103]!=0 || active[103]!=1);
      else{
        if(!df){
          receivedPos1_in.gethook();
          sentPos5_in.gethook();
          plantConveyorActive_o.gethook();
          plantConveyorBottleBeforePos1_o.gethook();
          motConveyorOnOff.gethook();
          spawnBottle.gethook();
          removeBottle.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      spawnBottle.setpreclear();
      removeBottle.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleBeforePos1_103.setpreclear();
      removeBeforePos1_103.setpreclear();
      spawnBottleAfter5_103.setpreclear();
      bottleAfter5_103.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = spawnBottle.getStatus() ? spawnBottle.setprepresent() : spawnBottle.setpreclear();
      spawnBottle.setpreval(spawnBottle.getValue());
      spawnBottle.setClear();
      dummyint = removeBottle.getStatus() ? removeBottle.setprepresent() : removeBottle.setpreclear();
      removeBottle.setpreval(removeBottle.getValue());
      removeBottle.setClear();
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
      bottleBeforePos1_103.setClear();
      removeBeforePos1_103.setClear();
      spawnBottleAfter5_103.setClear();
      bottleAfter5_103.setClear();
      receivedPos1_in.sethook();
      sentPos5_in.sethook();
      plantConveyorActive_o.sethook();
      plantConveyorBottleBeforePos1_o.sethook();
      if(paused[103]!=0 || suspended[103]!=0 || active[103]!=1);
      else{
        receivedPos1_in.gethook();
        sentPos5_in.gethook();
        plantConveyorActive_o.gethook();
        plantConveyorBottleBeforePos1_o.gethook();
        motConveyorOnOff.gethook();
        spawnBottle.gethook();
        removeBottle.gethook();
      }
      runFinisher();
      if(active[103] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

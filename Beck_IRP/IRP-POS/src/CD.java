import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import buffer.*;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 1, column: 1

public class CD extends ClockDomain{
  public CD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal incomingOrder = new Signal("incomingOrder", Signal.INPUT);
  public Signal absReady = new Signal("absReady", Signal.INPUT);
  public Signal absFault = new Signal("absFault", Signal.INPUT);
  public Signal outgoingOrder = new Signal("outgoingOrder", Signal.OUTPUT);
  public Signal returnMSG = new Signal("returnMSG", Signal.OUTPUT);
  private Signal orderBufferSignal_1;
  private String wholeInputString_thread_2;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 13, column: 3
  private .. test_thread_2;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 14, column: 3
  private Buffer firstTempBuffer_thread_2;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 16, column: 3
  private Buffer secondTempBuffer_thread_3;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 51, column: 3
  private String sendingString_thread_3;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 52, column: 3
  private Buffer orderBuffer_thread_4;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 86, column: 3
  private long __start_thread_2;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 20, column: 3
  private int S612 = 1;
  private int S324 = 1;
  private int S1 = 1;
  private int S7 = 1;
  private int S9 = 1;
  private int S608 = 1;
  private int S325 = 1;
  private int S361 = 1;
  private int S610 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread620(int [] tdone, int [] ends){
        switch(S610){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread619(int [] tdone, int [] ends){
        switch(S608){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S325){
          case 0 : 
            if(orderBufferSignal_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 54, column: 9
              S325=1;
              S361=0;
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
            if(absFault.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 57, column: 10
              S361=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              switch(S361){
                case 0 : 
                  if(absReady.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 58, column: 11
                    S361=1;
                    secondTempBuffer_thread_3 = (orderBufferSignal_1.getpreval() == null ? null : ((Buffer)orderBufferSignal_1.getpreval()));//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 62, column: 7
                    if(!secondTempBuffer_thread_3.isEmpty()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 64, column: 11
                      ends[3]=2;
                      ;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 60, column: 5
                      sendingString_thread_3 = (String)secondTempBuffer_thread_3.pop();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 75, column: 4
                      outgoingOrder.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 77, column: 4
                      currsigs.addElement(outgoingOrder);
                      outgoingOrder.setValue(sendingString_thread_3);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 77, column: 4
                      System.out.println("Emitted outgoingOrder");
                      orderBufferSignal_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 79, column: 4
                      currsigs.addElement(orderBufferSignal_1);
                      orderBufferSignal_1.setValue(secondTempBuffer_thread_3);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 79, column: 4
                      System.out.println("Emitted orderBufferSignal_1");
                      S361=2;
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
                  if(orderBufferSignal_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 67, column: 13
                    secondTempBuffer_thread_3 = (orderBufferSignal_1.getpreval() == null ? null : ((Buffer)orderBufferSignal_1.getpreval()));//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 62, column: 7
                    if(!secondTempBuffer_thread_3.isEmpty()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 64, column: 11
                      ends[3]=2;
                      ;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 60, column: 5
                      sendingString_thread_3 = (String)secondTempBuffer_thread_3.pop();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 75, column: 4
                      outgoingOrder.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 77, column: 4
                      currsigs.addElement(outgoingOrder);
                      outgoingOrder.setValue(sendingString_thread_3);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 77, column: 4
                      System.out.println("Emitted outgoingOrder");
                      orderBufferSignal_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 79, column: 4
                      currsigs.addElement(orderBufferSignal_1);
                      orderBufferSignal_1.setValue(secondTempBuffer_thread_3);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 79, column: 4
                      System.out.println("Emitted orderBufferSignal_1");
                      S361=2;
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
                
                case 2 : 
                  S361=2;
                  S361=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread618(int [] tdone, int [] ends){
        switch(S324){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1){
          case 0 : 
            if(orderBufferSignal_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 18, column: 9
              S1=1;
              S7=0;
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
            switch(S7){
              case 0 : 
                if(incomingOrder.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 22, column: 10
                  S7=1;
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
                if(!incomingOrder.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 23, column: 10
                  System.out.println("Got Order");//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 25, column: 4
                  returnMSG.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 26, column: 4
                  currsigs.addElement(returnMSG);
                  returnMSG.setValue("checking");//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 26, column: 4
                  System.out.println("Emitted returnMSG");
                  wholeInputString_thread_2 = (incomingOrder.getpreval() == null ? null : ((String)incomingOrder.getpreval()));//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 28, column: 4
                  firstTempBuffer_thread_2 = (orderBufferSignal_1.getpreval() == null ? null : ((Buffer)orderBufferSignal_1.getpreval()));//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 40, column: 4
                  firstTempBuffer_thread_2.push(wholeInputString_thread_2);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 41, column: 4
                  orderBufferSignal_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 42, column: 4
                  currsigs.addElement(orderBufferSignal_1);
                  orderBufferSignal_1.setValue(firstTempBuffer_thread_2);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 42, column: 4
                  System.out.println("Emitted orderBufferSignal_1");
                  S7=2;
                  __start_thread_2 = com.systemj.Timer.getMs();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 20, column: 3
                  S9=0;
                  if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 20, column: 3
                    ends[2]=2;
                    ;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 20, column: 3
                    returnMSG.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 46, column: 4
                    currsigs.addElement(returnMSG);
                    returnMSG.setValue("second tesh");//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 46, column: 4
                    System.out.println("Emitted returnMSG");
                    S7=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S9=1;
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
              
              case 2 : 
                switch(S9){
                  case 0 : 
                    S9=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 20, column: 3
                      ends[2]=2;
                      ;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 20, column: 3
                      returnMSG.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 46, column: 4
                      currsigs.addElement(returnMSG);
                      returnMSG.setValue("second tesh");//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 46, column: 4
                      System.out.println("Emitted returnMSG");
                      S7=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S9=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                  case 1 : 
                    S9=1;
                    S9=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 20, column: 3
                      ends[2]=2;
                      ;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 20, column: 3
                      returnMSG.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 46, column: 4
                      currsigs.addElement(returnMSG);
                      returnMSG.setValue("second tesh");//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 46, column: 4
                      System.out.println("Emitted returnMSG");
                      S7=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S9=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread616(int [] tdone, int [] ends){
        S610=1;
    orderBuffer_thread_4 = new Buffer(128);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 86, column: 3
    orderBufferSignal_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 87, column: 3
    currsigs.addElement(orderBufferSignal_1);
    orderBufferSignal_1.setValue(orderBuffer_thread_4);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 87, column: 3
    System.out.println("Emitted orderBufferSignal_1");
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread615(int [] tdone, int [] ends){
        S608=1;
            S325=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread614(int [] tdone, int [] ends){
        S324=1;
                S1=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S612){
        case 0 : 
          S612=0;
          break RUN;
        
        case 1 : 
          S612=2;
          S612=2;
          orderBufferSignal_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 9, column: 2
          thread614(tdone,ends);
          thread615(tdone,ends);
          thread616(tdone,ends);
          int biggest617 = 0;
          if(ends[2]>=biggest617){
            biggest617=ends[2];
          }
          if(ends[3]>=biggest617){
            biggest617=ends[3];
          }
          if(ends[4]>=biggest617){
            biggest617=ends[4];
          }
          if(biggest617 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          orderBufferSignal_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 9, column: 2
          thread618(tdone,ends);
          thread619(tdone,ends);
          thread620(tdone,ends);
          int biggest621 = 0;
          if(ends[2]>=biggest621){
            biggest621=ends[2];
          }
          if(ends[3]>=biggest621){
            biggest621=ends[3];
          }
          if(ends[4]>=biggest621){
            biggest621=ends[4];
          }
          if(biggest621 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest621 == 0){
            S612=0;
            active[1]=0;
            ends[1]=0;
            S612=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    orderBufferSignal_1 = new Signal();
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
          incomingOrder.gethook();
          absReady.gethook();
          absFault.gethook();
          df = true;
        }
        runClockDomain();
      }
      incomingOrder.setpreclear();
      absReady.setpreclear();
      absFault.setpreclear();
      outgoingOrder.setpreclear();
      returnMSG.setpreclear();
      orderBufferSignal_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = incomingOrder.getStatus() ? incomingOrder.setprepresent() : incomingOrder.setpreclear();
      incomingOrder.setpreval(incomingOrder.getValue());
      incomingOrder.setClear();
      dummyint = absReady.getStatus() ? absReady.setprepresent() : absReady.setpreclear();
      absReady.setpreval(absReady.getValue());
      absReady.setClear();
      dummyint = absFault.getStatus() ? absFault.setprepresent() : absFault.setpreclear();
      absFault.setpreval(absFault.getValue());
      absFault.setClear();
      outgoingOrder.sethook();
      outgoingOrder.setClear();
      returnMSG.sethook();
      returnMSG.setClear();
      orderBufferSignal_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        incomingOrder.gethook();
        absReady.gethook();
        absFault.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

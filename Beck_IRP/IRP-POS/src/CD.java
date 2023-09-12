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
  private Signal orderBufferSignal_1;
  private String wholeInputString_thread_2;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 13, column: 3
  private Buffer firstTempBuffer_thread_2;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 15, column: 3
  private Buffer secondTempBuffer_thread_3;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 44, column: 3
  private String sendingString_thread_3;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 45, column: 3
  private Buffer orderBuffer_thread_4;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 79, column: 3
  private int S316 = 1;
  private int S28 = 1;
  private int S1 = 1;
  private int S7 = 1;
  private int S312 = 1;
  private int S29 = 1;
  private int S65 = 1;
  private int S314 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread324(int [] tdone, int [] ends){
        switch(S314){
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

  public void thread323(int [] tdone, int [] ends){
        switch(S312){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S29){
          case 0 : 
            if(orderBufferSignal_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 47, column: 9
              S29=1;
              S65=0;
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
            if(absFault.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 50, column: 10
              S65=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              switch(S65){
                case 0 : 
                  if(absReady.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 51, column: 11
                    S65=1;
                    secondTempBuffer_thread_3 = (orderBufferSignal_1.getpreval() == null ? null : ((Buffer)orderBufferSignal_1.getpreval()));//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 55, column: 7
                    if(!secondTempBuffer_thread_3.isEmpty()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 57, column: 11
                      ends[3]=2;
                      ;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 53, column: 5
                      sendingString_thread_3 = (String)secondTempBuffer_thread_3.pop();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 68, column: 4
                      outgoingOrder.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 70, column: 4
                      currsigs.addElement(outgoingOrder);
                      outgoingOrder.setValue(sendingString_thread_3);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 70, column: 4
                      System.out.println("Emitted outgoingOrder");
                      orderBufferSignal_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 72, column: 4
                      currsigs.addElement(orderBufferSignal_1);
                      orderBufferSignal_1.setValue(secondTempBuffer_thread_3);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 72, column: 4
                      System.out.println("Emitted orderBufferSignal_1");
                      S65=2;
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
                  if(orderBufferSignal_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 60, column: 13
                    secondTempBuffer_thread_3 = (orderBufferSignal_1.getpreval() == null ? null : ((Buffer)orderBufferSignal_1.getpreval()));//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 55, column: 7
                    if(!secondTempBuffer_thread_3.isEmpty()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 57, column: 11
                      ends[3]=2;
                      ;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 53, column: 5
                      sendingString_thread_3 = (String)secondTempBuffer_thread_3.pop();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 68, column: 4
                      outgoingOrder.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 70, column: 4
                      currsigs.addElement(outgoingOrder);
                      outgoingOrder.setValue(sendingString_thread_3);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 70, column: 4
                      System.out.println("Emitted outgoingOrder");
                      orderBufferSignal_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 72, column: 4
                      currsigs.addElement(orderBufferSignal_1);
                      orderBufferSignal_1.setValue(secondTempBuffer_thread_3);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 72, column: 4
                      System.out.println("Emitted orderBufferSignal_1");
                      S65=2;
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
                  S65=2;
                  S65=0;
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

  public void thread322(int [] tdone, int [] ends){
        switch(S28){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1){
          case 0 : 
            if(orderBufferSignal_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 17, column: 9
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
                if(incomingOrder.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 21, column: 10
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
                if(!incomingOrder.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 22, column: 10
                  wholeInputString_thread_2 = (incomingOrder.getpreval() == null ? null : ((String)incomingOrder.getpreval()));//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 25, column: 4
                  firstTempBuffer_thread_2 = (orderBufferSignal_1.getpreval() == null ? null : ((Buffer)orderBufferSignal_1.getpreval()));//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 37, column: 4
                  firstTempBuffer_thread_2.push(wholeInputString_thread_2);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 38, column: 4
                  orderBufferSignal_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 39, column: 4
                  currsigs.addElement(orderBufferSignal_1);
                  orderBufferSignal_1.setValue(firstTempBuffer_thread_2);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 39, column: 4
                  System.out.println("Emitted orderBufferSignal_1");
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
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread320(int [] tdone, int [] ends){
        S314=1;
    orderBuffer_thread_4 = new Buffer(128);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 79, column: 3
    orderBufferSignal_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 80, column: 3
    currsigs.addElement(orderBufferSignal_1);
    orderBufferSignal_1.setValue(orderBuffer_thread_4);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 80, column: 3
    System.out.println("Emitted orderBufferSignal_1");
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread319(int [] tdone, int [] ends){
        S312=1;
            S29=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread318(int [] tdone, int [] ends){
        S28=1;
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
      switch(S316){
        case 0 : 
          S316=0;
          break RUN;
        
        case 1 : 
          S316=2;
          S316=2;
          orderBufferSignal_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 9, column: 2
          thread318(tdone,ends);
          thread319(tdone,ends);
          thread320(tdone,ends);
          int biggest321 = 0;
          if(ends[2]>=biggest321){
            biggest321=ends[2];
          }
          if(ends[3]>=biggest321){
            biggest321=ends[3];
          }
          if(ends[4]>=biggest321){
            biggest321=ends[4];
          }
          if(biggest321 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          orderBufferSignal_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 9, column: 2
          thread322(tdone,ends);
          thread323(tdone,ends);
          thread324(tdone,ends);
          int biggest325 = 0;
          if(ends[2]>=biggest325){
            biggest325=ends[2];
          }
          if(ends[3]>=biggest325){
            biggest325=ends[3];
          }
          if(ends[4]>=biggest325){
            biggest325=ends[4];
          }
          if(biggest325 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest325 == 0){
            S316=0;
            active[1]=0;
            ends[1]=0;
            S316=0;
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

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
  public Signal absBusy = new Signal("absBusy", Signal.INPUT);
  private Signal orderBufferSignal_1;
  private int[] inputOrderValues_thread_2;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 10, column: 3
  private String wholeInputString_thread_2;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 11, column: 3
  private String[] splitInputString_thread_2;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 12, column: 3
  private Buffer firstTempBuffer_thread_2;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 13, column: 3
  private Buffer secondTempBuffer_thread_3;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 38, column: 3
  private int[] numbers_thread_3;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 39, column: 3
  private Buffer orderBuffer_thread_4;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 52, column: 3
  private int S46 = 1;
  private int S28 = 1;
  private int S1 = 1;
  private int S7 = 1;
  private int S42 = 1;
  private int S44 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread54(int [] tdone, int [] ends){
        switch(S44){
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

  public void thread53(int [] tdone, int [] ends){
        switch(S42){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(orderBufferSignal_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 42, column: 10
          secondTempBuffer_thread_3 = (orderBufferSignal_1.getpreval() == null ? null : ((Buffer)orderBufferSignal_1.getpreval()));//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 43, column: 4
          if(!secondTempBuffer_thread_3.isEmpty()) {//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 44, column: 37
            numbers_thread_3 = (int[]) secondTempBuffer_thread_3.pop();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 45, column: 5
            System.out.println(numbers_thread_3[1]);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 46, column: 5
          }
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

  public void thread52(int [] tdone, int [] ends){
        switch(S28){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1){
          case 0 : 
            if(orderBufferSignal_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 15, column: 9
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
                if(incomingOrder.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 19, column: 10
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
                if(!incomingOrder.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 20, column: 10
                  wholeInputString_thread_2 = (incomingOrder.getpreval() == null ? null : ((String)incomingOrder.getpreval()));//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 23, column: 4
                  splitInputString_thread_2 = wholeInputString_thread_2.split(",", 0);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 24, column: 4
                  for(int i_thread_2 = 0; i_thread_2 < 5; i_thread_2 = i_thread_2 + 1) {//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 26, column: 28
                    inputOrderValues_thread_2[i_thread_2] = Integer.parseInt(splitInputString_thread_2[i_thread_2]);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 27, column: 5
                  }
                  firstTempBuffer_thread_2 = (orderBufferSignal_1.getpreval() == null ? null : ((Buffer)orderBufferSignal_1.getpreval()));//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 30, column: 4
                  firstTempBuffer_thread_2.push(inputOrderValues_thread_2);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 31, column: 4
                  orderBufferSignal_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 32, column: 4
                  currsigs.addElement(orderBufferSignal_1);
                  orderBufferSignal_1.setValue(firstTempBuffer_thread_2);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 32, column: 4
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

  public void thread50(int [] tdone, int [] ends){
        S44=1;
    orderBuffer_thread_4 = new Buffer(128);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 52, column: 3
    orderBufferSignal_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 53, column: 3
    currsigs.addElement(orderBufferSignal_1);
    orderBufferSignal_1.setValue(orderBuffer_thread_4);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 53, column: 3
    System.out.println("Emitted orderBufferSignal_1");
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread49(int [] tdone, int [] ends){
        S42=1;
        numbers_thread_3 = new int[5];//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 39, column: 3
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread48(int [] tdone, int [] ends){
        S28=1;
    inputOrderValues_thread_2 = new int[5];//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 10, column: 3
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
      switch(S46){
        case 0 : 
          S46=0;
          break RUN;
        
        case 1 : 
          S46=2;
          S46=2;
          orderBufferSignal_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 8, column: 2
          thread48(tdone,ends);
          thread49(tdone,ends);
          thread50(tdone,ends);
          int biggest51 = 0;
          if(ends[2]>=biggest51){
            biggest51=ends[2];
          }
          if(ends[3]>=biggest51){
            biggest51=ends[3];
          }
          if(ends[4]>=biggest51){
            biggest51=ends[4];
          }
          if(biggest51 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          orderBufferSignal_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 8, column: 2
          thread52(tdone,ends);
          thread53(tdone,ends);
          thread54(tdone,ends);
          int biggest55 = 0;
          if(ends[2]>=biggest55){
            biggest55=ends[2];
          }
          if(ends[3]>=biggest55){
            biggest55=ends[3];
          }
          if(ends[4]>=biggest55){
            biggest55=ends[4];
          }
          if(biggest55 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest55 == 0){
            S46=0;
            active[1]=0;
            ends[1]=0;
            S46=0;
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
          absBusy.gethook();
          df = true;
        }
        runClockDomain();
      }
      incomingOrder.setpreclear();
      absBusy.setpreclear();
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
      dummyint = absBusy.getStatus() ? absBusy.setprepresent() : absBusy.setpreclear();
      absBusy.setpreval(absBusy.getValue());
      absBusy.setClear();
      orderBufferSignal_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        incomingOrder.gethook();
        absBusy.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

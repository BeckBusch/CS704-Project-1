import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import buffer.Buffer;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 1, column: 1

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
  private Signal addToBuffer_1;
  private Signal bufferOutput_1;
  private Signal removeFromBuffer_1;
  private String wholeInputString_thread_2;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 14, column: 3
  private String sendingString_thread_3;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 30, column: 3
  private String inputHolder_thread_4;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 65, column: 2
  private String outputHolder_thread_4;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 65, column: 2
  private Buffer orderBuffer_thread_4;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 67, column: 3
  private int S505 = 1;
  private int S31 = 1;
  private int S6 = 1;
  private int S10 = 1;
  private int S411 = 1;
  private int S34 = 1;
  private int S80 = 1;
  private int S38 = 1;
  private int S503 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread513(int [] tdone, int [] ends){
        switch(S503){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(addToBuffer_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 74, column: 12
          inputHolder_thread_4 = (addToBuffer_1.getpreval() == null ? null : ((String)addToBuffer_1.getpreval()));//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 75, column: 5
          orderBuffer_thread_4.push(inputHolder_thread_4);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 76, column: 5
          if(removeFromBuffer_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 79, column: 12
            if(orderBuffer_thread_4.isEmpty()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 80, column: 5
              outputHolder_thread_4 = "";//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 81, column: 6
              bufferOutput_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 82, column: 6
              currsigs.addElement(bufferOutput_1);
              bufferOutput_1.setValue(outputHolder_thread_4);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 82, column: 6
              System.out.println("Emitted bufferOutput_1");
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              outputHolder_thread_4 = (String)orderBuffer_thread_4.pop();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 84, column: 6
              bufferOutput_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 85, column: 6
              currsigs.addElement(bufferOutput_1);
              bufferOutput_1.setValue(outputHolder_thread_4);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 85, column: 6
              System.out.println("Emitted bufferOutput_1");
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
          }
          else {
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
        else {
          if(removeFromBuffer_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 79, column: 12
            if(orderBuffer_thread_4.isEmpty()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 80, column: 5
              outputHolder_thread_4 = "";//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 81, column: 6
              bufferOutput_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 82, column: 6
              currsigs.addElement(bufferOutput_1);
              bufferOutput_1.setValue(outputHolder_thread_4);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 82, column: 6
              System.out.println("Emitted bufferOutput_1");
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              outputHolder_thread_4 = (String)orderBuffer_thread_4.pop();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 84, column: 6
              bufferOutput_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 85, column: 6
              currsigs.addElement(bufferOutput_1);
              bufferOutput_1.setValue(outputHolder_thread_4);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 85, column: 6
              System.out.println("Emitted bufferOutput_1");
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
          }
          else {
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
        break;
      
    }
  }

  public void thread512(int [] tdone, int [] ends){
        switch(S411){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S34){
          case 0 : 
            if(orderBufferSignal_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 32, column: 9
              S34=1;
              S80=0;
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
            if(absFault.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 35, column: 10
              S80=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              switch(S80){
                case 0 : 
                  if(absReady.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 36, column: 11
                    S80=1;
                    removeFromBuffer_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 40, column: 7
                    currsigs.addElement(removeFromBuffer_1);
                    System.out.println("Emitted removeFromBuffer_1");
                    S38=0;
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
                  switch(S38){
                    case 0 : 
                      if(bufferOutput_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 41, column: 13
                        sendingString_thread_3 = (bufferOutput_1.getpreval() == null ? null : ((String)bufferOutput_1.getpreval()));//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 42, column: 7
                        S38=1;
                        if(!(sendingString_thread_3.isEmpty())){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 44, column: 11
                          ends[3]=2;
                          ;//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 38, column: 5
                          outgoingOrder.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 56, column: 4
                          currsigs.addElement(outgoingOrder);
                          outgoingOrder.setValue(sendingString_thread_3);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 56, column: 4
                          System.out.println("Emitted outgoingOrder");
                          returnMSG.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 58, column: 4
                          currsigs.addElement(returnMSG);
                          returnMSG.setValue("Order Procesing");//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 58, column: 4
                          System.out.println("Emitted returnMSG");
                          S80=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S38=2;
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
                      removeFromBuffer_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 40, column: 7
                      currsigs.addElement(removeFromBuffer_1);
                      System.out.println("Emitted removeFromBuffer_1");
                      S38=0;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                    case 2 : 
                      if(addToBuffer_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 47, column: 13
                        removeFromBuffer_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 40, column: 7
                        currsigs.addElement(removeFromBuffer_1);
                        System.out.println("Emitted removeFromBuffer_1");
                        S38=0;
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
                  break;
                
                case 2 : 
                  S80=2;
                  S80=0;
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

  public void thread511(int [] tdone, int [] ends){
        switch(S31){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S6){
          case 0 : 
            if(orderBufferSignal_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 16, column: 9
              S6=1;
              S10=0;
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
            switch(S10){
              case 0 : 
                if(incomingOrder.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 19, column: 10
                  S10=1;
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
                  wholeInputString_thread_2 = (incomingOrder.getpreval() == null ? null : ((String)incomingOrder.getpreval()));//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 22, column: 4
                  addToBuffer_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 23, column: 4
                  currsigs.addElement(addToBuffer_1);
                  addToBuffer_1.setValue(wholeInputString_thread_2);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 23, column: 4
                  System.out.println("Emitted addToBuffer_1");
                  returnMSG.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 25, column: 4
                  currsigs.addElement(returnMSG);
                  returnMSG.setValue("Order Received");//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 25, column: 4
                  System.out.println("Emitted returnMSG");
                  S10=0;
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

  public void thread509(int [] tdone, int [] ends){
        S503=1;
            orderBuffer_thread_4 = new Buffer(128);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 67, column: 3
    returnMSG.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 69, column: 3
    currsigs.addElement(returnMSG);
    returnMSG.setValue("POS Sub-System Ready");//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 69, column: 3
    System.out.println("Emitted returnMSG");
    orderBufferSignal_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 71, column: 3
    currsigs.addElement(orderBufferSignal_1);
    System.out.println("Emitted orderBufferSignal_1");
    if(addToBuffer_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 74, column: 12
      inputHolder_thread_4 = (addToBuffer_1.getpreval() == null ? null : ((String)addToBuffer_1.getpreval()));//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 75, column: 5
      orderBuffer_thread_4.push(inputHolder_thread_4);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 76, column: 5
      if(removeFromBuffer_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 79, column: 12
        if(orderBuffer_thread_4.isEmpty()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 80, column: 5
          outputHolder_thread_4 = "";//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 81, column: 6
          bufferOutput_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 82, column: 6
          currsigs.addElement(bufferOutput_1);
          bufferOutput_1.setValue(outputHolder_thread_4);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 82, column: 6
          System.out.println("Emitted bufferOutput_1");
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          outputHolder_thread_4 = (String)orderBuffer_thread_4.pop();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 84, column: 6
          bufferOutput_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 85, column: 6
          currsigs.addElement(bufferOutput_1);
          bufferOutput_1.setValue(outputHolder_thread_4);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 85, column: 6
          System.out.println("Emitted bufferOutput_1");
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
      }
      else {
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      if(removeFromBuffer_1.getprestatus()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 79, column: 12
        if(orderBuffer_thread_4.isEmpty()){//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 80, column: 5
          outputHolder_thread_4 = "";//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 81, column: 6
          bufferOutput_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 82, column: 6
          currsigs.addElement(bufferOutput_1);
          bufferOutput_1.setValue(outputHolder_thread_4);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 82, column: 6
          System.out.println("Emitted bufferOutput_1");
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          outputHolder_thread_4 = (String)orderBuffer_thread_4.pop();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 84, column: 6
          bufferOutput_1.setPresent();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 85, column: 6
          currsigs.addElement(bufferOutput_1);
          bufferOutput_1.setValue(outputHolder_thread_4);//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 85, column: 6
          System.out.println("Emitted bufferOutput_1");
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
      }
      else {
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread508(int [] tdone, int [] ends){
        S411=1;
        S34=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread507(int [] tdone, int [] ends){
        S31=1;
        S6=0;
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
      switch(S505){
        case 0 : 
          S505=0;
          break RUN;
        
        case 1 : 
          S505=2;
          S505=2;
          orderBufferSignal_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 9, column: 2
          addToBuffer_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 10, column: 2
          bufferOutput_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 10, column: 2
          removeFromBuffer_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 11, column: 2
          thread507(tdone,ends);
          thread508(tdone,ends);
          thread509(tdone,ends);
          int biggest510 = 0;
          if(ends[2]>=biggest510){
            biggest510=ends[2];
          }
          if(ends[3]>=biggest510){
            biggest510=ends[3];
          }
          if(ends[4]>=biggest510){
            biggest510=ends[4];
          }
          if(biggest510 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          orderBufferSignal_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 9, column: 2
          addToBuffer_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 10, column: 2
          bufferOutput_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 10, column: 2
          removeFromBuffer_1.setClear();//C:\Users\beckb\Documents\GitHub\CS704-Project-1\Beck_IRP\IRP-POS\sysj\POS.sysj line: 11, column: 2
          thread511(tdone,ends);
          thread512(tdone,ends);
          thread513(tdone,ends);
          int biggest514 = 0;
          if(ends[2]>=biggest514){
            biggest514=ends[2];
          }
          if(ends[3]>=biggest514){
            biggest514=ends[3];
          }
          if(ends[4]>=biggest514){
            biggest514=ends[4];
          }
          if(biggest514 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest514 == 0){
            S505=0;
            active[1]=0;
            ends[1]=0;
            S505=0;
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
    addToBuffer_1 = new Signal();
    bufferOutput_1 = new Signal();
    removeFromBuffer_1 = new Signal();
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
      addToBuffer_1.setpreclear();
      bufferOutput_1.setpreclear();
      removeFromBuffer_1.setpreclear();
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
      addToBuffer_1.setClear();
      bufferOutput_1.setClear();
      removeFromBuffer_1.setClear();
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

package com.withsynchronization;

public class Thread2 extends Thread{
  Print print;
  Thread2(Print print){
    this.print = print;
  }
  public void run(){
    print.printTable(100);
  }
}

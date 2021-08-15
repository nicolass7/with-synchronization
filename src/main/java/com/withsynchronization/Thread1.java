package com.withsynchronization;

public class Thread1 extends Thread{
  Print print;
  Thread1(Print print){
    this.print = print;
  }
  public void run(){
    print.printTable(5);
  }
}

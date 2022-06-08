package com.example.practice.Certification.designPattern.State;

public class ModeSwitch {
  private ModeState modeState = new ModeStateLight();

  public void setState (ModeState modeState) {
    this.modeState = modeState;
  }
  
  //여기서 if문으로 진행할 수도 있다.
  public void onSwitch () {
    modeState.toggle(this);
  }
}
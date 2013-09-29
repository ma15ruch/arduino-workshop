#include <Servo.h>

//intializing objects
Servo leftWheel;
Servo rightWheel;
//end init obj

int lwpin = 10;
int rwpin = 11;

void setup() {
  leftWheel.attach(lwpin);
  rightWheel.attach(rwpin);  
}


void loop() 
{
  go_forward(); 
  delay(1000);//save the arduino
  go_backward(); 
  delay(1000);//save the arduino
  steerLeft();
    delay(1000);//save the arduino
  steerRight();
    delay(1000);//save the arduino
  turnLeft();
    delay(1000);//save the arduino
  turnRight();
    delay(1000);//save the arduino

}

void go_forward()
{
  leftWheel.write(180);
  rightWheel.write(0);
}

void go_backward()
{
  leftWheel.write(0);
  rightWheel.write(180);
}

void steerLeft()
{
  leftWheel.write(95);
  rightWheel.write(0);
}

void steerRight()
{
  leftWheel.write(180);
  rightWheel.write(85);
}

void turnLeft()
{
  leftWheel.write(0);
  rightWheel.write(0);
}

void turnRight()
{
  leftWheel.write(180);
  rightWheel.write(180);
}


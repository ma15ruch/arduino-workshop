#include <Servo.h>

//initializing objects
Servo leftWheel;
Servo rightWheel;
//end initializing objects

//objective to get this go in a square pattern.

int lwpin = 11;
int rwpin = 10;

void setup()
{
leftWheel.attach(lwpin);
rightWheel.attach(rwpin);
}

void loop()
{
  go_forward();
}

void go_forward()
{
  //right wheel is greater than 90 degrees makes wheel go backwards/counter-clockwise
  //left wheel is greater than 90 degrees makes wheel go forwards/clockwise

  leftWheel.write(100);
  rightWheel.write(80);
  delay(10);
}

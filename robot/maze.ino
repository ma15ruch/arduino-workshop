#include <Servo.h>

//intializing objects
Servo leftWheel;
Servo rightWheel;
//end init obj

int lwpin = 10;
int rwpin = 11;

//ultrasonic variables start here
long echotime;
float cm;
int echopin=4;
int trigpin=2;

float scan360[4];

float distance;

void setup()
{
  //leftWheel.attach(lwpin);
  //rightWheel.attach(rwpin); 

  Serial.begin(9600);

  pinMode(trigpin,OUTPUT);
  pinMode(echopin,INPUT);
}


void loop() 
{
  for (int i = 0; i < 4; ++i)
  {
    turnRight();
    delay(390);
    Stop();
    delay(500);
    scan360[i] = echolocation();
    Serial.println(scan360[i]);
    delay(10); 
  }

  int Max;
  for (int i = 0; i<3; ++i)
  {
    if(scan360[i] >scan360[i+1])
    {
      Max=i; 
    }
    else
    {
      Max = i+1; 
    }
  }
  switch(Max)
  {
    case 0; break;
    case 1; break;
    case 2; break;
    case 3; break;

  }
}

void go_forward()
{
  attachWheels();
  leftWheel.write(180);
  rightWheel.write(0);
}

void go_backward()
{
  attachWheels();
  leftWheel.write(0);
  rightWheel.write(180);
}

void steerLeft()
{
  attachWheels();
  leftWheel.write(95);
  rightWheel.write(0);
}

void steerRight()
{
  attachWheels();
  leftWheel.write(180);
  rightWheel.write(85);
}

void turnLeft()
{
  attachWheels();
  leftWheel.write(0);
  rightWheel.write(0);
}

void turnRight()
{
  attachWheels();
  leftWheel.write(180);
  rightWheel.write(180);
}

float echolocation()
{
  //trigerring trig pin
  digitalWrite(trigpin,LOW);
  delayMicroseconds(4);
  digitalWrite(trigpin,HIGH);
  delayMicroseconds(10);
  digitalWrite(trigpin,LOW);
  //end trigger trig pin 
  //begim measuring echotime
  echotime=pulseIn(echopin,HIGH);
  //end measuring echotime
  //begin calculating distance in cm
  cm=echotime*0.01715;
  //end calculating distance in cm
  return cm;
}

void attachWheels()
{
  leftWheel.attach(lwpin);
  rightWheel.attach(rwpin);  
}

void Stop(int t)
{
  leftWheel.detach();
  rightWheel.detach(); 
  delay(t);
}
void Stop()
{
  leftWheel.detach();
  rightWheel.detach(); 
}

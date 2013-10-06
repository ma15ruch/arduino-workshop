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

float distance;
void setup()
{
  leftWheel.attach(lwpin);
  rightWheel.attach(rwpin); 
  
  Serial.begin(9600);
 
 pinMode(trigpin,OUTPUT);
 pinMode(echopin,INPUT);
}


void loop() 
{
  /*go_forward(); 
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
    delay(1000);//save the arduino*/
    
    distance = echolocation();
Serial.println(echolocation());
  delay(10);
  
  if(distance < 60)
  {
    turnLeft();
    delay(500);
  }
  else
  {
    go_forward();
  }
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



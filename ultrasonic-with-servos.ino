#include <Servo.h>

Servo bob;
Servo arty;

int sensorRead1;
int sensorRead2;

int bobAngle;
int artyAngle;

//ultrasonic variables start here
long echotime;
float cm;
int echopin=4;
int trigpin=2;

void setup()
{
  bob.attach(11);  
 arty.attach(10);
 
 Serial.begin(9600);
 
 pinMode(trigpin,OUTPUT);
 pinMode(echopin,INPUT);
 
 
}

void loop()
{
 //bobmove
  sensorRead1 = analogRead(A0);
  
  Serial.print(sensorRead1);
  Serial.print(" bob \n");
  
  bobAngle = map(sensorRead1, 0, 586, 0, 180);
  bob.write(bobAngle);
  //endbobmove
  
  sensorRead2 = analogRead(A1);
  
  Serial.print(sensorRead2);
  Serial.print(" arty \n");
  
  artyAngle = map(sensorRead2, 0, 566, 0, 180);
  arty.write(artyAngle);
  
  Serial.println(echolocation());
    delay(10);

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

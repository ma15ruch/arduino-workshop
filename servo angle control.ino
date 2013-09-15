
#include <Servo.h>

Servo bob;
Servo arty;

int sensorRead1;

int bobAngle;
void setup()
{
  

  bob.attach(11);  
 
 Serial.begin(9600);
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
  
  delay(10);
}


#include <Servo.h>

Servo bob;
Servo arty;

int sensorRead1;
int sensorRead2;

int bobAngle;
int artyAngle;
void setup()
{
  

  bob.attach(11);  
 arty.attach(10);
 
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
  
  sensorRead2 = analogRead(A1);
  
  Serial.print(sensorRead2);
  Serial.print(" arty \n");
  
  artyAngle = map(sensorRead2, 0, 566, 0, 180);
  arty.write(artyAngle);
  
  
  delay(10);
}


#include <Servo.h>



int sensorRead;

void setup()
{
  

 Serial.begin(9600);
}

void loop()
{
  sensorRead = analogRead(A0);
  Serial.println(sensorRead);
  delay(100);
  
}

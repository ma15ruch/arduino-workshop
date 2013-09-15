
#include <Servo.h>

Servo bob;
Servo arty;

void setup()
{
 bob.attach(11);  
 arty.attach(10);
}

void loop()
{
bob.write(0);
arty.write(0);
  delay(1000);
  
 arty.write(90);
   delay(1000);
  bob.write(180);
   delay(1000);
   arty.write(0);
   delay(1000);
  bob.write(0);
   delay(1000);
}

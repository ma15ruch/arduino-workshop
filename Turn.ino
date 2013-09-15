
#include <Servo.h>

Servo bob;

void setup()
{
 bob.attach(11);  
}

void loop()
{
bob.write(90);
  delay(1000);
  bob.write(180);
  delay(1000);
}

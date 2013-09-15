void setup()
{
 pinMode(13,OUTPUT);
  Serial.begin(9600);
}

void loop()
{
 digitalWrite(13,HIGH);
 Serial.println("pin 13 is high");
 delay(1000);
 digitalWrite(13,LOW);
  Serial.println("pin 13 is low");
delay(1000);
}

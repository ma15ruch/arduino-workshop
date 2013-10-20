int relay0 = 3;
int relay1 = 6;

void setup()
{
  pinMode(relay0,OUTPUT);
  digitalWrite(relay0, LOW);
  pinMode(relay1,OUTPUT);
  digitalWrite(relay1, LOW);

  Serial.begin(9600);
}

void loop()
{
  char c = Serial.read();
  if (c == 'b')
  {
    Blink();
  } 
  if (c == 'n')
  {
    Blink2(); 
  }
}

void Blink()
{
  digitalWrite(relay0,HIGH);
  delay(1000);
  digitalWrite(relay0,LOW);
  delay(1000);
}

void Blink2()
{
  digitalWrite(relay1,HIGH);
  delay(1000);
  digitalWrite(relay1,LOW);
  delay(1000);
}

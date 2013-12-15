void setup()
{
Serial.begin(9600);
}

void loop()
{
  char c = Serial.read();
  if (c == 'q')//f
  {
    tone(8,87,100);
  }
  
  if (c == 'w')
  {
    tone(8,98,100);
  }
  
  if (c == 'e')
  {
    tone(8,110,100);
  }
  
  if (c == 'r')
  {
    tone(8,123,100);
  }
  
  if (c == 't')//c
  {
    tone(8,131,100);
  }
  
  if (c == 'y')
  {
    tone(8,147,100);
  }
  
  if (c == 'u')
  {
    tone(8,165,100);
  }
  
  if (c == 'i')
  {
    tone(8,175,100);
  }
  
  if (c == 'o')
  {
    tone(8,196,100);
  }
  
  if (c == 'p')//a
  {
    tone(8,220,100);
  }
}


//ultrasonic variables start here
long echotime;
float cm;
int echopin=4;
int trigpin=2;

void setup()
{
   Serial.begin(9600);
 
 pinMode(trigpin,OUTPUT);
 pinMode(echopin,INPUT);
}

void loop()
{
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

//the time we give the sensor to calibrate (10-60 secs according to the datasheet)
int calibrationTime = 30;            

//the amount of milliseconds the sensor has to be low 
//before we assume all motion has stopped
long unsigned int pause = 5000;  

int pirPin = 4;    //the digital pin connected to the PIR sensor's output
int ledPin = 3;
int ledPin2 = 2;

void setup(){
  Serial.begin(9600);
  pinMode(pirPin, INPUT);
  pinMode(ledPin, OUTPUT);
  pinMode(ledPin2, OUTPUT);
  digitalWrite(pirPin, LOW);

  //give the sensor some time to calibrate
  Serial.print("calibrating sensor ");
  for(int i = 0; i < calibrationTime; i++)
  {
    Serial.print(".");
    delay(1000);
  }
  Serial.println(" done");
  Serial.println("SENSOR ACTIVE");
  delay(50);
}


void loop(){

  if(digitalRead(pirPin) == HIGH)
  {
    digitalWrite(ledPin, HIGH);   //the led visualizes the sensors output pin state
    digitalWrite(ledPin2, HIGH);  
  }


  if(digitalRead(pirPin) == LOW){       
    digitalWrite(ledPin, LOW);  //the led visualizes the sensors output pin state
    digitalWrite(ledPin2, LOW);
  }
}




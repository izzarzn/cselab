//Co Detection-MQ-7 Sensor//
const int red=11;
const int green=8;
const int blue=10;
void setup() {
  // put your setup code here, to run once:
   pinMode(green,OUTPUT);//GREEN
   pinMode(9,OUTPUT);//GROUND
   pinMode(blue,OUTPUT);//BLUE
   pinMode(red,OUTPUT);//RED
   digitalWrite(9,LOW);
   Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
   int sensorValue = analogRead(A0);
   Serial.println(sensorValue);
  delay(20);
   if(sensorValue>500)
   {
    digitalWrite(green,HIGH);
    digitalWrite(blue,LOW);
    digitalWrite(red,LOW);
   }
   else{
    digitalWrite(green,LOW);
    digitalWrite(blue,LOW);
    digitalWrite(red,HIGH);
   }
}

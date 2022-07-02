//Co Detection-MQ-7 Sensor//
const int red=3;
const int green=0;
const int blue=2;
void setup() {
  // put your setup code here, to run once:
   pinMode(green,OUTPUT);//GREEN
   pinMode(1,OUTPUT);//GROUND
   pinMode(blue,OUTPUT);//BLUE
   pinMode(red,OUTPUT);//RED
   digitalWrite(1,LOW);
   Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
   int sensorValue = analogRead(A0);
   Serial.println(sensorValue);
  delay(20);
   if(sensorValue<500)
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

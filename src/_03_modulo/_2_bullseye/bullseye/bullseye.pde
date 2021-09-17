
void setup() {
 
  // set the size of your sketch
  size(800,800);
}

void draw() {

  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
    for(int i = 8; i > 0; i--){
  //Use an if statement and modulo to alternate the color of your rings.
  if(i % 2 == 0){
   fill(255,0,0); 
  } else {
    fill(0,0,255);
  }
   ellipse(400,400, i * 100, i * 100);
  
    }
}

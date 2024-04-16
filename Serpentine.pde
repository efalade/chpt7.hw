private int x, y;
private int speedX, speedY;

// Runs when the program is first launched
public void setup() {
  
  // Set the window size
  size(800, 800);
  
  this.x = width/2; //<>//
  this.y = height/2;
  this.speedX = 0;
  this.speedY = 0;
  
  frameRate(20);
}


// Runs repeatedly while the program is running
public void draw() { 
  background(51);

  fill(50, 205, 50);  
  square(x, y, 20); //<>//

  if (speedX != 0) {
    x += speedX;
  } else if (speedY != 0) {
    y += speedY;
  }
}



// ==================================================
// Inputs
// ==================================================

public void keyPressed() { 
  if (key==CODED) {
    if (keyCode==UP) {
      speedY = -20;
      speedX = 0;
    }
    if (keyCode==DOWN) {
      speedY = 20;
      speedX = 0;
    }
    if (keyCode==LEFT) {
      speedX = -20;
      speedY = 0;
    }
    if (keyCode==RIGHT) {
      speedX = 20;
      speedY = 0;
    }
  }
}

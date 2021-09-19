// Die CLASS that represents a single die
class Die {
  int randomVal;
  color dieColor;
  color dieEyesColor;
  
  // CONSTRUCTOR: color for the die and eyes
  Die() {
    dieColor = #E5DF20; //#FFFFFF   // White color
    dieEyesColor = #030303;   // Black color
  }
  
  // ROLL method: assigns random values to the die
  void roll() {
    if (keyCode == ENTER) {
    randomVal = (int(random(6)+1)); 
    //println(randomVal);
    }
  }
  
  // DRAW Method: draw die on screen
  void draw(int x, int y, int size) {
    fill(dieColor);
    rectMode(CENTER);
    rect(x, y, size, size);
    
    // draw n EYES
    switch (randomVal) {
      case 1:
        fill(dieEyesColor);
        ellipse(x, y, 10, 10);          // Middle
        break;
      case 2:
        fill(dieEyesColor);
        ellipse(x-15, y-15, 10, 10);    // Top left
        ellipse(x+15, y+15, 10, 10);    // Bottom right
        break;
      case 3:
        fill(dieEyesColor);
        ellipse(x-15, y-15, 10, 10);    // Top left
        ellipse(x, y, 10, 10);          // Middle
        ellipse(x+15, y+15, 10, 10);    // Bottom right
        break;
      case 4:
        fill(dieEyesColor);
        ellipse(x-15, y-15, 10, 10);    // Top left
        ellipse(x-15, y+15, 10, 10);    // Bottom left
        ellipse(x+15, y+15, 10, 10);    // Bottom right
        ellipse(x+15, y-15, 10, 10);    // Top right
        break;
      case 5:
        fill(dieEyesColor);
        ellipse(x-15, y-15, 10, 10);    // Top left
        ellipse(x-15, y+15, 10, 10);    // Bottom left
        ellipse(x, y, 10, 10);          // Middle
        ellipse(x+15, y+15, 10, 10);    // Bottom right
        ellipse(x+15, y-15, 10, 10);    // Top right
        break;
      case 6:
        fill(dieEyesColor);
        ellipse(x-15, y-15, 10, 10);    // Top left
        ellipse(x-15, y, 10, 10);       // Middle left
        ellipse(x-15, y+15, 10, 10);    // Bottom left
        ellipse(x+15, y+15, 10, 10);    // Bottom right
        ellipse(x+15, y, 10, 10);       // Middle right
        ellipse(x+15, y-15, 10, 10);    // Top right
        break;     
    }
  }
  
}

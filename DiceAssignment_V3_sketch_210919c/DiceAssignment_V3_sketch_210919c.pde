Die myDie;
DiceCup myDiceCup;

void setup() {
  size(600, 360);
  // Initialize the Die object
  //myDie = new Die(); // Calling constructor
  myDiceCup = new DiceCup();
  myDiceCup.addDie(new Die());
  myDiceCup.shake();
  
  
  
}

void draw() {
  background(255);
  // Operate Die object
  myDiceCup.draw(50, 50, 50);
}

void keyPressed() {
  myDiceCup.shake();
}

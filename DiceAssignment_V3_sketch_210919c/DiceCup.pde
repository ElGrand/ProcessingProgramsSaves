class DiceCup {
  Die[] diceCup;
  
  DiceCup() {
    // Initialize the Cup
    diceCup = new Die[4];
  }
  
  void addDie (Die die) {
    for (int i = 0; i < diceCup.length; i++) {
      if (diceCup.length > i) {
        diceCup[i] = die;
      }
    }
  }
  
  void shake() {
    for (int i = 0; i < diceCup.length; i++) {
      diceCup[i].roll();
    }
  }
  
  void draw (int x, int y, int size) {
    for (int i = 0; i < diceCup.length; i++) {
      diceCup[i].draw(int(x+i*size*2), y, size);
      println(diceCup[i].randomVal);
    }
  }
}

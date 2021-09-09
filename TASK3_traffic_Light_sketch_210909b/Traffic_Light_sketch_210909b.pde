// TASK 3
float Middle = 300/2;
int circleWidth = 150;
float circleTopX = Middle;
float circleTopY = 500/6;
float circleMiddleX = Middle;
float circleMiddleY = 500/2;
float circleBottomX = Middle;
float circleBottomY = circleMiddleY+circleWidth+15;
color red = #FC0505;
color green = #14FC05;
int grey = 130;

void setup () {
  size(300, 500);
  //background(0);
  fill(130);
  // Circles
  ellipse(circleTopX, circleTopY, circleWidth, circleWidth);       // Circle TOP (RED)
  ellipse(circleMiddleX, circleMiddleY, circleWidth, circleWidth); // Circle MIDDLE (GREY)
  ellipse(circleBottomX, circleBottomY, circleWidth, circleWidth); // Circle BOTTOM (GREEN)
}

int i = 0;
void draw () {
  frameRate(60);
  
  // Flash RED Light
  if (i > 20) {
    fill(red);
    ellipse(circleTopX, circleTopY, circleWidth, circleWidth);       // Circle TOP (RED)
    if (i > 40) {
      fill(grey);
      ellipse(circleTopX, circleTopY, circleWidth, circleWidth);    // Circle TOP (RED)
    }
  }

  // FLash GREEN light
  if (i > 60) {
    fill(green);
    ellipse(circleBottomX, circleBottomY, circleWidth, circleWidth); // Circle BOTTOM (GREEN)
    if (i > 80) {
      fill(grey);
      ellipse(circleBottomX, circleBottomY, circleWidth, circleWidth); // Circle BOTTOM (GREEN)
      
      // Resetting "i" to 0
      i = 0;
    }
  }
  i++;
}

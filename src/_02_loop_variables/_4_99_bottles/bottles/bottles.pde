for(int i = 99; i > 0; i--){
  if(i > 1){
  println(i + " bottles of beer on the wall " + i + " bottles of beer ");
  } else if(i == 1){
  println(i + " bottle of beer on the wall " + i + " bottle of beer ");
  }
  println("Take one down, pass it around, " + (i-1) + " bottles of beer on the wall ");
  println();
  
}

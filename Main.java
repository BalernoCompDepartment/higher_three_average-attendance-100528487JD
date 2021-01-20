class Main {
  public static void main(String[] args) {
    
  // Step 1: set total initially to 0
  double total = 0;
  int [] attendaces = new int [8];
    
  //Step 2: Start a fixed loop for 8 atttendances
  for(int index = 0; index < attendaces.length; index ++){
    
  //Step 3: ask user for attendance
  attendaces[index] = Keyboard.getInt("enter attendaces");

    
  //Step 4: add value of attendance to total
  total = total + attendaces[index];
    
  //Step 5: End fixed loop
  }
    
  //Step 6: Round average and convert to integer
  int averageAttendaces = (int) Math.round((double)total/8);
    
  //Step 7: display the "Average cricket attendance is " concantenated with the calue of the average and followed by " this year"\
  System.out.println("Average cricket attendace is " + averageAttendaces + " this year");
  }
}

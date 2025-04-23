import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String>words;
  public RandomStringChooser(String[] WordArray){
    words = new ArrayList<>();
    for(int i = 0; i < WordArray.length; i++){
      words.add(WordArray[i]);
    }
  }
  public String getNext(){
    if(words.size() > 0){
      return(words.remove((int)(Math.random()*words.size())));
        }else{
      return "NONE";
    }
  }
}

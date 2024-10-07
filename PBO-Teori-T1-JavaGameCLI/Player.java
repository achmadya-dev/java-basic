public class Player {

  // Private variables
  private String name;
  private double attackPower;
  private int level;
  private int exp;

  // Constructor
  Player(String name){
    this.name = name;
    this.level = 1;
    this.exp = 0;
    this.attackPower = 100;
  }

  // Method
  void display(){
    System.out.println("Name \t"+ this.name);
    System.out.println("Level \t"+ this.level);
    System.out.println("Ext \t"+ this.exp);
    System.out.println("ATP \t"+ this.attackPower);
    System.out.println();
  }

  // Getter
  String getName(){
    return this.name;
  }

  // Setter
  void addExperience(int expValue){
    int maxExp = 100;

    System.out.println("Mendapatkan exp "+ expValue);
    this.exp += expValue;
    if (this.exp >= maxExp) {
      this.level++;
      this.attackPower += 100;
      System.out.println("Level UP");
      this.exp = 0;
    }
  }

}

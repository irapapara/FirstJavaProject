package hw.hw2;

public class HW_2_2 {
    public static void main(String[] args) {
        /*
Write a program to divide the loot on a pirate ship.
According to tradition, half of the loot goes to the ship's owner,
half of the remaining loot goes to the captain,
and the rest is divided equally among all crew members, including the captain.
The size of the loot (e.g., in doubloons) and the number of pirates on the ship
should be set as variables.
Display how many doubloons each person receives.
How much will the captain (Jack Sparrow, of course) get if he claims that the ship belongs to him?
Bonus Challenge: Try to think of a way for the program to verify that the loot has been divided correctly.
*/
        int loot= 100;
        int pirates=10;
        int remaining= loot;
        int ownerShare=remaining/2; //part for owner
        System.out.println("ownerShare"+ownerShare);

        remaining= (remaining -  ownerShare);
        int captainShare= remaining/2;  //part for captain
        System.out.println("captainShare"+ captainShare);
        remaining= remaining - captainShare;
int piratesShare= remaining/(pirates+1);
                System.out.println("piratesShare" + piratesShare);
remaining= remaining- piratesShare*(pirates+1);
captainShare= captainShare+piratesShare;
        System.out.println("newCaptainShare"+ captainShare);
        System.out.println("remaining" +remaining);

        System.out.println(ownerShare+captainShare+piratesShare*pirates+remaining);// check for the answer
        System.out.println(ownerShare+captainShare + "JeckShare");// if captain is Jeck Vorobey
         int summ= ownerShare+captainShare+piratesShare*pirates+remaining;
        System.out.println(summ == loot);// check
    }
}

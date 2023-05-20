package pl.camp.it.fruits;

/*Kucharz dostał na urodziny dwa kosze owoców. W pierwszym koszu jest J jabłek, w drugim P pomarańczy.
  Kucharz lubi pomarańcze i jabłka tak samo bardzo dlatego chciałby mieć ich po równo.
  Każde jabłko i każda pomarańcza kosztuje 1 złotą monetę. Kucharz ma Z monet.
  Napisz program, który na wejściu dostaje trzy liczby:
        J P Z (ilość jabłek, ilość pomarańczy, ilość złotych monet).
        Program ma wypisywać jaka jest minimalna możliwa różnica między ilością jabłek i pomarańczy po zakupie owoców.
        Kucharz jest bardzo łakomy więc zawsze wydaje wszystkie monety na zakupach.
        Przykłady:
        Wejście: 1 3 1
        Wyjście:
        Minimalna różnica: 1
        Ilość jabłek: 2
        Ilość pomarańczy: 3
        Wejście: 5 3 3
        Wyjście:
        Minimalna różnica: 1
        Ilość jabłek: 6
        Ilość pomarańczy: 5
        Wejście: 1 10 20
        Wyjście:
        Minimalna różnica: 1
        Ilość jabłek: 16
        Ilość pomarańczy: 15*/

public class Main {

    public static void main(String[] args) {
        int apple = 5;
        int orange = 3;
        int coins = 3;

        int diff = balanceFruits(apple, orange, coins);
        int balancedApple = apple + diff;
        int balancedOrange = orange - diff;

        System.out.println(diff);
        System.out.println(balancedApple);
        System.out.println(balancedOrange);

    }

    public static int balanceFruits(int apple, int orange, int coins) {

        int totalFruits = apple + orange;

        int affordableFruits = Math.min(coins, totalFruits);

        int equalFruits = affordableFruits / 2;

        int diff = Math.abs(apple - orange);

        int minDiff = Math.min(diff, equalFruits);

        return minDiff;

    }
}




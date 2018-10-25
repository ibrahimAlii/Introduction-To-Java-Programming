package IntroductionToJavaProgramming.chapter30_graphs_and_applications.nine_tail;

import java.util.List;
import java.util.Scanner;

public class NineTail {

    public static void main(String[] args) {

        System.out.println("Enter the initial nine coins Hs and Ts: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char[] initialNode = s.toCharArray();

        NineTailModel model = new NineTailModel();
        List<Integer> path = model.getShortestPath(NineTailModel.getIndex(initialNode));

        System.out.println("The steps to flip the coins are ");
        for (Integer aPath : path) NineTailModel.printNode(NineTailModel.getNode(aPath));

    }
}

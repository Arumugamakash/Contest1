package com;
/*
11) Given an array health[] where health[i] is the health of the ith player in a game, any
player can attack any other player in the game. The health of the player being attacked
will be reduced by the amount of health the attacking player has. The task is to find the
minimum possible health of the winning player. (PS- Always the player with lower health
will attack the player with higher health)
 */

import java.util.Arrays;

public class Qn11 {
	public static void main(String[] args) {
		int health[] = { 4, 1, 5, 3 };
		System.out.println(
				"Mininimum Posible Health  of the WinningPlayer :" + mininimumPosibleHealthWinningPlayer(health));
	}

	public static int mininimumPosibleHealthWinningPlayer(int health[]) {
		for (int i = 0; i < health.length - 1;) {
			Arrays.sort(health);
			if (health[i] != 0) {
				health[i + 1] = health[i + 1] - health[i];// 4 2 8 /2 2 8/2 0 8/0 2 8/0 2 6/ 0 2 4 /0 2 2 /0 2 0
				i = i;
			} else {
				i++;
			}
		}
		return health[health.length - 1];
	}

}

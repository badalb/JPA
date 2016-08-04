package com.training.jpa.domain.onetomany;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		RegionManager rm = new RegionManager();
		rm.init();
		firstSelect(rm);
		secondSelect(rm);
	}

	private static void firstSelect(RegionManager rm) {
		System.out.println("First Select ===>");
		List<Region> result = rm.getRegionList();
		for (Region r : result) {
			System.out.println(r);
		}
	}

	private static void secondSelect(RegionManager rm) {
		System.out.println("Second Select ===>");
		List<Region> result = rm.getRegionList2();
		for (Region r : result) {
			System.out.println(r);
		}
	}

}

package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipeTest {
	
	private Recipe recipe;
	
	public void setupStage1() {
		recipe = new Recipe(null, 0);
	}
	
	public void setupStage2() {
		recipe = new Recipe("Cebolla",315);
		recipe = new Recipe("Ajo", 58);
		recipe = new Recipe("Arroz", 520);
	}
	
	@Test
	void test() {
		
	}

}

package abstractClasses;

public abstract class GameCalculator {
	public abstract void calculate();

	public final void gameOver() {
		System.out.println("Game Over!!!");
	}
	
}

//When Abstract is written, it enforces the calculate method. 
//But everyone will override it according to their user type.
//You can use abstract when you want to hide Base.
//You can not use with new to abstract classes.